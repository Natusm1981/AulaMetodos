package com.nataniel.aula;

public class Calcular {
    
    public static Boolean ValidarOperacao(String op){
        if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))
            return true;
        else{
            System.out.println("Digite uma operação válida:\nsomar ( + )\nsubtrair ( - )\nmultiplicar ( * )\ndividir ( / )");
            return false;
        }
    }
    public static void ExecutarCalculo(String op, double n1, double n2){
        switch (op) {
            case "+":
                Somar(n1, n2);
                break;
            case "-":
                Subtrair(n1, n2);
                break;
            case "*":
                Multiplicar(n1, n2);
                break;
            case "/":
                if(n2 == 0)
                    System.out.println("Não é possível dividir por ZERO, operação não executada.");
                else
                    Dividir(n1, n2);
                break;
        }
    }


    private static void Somar(double n1, double n2){
        System.out.println("O resultado de " + n1 + " + " + n2 + "é igual a: " + (n1 + n2));
    }

    private static void Subtrair(double n1, double n2){
        System.out.println("O resultado de " + n1 + " - " + n2 + "é igual a: " + (n1 - n2));
    }

    private static void Multiplicar(double n1, double n2){
        System.out.println("O resultado de " + n1 + " * " + n2 + "é igual a: " + (n1 * n2));
    }

    private static void Dividir(double n1, double n2){
        System.out.println("O resultado de " + n1 + " / " + n2 + "é igual a: " + (n1 / n2));
    }
}
