/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author ASUS 2024
 */
public class Ejercicio3 {

    private static double BuenaNota;
    public static void main (String[] args) {
        final double excelente =20, bueno=17, regular=14,
                deficiente = 10;
double buenaNota, malaNota;
            Scanner myScan=new Scanner(System.in);
            System.out.println("Ingresa buenaNota:");
            BuenaNota = myScan.nextDouble();
            System.out.println("Ingresa malaNota:");
            malaNota = myScan.nextDouble();
            double imc;
            imc = BuenaNota/ (malaNota * malaNota);
            
            switch (imc < excelente ? 1 : imc >= bueno && imc < regular ? 2 : imc >= regular && imc < deficiente ? 3 : imc >= deficiente ? 4 : 0 ) {
                case 1 -> System.out.println("excelente");
                case 2 -> System.out.println("bueno");
                case 3 -> System.out.println("regular");
                case 4 -> System.out.println("deficiente");      
            }
    }  
}

    
