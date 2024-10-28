/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS 2024
 */
public class OrdenarMatrizPorFila2 {
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);

        // Leer las dimensiones de la matriz
        System.out.print("Ingrese el número de filas (m): ");
        int filas = Lector.nextInt();
        System.out.print("Ingrese el número de columnas (n): ");
        int columnas = Lector.nextInt();

        // Inicializar la matriz
        int[][] matriz = new int[filas][columnas];

        // Leer la matriz
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = Lector.nextInt();
            }
        }

        // Ordenar cada fila de la matriz
        for (int i = 0; i < filas; i++) {
            Arrays.sort(matriz[i]);
        }

        // Mostrar la matriz ordenada
        System.out.println("La matriz con las filas ordenadas es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        Lector.close();
    }
}