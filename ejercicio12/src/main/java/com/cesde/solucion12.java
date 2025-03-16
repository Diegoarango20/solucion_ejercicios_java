package com.cesde;

public class solucion12 {
    public static void main(String[] args) {
        System.out.println("Hola Profe Jhon!");

        /* Categoría de Edad */

        int edad = 15;

        if (edad >= 0 && edad <= 2) {
            System.out.println("Bebé");

        } else if (edad >= 3 && edad <= 12) {
            System.out.println("Niño");

        } else if (edad >= 13 && edad <= 19) {
            System.out.println("Adolescente");

        } else if (edad >= 20 && edad <= 64) {
            System.out.println("Adulto");

        } else {System.out.println( "Adulto Mayor");}





    }
}