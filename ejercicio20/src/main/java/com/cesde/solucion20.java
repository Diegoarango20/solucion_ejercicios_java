package com.cesde;

public class solucion20 {
    public static void main(String[] args) {
        System.out.println("Hola Profe Jhon!");

        // Validador de Triángulo

        int lado1 = 5;
        int lado2 = 10;
        int lado3 = 10;

        // Saber si se puede formar el triangulo

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {

            // Tipo de triángulo

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es Equilátero.");

            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("El triángulo es Isósceles.");

            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("El triángulo es Escaleno.");
            }
        }

        else {
            System.out.println("Los lados no pueden formar un triangulo.");
        }

    }
}