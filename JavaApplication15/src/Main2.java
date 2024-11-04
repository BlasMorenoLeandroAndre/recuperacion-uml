
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS 2024
 */
class Estudiante {
    private String nombre;
    private int edad;
    private String matricula;
    private String carrera;
    private int anoIngreso;
    private double promedio;

    // Constructor vacío
    public Estudiante() {
        this.nombre = "";
        this.edad = 0;
        this.matricula = "";
        this.carrera = "";
        this.anoIngreso = 0;
        this.promedio = 0.0;
    }

    // Constructor completo
    public Estudiante(String nombre, int edad, String matricula, String carrera, int anoIngreso, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
        this.carrera = carrera;
        this.anoIngreso = anoIngreso;
        this.promedio = promedio;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }
    public int getAnoIngreso() { return anoIngreso; }
    public void setAnoIngreso(int anoIngreso) { this.anoIngreso = anoIngreso; }
    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) { this.promedio = promedio; }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", matricula='" + matricula + '\'' +
                ", carrera='" + carrera + '\'' +
                ", anoIngreso=" + anoIngreso +
                ", promedio=" + promedio +
                '}';
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);

        Estudiante estudiante = new Estudiante();

        System.out.print("Ingrese el nombre del estudiante: ");
        estudiante.setNombre(Lector.nextLine());

        System.out.print("Ingrese la edad del estudiante: ");
        estudiante.setEdad(Lector.nextInt());
        Lector.nextLine(); // Consumir nueva línea

        System.out.print("Ingrese la matrícula del estudiante: ");
        estudiante.setMatricula(Lector.nextLine());

        System.out.print("Ingrese la carrera del estudiante: ");
        estudiante.setCarrera(Lector.nextLine());

        System.out.print("Ingrese el año de ingreso del estudiante: ");
        estudiante.setAnoIngreso(Lector.nextInt());

        System.out.print("Ingrese el promedio del estudiante: ");
        estudiante.setPromedio(Lector.nextDouble());

        System.out.println("\nDatos del estudiante:");
        System.out.println(estudiante);

        Lector.close();
    }
}