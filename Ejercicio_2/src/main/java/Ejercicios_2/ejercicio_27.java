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
public class ejercicio_27 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
