package com.cesde;

public class solucion8 {
    public static void main(String[] args) {
        System.out.println("Hola Profe Jhon!");


        /* Calculadora de Tiempo */

        int minutos = 2000;

        int horas = 0;
        int minutosrestantes = 0;
        int dias = 0;

        /* operaciones */

        dias = minutos / ( 24 * 60);
        minutosrestantes = minutos % 60;
        horas = minutos / 60;
        
        System.out.println("La cantidad de dias es " + dias + " La cantidad de horas es " + horas +
         " y la cantidad de minutos son " + minutosrestantes);

     












    }
}