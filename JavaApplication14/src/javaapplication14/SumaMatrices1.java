/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author ASUS 2024
 */
public class SumaMatrices1 {
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);

        // Leer las dimensiones de las matrices
        System.out.print("Ingrese el número de filas (m): ");
        int filas = Lector.nextInt();
        System.out.print("Ingrese el número de columnas (n): ");
        int columnas = Lector.nextInt();

        // Inicializar las matrices
        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];
        int[][] suma = new int[filas][columnas];

        // Leer la primera matriz
        System.out.println("Ingrese los elementos de la matriz A:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento A[" + i + "][" + j + "]: ");
                matrizA[i][j] = Lector.nextInt();
            }
        }

        // Leer la segunda matriz
        System.out.println("Ingrese los elementos de la matriz B:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento B[" + i + "][" + j + "]: ");
                matrizB[i][j] = Lector.nextInt();
            }
        }

        // Calcular la suma de las matrices
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Mostrar la matriz resultante
        System.out.println("La suma de las matrices A y B es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }

        Lector.close();
    }
}