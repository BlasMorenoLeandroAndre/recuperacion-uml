/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author ASUS 2024
 */
public class ejercicioPropuesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadro (n): ");
        int n = scanner.nextInt();

        // Bucle externo para las filas
        for (int i = 1; i <= n; i++) {
            // Bucle interno para las columnas
            for (int j = 1; j <= n; j++) {
                // Condiciones para determinar qué carácter imprimir
                if (i == 1 || i == n) { // Primera y última fila
                    System.out.print("* "); // Esquinas
                } else { // Filas intermedias
                    if (j == 1 || j == n) { // Bordes
                        System.out.print("# "); // Bordes
                    } else {
                        System.out.print("  "); // Espacio vacío
                    }
                }
            }
            System.out.println(); // Nueva línea después de cada fila
        }

        scanner.close();
    }
}