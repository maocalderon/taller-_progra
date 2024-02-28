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
public class ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número de dos cifras: ");
        int numero = scanner.nextInt();

        if (numero >= 10 && numero <= 99) {
            int unidades = numero % 10;
            int decenas = numero / 10;

            int numeroInvertido = unidades * 10 + decenas;

            System.out.println("Número invertido: " + numeroInvertido);
        } else {
            System.out.println("El número no tiene dos cifras.");
        }
    }
}
