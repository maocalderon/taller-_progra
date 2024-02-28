/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Armando Bautista
 */
import java.util.Scanner;
public class ejercicio_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo base del vendedor: ");
        double sueldoBase = scanner.nextDouble();

        System.out.print("Ingrese el monto de la primera venta: ");
        double venta1 = scanner.nextDouble();

        System.out.print("Ingrese el monto de la segunda venta: ");
        double venta2 = scanner.nextDouble();

        System.out.print("Ingrese el monto de la tercera venta: ");
        double venta3 = scanner.nextDouble();

        double comisionTotal = 0.10 * (venta1 + venta2 + venta3);
        double salarioTotal = sueldoBase + comisionTotal;

        System.out.println("Comisión por ventas: " + comisionTotal);
        System.out.println("Salario total: " + salarioTotal);
    }
}
