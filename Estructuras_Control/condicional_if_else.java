package JAVA.Estructuras_Control;
import java.util.*;

/**    Instrucciones previas
                 | 
         if (condición)
                 |                
       -------------------------
       |                       |
     false                    true
       |                       |
 instrucciones F         instrucciones T
       |                       |
       |---------->|<----------|
                   |
        siguientes instrucciones
*/

public class condicional_if_else {

    public static void main(String[] args) {
        
        //Selección simple: permite ejecutar una instrucción o conjunto de ellas en función de una expresión lógica 

         //Ejemplo explicativo: escribe un programa que pida tu edad y te diga en que etapa de la vida de encuentras,
         // siendo adolescente x < 18, joven 18 < x < 40, maduro 40 < x:    
                
                //Declaramos las variables:
                try(Scanner tec = new Scanner(System.in)){
                        System.out.println("--------------------");
                        System.out.println("Ejemplo explicativo de selección simple:");               
                        System.out.println("Introduce tu edad: ");
                        int edad = tec.nextInt();
                        //Evaluamos las condiciones con if-else
                        if(edad < 18){ //Condición inicial: primer condición a evaluar
                                System.out.println("Tienes " +edad+ " años, por lo tanto se te considera adolescente");
                        }
                        else if (edad > 18 && edad < 40){ //Segunda condición: si no se cumple la c.i se evalúa esta instrucción
                                System.out.println("Tienes " +edad+ " años, por lo tanto se te considera joven");   
                        }
                        else { //Última condición: si no se cumple ninguna de las condiciones anteriores, se evalua esta instrucción
                                System.out.println("Tienes " +edad+ " años, por lo tanto se te considera maduro");
                        }        
                
                  System.out.println("--------------------");  
         
        //Selección anidada: existe la posibilidad de que la acción de un condicional sea a su vez otro condicional      
                 System.out.println(" ");  
                 System.out.println("Ejemplo explicativo de selección anidada:");
         
         //Ejemplo explicativo: escribe un programa que pida una nota y diga si la nota corresponde a un aprobado o suspenso:
         // aprobado = aprobado(5 <= x < 7), notable(7 <= x < 9), sobresaliente (x >= 9)
         // suspenso = suspenso(< 5) 
                        System.out.println("Introduce tu nota: ");
                        double nota = tec.nextDouble();
                        //Evaluamos las condiciones con if-else
                        if(nota >= 5){ //Condición inicial: primer condición a evaluar
                                if(nota >= 5 && nota < 7){
                                 System.out.println("Tienes un " +nota+ ", estás aprobado.");
                                }
                               else if(nota >= 7 && nota < 9) {
                                 System.out.println("Tienes un " +nota+ ", estás aprobado con un notable");
                               }
                               else{
                                 System.out.println("Tienes un " +nota+ ", estás aprobado con un sobresaliente");   
                               }
                        }
                        else { //Última condición: si no se cumple ninguna de las condiciones anteriores, se evalua esta instrucción
                                System.out.println("Tienes un " +nota+ ", estás aprobado con un sobresaliente"); 
                                
                        }
                                
                }
         System.out.println("--------------------");  
        }

}
       