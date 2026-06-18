/* Calcular la media de una serie de números que se leen por teclado. Leer por teclado 10 números
enteros y guardarlos en un array. A continuación calcula y muestra por separado la media de los
valores positivos y la de los valores negativos. */

import java.util.Scanner;

public class Relacion7_Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] array = new int[10];
        int sumaPositivos = 0, sumaNegativos = 0, mediaPositivos = 0, mediaNegativos = 0;
        int numPositivos = 0, numNegativos = 0;

        // Dar valores al array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Escribe el número " + (i + 1) + " del array.");
            array[i] = entrada.nextInt();
        }

        // Calculo del numeros de valores positivos y negativos
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                numPositivos += 1;
            } else {
                numNegativos += 1;
            }
        }

        // Calcular las medias
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sumaPositivos += array[i];
                mediaPositivos = (int)(sumaPositivos / numPositivos);
            } else {
                sumaNegativos += array[i];
                mediaNegativos = (int)(sumaNegativos / numNegativos);
            }
        }

        // Mostrar por pantalla el resultado
        System.err.printf("La media de los valores positivos es: %d \nLa media de los valores negativos es: %d", mediaPositivos, mediaNegativos );

        // Salto de línea
        System.out.println("");
    }
}
