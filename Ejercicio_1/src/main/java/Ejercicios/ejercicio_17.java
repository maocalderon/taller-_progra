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
public class ejercicio_17 {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese la hora de partida (HH MM SS): ");
        int horaPartida = scanner.nextInt();
        int minutoPartida = scanner.nextInt();
        int segundoPartida = scanner.nextInt();

        
        System.out.print("Ingrese el tiempo de viaje hasta llegar a B en segundos: ");
        int tiempoViaje = scanner.nextInt();

        // Calcular la hora de llegada a la ciudad B
        int segundosTotalesPartida = horaPartida * 3600 + minutoPartida * 60 + segundoPartida;
        int segundosLlegada = segundosTotalesPartida + tiempoViaje;

        int horaLlegada = segundosLlegada / 3600;
        int minutosLlegada = (segundosLlegada % 3600) / 60;
        int segundosLlegadaFinal = segundosLlegada % 60;

        
        System.out.println("El ciclista llegará a la ciudad B a las " +
                String.format("%02d", horaLlegada) + ":" +
                String.format("%02d", minutosLlegada) + ":" +
                String.format("%02d", segundosLlegadaFinal) + " horas.");
    }
    
    
}
