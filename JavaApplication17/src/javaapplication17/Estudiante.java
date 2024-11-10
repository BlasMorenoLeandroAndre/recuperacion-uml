/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author ASUS 2024
 */
import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private String carrera;
    private double promedio;
    
    public Estudiante(String nombre, String carrera, double promedio) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public static void generarReporte() {
        Scanner scanner = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[5];

        // Recolectar datos para 5 estudiantes
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingrese los datos del estudiante " + (i+1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Carrera: ");
            String carrera = scanner.nextLine();
            System.out.print("Promedio: ");
            double promedio = scanner.nextDouble();
            scanner.nextLine();  // Limpiar el buffer
            
            estudiantes[i] = new Estudiante(nombre, carrera, promedio);
        }

        // Generar reporte HTML
        StringBuilder html = new StringBuilder();
        html.append("<html><head><title>Reporte de Estudiantes</title></head><body>");
        html.append("<h1>Reporte de Estudiantes</h1>");
        html.append("<table border='1'><tr><th>Nombre</th><th>Carrera</th><th>Promedio</th></tr>");
        
        for (Estudiante est : estudiantes) {
            html.append("<tr><td>").append(est.getNombre()).append("</td><td>").append(est.getCarrera())
                .append("</td><td>").append(est.getPromedio()).append("</td></tr>");
        }
        
        html.append("</table>");
        html.append("<footer><p>Reporte generado el: ").append(java.time.LocalDate.now()).append("</p></footer>");
        html.append("</body></html>");
        
        System.out.println(html.toString());
    }
}