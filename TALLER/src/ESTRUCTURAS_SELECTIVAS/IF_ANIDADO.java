
package ESTRUCTURAS_SELECTIVAS;

import java.util.Scanner;

/**
 *IfAnidado.java – Clasificación por rango (3 niveles)
Problema: Ingrese un puntaje (0–100) y clasifique:

90–100: Excelente
70–89: Bueno
0–69: En proceso
Requisitos:

Validar rango 0–100.
Usar if anidado (mínimo 2 niveles).
No usar switch.
Ejemplo:

95 → Excelente
75 → Bueno
40 → En proceso
 * @author EMILY RIVERA
 * @version 1.0
 */
public class IF_ANIDADO {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int puntaje;
        System.out.println("INGRESE EL PUNTAJE");
        puntaje = tcl.nextInt();
        if (puntaje < 0 || puntaje > 100)
            System.out.println("PUNTAJE INVALIDO");
        else if (puntaje == 70 && puntaje <= 89)
            System.out.println("BUENO");
        else if (puntaje == 90 && puntaje <= 100)
            System.out.println("EXCELENTE");
        else 
            System.out.println("EN PROCESO");
    }
}
/**
 * run:
INGRESE EL PUNTAJE
-6
PUNTAJE INVALID0
 */