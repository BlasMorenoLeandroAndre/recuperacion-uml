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
public class CopiaDeArreglos {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Solicitar al usuario el número de valores a ingresar
        System.out.print("¿Cuántos valores desea ingresar? ");
        int n = lector.nextInt();
        lector.nextLine(); // Consumir el salto de línea

        // Crear el arreglo y solicitar valores
        String[] arregloOriginal = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + ": ");
            arregloOriginal[i] = lector.nextLine();
        }

        // Menú para decidir si la copia es total o parcial
        System.out.println("\nSeleccione una opción:");
        System.out.println("1. Copiar todo el arreglo");
        System.out.println("2. Copiar una parte del arreglo");
        int opcion = lector.nextInt();

        String[] arregloCopiado;

        if (opcion == 1) {
            // Copia total
            arregloCopiado = arregloOriginal.clone();
        } else {
            // Copia parcial
            System.out.print("Ingrese el índice inicial (0 - " + (n - 1) + "): ");
            int inicio = lector.nextInt();
            System.out.print("Ingrese el índice final (0 - " + (n - 1) + "): ");
            int fin = lector.nextInt();
            
            // Copiar el rango seleccionado
            arregloCopiado = new String[fin - inicio + 1];
            for (int i = 0; i < arregloCopiado.length; i++) {
                arregloCopiado[i] = arregloOriginal[inicio + i];
            }
        }

        // Mostrar el arreglo copiado
        System.out.println("\nArreglo copiado:");
        for (String valor : arregloCopiado) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}