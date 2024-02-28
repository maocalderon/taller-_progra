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
public class ejercicio_10 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar el tipo de uva (A o B) y el tamaño (1 o 2)
        System.out.print("Ingrese el tipo de uva (A/B): ");
        char tipoUva = scanner.next().charAt(0);

        System.out.print("Ingrese el tamaño de la uva (1/2): ");
        int tamañoUva = scanner.nextInt();

        // Ingresar el precio inicial por kilo de uva
        System.out.print("Ingrese el precio inicial por kilo de uva en euros: ");
        double precioInicial = scanner.nextDouble();

        // Calcular el monto a recibir por el productor
        double montoFinal = 0.0;

        if (tipoUva == 'A') {
            if (tamañoUva == 1) {
                montoFinal = precioInicial + 0.20;
            } else if (tamañoUva == 2) {
                montoFinal = precioInicial + 0.30;
            }
        } else if (tipoUva == 'B') {
            if (tamañoUva == 1) {
                montoFinal = precioInicial - 0.30;
            } else if (tamañoUva == 2) {
                montoFinal = precioInicial - 0.50;
            }
        }

        // Mostrar el monto final a recibir por el productor
        System.out.println("El productor recibirá " + montoFinal + " euros por kilo de uva.");
    }   
}
