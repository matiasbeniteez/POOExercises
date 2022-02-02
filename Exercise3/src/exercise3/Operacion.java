/*
3. Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
package exercise3;

import java.util.Locale;
import java.util.Scanner;

public class Operacion {

    private double n1;
    private double n2;

    public Operacion(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Operacion() {

    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public void crearOperacion() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("INGRESE UN NUMERO: ");
        this.n1 = read.nextDouble();
        System.out.println("INGRESE OTRO NUMERO: ");
        this.n2 = read.nextDouble();
    }

    public double suma() {
        return (n1 + n2);
    }

    public double resta() {
        return (n1 - n2);
    }

    public double multiplicacion() {
        if (n1 == 0 || n2 == 0) {
            System.out.println("ERROR! Multiplicando por cero");
            return 0;
        } else {
            return n1 * n2;
        }
    }

    public double division() {
        if (n1 == 0 || n2 == 0) {
            System.out.println("ERROR! Dividiendo por cero");
            return 0;
        } else {
            return n1 / n2;
        }
    }

}
