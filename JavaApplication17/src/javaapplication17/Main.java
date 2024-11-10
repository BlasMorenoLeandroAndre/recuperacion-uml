/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author ASUS 2024
 */
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Seleccione el reporte que desea generar:");
        System.out.println("1. Reporte de Empleados");
        System.out.println("2. Reporte de Productos");
        System.out.println("3. Reporte de Estudiantes");
        System.out.println("4. Reporte de Clientes");
        System.out.println("5. Reporte de Ventas");

        int opcion = lector.nextInt();
        lector.nextLine(); // Limpiar el buffer

        switch(opcion) {
            case 1:
                Empleado.generarReporte();
                break;
            case 2:
                Producto.generarReporte();
                break;
            case 3:
                Estudiante.generarReporte();
                break;
            case 4:
                Cliente.generarReporte();
                break;
            case 5:
                Venta.generarReporte();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}