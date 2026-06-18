package Relacion10.Ej04;

import java.util.Scanner;

import Relacion10.Ej03.PruebaArticulo;

public class gestSimAlm {
    public static void main(String[] args) {
        PruebaArticulo almacen = new PruebaArticulo(20);
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            menu();
            System.out.println("Escribe la opción que desee: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 0:
                    almacen.entradaAutomatizada(almacen);
                    break;
                case 1:
                    almacen.lista(almacen);
                    break;
                case 2:
                    almacen.alta(entrada, almacen);
                    break;
                case 3: 
                    almacen.baja(entrada);
                    break;
                case 4:
                    almacen.entradaMercancida(entrada);
                case 5:
                    almacen.salidaMercancia(entrada);
                case 6:
                    System.out.println("Saliendo del programa.............");

                default:
                    System.out.println("Elige un número del 0 al 6");
                    break;
            }
            
        } while (opcion != 6);


    }

    public static void menu() {
        System.out.println("\n--- GESTIÓN DE ALMACÉN ---");
        System.out.println("0. Entrada automatizada");
        System.out.println("1. Listado");
        System.out.println("2. Alta");
        System.out.println("3. Baja");
        System.out.println("4. Entrada de mercancía");
        System.out.println("5. Salida de mercancía");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
