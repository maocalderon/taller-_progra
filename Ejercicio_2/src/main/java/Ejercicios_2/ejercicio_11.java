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
public class ejercicio_11 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de alumnos: ");
        int numeroAlumnos = scanner.nextInt();

        double costoPorAlumno;
        double costoRentaAutobus = 4000.0;

        if (numeroAlumnos >= 100) {
            costoPorAlumno = 65.0;
        } else if (numeroAlumnos >= 50) {
            costoPorAlumno = 70.0;
        } else if (numeroAlumnos >= 30) {
            costoPorAlumno = 95.0;
        } else {
            costoPorAlumno = costoRentaAutobus / numeroAlumnos;
        }

        double pagoTotalAutobus = costoPorAlumno * numeroAlumnos;

        System.out.println("Costo por alumno: " + costoPorAlumno + " euros.");
        System.out.println("Pago total a la compañía de autobuses: " + pagoTotalAutobus + " euros.");
    }
}
