/*
5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package exercise5;

import java.util.Locale;
import java.util.Scanner;


public class Cuenta {

    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    private int numerodeCuenta;
    private long DNI;
    private double saldoActual;

    public Cuenta() {

    }

    public Cuenta(int numerodeCuenta, long DNI, double saldoActual) {
        this.DNI = DNI;
        this.numerodeCuenta = numerodeCuenta;
        this.saldoActual = saldoActual;
    }

    public int getNumerodeCuenta() {
        return numerodeCuenta;
    }

    public void setNumerodeCuenta(int numerodeCuenta) {
        this.numerodeCuenta = numerodeCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void crearCuenta() {

        System.out.println("INGRESE NUMERO DE CUENTA: ");
        numerodeCuenta = read.nextInt();
        System.out.println("INGRESE DNI: ");
        DNI = read.nextLong();
        System.out.println("INGRESE SAlDO ACTUAL: ");
        saldoActual = read.nextDouble();
    }

    public void ingresar(double ingreso) {
        saldoActual += ingreso;
    }

    public void retirar(double retiro) {
        if (retiro > saldoActual) {
            saldoActual = 0;
        } else {
            saldoActual -= retiro;
        }

    }

    public void extraccionRapida() {
        System.out.println("INGRESE DINERO PARA EXTRACCION RAPIDA: ");
        double ext = read.nextDouble();

        while (ext > saldoActual * 0.2) {
            System.out.printf("ERROR! Saque menos del 20%% que es %f \n", saldoActual);
        }
        saldoActual -= ext;
    }

    public void consultarSaldo() {
        System.out.printf("EL SALDO ACTUAL ES: %f \n", saldoActual);
    }

    public void consultarDatos() {
        System.out.printf("DATOS: \n" + "DNI: ", DNI + " NUMERO DE CUENTA: "+ numerodeCuenta + " SALDO ACTUAL: "+ saldoActual );

    }

}
