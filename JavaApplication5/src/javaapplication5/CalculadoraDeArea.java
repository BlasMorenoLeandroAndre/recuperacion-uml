/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author ASUS 2024
 */


    /**
     */
  
        // TODO code application logic here
    
    

public class CalculadoraDeArea {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Seleccione la figura geométrica:");
            System.out.println("1. Círculo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.print("Ingrese el número correspondiente a la figura: ");
            int opcion = scanner.nextInt();
            
            double area = 0;
            
            switch (opcion) {
                case 1 -> {
                    // Área de un círculo
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    area = Math.PI * Math.pow(radio, 2);
                }
                    
                case 2 -> {
                    // Área de un rectángulo
                    System.out.print("Ingrese la longitud del rectángulo: ");
                    double longitud = scanner.nextDouble();
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    area = longitud * ancho;
                }
                    
                case 3 -> {
                    // Área de un triángulo
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    area = (base * altura) / 2;
                }
                    
                default -> {
                    System.out.println("Opción no válida.");
                    System.exit(0);
                }
            }
            
            System.out.println("El área de la figura seleccionada es: " + area);
        }
    }
}