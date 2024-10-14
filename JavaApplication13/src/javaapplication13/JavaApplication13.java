/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS 2024
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // Solicitar la cantidad de datos
        try (Scanner sc = new Scanner(System.in)) {
            // Solicitar la cantidad de datos
            System.out.print("Ingrese la cantidad de elementos: ");
            int n = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer
            
            // Crear arreglos paralelos
            String[] nombres = new String[n];
            int[] edades = new int[n];
            
            // Solicitar los datos
            for (int i = 0; i < n; i++) {
                System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
                nombres[i] = sc.nextLine();
                System.out.print("Ingrese la edad de " + nombres[i] + ": ");
                edades[i] = sc.nextInt();
                sc.nextLine();  // Limpiar el buffer
            }
            
            // Mostrar el menú de opciones
            System.out.println("\nSeleccione la opción de ordenamiento:");
            System.out.println("1. Ordenar por nombre (Ascendente)");
            System.out.println("2. Ordenar por nombre (Descendente)");
            System.out.println("3. Ordenar por edad (Ascendente)");
            System.out.println("4. Ordenar por edad (Descendente)");
            int opcion = sc.nextInt();
            
            // Crear un arreglo de índices para mantener la relación entre nombres y edades
            Integer[] indices = new Integer[n];
            for (int i = 0; i < n; i++) {
                indices[i] = i;
            }
            
            // Ordenar según la opción seleccionada
            switch (opcion) {
                case 1 -> Arrays.sort(indices, (i1, i2) -> nombres[i1].compareTo(nombres[i2]));  // Ascendente por nombre
                case 2 -> Arrays.sort(indices, (i1, i2) -> nombres[i2].compareTo(nombres[i1]));  // Descendente por nombre
                case 3 -> Arrays.sort(indices, (i1, i2) -> Integer.compare(edades[i1], edades[i2]));  // Ascendente por edad
                case 4 -> Arrays.sort(indices, (i1, i2) -> Integer.compare(edades[i2], edades[i1]));  // Descendente por edad
                default -> {
                    System.out.println("Opción no válida.");
                    return;
                }
            }
            
            // Mostrar los datos ordenados
            System.out.println("\nDatos ordenados:");
            for (int i = 0; i < n; i++) {
                System.out.println(nombres[indices[i]] + " - " + edades[indices[i]] + " años");
            }
        }
    }
}