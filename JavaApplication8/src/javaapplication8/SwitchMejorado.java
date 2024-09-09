/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author ASUS 2024
 */
public class SwitchMejorado {
    public static void main(String[] args) {
        char opcion = 'B'; // Ejemplo de entrada

        String resultado = switch (opcion) {
            case 'A', 'a' -> "Opción A seleccionada";
            case 'B', 'b' -> "Opción B seleccionada";
            case 'C', 'c' -> "Opción C seleccionada";
            case 'D', 'd' -> "Opción D seleccionada";
            default -> "Opción no válida";
        };

        System.out.println(resultado);
    }
}
