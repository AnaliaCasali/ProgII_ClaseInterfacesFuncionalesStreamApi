package com.progII;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    // Function<T,R> es una interfaz funcional
    // que representa una función que
    // toma un argumento de tipo T y devuelve un resultado de tipo R.


    // recibe 1 argumento y devuelve 1 argumento
    public static void main(String[] args) {

          // imperativo
            int nro= incrementarEnUno(5);
            System.out.println("El nro incrementado en uno es " + nro);

            // para ejecutar su metodo uso apply
        int resultado=incrementarEnUnoFunction.apply(10);
        System.out.println("incrementarEnUnoFunction " + resultado);

        resultado=calcularDoble.apply(9);
        System.out.println("doble" + resultado);

        resultado=calcularDobleySumar1.apply(22);
        System.out.println("resultado de calcularDobleySumar1 " + resultado);
        System.out.println(sumarMostrar.apply(5,9));
    }
    static int incrementarEnUno(int nro){
        nro++;
        return nro;
    }

    static Function<Integer, Integer> incrementarEnUnoFunction = (nro)->++nro;

    static Function<Integer, Integer> calcularDoble = (nro)->nro*2;

    static Function<Integer, Integer> calcularDobleySumar1=
            incrementarEnUnoFunction.andThen(calcularDoble);

    static BiFunction<Integer,Integer, String> sumarMostrar
            =(nro1, nro2)->
            "La suma de " + nro1  + " y" + nro2 + " es " + (nro1+nro2);

}
