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
public class ejercicio_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números primos a mostrar: ");
        int cantidadNumerosPrimos = scanner.nextInt();

        System.out.println("Los primeros " + cantidadNumerosPrimos + " números primos son:");
        mostrarNumerosPrimos(cantidadNumerosPrimos);
    }

    private static void mostrarNumerosPrimos(int cantidadNumerosPrimos) {
        int numero = 2;
        int contadorPrimos = 0;

        while (contadorPrimos < cantidadNumerosPrimos) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
                contadorPrimos++;
            }

            numero++;
        }
    }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
