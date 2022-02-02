package exercise7;

public class Principal {

    public static void main(String[] args) {
  
        double bajoPeso = 0;
        double pesoIdeal = 0;
        double sobrepeso = 0;
        double mayores = 0;
        double menores = 0;
        
        Persona persona1 = new Persona("Mateo", 25, 'H', 75, 1.81);
        Persona persona2 = new Persona("Laura", 15, 'M', 54, 1.57);
        Persona persona3 = new Persona("Fer", 20, 'H', 62, 1.76);
        Persona persona4 = new Persona("Francisco", 42, 'o', 80, 1.70);

        Persona personas[] = {persona1 , persona2, persona3, persona4}; 
        
        for(int i=0; i<personas.length; i++){
            
            System.out.println("Persona" + personas[i].getName());
            
            // imc = personas[i].getcalcularImc();
            
            
            
        }
        
       

    }

}
