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
public class ejercicio_17 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAdivinar = random.nextInt(100) + 1;
        int intentosRestantes = 10;
        int intento;

        System.out.println("Bienvenido al juego de adivinanza. Adivina el número del 1 al 100.");

        do {
            System.out.print("Ingresa tu intento: ");
            intento = scanner.nextInt();

            if (intento < 1 || intento > 100) {
                System.out.println("Por favor, ingresa un número válido del 1 al 100.");
                continue;
            }

            if (intento == numeroAdivinar) {
                System.out.println("¡Felicidades! Has adivinado el número en " + (10 - intentosRestantes + 1) + " intentos.");
                break;
            } else if (intento < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor. Intentos restantes: " + --intentosRestantes);
            } else {
                System.out.println("El número a adivinar es menor. Intentos restantes: " + --intentosRestantes);
            }

            if (intentosRestantes == 0) {
                System.out.println("Lo siento, has agotado todos tus intentos. El número era: " + numeroAdivinar);
                break;
            }
        } while (true);
    }
}
