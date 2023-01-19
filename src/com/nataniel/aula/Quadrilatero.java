package com.nataniel.aula;

public class Quadrilatero {

    public static void Calcular(int lado1, int lado2){
        System.out.println("A área do retângulo é: " + (lado1 * lado2));

    }
    public static void Calcular(int lado){
        System.out.println("A área do QUADRADO é: " + (lado * lado));

    }
    public static void Calcular(int lado1, int lado2, int altura){
        System.out.println("A área do Trapézio é: " + ((lado1 + lado2) * altura * 0.5));

    }
}
