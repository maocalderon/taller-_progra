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
public class ejercicio_3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

       
        if (numero2 != 0) {
            
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
          
            System.out.println("Error: No se puede dividir por 0.");
        }
    }
}
