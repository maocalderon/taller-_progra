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
public class ejercicio_14 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día de la semana (del 1 al 7): ");
        int diaSemana = scanner.nextInt();

        String nombreDia = obtenerNombreDia(diaSemana);

        if (nombreDia.equals("ERROR")) {
            System.out.println("ERROR: número incorrecto.");
        } else {
            System.out.println("El día correspondiente es: " + nombreDia);
        }
    }

    private static String obtenerNombreDia(int numeroDia) {
        String[] diasSemana = {"ERROR", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        if (numeroDia >= 1 && numeroDia <= 7) {
            return diasSemana[numeroDia];
        } else {
            return "ERROR";
        }
    }
}
