package com.cesde;

public class solucion9 {
    public static void main(String[] args) {
        System.out.println("Hola Profe Jhon!");

        /* Calificación de Notas */

        int nota = 100;

        if (nota >= 90) {
            System.out.println("Tu nota es A");

        } else if (nota >= 80 && nota <= 89) {
            System.out.println("Tu nota es B");

        } else if (nota >= 70 && nota <= 79) {
            System.out.println("Tu nota es C");

        } else if (nota >= 60 && nota <= 69) {
            System.out.println("Tu nota es D");

        } else if (nota >= 0 && nota <= 59) {
            System.out.println("Tu nota es F");

        }
    }
}