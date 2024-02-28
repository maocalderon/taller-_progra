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
public class ejercicio_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            maximo = Math.max(maximo, numeros[i]);
            minimo = Math.min(minimo, numeros[i]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
            if (numeros[i] == maximo) {
                System.out.print("máximo ");
            }
            if (numeros[i] == minimo) {
                System.out.print("mínimo ");
            }
            System.out.println();
        }
    }
}
