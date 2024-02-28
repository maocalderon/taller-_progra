/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_2;

/**
 *
 * @author Armando Bautista
 */
import java.util.Random;
import java.util.Scanner;
public class ejercicio_30 {
 public static void main(String[] args) {
        Random rand = new Random();
        int[][] numeros = new int[4][5];

        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                numeros[i][j] = rand.nextInt(900) + 100; // Números aleatorios entre 100 y 999
            }
        }

       
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += numeros[i][j];
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println("Suma Fila " + (i + 1) + ": " + sumaFila);
        }

        
        for (int j = 0; j < 5; j++) {
            System.out.print("--------");
        }
        System.out.println();

        
        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += numeros[i][j];
            }
            System.out.print("Suma Col " + (j + 1) + ": " + sumaColumna + "\t");
        }

        
        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumaTotal += numeros[i][j];
            }
        }
        System.out.println("\nSuma Total: " + sumaTotal);
    }   
}
