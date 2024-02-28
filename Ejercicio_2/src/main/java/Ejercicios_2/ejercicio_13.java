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
public class ejercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el resultado obtenido al lanzar el dado: ");
        int resultadoDado = scanner.nextInt();

        String caraOpuesta = obtenerCaraOpuesta(resultadoDado);

        if (caraOpuesta.equals("ERROR")) {
            System.out.println("ERROR: número incorrecto.");
        } else {
            System.out.println("La cara opuesta es: " + caraOpuesta);
        }
    }

    private static String obtenerCaraOpuesta(int resultado) {
        String caraOpuesta = "ERROR";

        if (resultado >= 1 && resultado <= 6) {
            int[] carasOpuestas = {6, 5, 4, 3, 2, 1};
            caraOpuesta = String.valueOf(carasOpuestas[resultado - 1]);
        }

        return caraOpuesta;
    }
}
