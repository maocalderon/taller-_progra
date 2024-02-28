/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 *
 * 
 * 
 * @author Armando Bautista
 */

import java.util.Scanner;
public class ejercicio_20 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la cantidad de monedas de 2 euros: ");
        int monedas2Euros = scanner.nextInt();

        System.out.print("Ingrese la cantidad de monedas de 1 euro: ");
        int monedas1Euro = scanner.nextInt();

        System.out.print("Ingrese la cantidad de monedas de 50 céntimos: ");
        int monedas50Centimos = scanner.nextInt();

        System.out.print("Ingrese la cantidad de monedas de 20 céntimos: ");
        int monedas20Centimos = scanner.nextInt();

        System.out.print("Ingrese la cantidad de monedas de 10 céntimos: ");
        int monedas10Centimos = scanner.nextInt();

        // Calcular el dinero total en euros y céntimos
        double totalEuros = monedas2Euros * 2 + monedas1Euro + monedas50Centimos * 0.5 +
                            monedas20Centimos * 0.2 + monedas10Centimos * 0.1;

        // Separar euros y céntimos
        int euros = (int) totalEuros;
        int centimos = (int) ((totalEuros - euros) * 100);

        
        System.out.println("Tienes un total de " + euros + " euros y " + centimos + " céntimos.");
    }
}
