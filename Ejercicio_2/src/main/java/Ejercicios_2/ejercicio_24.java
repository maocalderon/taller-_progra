/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_2;

/**
 *
 * @author Armando Bautista
 */import java.util.Scanner;
public class ejercicio_24 {
     public static void main(String[] args) throws InterruptedException {
        int horas = 0, minutos = 0, segundos = 0;

        while (true) {
            System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);

            segundos++;

            if (segundos == 60) {
                minutos++;
                segundos = 0;
            }

            if (minutos == 60) {
                horas++;
                minutos = 0;
            }

            Thread.sleep(1000);
        }
    }
}
