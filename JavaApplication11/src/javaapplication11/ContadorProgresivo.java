/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author ASUS 2024
 */
public class ContadorProgresivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0; // Contador para los números ingresados
        int numero; // Variable para almacenar el número ingresado

        do {
            System.out.print("Ingrese un número (ingrese un número negativo para salir): ");
            numero = scanner.nextInt(); // Leer el número ingresado

            if (numero >= 0) {
                contador++; // Incrementar el contador si el número es no negativo
            }
        } while (numero >= 0); // Continuar hasta que se ingrese un número negativo

        System.out.println("Usted ingresó " + contador + " números no negativos.");
        scanner.close(); // Cerrar el escáner
    }
}