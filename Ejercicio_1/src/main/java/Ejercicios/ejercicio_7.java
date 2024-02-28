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
public class ejercicio_7 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de minutos: ");
        int minutosTotales = scanner.nextInt();

        int horas = minutosTotales / 60;
        int minutos = minutosTotales % 60;

        System.out.println("Equivalente a: " + horas + " horas y " + minutos + " minutos.");
    }
}
