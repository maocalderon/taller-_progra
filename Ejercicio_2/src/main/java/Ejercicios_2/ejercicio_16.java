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
public class ejercicio_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar el peso del paquete y la zona de destino
        System.out.print("Ingrese el peso del paquete en kilogramos: ");
        double pesoPaquete = scanner.nextDouble();

        System.out.print("Ingrese la zona de destino (1 a 5): ");
        int zonaDestino = scanner.nextInt();

        // Determinar el cobro por la entrega o el rechazo
        double costoKilogramo = obtenerCostoKilogramo(zonaDestino);

        if (costoKilogramo == -1 || pesoPaquete > 5) {
            System.out.println("El paquete no puede ser transportado.");
        } else {
            double costoTotal = pesoPaquete * costoKilogramo;
            System.out.println("El costo por la entrega del paquete es de " + costoTotal + " euros.");
        }
    }

    private static double obtenerCostoKilogramo(int zona) {
        double[] costosPorZona = {-1, 24.00, 20.00, 21.00, 10.00, 18.00};

        if (zona >= 1 && zona <= 5) {
            return costosPorZona[zona];
        } else {
            return -1;
        }
    }
}
