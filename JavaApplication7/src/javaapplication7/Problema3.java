/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author ASUS 2024
 */
public class Problema3 {
    public static void main(String[] args) {
        // Pedir al usuario que ingrese un número
        try ( // Crear un objeto Scanner para leer datos del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Pedir al usuario que ingrese un número
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();
            // Utilizar estructura condicional doble para determinar el resultado
            if (numero > 0) {
                System.out.println("El número es positivo.");
            } else if (numero < 0) {
                System.out.println("El número es negativo.");
            } else {
                System.out.println("El número es cero.");
            }
            // Cerrar el objeto Scanner
        }
    }
}

