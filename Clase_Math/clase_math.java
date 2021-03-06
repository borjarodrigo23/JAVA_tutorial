package JAVA.Clase_Math;
import java.awt.Point;

public class clase_math{
    public static void main(String [] args){
        System.out.println("------------------"); 
        
        //Math.sqrt(): Cáculo de raíces cuadradas: 
        double variable = 9;
        double raiz = Math.sqrt(variable);
        System.out.println("La raiz cuadrada de " + variable + " es " + raiz);

        //Math.pow(): Potencia de un número
        int base = 3;
        int exponente = 2;
        int potencia = (int)Math.pow(base, exponente); //Colocamos la variable (int) para forzar que el valor es entero
        System.out.println("La potencia obtenida es " + potencia);

        //Math.PI : Expresar el número π :
        double pi = Math.PI;
        System.out.println("El número π equivale a " +pi);

        //Math.round(): Redondear decimales al número entero más cercano:
         double decimal = 5.85;
         double redondeo = Math.round(decimal);
         System.out.println("El redondeado del número es " +redondeo);

        //Math.random(): sirve para crear números aleatorios:
        
        //(int), (double) :Refundición: almacenar una variable de otro tipo:
        double  decimales = 5.85;
        int res = (int)Math.sqrt(decimales); //Forzamos que la raíz de 5.85 sea el número entero más cercano
        System.out.println("El resultado entero de la raíz es " + res);

        //Clase point: crear puntos en espacios bidimiensionales x e y
        Point p1 = new Point();
        p1.x = 1;
        p1.y = 3;
        System.out.println("(" +p1.x+ "," +p1.y+ ")");
        
        System.out.println("------------------"); 
    }

}