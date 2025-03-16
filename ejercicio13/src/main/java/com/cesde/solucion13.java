package com.cesde;

public class solucion13 {
    public static void main(String[] args) {
        System.out.println("Hola Profe Jhon!");

        /* Calculadora de Préstamo */

        /* Datos del prestamo */

        double prestamo = 20000000;
        double tasaAnual = 5.20 / 100;
        int años = 5;

        double tasaMensual = tasaAnual / 12;
        int numeroTotalDePagos = años * 12;

        /* operacion */

        double pagoMensual = prestamo * (tasaMensual * Math.pow(1 + tasaMensual, numeroTotalDePagos))
                / (Math.pow(1 + tasaMensual, numeroTotalDePagos) - 1);

        System.out.printf("Tu pago mensual es de $ %,.0f\n", pagoMensual);

    }
}