package com.cesde;

public class solucion4 {
    public static void main(String[] args) {
        System.out.println("Hola Profe Jhon");

        /* Descuento en Compra */

        double compra = 20;
        double descuento = 0;

        if (compra > 100) {
            descuento = (compra * 0.10);
            System.out.println("El monto original es " + compra + " El valor del descuento es " + descuento +
                    " El monto final es " + (compra - descuento));
        } 
        
        else if (compra > 50 && compra <= 100)
        {
            descuento = (compra * 0.05);
            System.out.println("El monto original es " + compra + " El valor del descuento es " + descuento +
                    " El monto final es " + (compra - descuento));
        }
        
        else if (compra <= 50) { descuento =0;
            System.out.println( "El monto original es " + compra + " El valor del descuento es " + descuento +
                    " El monto final es " + (compra - descuento) );
            
        }


    }
}