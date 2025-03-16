package com.cesde;

import java.util.Scanner;

public class solucion10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola Profe Jhon!");

        /* Calculadora Simple */

        /* Ingresar los numeros y el operador*/

        System.out.print("Ingrese el primer número ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese el operador (+, -, *, /) ");
        char operador = scanner.next().charAt(0);

         /* Operacion */

        double resultado = 0;
        boolean operacionexitosa = true;
     

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("No se puede dividir con cero ");
                    
                }
                break;
            default:
                System.out.println("ingrese un operador valido.");
                
                break;
        }

        /* Resultado */

        if (operacionexitosa) {
            System.out.println("El resultado de " + numero1 + " " + operador + " " + numero2 + " es: " 
            + resultado);
        }

    }
}