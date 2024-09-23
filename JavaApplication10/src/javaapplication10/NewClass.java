/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author ASUS 2024
 */
public class NewClass {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("¿Cuántos datos deseas ingresar? ");
            int n = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            String[] datos = new String[n];
            int contador = 0;
            
            while (contador < n) {
                System.out.print("Ingresa el dato " + (contador + 1) + ": ");
                datos[contador] = scanner.nextLine();
                contador++;
            }
            
            System.out.println("Los datos ingresados son:");
            for (String dato : datos) {
                System.out.println(dato);
            }
        }
    }
}