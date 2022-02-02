package exercise5;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        Cuenta cuenta1 = new Cuenta();
        cuenta1.crearCuenta();
        
        System.out.println("Ingrese dinero a ingresar: ");
        double ingreso = read.nextDouble();
        cuenta1.ingresar(ingreso);

        System.out.println("Ingrese dinero a retirar: ");
        double retiro = read.nextDouble();
        cuenta1.retirar(retiro);

        cuenta1.extraccionRapida();
        cuenta1.consultarSaldo();
        cuenta1.consultarDatos();

    }

}
