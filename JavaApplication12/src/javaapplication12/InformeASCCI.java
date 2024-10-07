/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author ASUS 2024
 */
public class InformeASCCI {


    public static void generarInformeASCII() {
        // Cabecera del informe
        System.out.println("Informe ASCII: Tabla de Números, Cuadrados y Cubos");
        System.out.println("=============================================");
        System.out.printf("%-10s%-10s%-10s\n", "Número", "Cuadrado", "Cubo");
        System.out.println("---------------------------------------------");

        // Bucle for para generar los números
        for (int numero = 1; numero <= 10; numero++) {
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.printf("%-10d%-10d%-10d\n", numero, cuadrado, cubo);
        }

        System.out.println("=============================================");
    }

    public static void main(String[] args) {
        // Llamada a la función para generar el informe
        generarInformeASCII();
    }
}