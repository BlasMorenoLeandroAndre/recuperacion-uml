/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author ASUS 2024
 */
public class EmpleadosReporte {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de empleados
        System.out.print("Ingrese el número de empleados: ");
        int n = scanner.nextInt();

        // Declarar arreglos paralelos
        String[] nombres = new String[n];
        int[] edades = new int[n];
        double[] salarios = new double[n];

        // Variables para contadores y acumuladores
        double salarioTotal = 0;
        int mayoresDeEdad = 0;

        // Solicitar datos para cada empleado
        for (int i = 0; i < n; i++) {
            System.out.println("\nEmpleado #" + (i + 1));
            System.out.print("Nombre: ");
            nombres[i] = scanner.next();

            System.out.print("Edad: ");
            edades[i] = scanner.nextInt();

            System.out.print("Salario: ");
            salarios[i] = scanner.nextDouble();

            // Acumuladores
            salarioTotal += salarios[i];
            if (edades[i] >= 18) {
                mayoresDeEdad++;
            }
        }

        // Calcular el salario promedio
        double salarioPromedio = salarioTotal / n;

        // Mostrar el reporte ASCII
        System.out.println("\n--- Reporte de Empleados ---");
        System.out.printf("%-15s %-10s %-10s\n", "Nombre", "Edad", "Salario");
        System.out.println("-------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-15s %-10d %-10.2f\n", nombres[i], edades[i], salarios[i]);
        }

        // Mostrar estadísticas
        System.out.println("\n--- Estadísticas ---");
        System.out.printf("Total de salarios: %.2f\n", salarioTotal);
        System.out.printf("Salario promedio: %.2f\n", salarioPromedio);
        System.out.println("Cantidad de empleados mayores de edad: " + mayoresDeEdad);

        scanner.close();
    }
}