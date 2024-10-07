/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author ASUS 2024
 */
public class SumaProgresiva1 {
    public static void main(String[] args) {
        // Declaración de variables
        int suma = 0; // Acumulador
        int contador = 1; // Contador inicial

        // Estructura de control "for"
        for (int i = 1; i <= 10; i++) {
            suma += i; // Se suma el valor de i a la variable "suma"
            System.out.println("Iteración: " + i + ", suma acumulada: " + suma + ", contador: " + contador);
            contador++; // Incremento del contador
        }

        // Resultado final
        System.out.println("La suma de los números del 1 al 10 es: " + suma);
    }
}