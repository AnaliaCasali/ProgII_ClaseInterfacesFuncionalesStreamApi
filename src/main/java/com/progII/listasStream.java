package com.progII;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class listasStream {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<String>();
        lista.add("Elian");
        lista.add("Gabriel");
        lista.add("Agustin");
        lista.add("Ariel");


        lista.stream()
                .filter(getNombresConA())
                .forEach(mostrarNombresA());
    }

    private static Consumer<String> mostrarNombresA() {
        return n -> System.out.println(n);
    }

    private static Predicate<String> getNombresConA() {
        return n -> n.startsWith("A");
    }
}
