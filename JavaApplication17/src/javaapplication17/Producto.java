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

public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public static void generarReporte() {
        Scanner lector = new Scanner(System.in);
        Producto[] productos = new Producto[5];

        // Recolectar datos para 5 productos
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Ingrese los datos del producto " + (i+1));
            System.out.print("Nombre: ");
            String nombre = lector.nextLine();
            System.out.print("Precio: ");
            double precio = lector.nextDouble();
            System.out.print("Cantidad: ");
            int cantidad = lector.nextInt();
            lector.nextLine();  // Limpiar el buffer
            
            productos[i] = new Producto(nombre, precio, cantidad);
        }

        // Generar reporte HTML
        StringBuilder html = new StringBuilder();
        html.append("<html><head><title>Reporte de Productos</title></head><body>");
        html.append("<h1>Reporte de Productos</h1>");
        html.append("<table border='1'><tr><th>Nombre</th><th>Precio</th><th>Cantidad</th></tr>");
        
        for (Producto prod : productos) {
            html.append("<tr><td>").append(prod.getNombre()).append("</td><td>").append(prod.getPrecio())
                .append("</td><td>").append(prod.getCantidad()).append("</td></tr>");
        }
        
        html.append("</table>");
        html.append("<footer><p>Reporte generado el: ").append(java.time.LocalDate.now()).append("</p></footer>");
        html.append("</body></html>");
        
        System.out.println(html.toString());
    }
}