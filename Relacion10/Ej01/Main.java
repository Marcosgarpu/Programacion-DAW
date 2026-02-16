package Relacion10.Ej01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String matricula = "";
        String modelo = "";
        int potencia = 0;
        int numPlazas = 0;
        
        Autobus [] array = new Autobus[4];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce los datos del autobús " + (i + 1));

            System.out.print("Introduce la matricula del autobús: ");
            matricula = entrada.nextLine();

            System.out.print("Introduce el modelo del autobús: ");
            modelo = entrada.nextLine();

            System.out.print("Introduce la potencia del autobús: ");
            potencia = entrada.nextInt();

            System.out.print("Introduce el número de plazas: ");
            numPlazas = entrada.nextInt();

            entrada.nextLine();

            array[i] = new Autobus(matricula, modelo, potencia, numPlazas);

            System.out.println();
        }

        for (Autobus autobus : array) {
            System.out.println(autobus);
        }

        entrada.close();
    }
}
