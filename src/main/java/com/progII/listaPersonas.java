package com.progII;

import com.progII.model.Genero;
import com.progII.model.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
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

        List<Persona> masculinos=
                personas.stream()
                        .filter(p -> p.getGenero()==Genero.MASCULINO)
                        .collect(Collectors.toList());

        System.out.println("----- Lista de personas masculinos----");
        masculinos.stream().forEach(getPersonayMostrar());


    }

    private static Consumer<Persona> getPersonayMostrar() {
        // return p -> System.out.println(p.toString());
        return System.out::println;
    }
}
