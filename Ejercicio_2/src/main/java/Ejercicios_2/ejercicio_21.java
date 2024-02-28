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
public class ejercicio_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        int limiteInferior, limiteSuperior;

        do {
            System.out.print("Ingrese el límite inferior del intervalo: ");
            limiteInferior = scanner.nextInt();

            System.out.print("Ingrese el límite superior del intervalo: ");
            limiteSuperior = scanner.nextInt();

            if (limiteInferior > limiteSuperior) {
                System.out.println("Error: El límite inferior debe ser menor o igual al límite superior. Inténtelo de nuevo.");
            }
        } while (limiteInferior > limiteSuperior);

       
        int sumaDentroIntervalo = 0;
        int numerosFueraIntervalo = 0;
        boolean hayIgualLimite = false;

        // Pedir números hasta que se introduzca 0
        int numero;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                // Realizar el análisis
                if (numero > limiteInferior && numero < limiteSuperior) {
                    sumaDentroIntervalo += numero;
                } else {
                    numerosFueraIntervalo++;
                }

                if (numero == limiteInferior || numero == limiteSuperior) {
                    hayIgualLimite = true;
                }
            }
        } while (numero != 0);

        // Mostrar resultados
        System.out.println("Suma de números dentro del intervalo: " + sumaDentroIntervalo);
        System.out.println("Números fuera del intervalo: " + numerosFueraIntervalo);
        System.out.println("¿Hemos introducido algún número igual a los límites del intervalo?: " + (hayIgualLimite ? "Sí" : "No"));
    }
}
