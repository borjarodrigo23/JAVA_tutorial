package JAVA.Clase_String;
import java.util.Scanner;

public class Palabras_Iguales {
   public static void main(String [] args){
    System.out.println("------------------"); //Separador de los directorios del terminal
    System.out.println("Escribe una frase");
    //Solicitar frase.
        try(Scanner tec = new Scanner (System.in)) {
         String frase  = tec.nextLine();
         //Buscar posiciones.
         int pos1 = frase.indexOf(" ");
         String palabra1 = frase.substring(0,pos1);;
         int pos2 = frase.lastIndexOf(" ") + 1;
         int cFinal = frase.length();
         String palabra2= frase.substring(pos2,cFinal);
         //Evaluar
         boolean sonIguales = palabra1.equalsIgnoreCase(palabra2);
         System.out.println("Son iguales la primera y la ultima palabra? ");
         System.out.println(sonIguales);
         System.out.println("La frase resultante es: " + palabra1 + " " + palabra2);
        }
        System.out.println("------------------"); //Separador de los directorios del terminal
    }    
}
