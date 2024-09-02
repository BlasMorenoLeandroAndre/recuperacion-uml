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
public class Problema1 {
    public static void main(String[] args) {
        // Pedir al usuario que seleccione una operación
        try ( // Crear un objeto Scanner para leer datos del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Pedir al usuario que seleccione una operación
            System.out.println("Selecciona una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.print("Ingresa el número de la operación (1-4): ");
            int operacion = scanner.nextInt();
            // Pedir al usuario que ingrese dos números
            System.out.print("Ingresa el primer número: ");
            double numero1 = scanner.nextDouble();
            System.out.print("Ingresa el segundo número: ");
            double numero2 = scanner.nextDouble();
            // Realizar la operación seleccionada utilizando estructuras condicionales dobles
            switch (operacion) {
                case 1:
                {
                    // Suma
                    double resultado = numero1 + numero2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                }
                case 2:
                {
                    // Resta
                    double resultado = numero1 - numero2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                }
                case 3:
                {
                    // Multiplicación
                    double resultado = numero1 * numero2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                }
                case 4:
                    // División
                    if (numero2 != 0) {
                        double resultado = numero1 / numero2;
                        System.out.println("El resultado de la división es: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }   break;
                default:
                    System.out.println("Operación no válida. Por favor, selecciona un número entre 1 y 4.");
                    break;
            }
            // Cerrar el objeto Scanner
        }
    }
}

