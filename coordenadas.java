package JAVA.Clase_Math;
import java.awt.*;
import java.util.*;

//Enunciado: Escribe un programa que cree un objeto de tipo Point, solicite al usuario la nueva posición
// del punto y lo mueva a dicha localización.

public class coordenadas {
    public static void main(String[] args) {
        System.out.println("------------------");
        //Creamos el primer punto, en nuesto caso en el origen (0,0)
        Point p0 = new Point();
        p0.x = 0; p0.y = 0;
        System.out.println("Las coordenads iniciales son (" +p0.x+ "," +p0.y+")");
        
        //Pedimos al usuario que escriba sus coordenadas:
        System.out.println("Introduce las coordenadas donde desea mover el punto: "); 
        try(Scanner tec = new Scanner(System.in)){
            Point coord = new Point();
            coord.x = tec.nextInt();
            coord.y = tec.nextInt();
            p0 = coord; 
            System.out.println("El punto  ha sido desplazado a (" +p0.x+ "," +p0.y+")");

            System.out.println("------------------");
        }
    }
}
