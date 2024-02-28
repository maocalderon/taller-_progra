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
public class ejercicio_15 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero entre 1 y 12: ");
        int numeroMes = scanner.nextInt();

        int diasEnMes = obtenerDiasEnMes(numeroMes);

        if (diasEnMes == -1) {
            System.out.println("ERROR: Número incorrecto.");
        } else {
            System.out.println("El mes " + numeroMes + " tiene " + diasEnMes + " días.");
        }
    }

    private static int obtenerDiasEnMes(int numeroMes) {
        int[] diasEnMeses = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (numeroMes >= 1 && numeroMes <= 12) {
            return diasEnMeses[numeroMes];
        } else {
            return -1;
        }
    }
}
