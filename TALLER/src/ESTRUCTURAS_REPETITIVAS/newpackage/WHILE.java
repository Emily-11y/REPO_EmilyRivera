
package ESTRUCTURAS_REPETITIVAS.newpackage;
/**
 * WhileBasico.java – Validación de contraseña
Problema: Defina una contraseña correcta (por ejemplo: "utpl").
Pida al usuario ingresar una contraseña hasta que sea correcta.

Requisitos:

Usar while.
Contar intentos y al final mostrar: Acceso concedido en X intento(s).
Ejemplo:

Entradas: abc, 123, utpl → Acceso concedido en 3 intento(s)
 * @author EMILY RIVERA
 * @version 1.0
 */
import java.util.Scanner;

public class WHILE {

    public static void main(String[] args) {

        Scanner tcl = new Scanner(System.in);

        String Correcta = "utpl";
        String contraseña = "";
        int intentos = 0;
     
        
        while (!contraseña.equals(Correcta)) {

            System.out.print("Ingrese la contraseña: ");
            contraseña = tcl.nextLine();
            intentos++;
        }

        System.out.println("Acceso concedido en " + intentos + " intentos");
    }
}
/**
 *run:
Ingrese la contrase�a: casa
Ingrese la contrase�a: carro
Ingrese la contrase�a: utpl
Acceso concedido en 3 intentos

 */