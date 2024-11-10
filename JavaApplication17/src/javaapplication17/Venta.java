/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

/**
 *
 * @author ASUS 2024
 */
public class Venta {
    private String producto;
    private int cantidad;
    private double total;
    
    public Venta(String producto, int cantidad, double total) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public static void generarReporte() {
        Venta[] ventas = {
            new Venta("Laptop", 3, 2401.50),
            new Venta("Teclado", 5, 154.95),
            new Venta("Mouse", 10, 154.90),
            new Venta("Monitor", 2, 401.50),
            new Venta("Auriculares", 8, 407.92)
        };
        
        StringBuilder html = new StringBuilder();
        html.append("<html><head><title>Reporte de Ventas</title></head><body>");
        html.append("<h1>Reporte de Ventas</h1>");
        html.append("<table border='1'><tr><th>Producto</th><th>Cantidad</th><th>Total</th></tr>");
        
        for (Venta ven : ventas) {
            html.append("<tr><td>").append(ven.getProducto()).append("</td><td>").append(ven.getCantidad())
                .append("</td><td>").append(ven.getTotal()).append("</td></tr>");
        }
        
        html.append("</table>");
        html.append("<footer><p>Reporte generado el: ").append(java.time.LocalDate.now()).append("</p></footer>");
        html.append("</body></html>");
        
        System.out.println(html.toString());
    }
}