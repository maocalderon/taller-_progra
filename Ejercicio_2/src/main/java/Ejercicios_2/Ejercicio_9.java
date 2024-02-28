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
public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar el año
        System.out.print("Ingrese un año: ");
        int año = scanner.nextInt();

        // Verificar si el año es bisiesto
        boolean esBisiesto = false;

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            esBisiesto = true;
        }

        // Mostrar el resultado
        if (esBisiesto) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }
    }
}
