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
public class ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el total de la compra: ");
        double totalCompra = scanner.nextDouble();

        double descuento = 0.15 * totalCompra;
        double totalPagar = totalCompra - descuento;

        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + totalPagar);
    }
}
