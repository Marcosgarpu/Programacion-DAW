/* Escribir por pantalla cada carácter de una cadena introducida por teclado. */

import java.util.Scanner;

public class Relacion6_Ejercicio1 {
    public static void main(String[] args) {
        String cadena1;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una cadena de caracteres");
        cadena1 = entrada.nextLine();

        for (int i = 0; i < cadena1.length(); i++) {
            System.out.println(cadena1.charAt(i));
        }
    }
}
