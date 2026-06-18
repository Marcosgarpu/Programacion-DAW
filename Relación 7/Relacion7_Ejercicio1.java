import java.util.Scanner;

public class Relacion7_Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array");

        int tamaño;
        tamaño = entrada.nextInt();
        int[] numeros = new int[tamaño];

        System.out.println("Introduce los elementos del array:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Elemento " + (i + 1) + ":");
            numeros[i] = entrada.nextInt();
        }
       
        System.out.println("Introduce el valor a buscar: ");
        int valor = entrada.nextInt();
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                contador++;
            }
        }

        System.out.printf("El valor %d aparece %d veces en el array\n", valor, contador);
    }
}
