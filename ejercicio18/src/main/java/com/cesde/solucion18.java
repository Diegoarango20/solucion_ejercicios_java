package com.cesde;

public class solucion18 {
    public static void main(String[] args) {
        System.out.println("Hola Profe Jhon!");

        // Verificador de Múltiplos

        int numero = 33;

        boolean multiplo2 = (numero % 2 == 0);
        boolean multiplo3 = (numero % 3 == 0);
        boolean multiplo5 = (numero % 5 == 0);

        // resultado

        System.out.println("El número " + numero + " cumple con las siguientes condiciones");

        if (multiplo2) {
            System.out.println("Es múltiplo de 2");
        }
        if (multiplo3) {
            System.out.println("Es múltiplo de 3");
        }
        if (multiplo5) {
            System.out.println("Es múltiplo de 5");
        }
        if (!multiplo2 && !multiplo3 && !multiplo5) {
            System.out.println("No es múltiplo de 2, 3 ni 5.");
        }

    }
}