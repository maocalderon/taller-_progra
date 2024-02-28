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
public class ejercicio_19 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Ingrese el número de respuestas correctas: ");
        int respuestasCorrectas = scanner.nextInt();

        System.out.print("Ingrese el número de respuestas incorrectas: ");
        int respuestasIncorrectas = scanner.nextInt();

        System.out.print("Ingrese el número de respuestas no contestadas: ");
        int respuestasNoContestadas = scanner.nextInt();

        
        int notaFinal = respuestasCorrectas * 5 - respuestasIncorrectas;

        
        System.out.println("La nota final del estudiante es: " + notaFinal);
    }
}
