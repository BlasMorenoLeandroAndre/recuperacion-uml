/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author ASUS 2024
 */
public class Ejerciciopropuesto1{
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas (n): ");
        int n = scanner.nextInt();

        // Bucle externo para las filas
        for (int i = 1; i <= n; i++) {
            // Bucle para imprimir espacios en blanco
            for (int j = i; j < n; j++) {
                System.out.print("    "); // Espacios en blanco
            }
            // Bucle interno para imprimir la parte izquierda de la pirámide
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Números ascendentes
            }
            // Bucle interno para imprimir la parte derecha de la pirámide
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j); // Números descendentes
            }
            System.out.println(); // Nueva línea después de cada fila
        }

        scanner.close();
    }
}