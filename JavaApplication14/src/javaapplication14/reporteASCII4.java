/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

/**
 *
 * @author ASUS 2024
 */
public class reporteASCII4 {

    public static void main(String[] args) {
        // Datos de ejemplo
        String[] estudiantes = {"Juan", "Ana", "Luis"};
        String[] asignaturas = {"Matemáticas", "Historia", "Ciencias"};
        
        // Matriz de puntajes (filas son estudiantes y columnas son asignaturas)
        int[][] puntajes = {
            {85, 90, 80},
            {70, 75, 85},
            {95, 100, 90}
        };
        
        // Generar el reporte ASCII
        generarReporte(estudiantes, asignaturas, puntajes);
    }
    
    public static void generarReporte(String[] estudiantes, String[] asignaturas, int[][] puntajes) {
        // Calcular el promedio de cada estudiante y asignatura
        int numEstudiantes = estudiantes.length;
        int numAsignaturas = asignaturas.length;
        
        // Imprimir encabezado del reporte
        System.out.println("===== Reporte de Puntajes =====");
        
        // Encabezado con asignaturas
        System.out.print("Estudiante\t");
        for (String asignatura : asignaturas) {
            System.out.print(asignatura + "\t");
        }
        System.out.println("Promedio");
        
        // Imprimir los puntajes de cada estudiante y calcular su promedio
        for (int i = 0; i < numEstudiantes; i++) {
            int sumaEstudiante = 0;
            System.out.print(estudiantes[i] + "\t");
            for (int j = 0; j < numAsignaturas; j++) {
                System.out.print(puntajes[i][j] + "\t\t");
                sumaEstudiante += puntajes[i][j];
            }
            double promedioEstudiante = (double) sumaEstudiante / numAsignaturas;
            System.out.printf("%.2f%n", promedioEstudiante);
        }
        
        // Calcular y mostrar el promedio por asignatura
        System.out.print("Promedio\t");
        for (int j = 0; j < numAsignaturas; j++) {
            int sumaAsignatura = 0;
            for (int i = 0; i < numEstudiantes; i++) {
                sumaAsignatura += puntajes[i][j];
            }
            double promedioAsignatura = (double) sumaAsignatura / numEstudiantes;
            System.out.printf("%.2f\t\t", promedioAsignatura);
        }
        System.out.println();
        
        System.out.println("===============================");
    }
}