
package ARREGLOS_UNIDIMENSIONALES;

import java.util.Random;

/**
 * ArregloProcesamiento.java – Estadísticas básicas
Problema: Con un arreglo de N enteros (cargado por teclado), calcular:

Mayor
Menor
Promedio (double)
Requisitos:

Validar N (1..50).
Mostrar resultados con 2 decimales en el promedio.
 * @author EMILY RIVERA
 * @version 1.0
 */
public class ARREGLO_PROCESAMIENTO {
    public static void main(String[] args) {

        Random r = new Random();
        int[] numeros = new int[9]; 

        int suma = 0, promedio, mayor, menor;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(50); 
            System.out.println(numeros[i]);
        }

        mayor = numeros[0];
        menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            } else {
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }
        }

        promedio = suma / numeros.length;

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Promedio: " + promedio);
    }
} 
/**
 * run:
31
45
4
49
49
31
30
20
6
Mayor: 49
Menor: 4
Promedio: 29
 */
