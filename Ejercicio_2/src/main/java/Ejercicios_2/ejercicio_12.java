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
public class ejercicio_12 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la duración de la llamada en minutos: ");
        int duracionLlamada = scanner.nextInt();

        System.out.print("Ingrese el día de la semana (1 para domingo, 2 para otro día): ");
        int diaSemana = scanner.nextInt();

        System.out.print("Ingrese el turno de la llamada (1 para mañana, 2 para tarde): ");
        int turnoLlamada = scanner.nextInt();

        double costoLlamada = calcularCostoLlamada(duracionLlamada);
        double impuesto = calcularImpuesto(diaSemana, turnoLlamada);
        double costoTotal = costoLlamada + impuesto;

        System.out.println("Costo de la llamada: " + costoLlamada + " euros.");
        System.out.println("Impuesto aplicado: " + impuesto + " euros.");
        System.out.println("Costo total: " + costoTotal + " euros.");
    }

    private static void mostrarResultado(double costoLlamada, double impuesto, double costoTotal) {
        System.out.println("Costo de la llamada: " + costoLlamada + " euros.");
        System.out.println("Impuesto aplicado: " + impuesto + " euros.");
        System.out.println("Costo total: " + costoTotal + " euros.");
    }

    private static double calcularCostoLlamada(int duracion) {
        double costo = 0.0;

        if (duracion <= 5) {
            costo = 1.0;
        } else if (duracion <= 8) {
            costo = 1.0 + (duracion - 5) * 0.8;
        } else if (duracion <= 10) {
            costo = 1.0 + 3 * 0.8 + (duracion - 8) * 0.7;
        } else {
            costo = 1.0 + 3 * 0.8 + 2 * 0.7 + (duracion - 10) * 0.5;
        }

        return costo;
    }

    private static double calcularImpuesto(int diaSemana, int turno) {
        double impuesto = 0.0;

        if (diaSemana == 1) {
            impuesto = calcularCostoLlamada(1) * 0.03;
        } else {
            impuesto = calcularCostoLlamada(1) * (turno == 1 ? 0.15 : 0.1);
        }

        return impuesto;
    }    
}
