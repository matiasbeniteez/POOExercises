/*
6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package exercise6;

import java.util.Locale;
import java.util.Scanner;

public class Cafetera {

    private int capacidadMaxima;
    private int capacidadActual;

    public Cafetera() {

    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void llenarCafetera() {
        this.capacidadActual = this.capacidadMaxima;
        System.out.println("Cafetera cargada con exito");
    }

    public void servirTaza(int tamañoTaza) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese el tamañano de su taza en ml: ");
        tamañoTaza = read.nextInt();

        if (tamañoTaza > capacidadActual) {
            System.out.println("La taza no se ha llenado por completo, se ha cargado: " + (tamañoTaza - capacidadActual));
            capacidadActual = 0;
        } else {
            System.out.println("La taza se lleno por completo: " + tamañoTaza);
            capacidadActual -= tamañoTaza;
        }
    }

    public void vaciarCafetera() {
        capacidadActual = 0;
        System.out.println("Cafetera cargada con exito");

    }

    public void agregarCafe(int litros) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        while (litros > capacidadActual) {
            System.out.println("Se sobrepaso del limite maximo de la cafetera, vuelva a ingresar: ");
            litros = read.nextInt();
        }
        capacidadActual += litros;

    }

}
