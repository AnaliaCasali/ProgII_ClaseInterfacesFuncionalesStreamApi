package com.progII;

import java.util.function.Consumer;

public class _Consumer {

    //  reciben 1 argumento y no devuelven nada
    public static void main(String[] args) {
            // para usar Consumer
            // uso: accept

            mostrarMensaje.accept("Bienvenidos a java avanzado" +
                    " con interfaces funcionales");
    }
    static Consumer<String> mostrarMensaje
            = (mensaje) -> System.out.println(mensaje);


}
