/*Pide una cadena y un carácter por teclado (valida que sea un carácter) y muestra cuántas veces
aparece el carácter en la cadena.*/

import java.util.Scanner;

public class Relacion6_Ejercicio3 {
    public static void main(String[] args) {
        String cadena1, porcion;
        String caracter;
        int contador = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        cadena1 = entrada.nextLine();
        System.out.print("Introduce un caracter: ");
        caracter = entrada.nextLine();

        for (int index = 0; index < cadena1.length(); index++){
            porcion = cadena1.substring(index, index+1);
            if (porcion.equals(caracter)) {
                contador++;
            }
        
        System.out.println("EL caracter " + caracter + " se repite " + contador + " veces");
    }
    }
}
