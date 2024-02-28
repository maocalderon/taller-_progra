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
public class ejercicio_18 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a introducir: ");
        int cantidadNumeros = scanner.nextInt();

        int mayoresQueCero = 0;
        int menoresQueCero = 0;
        int igualesACero = 0;

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                mayoresQueCero++;
            } else if (numero < 0) {
                menoresQueCero++;
            } else {
                igualesACero++;
            }
        }

        System.out.println("Resultados:");
        System.out.println("Números mayores que 0: " + mayoresQueCero);
        System.out.println("Números menores que 0: " + menoresQueCero);
        System.out.println("Números iguales a 0: " + igualesACero);
    }
}
