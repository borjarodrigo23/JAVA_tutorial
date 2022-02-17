package JAVA.Clase_Math;
import java.util.Scanner;

//Enunciado: escribe un programa que pida un número entero y escriba true si es positivo impar o false si no

public class impar_positivo{
    public static void main (String[] args) {
        System.out.println("-----------------");

        try (Scanner tec = new Scanner (System.in)) {
            System.out.println("Introduce un número entero");
            int entero = tec.nextInt();
            boolean Im_Pos = (entero % 2 == 1) && (entero > 0);;
             System.out.println("¿El número es impar y positivo? " +Im_Pos );
        }

        System.out.println("-----------------");
    }

}