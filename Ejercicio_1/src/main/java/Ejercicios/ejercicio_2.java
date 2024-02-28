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
public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        double perimetro = 2 * (base + altura);
        double area = base * altura;

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
    }
}
