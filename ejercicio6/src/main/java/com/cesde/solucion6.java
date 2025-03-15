package com.cesde;

public class solucion6 {
    public static void main(String[] args) {
        System.out.println("Hola Profe Jhon!");

        /*Conversor de Temperatura */

        int celsius = 100;
        int fahrenheit = 250;

        int tempfahrenheit = (celsius * 9/5) + 32;
        int tempcelsius = (fahrenheit - 32) * 5/9;

        System.out.println("la temperatura en G° Fahrenheit es: " + tempfahrenheit);
        System.out.println("la temperatura en G° Celsius es: " + tempcelsius);



    }
}