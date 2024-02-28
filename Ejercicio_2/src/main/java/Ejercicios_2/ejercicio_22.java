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
public class ejercicio_22 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la base (número real): ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese el exponente (número entero positivo): ");
        int exponente = scanner.nextInt();

        
        double resultado = calcularPotencia(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es igual a " + resultado);
    }

    private static double calcularPotencia(double base, int exponente) {
        double resultado = 1;

        // Manejar casos especiales
        if (exponente == 0) {
            return 1;
        }

        // Calcular la potencia iterativamente
        for (int i = 1; i <= Math.abs(exponente); i++) {
            resultado *= base;
        }

        // Manejar exponentes negativos
        if (exponente < 0) {
            resultado = 1 / resultado;
        }

        return resultado;
    }
}
