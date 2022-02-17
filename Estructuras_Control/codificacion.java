package JAVA.Estructuras_Control;
import java.util.Scanner;

//Enunciado: codificación y descodificación de mensajes.
 
public class codificacion{
    //Actividad 1: Crear proyecto y clase.
    // Actividad 6: Crear el método principal.
    public static void main (String []args){
        try(Scanner tec = new Scanner(System.in)){
            String alfabeto = "abcdefghijklmnñopqrstuvwxyz";
            String mensaje = new String();
            System.out.println("Introduzca el mensaje: ");
            mensaje = tec.nextLine();
            int longitud = (alfabeto.length() - 1);
            System.out.println("Seleccione el algoritmo: \n1. César \n2. Vigenére \n3. Cambiar alfabeto ");
            int codigo = tec.nextInt();
            switch (codigo){
                case 1:
                System.out.println("Introduzca la clave " + " (numérica entera entre 0 y " + longitud + ")");
                int clave = tec.nextInt();
                System.out.println("\n1. Encriptar, \n2. Descencriptar");
                int codigo1 = tec.nextInt();
                switch (codigo1){
                    case 1:
                    String solcodCes = new String(codCes(mensaje, clave, alfabeto)); 
                    System.out.println(solcodCes);
                    break;
                    case 2:
                    String soldecCes = new String(decCes(mensaje, clave, alfabeto)); 
                    System.out.println(soldecCes);
                    break;
                    default:
                    System.out.println("Error");
                }
                break;
                case 2:
                System.out.println("Introduzca la clave (palabra)");
                String claveces = new String();
                claveces = tec.next();
                System.out.println("\n1. Encriptar, \n2. Descencriptar");
                int codigo2 = tec.nextInt();
                switch (codigo2){
                    case 1:
                    String solcodVig = new String(codVig(mensaje, claveces, alfabeto)); 
                    System.out.println(solcodVig);
                    break;
                    case 2:
                    String soldecvig = new String(decVig(mensaje, claveces, alfabeto));
                    System.out.println(soldecvig);
                    break;
                    default:
                    System.out.println("Error");
                }
                default:
                System.out.println("Error"); 
            }
        }
    }
    //Actividad 2: Crear método desplazar.
    public static char desplazar (char caracter, int desplazamiento, String alfabeto){
        int pos = alfabeto.indexOf(caracter);
        if(pos < 0){
            return caracter;
        }
        else{
            int nuevaPos = pos + desplazamiento;
            nuevaPos = nuevaPos % alfabeto.length();
            char resultado = alfabeto.charAt(nuevaPos);
            return resultado;
        }  
    }
    //Actividad 3: Crear el método alfInv
    public static String alfInv (String alfabeto){
        String alfinv = new StringBuilder(alfabeto).reverse().toString();
        return alfinv;
    }
    //Actividad 4: Crear cifrado y descrifrado con el método César
    public static String codCes (String mensaje, int clave, String alfabeto){
        String res = "";
        String resultado = new String();
        for (int i = 0; i < mensaje.length();) {
            char caracter = mensaje.charAt(i);
            desplazar(caracter,clave, alfabeto);
            return resultado;
        }
        return res;
    } 

    public static String decCes(String frase, int clave, String alfabeto){
        frase = frase.toLowerCase();
        alfabeto = alfInv(alfabeto);
        int caracteres = frase.length();
        String solucion = new String();
        String buffer = new String();
        for (int i = 0;i < caracteres;i++){
            char modif = frase.charAt(i);
            modif = desplazar(modif, clave, alfabeto);
            buffer = Character.toString(modif);
            solucion = solucion.concat(buffer);
        }
        return solucion;
    }
    //Actividad 5: Crear cifrado y descrifrado con el método Vigenère
    public static String codVig (String frase, String contra, String alfabeto){
        String solucion = new String();
        String buffer = new String();
        frase = frase.toLowerCase();
        int caracteres = frase.length(); 
        int caracterescontr = contra.length();
        int count = 0;
        for (int i = 0;i < caracteres;i++){
            if (count < caracterescontr){
                char modif = frase.charAt(i);
                char contr = contra.charAt(count);
                int dcontr = alfabeto.lastIndexOf(contr);
                modif = desplazar(modif, dcontr, alfabeto);
                buffer = Character.toString(modif);
                solucion = solucion.concat(buffer);
                count++;
            }
            else{
                count = 0;  
                char modif = frase.charAt(i);
                char contr = contra.charAt(count);
                int dcontr = alfabeto.lastIndexOf(contr);
                modif = desplazar(modif, dcontr, alfabeto);
                buffer = Character.toString(modif);
                solucion = solucion.concat(buffer);
                count++;
            }

        }
        return solucion;
    }

    public static String decVig (String frase, String contra, String alfabeto){
        String solucion = new String();
        String buffer = new String();
        frase = frase.toLowerCase();
        int caracteres = frase.length();
        int caracterescontr = contra.length();
        int count = 0;
        for (int i = 0;i < caracteres;i++){
            if (count < caracterescontr){
                char modif = frase.charAt(i);
                char contr = contra.charAt(count);
                int dcontr = alfabeto.lastIndexOf(contr);
                modif = desplazar(modif, dcontr, alfInv(alfabeto));
                buffer = Character.toString(modif);
                solucion = solucion.concat(buffer);
                count++;
            }
            else{
                count = 0;  
                char modif = frase.charAt(i);
                char contr = contra.charAt(count);
                int dcontr = alfabeto.lastIndexOf(contr);
                modif = desplazar(modif, dcontr, alfInv(alfabeto));
                buffer = Character.toString(modif);
                solucion = solucion.concat(buffer);
                count++;
            }

        }
        return solucion;
    } 
}
