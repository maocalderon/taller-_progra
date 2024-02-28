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
public class ejercicio_19 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char caracter;

        do {
            System.out.print("Ingrese un caracter (o espacio para salir): ");
            caracter = scanner.next().charAt(0);

            if (caracter != ' ') {
                if (esVocal(caracter)) {
                    System.out.println("VOCAL");
                } else {
                    System.out.println("NO VOCAL");
                }
            }

        } while (caracter != ' ');
    }

    private static boolean esVocal(char c) {
        // Verificar si el carácter es una vocal (mayúscula o minúscula)
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
