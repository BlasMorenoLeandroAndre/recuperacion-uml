/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author ASUS 2024
 */



public class ejercicio3 {
    public static void main(String[]args){
        //variable de entrada
        LocalDateTime fechaHora = LocalDateTime.now();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaHora.format(formatoFecha);
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH/MM/ss");
        String horaFormateada = fechaHora.format(formatoHora);
        
        Scanner p = new Scanner(System.in);
        String nombre;
        double retiro;
        double saldo = 2000;
        //variable de salida
        double montoFinal;
        //captura de datos
        System.out.println("Ingrese su nombre");
        nombre = p.nextLine();
        System.out.println("Ingrese monto de retiro");
        retiro = p.nextDouble();
        //Proceso
        montoFinal = saldo - retiro;
        //salida
        System.out.println("##############################");
        System.out.println("BANCO ABC");
        System.out.println("RETIRO");
        System.out.println("AV.Lima Norte 224");
        System.out.println("##############################");
        System.out.println("FECHA: "+fechaFormateada+" HORA: "+horaFormateada);
        System.out.println("CLIENTE: "+nombre);
        System.out.println("MONTO DE RETIRO: "+retiro);
        System.out.println("TOTAL SALDO: "+montoFinal);
        System.out.println("##############################");
    }
}
       