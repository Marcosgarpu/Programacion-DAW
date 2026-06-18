/*Realizar un programa que comprueba si una cadena leída por teclado comienza por una subcadena
introducida por teclado. */

import java.util.Scanner;

public class Relacion6_Ejercicio2 {
    public static void main(String[] args) {
        String cad1, cad2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una cadena para leer si la siguiente que vas a introducir comienza por esta.");
        cad1 = entrada.nextLine();
        cad1.toLowerCase();

        System.out.println("Escribe la otra cadena");
        cad2 = entrada.nextLine();
        cad2.toLowerCase();

        if (cad1.startsWith(cad2)) {
           System.out.println("La segunda cadena empieza por la primera.");
        }else{
            System.out.println("La segunda cadena no empieza por la primera.");
        }
    }
}
