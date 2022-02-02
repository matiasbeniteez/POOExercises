package exercise3;

public class Principal {

    public static void main(String[] args) {

        Operacion operacion = new Operacion();

        operacion.crearOperacion();
        System.out.printf("EL RESULTADO DE LA SUMA DE %f + %f ES %.2f ", operacion.getN1(), operacion.getN2(), operacion.suma());
        System.out.printf("EL RESULTADO DE LA RESTA DE %f - %f ES %.2f ", operacion.getN1(), operacion.getN2(), operacion.resta());
        System.out.printf("EL RESULTADO DE LA MULTIPLICACION DE %f * %f ES %.2f ", operacion.getN1(), operacion.getN2(), operacion.multiplicacion());
        System.out.printf("EL RESULTADO DE LA DIVISION DE %f / %f ES %.2f ", operacion.getN1(), operacion.getN2(), operacion.division());

    }

}
