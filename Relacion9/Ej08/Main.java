package Relacion9.Ej08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion, numEntradas;
        int opcZona;
        Zona zonaPrincipal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona zonaVip = new Zona(25);

        do {
            
            menu();
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Entradas de la zona principal: " + zonaPrincipal.getEntradasPorVender());
                    System.out.println("Entradas de la zona compra-venta: " + compraVenta.getEntradasPorVender());
                    System.out.println("Entradas de la zona vip: " + zonaVip.getEntradasPorVender());
                    break;
                case 2: 
                    System.out.print("¿Cuantas entradas quieres comprar? ");
                    numEntradas = entrada.nextInt();
                    System.out.print("De que zona quieres comprar las entradas: (Principal(1), Compra-Venta(2), Vip(3)) ");
                    opcZona = entrada.nextInt();

                    switch (opcZona) {
                        case 1:
                            zonaPrincipal.vender(numEntradas);
                            break;
                        case 2:
                            compraVenta.vender(numEntradas);
                            break;
                        case 3:
                            zonaVip.vender(numEntradas);
                            break;
                        default:
                            System.out.println("Introduce un número correspondiente a una zona: ");
                            break;
                    }
                    case 3:
                        System.out.println("Saliendo del programa.........");
                        break;
                default:
                    System.out.print("Introduce un número correcto: ");
                    break;
            }

        } while (opcion != 3);

        entrada.close();
    }

    public static void menu() {
        System.out.println("------------- MENÚ -------------");
        System.out.println();
        System.out.println("1. Mostrar número de entradas libres.");
        System.out.println("2. Vender.");
        System.out.println("3. Salir.");
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();
    }


}
