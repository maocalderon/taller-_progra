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
public class ejercicio_15 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Ingrese el valor de B: ");
        int B = scanner.nextInt();

        // Intercambiar los valores de A y B
        int temp = A;
        A = B;
        B = temp;

        System.out.println("Al final, el valor de A es: " + A);
        System.out.println("Al final, el valor de B es: " + B);
    }
}
