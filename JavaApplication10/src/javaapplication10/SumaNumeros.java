/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author ASUS 2024
 */
 import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para recibir la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero positivo
        System.out.print("Introduce un número entero positivo: ");
        int n = scanner.nextInt();

        // Inicializar variables
        int suma = 0;
        int contador = 1;

        // Usar un bucle while para realizar la suma
        while (contador <= n) {
            suma += contador;
            contador++;
        }

        // Mostrar el resultado
        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
        
        // Cerrar el objeto Scanner
        scanner.close();
    }
}