
package ESTRUCTURAS_REPETITIVAS.newpackage;

import java.util.Scanner;

/**
 * ComparacionCiclos.java – Suma de 1..N con 3 ciclos
Problema: Ingrese un entero N (>=1). Calcule la suma 1+2+...+N usando:

while
do-while
for
Muestre los tres resultados y verifique que coinciden.

Requisitos:

Validación de N (>=1).
Mostrar:
Suma con while: ...
Suma con do-while: ...
Suma con for: ...
Si no coinciden (no debería ocurrir), mostrar Revisar implementación.
 * @author EMILY RIVERA
 * @version 1.0
 */
public class COMPARACION_CICLOS {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, suma, i, sumaWhile, sumaDowhile, sumafor;
        System.out.println("INGRESE UN ENTERO");
        num = tcl.nextInt();

        if (num < 1) {
            System.out.println("Valor inválido");
            return; 
        }

        sumaWhile = 0;
        i = 1;
        while (i <= num) {
            sumaWhile += i;
            i++;
        }
        
        
        sumaDowhile = 0;
        i = 1;
        do {
            sumaDowhile += i;
            i++;
        } while (i <= num);
        
        
        sumafor = 0;
        for (i = 1; i <= num; i++) {
            sumafor += i;
        }

        System.out.println("Suma con while: " + sumaWhile);
        System.out.println("Suma con do-while: " + sumaDowhile);
        System.out.println("Suma con for: " + sumafor);

        if (sumaWhile == sumaDowhile && sumaWhile == sumafor) {
            System.out.println("Las sumas coinciden");
        } else {
            System.out.println("Revisar implementación");
        }
    }
}
/**
 * run:
INGRESE UN ENTERO
5
Suma con while: 15
Suma con do-while: 15
Suma con for: 15
Las sumas coinciden
 */
