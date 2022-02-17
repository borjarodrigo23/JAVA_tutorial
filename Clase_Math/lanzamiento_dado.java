package JAVA.Clase_Math;
import java.util.Random;

public class lanzamiento_dado {
    public static void main(String[] args) {
        System.out.println("---------------");

        //Escirbrimos el valor de los dados como sucesos aleatorios:
        Random r = new Random();
        int dado1 = r.nextInt(6)+1;
        System.out.println("El lanzamiento del 1er dado es " +dado1);
        int dado2 = r.nextInt(6)+1;
        System.out.println("El lanzamiento del 2o dado es " +dado2);
        
        //Realizamos la operación
        int suma = (dado1 + dado2); 
        System.out.println("La suma del valor de ambos dados es " +suma);

        System.out.println("---------------");
        
    }
}
