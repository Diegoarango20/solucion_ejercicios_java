package com.cesde;

import java.util.Scanner;

public class solucion11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hola Profe Jhon!");

        /* Día de la Semana */

        System.out.println("Ingrese un número del 1 al 7 ");
        int diadelasemana = sc.nextInt();

        switch (diadelasemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero fuera de rango ingrese un número del 1 al 7");
        }

    }
}