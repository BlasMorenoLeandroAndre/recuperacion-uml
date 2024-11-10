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
public class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    
    public Cliente(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static void generarReporte() {
        Scanner scanner = new Scanner(System.in);
        Cliente[] clientes = new Cliente[5];

        // Recolectar datos para 5 clientes
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Ingrese los datos del cliente " + (i+1));
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();
            
            clientes[i] = new Cliente(nombre, direccion, telefono);
        }

        // Generar reporte HTML
        StringBuilder html = new StringBuilder();
        html.append("<html><head><title>Reporte de Clientes</title></head><body>");
        html.append("<h1>Reporte de Clientes</h1>");
        html.append("<table border='1'><tr><th>Nombre</th><th>Dirección</th><th>Teléfono</th></tr>");
        
        for (Cliente cli : clientes) {
            html.append("<tr><td>").append(cli.getNombre()).append("</td><td>").append(cli.getDireccion())
                .append("</td><td>").append(cli.getTelefono()).append("</td></tr>");
        }
        
        html.append("</table>");
        html.append("<footer><p>Reporte generado el: ").append(java.time.LocalDate.now()).append("</p></footer>");
        html.append("</body></html>");
        
        System.out.println(html.toString());
    }
}