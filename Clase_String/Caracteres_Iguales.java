package JAVA.Clase_String;
import java.util.Scanner;

//Enunciado: escribe un programa que solicite una palabra y muestre True si su primer y 
// último carácter son iguales, o false en caso contrario

public class Caracteres_Iguales {
    public static void main(String[] args){
        System.out.println("--------------------");
        
        //Solicitamos la palabra a escribir por teclado:
        try(Scanner tec = new Scanner(System.in)) {
            
         System.out.println("Escriba una palabra: ");
         String p1 = tec.nextLine(); 
         String P1 = p1.toUpperCase();
         char c0_1 = P1.charAt(0);
         int long_p1 = P1.length();
         char ult_1 = P1.charAt(long_p1-1);  
         System.out.println("Primer caracter " +c0_1+ " y ultimo " +ult_1);
         boolean iguales = (c0_1 == ult_1);
         System.out.println("¿Los carácteres son iguales? ");
         System.out.println(iguales);
       
        }
        System.out.println("--------------------");
    }
}