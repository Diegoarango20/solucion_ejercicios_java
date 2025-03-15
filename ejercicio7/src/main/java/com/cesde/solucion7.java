package com.cesde;

public class solucion7 {
    public static void main(String[] args) {
        System.out.println("Hola Profe Jhon!");

        /* Calculadora de IMC */

        double peso = 100;
        double altura = 1.75;

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Bajo peso");

        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Normal");

        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");

        } else if (imc >= 30) {
             System.out.println("Obesidad");
        }

    }
}