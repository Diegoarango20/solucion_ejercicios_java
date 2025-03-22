package com.cesde;

import java.util.Scanner;

public class solucion15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Calculadora de Descuento por Lealtad

        // Solicitar al usuario los años de cliente

        System.out.print("Introduce los años de cliente: ");
        int añosCliente = scanner.nextInt();


        // Solicitar al usuario el monto de la compra

        System.out.print("Introduce el monto de la compra: ");
        double montoCompra = scanner.nextDouble();

        
        double porcentajeDescuento = 0;

        // Calcular el descuento 

        if (añosCliente >= 1 && añosCliente <= 2) {
            porcentajeDescuento = 5; 
        } else if (añosCliente >= 3 && añosCliente <= 5) {
            porcentajeDescuento = 10; 
        } else if (añosCliente > 5) {
            porcentajeDescuento = 15;
        }

        // compra supera $500

        if (montoCompra > 500) {
            porcentajeDescuento += 5; 
        }

        // Calcular el descuento total

        double descuentoTotal = (porcentajeDescuento / 100) * montoCompra;
        double montoFinal = montoCompra - descuentoTotal;

        // Resultados

        System.out.println("Descuento: " + porcentajeDescuento + "%");
        System.out.println("Total después del descuento: $" + montoFinal);

    }

}
