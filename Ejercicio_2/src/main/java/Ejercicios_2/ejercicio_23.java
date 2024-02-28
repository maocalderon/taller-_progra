/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_2;

/**
 *
 * @author Armando Bautista
 */
import java.util.Scanner;
public class ejercicio_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el primer pago: ");
        double primerPago = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de meses: ");
        int cantidadMeses = scanner.nextInt();

       
        double pagoMensual = calcularPagoMensual(primerPago, cantidadMeses);
        double totalPagado = calcularTotalPagado(primerPago, cantidadMeses);

        
        System.out.println("Pago mensual: " + pagoMensual + " €");
        System.out.println("Total pagado después de " + cantidadMeses + " meses: " + totalPagado + " €");
    }

    private static double calcularPagoMensual(double primerPago, int cantidadMeses) {
        // Fórmula para calcular el pago mensual
        return primerPago * Math.pow(2, cantidadMeses - 1);
    }

    private static double calcularTotalPagado(double primerPago, int cantidadMeses) {
        // Fórmula para calcular el total pagado después de la cantidad de meses especificada
        return primerPago * (Math.pow(2, cantidadMeses) - 1);
    }
}
