package JAVA.Estructuras_Control;
import java.util.*;

//Solicitar un DNI y comprobar que este sea correcto.

public class comprobarDNI {
    public static void main (String [] args){
        try(Scanner tec = new Scanner(System.in)) {
            int cont = 0;
            boolean correcto;
            //Bucle para solicitar DNI, con su correcta longitud y letra:
            do{
                correcto = true;
                System.out.println("Introduzca su DNI: ");
                String dni = tec.next();
                correcto = true;
                int longDni = dni.length();
                //comprobar longitud del DNI:
                if (longDni != 9) {
                    System.out.println("La longitud del DNI es incorrecta. ");  
                    correcto = false;
                }
                else {
                    //Comprobar digitos del DNI:
                    String digitos = dni.substring(0,longDni-1);
                    System.out.println(digitos);
                    if (digitos.matches("[0-9]+") == false) {
                        System.out.println("Formato incorrecto: Los 8 primeros dígitos deben ser números. ");
                        correcto = false;
                    }
                    //Comprobar letra DNI:
                    char letra = dni.charAt(longDni-1);
                    if (letra < 'A' || letra > 'Z') {
                        System.out.println("Formato incorrecto: el último dígito debe ser una letra. ");
                        correcto = false;
                    }
                    if (digitos.matches("[0-9]+")) {
                        String test = "TRWAGMYFPDXBNJZSQVHLCKE";
                        int num = Integer.parseInt(digitos);
                        int resto = num % 23;
                        char letraFinal = test.charAt(resto);
                        if (letra == letraFinal) {
                            System.out.println("La letra del DNI es: " + letraFinal);
                        }
                    }
                }
            } while (correcto == false && cont < 5);
            //Comprobar en cuantos intentos se ha introducido el DNI:
            if (correcto == true) {
                System.out.println("Has introducido el DNI correctamente tras " + cont + " intento(s). ");
            }
            else {
                System.out.println("Error, ha alcanzado el máximo de intentos posibles. ");
            }
        }
    }
}
