/*
1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package pooexercises;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    static Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.cargarLibro();
        libro1.mostrar();
        
    }

}
