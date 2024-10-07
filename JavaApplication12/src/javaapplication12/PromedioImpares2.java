/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author ASUS 2024
 */
public class PromedioImpares2 {
    public static void main(String[] args) {
        // Declaración de variables
        int sumaImpares = 0; // Acumulador de números impares
        int contadorImpares = 0; // Contador de números impares

        // Estructura de control "for"
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) { // Verifica si el número es impar
                sumaImpares += i; // Acumula el número impar
                contadorImpares++; // Incrementa el contador de números impares
                System.out.println("Número impar: " + i + ", suma acumulada: " + sumaImpares + ", contador: " + contadorImpares);
            }
        }

        // Calcular el promedio
        double promedio = (double) sumaImpares / contadorImpares;

        // Mostrar el resultado final
        System.out.println("El promedio de los números impares del 1 al 20 es: " + promedio);
    }
}