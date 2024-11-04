
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS 2024
 */
class Reporte {
    private final String titulo;
    private final String contenido;

    public Reporte(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String generarHTML() {
        return """
               <html>
               <head>
               <title>""" + titulo + "</title>\n" +
               "</head>\n" +
               "<body>\n" +
               "<h1>" + titulo + "</h1>\n" +
               "<p>" + contenido + "</p>\n" +
               "<img src='imagen.png' alt='Imagen de reporte' />\n" +
               "</body>\n" +
               "</html>";
    }
}

public class TestdeReporte {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el título del reporte: ");
        String titulo = lector.nextLine();

        System.out.print("Ingrese el contenido del reporte: ");
        String contenido = lector.nextLine();

        Reporte reporte = new Reporte(titulo, contenido);

        try (FileWriter writer = new FileWriter("reporte.html")) {
            writer.write(reporte.generarHTML());
            System.out.println("Reporte generado con éxito: reporte.html");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al generar el reporte: " + e.getMessage());
        }

        lector.close();
    }
}