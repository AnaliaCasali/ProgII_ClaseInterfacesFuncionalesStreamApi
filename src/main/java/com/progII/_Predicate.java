package com.progII;

import java.util.function.Predicate;

public class _Predicate {
    //  reciben 1 argumento a evaluar y devuelve V o F

    public static void main(String[] args) {
        System.out.println("tel +543482112233" );
        System.out.println( telValido.test("+543482112233"));

        System.out.println("tel +5434" );
        System.out.println( telValido.test("+5434"));

    }

    static Predicate<String> telValido
            =(tel) -> tel.startsWith("+54") && tel.length() == 13;

}
