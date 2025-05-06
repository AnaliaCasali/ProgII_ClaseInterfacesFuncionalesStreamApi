package com.progII;

import java.util.function.Supplier;

public class _Supplier {

    // no recibe nada pero devuelve un valor
    public static void main(String[] args) {
        // para usar Supplier
        // uso get
        System.out.println(getCadenaConexionBD.get());
    }

   static Supplier<String> getCadenaConexionBD=
           ()-> "jdbc:mysql://localhost:3306/miBD?";
}
