/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author ASUS 2024
 */
public class Empleado {
    private String nombre;
    private int edad;
    private String puesto;
    
    public Empleado(String nombre, int edad, String puesto) {
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public static void generarReporte() {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[5];

        // Recolectar datos para 5 empleados
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Ingrese los datos del empleado " + (i+1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer
            System.out.print("Puesto: ");
            String puesto = scanner.nextLine();
            
            empleados[i] = new Empleado(nombre, edad, puesto);
        }

        // Generar reporte HTML
        StringBuilder html = new StringBuilder();
        html.append("<html><head><title>Reporte de Empleados</title></head><body>");
        html.append("<h1>Reporte de Empleados</h1>");
        html.append("<table border='1'><tr><th>Nombre</th><th>Edad</th><th>Puesto</th></tr>");
        
        for (Empleado emp : empleados) {
            html.append("<tr><td>").append(emp.getNombre()).append("</td><td>").append(emp.getEdad())
                .append("</td><td>").append(emp.getPuesto()).append("</td></tr>");
        }
        
        html.append("</table>");
        html.append("<footer><p>Reporte generado el: ").append(java.time.LocalDate.now()).append("</p></footer>");
        html.append("</body></html>");
        
        System.out.println(html.toString());
    }
}
