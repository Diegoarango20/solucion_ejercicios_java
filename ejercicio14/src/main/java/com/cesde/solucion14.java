package com.cesde;

public class solucion14 {
    public static void main(String[] args) {
        System.out.println("Hola Profe Jhon!");

        // Verificador de Año Bisiesto

        int año = 2020;

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println(año + " Es año bisiesto.");
        } else {
            System.out.println(año + " No es año bisiesto.");
        }

    }
}