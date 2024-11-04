
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS 2024
 */
// Clase base
class Persona {
    private String nombre;
    private int edad;

    // Constructor vacío
    public Persona() {
        this.nombre = "";
        this.edad = 0;
    }

    // Constructor completo
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

// Clase derivada
class Estudiante extends Persona {
    private String matricula;

    // Constructor vacío
    public Estudiante() {
        super();
        this.matricula = "";
    }

    // Constructor completo
    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", Edad: " + getEdad() + ", Matrícula: " + matricula;
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Leer datos de la persona
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = lector.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = lector.nextInt();
        lector.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese la matrícula del estudiante: ");
        String matricula = lector.nextLine();

        // Crear una instancia de Estudiante
        Estudiante estudiante = new Estudiante(nombre, edad, matricula);

        // Mostrar los datos del estudiante
        System.out.println("\nDatos del estudiante:");
        System.out.println(estudiante);

        lector.close();
    }
}