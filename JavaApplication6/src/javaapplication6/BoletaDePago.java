/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author ASUS 2024
 */



public class BoletaDePago {
    
    public static void main(String[] args) {
        // Pedir al usuario que ingrese el subtotal
        try ( // Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Pedir al usuario que ingrese el subtotal
            System.out.print("Ingrese el subtotal: $");
            double subtotal = scanner.nextDouble();
            // Pedir al usuario que ingrese el porcentaje de descuento
            System.out.print("Ingrese el porcentaje de descuento: ");
            double porcentajeDescuento = scanner.nextDouble();
            // Calcular el descuento
            double descuento = subtotal * (porcentajeDescuento / 100);
            // Calcular el total después del descuento
            double total = subtotal - descuento;
            // Imprimir la boleta de pago
            System.out.println("\n** BOLETA DE PAGO **");
            System.out.printf("Subtotal:          $%.2f\n", subtotal);
            System.out.printf("Descuento:         -$%.2f\n", descuento);
            System.out.printf("Total a pagar:     $%.2f\n", total);
            // Cerrar el scanner
        }
    }
}