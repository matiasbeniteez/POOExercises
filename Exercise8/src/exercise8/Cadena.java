/*
8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package exercise8;


public class Cadena {
    
    private String frase;
    private int longitud;
    
    Cadena(){
        
    }
    
    Cadena(String frase, int longitud){
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public void mostrarVocales(){
        // utilizar switch
        
       /* switch (letra) {
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    cantidadVocales++;
                    break; */
            }

    public void invertirFrase(){
        
        int contadorInvertido = frase.length();
        
        String fraseInvertida = " ";
        
        for(int i = frase.length() -1; i >=0; i--){
            fraseInvertida = fraseInvertida.concat(frase.substring(i, i+1));
        }
        
        System.out.printf("La frase original es: %f \n" + frase);
        System.out.printf("Frase invertida: %f \n" + fraseInvertida);
    }
    
    // contains()
    
        
    }
    

    

