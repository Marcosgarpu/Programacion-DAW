/* Crea un programa que reciba un Array de Strings y un char. Deberá mostrar
todos los Strings cuya primera letra coincida con el char. */

import java.util.Scanner;

public class Relacion7_Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamaño;
        String letra, primeraLetra;

        System.out.print("Escribe el tamaño del array: ");
        tamaño = entrada.nextInt();
        String[] lista = new String[tamaño];

        for (int i = 0; i <= tamaño; i++) {
            System.out.printf("Escribe la cadena %d del array: ", i);
            lista[i] = entrada.nextLine().toLowerCase();           
        }

        System.out.print("Escribe una caracter para identificar que cadenas del array empiezan por el caracter introducido");
        letra = entrada.nextLine();

        
        for ( int j = 0; j < lista.length; j++){
            primeraLetra = lista[j].substring(0, 0);
            if (primeraLetra == letra){
                System.out.printf("La cadena %s empieza por la letra introducida", lista[j]);
            }else{
                System.out.println("La letra introducida no empieza por ninguna cadena del array");
            }
        }       
    }
}

