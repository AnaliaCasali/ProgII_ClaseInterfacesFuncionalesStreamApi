package com.progII;

import com.progII.interfaces.Calculadora;

public class CalcularSuma implements Calculadora {


    @Override
    public void calcular(int a, int b) {
        System.out.println(a+b);
    }
}
