package com.progII;

import com.progII.model.Genero;
import com.progII.model.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class listaPersonas {

    public static void main(String[] args) {

        //List<Persona> personas = new ArrayList();
        //personas.add(new Persona(1, "Elian", 20, Genero.MASCULINO));

        List<Persona> personas =List.of(
                new Persona(1, "Elian", 20, Genero.MASCULINO),
                new Persona(2, "Gabriel", 25, Genero.MASCULINO),
                new Persona(3, "Agustin", 30, Genero.MASCULINO),
                new Persona(4, "Ariel", 35, Genero.MASCULINO),
                new Persona(5, "Ana", 16, Genero.FEMENINO),
                new Persona(6, "Maria", 14, Genero.FEMENINO)
        );
        // imperativo
      /*  for (Persona persona : personas) {
            System.out.println(persona.toString());
        }*/
        //funcional

        personas.stream().forEach(getPersonayMostrar());

        // genera como resultado una lista de personas del genero masculo  
        List<Persona> masculinos=
                personas.stream()
                        .filter(getPersonaMasculino())
                        .collect(Collectors.toList());

        System.out.println("----- Lista de personas masculinos----");
        masculinos.stream().forEach(getPersonayMostrar());

        System.out.println("lista de nombres en mayuscula");
        //map trasnsforma
        List<String> nombresMay= personas.stream()
            .map( (p) -> p.getNombre().toUpperCase())
            .collect(Collectors.toList());
        nombresMay.stream().forEach(System.out::println);

        List<Integer> largosNombres= personas.stream()
                .map(p-> p.getNombre().length())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("largo de los nombres");
        largosNombres.stream().forEach(System.out::println);


        Optional<Integer> max= personas.stream()
            .map(p-> p.getNombre().length())
            .distinct()
            .max(Integer::compareTo);


        System.out.println("El mas largo es" + max.orElse(0));







    }

    private static Function<Persona, String> getNombrePersonaEnMayuscula() {
        return (p) -> p.getNombre().toUpperCase();
    }

    private static Collector<Persona, ?, List<Persona>> getList() {
        return Collectors.toList();
    }

    private static Predicate<Persona> getPersonaMasculino() {
        return p -> p.getGenero() == Genero.MASCULINO;
    }

    private static Consumer<Persona> getPersonayMostrar() {
        // return p -> System.out.println(p.toString());
        return System.out::println;
    }
}
