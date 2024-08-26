/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author ASUS 2024
 */



class Boleto {
    private final String nombre;
    private final String dni;
    private final String origen;
    private final String destino;
    private final String fecha;
    private final String hora;
    private final String asiento;

    public Boleto(String nombre, String dni, String origen, String destino, String fecha, String hora, String asiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.asiento = asiento;
    }

    public void imprimirBoleto() {
        System.out.println("****************");
        System.out.println("             BOLETO DE VIAJE");
        System.out.println("****************");
        System.out.println("Nombre del pasajero: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Fecha de viaje: " + fecha);
        System.out.println("Hora de salida: " + hora);
        System.out.println("Asiento: " + asiento);
        System.out.println("****************");
        System.out.println("    ¡Gracias por viajar con nosotros!");
        System.out.println("****************");
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingrese su DNI: ");
            String dni = scanner.nextLine();
            
            System.out.print("Ingrese la ciudad de origen: ");
            String origen = scanner.nextLine();
            
            System.out.print("Ingrese la ciudad de destino: ");
            String destino = scanner.nextLine();
            
            System.out.print("Ingrese la fecha de viaje (dd/mm/aaaa): ");
            String fecha = scanner.nextLine();
            
            System.out.print("Ingrese la hora de salida (HH:MM): ");
            String hora = scanner.nextLine();
            
            System.out.print("Ingrese el número de asiento: ");
            String asiento = scanner.nextLine();
            
            Boleto boleto = new Boleto(nombre, dni, origen, destino, fecha, hora, asiento);
            boleto.imprimirBoleto();
        }
    }
}