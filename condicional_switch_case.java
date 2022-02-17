package JAVA.Estructuras_Control;
import java.util.*;

/**         Instrucciones previas
                      | 
             expresión a evaluar
                      |                
       ---------------|-------------------
       |              |                  |
 Instrucción 1    Instrucción 2      Instrucción ...        
       |              |                  |
       |--------------|------------------|
                      |
          Comporbar si la expresión
        coincide con las instrucciones
                      |
    SÍ coincide ------|----- NO coincide ---- Se ejecuta el default(mostrar opción incorrecta)
        |     
        |-----> Ejecuta las siguientes instrucciones
*/
public class condicional_switch_case {
    public static void main(String[] args){
         //Selección múltiple: permite seleccionar entre múltiples grupos de sentencias
         //Ejemplo explicativo: escribe una clase programa que simule una calculadora. Las operaciones son:
         // num_1 (operador +, -, *, /) num_2
         try(Scanner tec = new Scanner(System.in).useLocale(Locale.US)){
            System.out.println("Introduce el primer número: ");
            double num1 = tec.nextDouble();
            System.out.println("Introduce el segundo número: ");
            double num2 = tec.nextDouble();
            double resultado = 0;
            System.out.println("Introduce el operador a utilizar: ");
            char operador = tec.nextLine().charAt(0); //Introducimos el operador y solo escogémos el primer carácter
         //Evaluamos el operador con switch-case:
            switch(operador){
                case '+' : resultado = num1 + num2; break;
                case '-' : resultado = num1 - num2; break;
                case '*' : resultado = num1 * num2; break;
                case '/' : resultado = num1 / num2; break;
                default  : System.out.println("ERROR: Datos mal introducidos");
            }
            System.out.println("La operación realizada es: " +num1 +" " +operador+ " " +num2+ "=" +resultado);  
         }
    }
}
