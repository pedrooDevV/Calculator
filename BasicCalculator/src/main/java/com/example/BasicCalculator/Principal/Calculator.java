package com.example.BasicCalculator.Principal;

import java.util.Scanner;

public class Calculator extends IllegalArgumentException {
    static Scanner scan = new Scanner(System.in);

    public static void menuCalc() throws IllegalAccessException {
        Integer choice = -1;
        while (choice != 0) {
            System.out.println("""
                    ----------------------
                    ESCOLHA QUAL OPERAÇÕES DESEJA
                    1- Adição
                    2- Subtração
                    3- Multiplicação
                    4- Divisão
                    0- Sair
                    ----------------------
                    """);
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    adiction();
                    break;
                case 2:
                    subtrate();
                    break;
                case 3:
                    multiplicate();
                    break;
                case 4:
                    division();
                    break;
                default:

                    if (choice != 0) {
                        throw new IllegalAccessException("Está Opção não existe tente apenas 1, 2, 3, 4 ou 0" );
                    }
            }
        }

    }

    private static void adiction() {
        System.out.println("Escolha dois numeros para soma:" );
        int number = scan.nextInt();
        System.out.println("Segundo:" );
        int number2 = scan.nextInt();
        double result = (double) number + (double) number2;
        System.out.println("Resultado da soma é: " + result);
    }

    private static void subtrate() {
        System.out.println("Escolha dois numeros para Subtração:" );
        int number = scan.nextInt();
        System.out.println("Segundo:" );
        int number2 = scan.nextInt();
        double result = (double) number - (double) number2;
        System.out.println("Resultado da subtração é: " + result);
    }

    private static void multiplicate() {
        System.out.println("Escolha dois numeros para Divisão:" );
        int number = scan.nextInt();
        System.out.println("Segundo:" );
        int number2 = scan.nextInt();
        double result = (double) number * (double) number2;
        System.out.println("Resultado da divisao é: " + result);
    }

    private static void division() {
        System.out.println("Escolha dois numeros para Divisão:" );
        int number = scan.nextInt();
        System.out.println("Segundo:" );
        int number2 = scan.nextInt();
        double result = (double) number / (double) number2;
        System.out.println("Resultado da divisao é: " + result);

    }
}
