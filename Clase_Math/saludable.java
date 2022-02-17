package JAVA.Clase_Math;
import java.util.Scanner;

//Enunciado: escribe un programa que pida tu altura en metros y tu peso en kg, y devuelva true si (peso/altura^2) está entre 20 y 25.

public class saludable {
    public static void main(String[] args){
        System.out.println("--------------------------");

        try (Scanner tec = new Scanner(System.in)){
        //Solicitamos la altura:
        System.out.println("Introduce tu altura en metros: ");
        double altura = tec.nextDouble(); //Escribir con comas en el terminal
        System.out.println("La altura introducida es " +altura + "metros.");
        
        //Solicitamos el peso:
        System.out.println("Introduce tu peso en kg: ");
        double peso = tec.nextDouble(); //Escribir con comas en el terminal
        System.out.println("El peso introducido es " +peso + "kg");
        
        //Calculamos la altura^2:
        double exponente = Math.pow(altura, 2);
        
        //Realizamos la operación: 
        double operacion = (peso/exponente);
        
        //Evaluamos si es True or False:
        boolean b1 = (operacion > 20 && operacion < 25); 
        
        //Imprimimos el resultado en pantalla: 
        System.out.println("¿Eres saludable? " +b1);

        System.out.println("--------------------------");

        } catch(Exception e){
            System.err.println("Error" +e);
        }
    }

}
