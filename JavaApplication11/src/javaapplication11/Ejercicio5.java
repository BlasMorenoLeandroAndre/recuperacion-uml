/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author ASUS 2024
 */
import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int opcion;
  do {
  System.out.println("1. Contador progresivo");
  System.out.println("2. Contador regresivo");
  System.out.println("3. Acumulador progresivo");
  System.out.println("4. Acumulador y contador");
  System.out.println("5. Salir");
  System.out.print("Seleccione una opción: ");
  opcion = scanner.nextInt();
  switch (opcion) {
  case 1:
  // Llamar al programa del contador progresivo
  break;
  case 2:
  // Llamar al programa del contador regresivo
  break;
  case 3:
  // Llamar al programa del acumulador progresivo
  break;
  case 4:
  // Llamar al programa del acumulador y contador
  break;
  case 5:
  System.out.println("Saliendo del menú...");
  break;
  default:
  System.out.println("Opción inválida");
  }
  } while (opcion != 5);
  }
}