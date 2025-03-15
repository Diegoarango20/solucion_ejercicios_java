package com.cesde;

public class solucion5 {
    public static void main(String[] args) {
        System.out.println("Hola Profe Jhon");

        /* Verificador de Número Positivo, negativo o cero */

        int numero = 20;

        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero == 0) {
            System.out.println("El numero es 0");

        } else {
            System.out.println("El numero es negativo");
        }

        /* Verificador de Número Par o Impar */

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }




    }
}