/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author ASUS 2024
 */
public class reporteASCII3 {

    public static void main(String[] args) {
        // Ejemplo de matriz de enteros
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Generar el reporte ASCII
        generarReporte(matriz);
    }
    
    public static void generarReporte(int[][] matriz) {
        // Calcular la suma y el promedio
        int sumaTotal = 0;
        int numElementos = 0;
        
        for (int[] fila : matriz) {
            for (int valor : fila) {
                sumaTotal += valor;
                numElementos++;
            }
        }
        
        double promedio = (double) sumaTotal / numElementos;

        // Crear el reporte ASCII
        System.out.println("===== Reporte ASCII =====");
        System.out.println("Matriz:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nSuma total: " + sumaTotal);
        System.out.println("Promedio: " + promedio);
        System.out.println("=========================");
    }
}