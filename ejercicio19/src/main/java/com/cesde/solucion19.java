package com.cesde;

public class solucion19 {
    public static void main(String[] args) {
        System.out.println("Hola Profe Jhon!");

        //Calculadora de Notas Ponderadas

        double examen = 4.8;
        double proyecto = 4.2;
        double tareas = 3.5;
        double participacion = 4.0;

        double notaFinal = (examen * 0.4) + (proyecto * 0.3) + (tareas * 0.2) + (participacion * 0.1);

        System.out.println("Tu nota final es: " + notaFinal);

        //Mensaje adicional profe

        if (notaFinal >= 3) { System.out.println("Felicitaciones pasaste la materia");
            
        } else {System.out.println( "Debes repetir la materia");}















    }
}