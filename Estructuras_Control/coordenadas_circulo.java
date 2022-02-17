package JAVA.Estructuras_Control;
import java.util.*;
import java.awt.*;

// Enunciado: a partir del centro (0,0) y el radio (0,r) del círcula y de las coordenadas de un punto, comprobar si
// se encuentra dentro o fuera del círculo-
public class coordenadas_circulo {
    public static void main(String[] args){
        try(Scanner tec = new Scanner(System.in)){
            System.out.println("-----------------");
            //Introducimos las coordenadas del centro
            Point centro  = new Point();
            centro.x = 0;
            centro.y = 0;
            //Introducimos el radio
            System.out.println("Introduce el radio de tu círculo en cm: ");
            int radio = tec.nextInt();
            System.out.println("El radio introducido es de " +radio+ "cm.");
            //Introducimos las coordenadas a comprobar
            System.out.println("Introduce las coordenadas a comprobar: ");
            Point coord_circulo = new Point();
            coord_circulo.x = tec.nextInt();
            coord_circulo.y = tec.nextInt();
        
            //Podemos usar la fórmual de la distancia entre puntos: sqrt((xcentro^2 - xcoord^2) + y^2(xcentro^2 - xcoord^2))
            int distancia = (int)Math.sqrt(Math.pow(centro.x-coord_circulo.x, 2)+ Math.pow(centro.y-coord_circulo.y, 2));
            // o podemos usar: coord_circulo.x >= centro.x && coord_circulo.y <= radio && coord_circulo.x <= radio && coord_circulo.y > 0
           
            //Evaluamos las coordenadas:
            if(distancia < radio){
             //if(coord_circulo.x >= centro.x && coord_circulo.y <= radio && coord_circulo.x <= radio && coord_circulo.y > 0 ) {
                System.out.println("Las coordenadas ("+coord_circulo.x + "," +coord_circulo.y+ ") pertenecen al círculo");
            }
            else {
                System.out.println("Las coordenadas ("+coord_circulo.x + "," +coord_circulo.y+ ") no pertenecen al círculo");
            }
        }
        System.out.println("-----------------");
    }
    
}
