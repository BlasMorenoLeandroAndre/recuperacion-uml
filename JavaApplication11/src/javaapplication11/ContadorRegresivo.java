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
public class ContadorRegresivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero positivo para iniciar el contador regresivo: ");
        int numero = scanner.nextInt();
        
        // Validar que el número sea positivo
        if (numero <= 0) {
            System.out.println("Por favor, introduce un número entero positivo.");
        } else {
            int contador = numero;
            do {
                System.out.println(contador);
                contador--; // Decrementar el contador
            } while (contador > 0); // Continuar hasta que el contador sea mayor que 0
        }
        
        scanner.close();
    }
}