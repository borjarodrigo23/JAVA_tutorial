package JAVA;
import java.util.Scanner;

public class clase_string {
    public static void main(String [] args){
        System.out.println("------------------"); 
       
        //.length() si queremos obtener la longitud de una palabra (número entero):
        String palabra1 = "Abecedario";
        int letras = palabra1.length();
        System.out.println("La palabra " + palabra1 + " tiene " +letras+ " letras"); 

        //.charAt() si queremos obtener la posición de un carácter en una palabra
        String palabra2 = "Vocales"; 
        char posicion = palabra2.charAt(5);
        System.out.println("La palabra " +palabra2+ " tiene en 5º lugar la letra " +posicion); 
       
        //.substring(x, y) si queremos obtener una subcadena, siendo 'x' el caracter a partir del cual se extrae 
        //e 'y' el número de carácteres que se quieren extraer
        String frase = "Programar no está bien";
        String subcadena1 = frase.substring(0, 9);
        String subcadena2 = frase.substring(12, 22);
        System.out.println("La frase final es: " +subcadena1+ "" +subcadena2); 

        //.equals() compara dos cadenas y distingue mayúsculas de minúsculas
        String password = "aBc123dEf";
        try (Scanner tec = new Scanner(System.in)) {
            System.out.println("Escribe la contraseña: "); 
            String log_in = tec.nextLine();
            boolean comprobar = password.equals(log_in);
            System.out.println("La contraseña es " +comprobar); 

            //.equalsIgnoreCase() compara dos cadenas sin distinguir mayúsculas de minúsculas
            String name = "AlumNO_TeLeco";
            String name2 = "alumno_teleco";
            boolean comprobar2 = name.equalsIgnoreCase(name2);
            System.out.println("¿Los nombres coinciden? " +comprobar2); 

            //.toUpperCase() pasa la cadena a mayúsculas y .toLowerCase() pasa la cadena a minúsculas
            String s1 = "TelEcOm";
            String mayusculas = s1.toUpperCase();
            String minusculas = s1.toLowerCase();
            System.out.println("La cadena " +s1+  " en mayúsculas es " +mayusculas+ " y en minúsculas " +minusculas); 

            //.IndexOf() devuelve la posición mediante un nº entero de una cadena o un caracter en un String
            System.out.println("Escribe una frase: ");
            String frase2 = tec.next();
            int espacio1 = frase2.indexOf(" "); //nos saca la posición del primer espacio
            String pal1 = frase2.substring(0, espacio1);
            //int espacio2 = frase2.lastIndexOf(" "); //nos saca el último espacio
            //int pos2 = frase2.length();
            //String pal2 = frase2.substring(espacio2, pos2);
            System.out.println("La frase resultante es: " +pal1);

        }
    
        System.out.println("------------------"); 
    }
}
