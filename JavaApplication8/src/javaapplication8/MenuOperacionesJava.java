/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author ASUS 2024
 */

    public class MenuOperacionesJava {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            short opcion;
            int num1, num2;
            // Mostrar menú
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextShort(); // Leer la opción
            if (opcion >= 1 && opcion <= 4) {
                // Pedir números
                System.out.print("Introduce el primer número: ");
                num1 = scanner.nextInt();
                System.out.print("Introduce el segundo número: ");
                num2 = scanner.nextInt();
            } else {
                num1 = num2 = 0; // Valores por defecto
            }   // Evaluar opción
            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: División por cero.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            // Cerrar el escáner
        }
    }
}

