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
public class ejercicio_18 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        
        System.out.print("Ingrese el primer apellido: ");
        String apellido1 = scanner.nextLine();

        
        System.out.print("Ingrese el segundo apellido: ");
        String apellido2 = scanner.nextLine();

        // Obtener las iniciales
        char inicialNombre = nombre.charAt(0);
        char inicialApellido1 = apellido1.charAt(0);
        char inicialApellido2 = apellido2.charAt(0);

      
        System.out.println("Las iniciales son: " + inicialNombre + inicialApellido1 + inicialApellido2);
    }
    
    
}
