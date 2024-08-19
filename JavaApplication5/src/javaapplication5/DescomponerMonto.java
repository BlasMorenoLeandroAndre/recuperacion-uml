/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author ASUS 2024
 */

    

public class DescomponerMonto {
    public static void main(String[] args) {
        // Solicitar el monto total al usuario
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar el monto total al usuario
            System.out.print("Ingrese el monto total: ");
            double montoTotal = scanner.nextDouble();
            
            // Definir la tasa de IGV
            double tasaIGV = 0.18;
            
            // Calcular el monto base (antes de impuestos)
            double montoBase = montoTotal / (1 + tasaIGV);
            
            // Calcular el IGV
            double igv = montoTotal - montoBase;
            
            // Mostrar los resultados
            System.out.println("Monto base (antes de impuestos): " + String.format("%.2f", montoBase));
            System.out.println("IGV (18%): " + String.format("%.2f", igv));
        }
    }
}