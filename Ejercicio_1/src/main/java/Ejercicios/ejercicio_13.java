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
public class ejercicio_13 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        double raizCuadrada = Math.sqrt(numero);
        double raizCubica = Math.cbrt(numero);

        System.out.println("Raíz cuadrada: " + raizCuadrada);
        System.out.println("Raíz cúbica: " + raizCubica);
    }
}
