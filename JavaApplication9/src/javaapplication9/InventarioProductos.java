/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author ASUS 2024
 */
import java.util.Scanner;

public class InventarioProductos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar los datos de los 5 productos
        String nombreProducto1, nombreProducto2, nombreProducto3, nombreProducto4, nombreProducto5;
        int cantidadProducto1, cantidadProducto2, cantidadProducto3, cantidadProducto4, cantidadProducto5;
        double precioProducto1, precioProducto2, precioProducto3, precioProducto4, precioProducto5;
        int categoriaProducto1, categoriaProducto2, categoriaProducto3, categoriaProducto4, categoriaProducto5;

        // Entrada de datos para los productos
        System.out.println("Ingrese el nombre del producto #1:");
        nombreProducto1 = scanner.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #1:");
        cantidadProducto1 = scanner.nextInt();
        System.out.println("Ingrese el precio unitario del producto #1:");
        precioProducto1 = scanner.nextDouble();
        System.out.println("Ingrese la categoría del producto #1 (1: Electrónicos, 2: Alimentos, 3: Ropa):");
        categoriaProducto1 = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea restante

        System.out.println("Ingrese el nombre del producto #2:");
        nombreProducto2 = scanner.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #2:");
        cantidadProducto2 = scanner.nextInt();
        System.out.println("Ingrese el precio unitario del producto #2:");
        precioProducto2 = scanner.nextDouble();
        System.out.println("Ingrese la categoría del producto #2 (1: Electrónicos, 2: Alimentos, 3: Ropa):");
        categoriaProducto2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del producto #3:");
        nombreProducto3 = scanner.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #3:");
        cantidadProducto3 = scanner.nextInt();
        System.out.println("Ingrese el precio unitario del producto #3:");
        precioProducto3 = scanner.nextDouble();
        System.out.println("Ingrese la categoría del producto #3 (1: Electrónicos, 2: Alimentos, 3: Ropa):");
        categoriaProducto3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del producto #4:");
        nombreProducto4 = scanner.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #4:");
        cantidadProducto4 = scanner.nextInt();
        System.out.println("Ingrese el precio unitario del producto #4:");
        precioProducto4 = scanner.nextDouble();
        System.out.println("Ingrese la categoría del producto #4 (1: Electrónicos, 2: Alimentos, 3: Ropa):");
        categoriaProducto4 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del producto #5:");
        nombreProducto5 = scanner.nextLine();
        System.out.println("Ingrese la cantidad en inventario del producto #5:");
        cantidadProducto5 = scanner.nextInt();
        System.out.println("Ingrese el precio unitario del producto #5:");
        precioProducto5 = scanner.nextDouble();
        System.out.println("Ingrese la categoría del producto #5 (1: Electrónicos, 2: Alimentos, 3: Ropa):");
        categoriaProducto5 = scanner.nextInt();

        // Cálculo y salida de los valores
        calcularYMostrarResumen(nombreProducto1, cantidadProducto1, precioProducto1, categoriaProducto1);
        calcularYMostrarResumen(nombreProducto2, cantidadProducto2, precioProducto2, categoriaProducto2);
        calcularYMostrarResumen(nombreProducto3, cantidadProducto3, precioProducto3, categoriaProducto3);
        calcularYMostrarResumen(nombreProducto4, cantidadProducto4, precioProducto4, categoriaProducto4);
        calcularYMostrarResumen(nombreProducto5, cantidadProducto5, precioProducto5, categoriaProducto5);
    }

    // Método para calcular y mostrar el resumen de cada producto
    public static void calcularYMostrarResumen(String nombre, int cantidad, double precioUnitario, int categoria) {
        double valorTotal = cantidad * precioUnitario;
        double descuento = 0;

        // Aplicar descuento por cantidad
        if (cantidad > 100) {
            descuento = 0.20;
        } else if (cantidad > 50) {
            descuento = 0.10;
        }

        double valorTotalConDescuento = valorTotal * (1 - descuento);

        // Mostrar detalles del producto
        System.out.println("Producto: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Valor total antes de descuentos: " + valorTotal);

        if (descuento > 0) {
            System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
            System.out.println("Valor total después de descuentos: " + valorTotalConDescuento);
        } else {
            System.out.println("Descuento aplicado: No hay descuento (Cantidad menor o igual a 50)");
            System.out.println("Valor total después de descuentos: " + valorTotalConDescuento);
        }

        // Mostrar mensaje según la categoría
        switch (categoria) {
            case 1:
                System.out.println("Producto electrónico. Revisar garantía.");
                break;
            case 2:
                System.out.println("Producto alimenticio. Revisar fecha de caducidad.");
                break;
            case 3:
                System.out.println("Producto de ropa. Revisar tallas disponibles.");
                break;
            default:
                System.out.println("Categoría no válida.");
                break;
        }

        // Evaluar si se debe mostrar el mensaje de advertencia
        if (valorTotalConDescuento > 500) {
            System.out.println("Atención: Se recomienda reducir el inventario ya que el valor total supera los 500 soles.");
        }

        
    }
}