package JAVA.Inicio;

public class datos_primitivos {
    public static void main (String[] args) {
        System.out.println("------------------"); //Separador de los directorios del terminal
        
        //Dato String para escribir carácteres:
        String name = "Alumno"; //Declaramos el String name llamado "Alumno"
        System.out.println("Mi nombre es " +name + ".");
        
        //Dato Enteras para escribir números
        int edad = 23;
        System.out.println("Tengo " +edad + "años.");

        //Dato Double para escribir números decimales:
        double altura = 1.78;
        System.out.println("Mido " +altura + "metros.");

        //Dato Boolean para evaluar si una variable es True or False.
        boolean soy_alto = altura > 180 && edad < 22;
        System.out.println("¿Me puedo considerar alto? La respuesta es: " +soy_alto + ".");
       
        //Si queremos expresarlo todo en una misma línea basta con cambiar System.out.println("") por System.out.print("")
        System.out.println("------------------"); //Separador de los directorios del terminal
    }
}
