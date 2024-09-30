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
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero; // Variable para almacenar los números ingresados por el usuario
        int acumulador = 0; // Inicializamos el acumulador en 0

        // Ciclo do-while
        do {
            System.out.print("Ingresa un número (negativo para terminar): ");
            numero = scanner.nextInt(); // Leemos el número ingresado
            if (numero >= 0) {
                acumulador += numero; // Acumulamos el número si es positivo
            }
        } while (numero >= 0); // El ciclo se repite mientras el número sea positivo o cero

        // Mostramos el resultado
        System.out.println("La suma total es: " + acumulador);
    }
}