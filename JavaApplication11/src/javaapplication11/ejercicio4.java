/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author ASUS 2024
 */
import java.util.Scanner;

public class ejercicio4 {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int contador = 0;
  int acumulador = 0;
  int numero;

  do {
  System.out.print("Ingrese un número (ingrese un número negativo para terminar): ");
  numero = input.nextInt();
  if (numero >= 0) {
  acumulador += numero; // Sumar el número al acumulador
  contador++; // Incrementar el contador
  }
  } while (numero >= 0);

  System.out.println("La suma de los números ingresados es: " + acumulador);
  System.out.println("Se ingresaron " + contador + " números positivos.");
  }
}