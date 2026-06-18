/* Programa que lee por teclado la nota de los alumnos de una clase y calcula la nota media del grupo.
También muestra los alumnos con notas superiores a la media. El número de alumnos se lee por
teclado. */

import java.util.Scanner;

public class Relacion7_Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numAlumnos;
        float media, sumNotas = 0;

        // Declaración de número de alumnos por teclado.
        System.out.print("Escribe el número de alumnos de la clase ");
        numAlumnos = entrada.nextInt();

        // Declaración del array.
        float[] clase = new float[numAlumnos];

        // Introducción de las notas de los alumnos.
        for (int i = 0; i < clase.length; i++) {
            System.out.print("Escribe la nota del alumno " + (i + 1) + ". ");
            clase[i] = entrada.nextFloat();
        }

        // Calculo de la nota media de la clase
        for (int i = 0; i < clase.length; i++) {
            sumNotas += clase[i];
        }

        media = sumNotas / numAlumnos;

        // Mostrar nota media del grupo.
        System.out.printf("La nota media del grupo es %.2f\n", media);

        // Alumnos con nota superior a la media del grupo.
        for (int i = 0; i < clase.length; i++) {
            if (clase[i] > media) {
                System.out.printf("El alumno %d supera la nota media del grupo\n", (i + 1));
            }
        }

        System.out.println("");
    }
}
