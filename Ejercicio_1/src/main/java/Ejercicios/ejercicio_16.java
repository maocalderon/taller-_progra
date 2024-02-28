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
public class ejercicio_16 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la distancia entre los vehículos (km): ");
        double distancia = scanner.nextDouble();

        
        System.out.print("Ingrese la velocidad del vehículo que está detrás (km/h): ");
        double velocidadDetras = scanner.nextDouble();

        // Ingresar la velocidad del vehículo más rápido en km/h
        System.out.print("Ingrese la velocidad del vehículo más rápido (km/h): ");
        double velocidadMasRapido = scanner.nextDouble();

        // Calcular el tiempo que tardará el vehículo más rápido en alcanzar al otro
        double tiempoEnHoras = distancia / (velocidadMasRapido - velocidadDetras);
        double tiempoEnMinutos = tiempoEnHoras * 60;

       
        System.out.println("El vehículo más rápido alcanzará al otro en " + tiempoEnMinutos + " minutos.");
    }
    
    
}
