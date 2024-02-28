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
public class ejercicio_29 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] numeros = new int[4][5];

        // Ingresar los 20 números enteros
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                numeros[i][j] = scanner.nextInt();
            }
        }

        // Calcular las sumas parciales de filas y columnas
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += numeros[i][j];
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println("Suma Fila " + (i + 1) + ": " + sumaFila);
        }

        // Imprimir separador
        for (int j = 0; j < 5; j++) {
            System.out.print("--------");
        }
        System.out.println();

        // Calcular las sumas parciales de columnas
        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += numeros[i][j];
            }
            System.out.print("Suma Col " + (j + 1) + ": " + sumaColumna + "\t");
        }

        // Calcular la suma total
        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumaTotal += numeros[i][j];
            }
        }
        System.out.println("\nSuma Total: " + sumaTotal);
    }
}
