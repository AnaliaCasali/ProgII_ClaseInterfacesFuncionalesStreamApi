package com.progII;

import com.progII.interfaces.Calculadora;
import com.progII.interfaces.Mensaje;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // forma imperativa
//        CalcularSuma suma = new CalcularSuma();
//        suma.sumar(45,23);

        // forma funcional

        //1. creo la variable de tipo interfaz funcional
        Calculadora sumaLambda;
        // 2. a la interfaz funcional le indico como impletar el unico método
        sumaLambda = (int a, int b) ->  {
            System.out.println("la funcion lambda da como resultado");
            System.out.println(a+b);
        };
        // 3. usar el metodo
        sumaLambda.calcular(45,23);

        Calculadora multiplicar;
        multiplicar = (int a, int b) -> {
            System.out.println("la funcion lambda multiplicar da como resultado");
            System.out.println(a*b);
        };

        multiplicar.calcular(2,2);

        Mensaje mensajeBienvenida;
        mensajeBienvenida = () -> {
            return "Hola, bienvenido programacion funcional";};

        System.out.println(mensajeBienvenida.mostrarMensaje());

        mensajeBienvenida = () -> "Hola,  programacion funcional " +
                "este es el segundo msg";

        System.out.println(mensajeBienvenida.mostrarMensaje());


    }
}