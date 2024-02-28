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
public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la calificación parcial 1: ");
        double parcial1 = scanner.nextDouble();

        System.out.print("Ingrese la calificación parcial 2: ");
        double parcial2 = scanner.nextDouble();

        System.out.print("Ingrese la calificación parcial 3: ");
        double parcial3 = scanner.nextDouble();

        System.out.print("Ingrese la calificación del examen final: ");
        double examenFinal = scanner.nextDouble();

        System.out.print("Ingrese la calificación del trabajo final: ");
        double trabajoFinal = scanner.nextDouble();

        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;
        double calificacionFinal = 0.55 * promedioParciales + 0.30 * examenFinal + 0.15 * trabajoFinal;

        System.out.println("La calificación final en Algoritmos es: " + calificacionFinal);
    }
}
