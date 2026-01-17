
package ESTRUCTURAS_REPETITIVAS.newpackage;



/**
 *
 * @author Emily R
 */
import java.util.Scanner;

public class whilebasico {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String contraseñaCorrecta = "utpl";
        String contraseña = "";
        int intentos = 0;
     
        
        while (!contraseña.equals(contraseñaCorrecta)) {

            System.out.print("Ingrese la contraseña: ");
            contraseña = entrada.nextLine();
            intentos++;
        }

        System.out.println("Acceso concedido en " + intentos + " intentos");
    }
}
/**
 * RUN:
 * run:
Ingrese la contrase�a: casa
Ingrese la contrase�a: carro
Ingrese la contrase�a: utpl
Acceso concedido en 3 intentos
BUILD SUCCESSFUL (total time: 24 seconds)
 */