/*
4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
 */
package exercise4;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {

    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("INGRESE LA BASE DEL RECTANGULO: ");
        this.base = read.nextInt();
        System.out.println("INGRESE LA ALTURA DEL RECTANGULO: ");
        this.altura = read.nextInt();
    }
    
    public void crearSuperficie(){
        System.out.println("La superficie del rectangulo es: " + (base*altura));
    }
    
    public void crearPerimetro(){
        System.out.println("El perimetro del rectangulo es: " + (base*altura)*2);
    }
    
    public void dibujarRectangulo(){
        for (int i = 0; i<altura; i++){
            for (int j = 0; j<base; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
