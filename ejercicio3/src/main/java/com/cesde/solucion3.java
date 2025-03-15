package com.cesde;

public class solucion3 {
    public static void main(String[] args) {
        System.out.println("Hola Profe Jhon!");

        /* Temperatura y Estado del Agua */

        int temp = 500;

        if (temp <= 0) {
            System.out.println("El estado del agua es solido ");
        } 
        else if (temp > 0 && temp <= 100) {
            System.out.println("El estado del agua es liquido");
        } 
        else {
            System.out.println("El estado del agua es gaseoso");
        }

    }
}