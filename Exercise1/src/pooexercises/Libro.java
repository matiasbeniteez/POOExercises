package pooexercises;

import java.util.Locale;
import java.util.Scanner;

public class Libro {

    private int isbn;
    private String title;
    private String author;
    private int pages;

    // CONSTRUCTOR VACIO
    public Libro() {

    }

    // CONSTRUCTOR PARAMETRIZADO
    public Libro(int isbn, String title, String author, int pages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int Isbn) {
        this.isbn = Isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void cargarLibro() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese el ISBN: ");
        this.isbn = entrada.nextInt();
        System.out.println("INGRESE EL TITULO DEL LIBRO: ");
        this.title = entrada.next();
        System.out.println("INGRESE AUTOR DEL LIBRO: ");
        this.author = entrada.next();
        System.out.println("INGRESE PAGINAS DEL LIBRO: ");
        this.pages = entrada.nextInt();
    }

    public void mostrar() {
        System.out.println("DATOS DEL LIBRO INGRESADO: ");
        System.out.println("ISBN: " + getIsbn() + ", TITULO: " + getTitle() + ", AUTOR: " + getAuthor() + ", PAGINAS: " + getPages());

    }
}
