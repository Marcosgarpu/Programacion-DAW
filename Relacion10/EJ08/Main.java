package Relacion10.EJ08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ObrerosProd producciones = new ObrerosProd();

        String [] nombres = new String[20];
        int [][] prod = new int[20][6];

        // Introducir datos
        for (int i = 0; i < 20; i++) {
            System.out.println("Nombre del obrero " + (i + 1) + ": ");
            nombres[i] = entrada.nextLine();
            for (int j = 0; i < 6; i++) {
                System.out.println("Introduce la produccion del obrero" + (i + 1) + " en el mes " + (j + 1));
                prod[i][j] = entrada.nextInt();
            }
            entrada.nextLine();
        }

        // Llamada a los métodos para los calculos
        producciones.setNombres(nombres);
        producciones.setProduccion(prod);
        producciones.calcularTotProd();
        producciones.calcularTotMes();
        producciones.calcularToTotProd();

        // Imprimir producciones
        System.out.println("\n PRODUCCION SEMESTRAL DE PRODUCCIÓN");
        System.out.printf("%-20s %-5s %-5s %-5s %-5s %-5s %-5s %-8s\n", 
                        "NOMBRE DEL OBRERO", "MES1", "MES2", "MES3", "MES4", "MES5", "MES6", "TOT. PROD.");
        String [] n = producciones.getNombres();
        int [][] p = producciones.getProduccion();
        int [] tp = producciones.getTotProd();

        for (int i = 0; i < 20; i++) {
            System.out.printf("%-20s ", n[i]);
            for (int j = 0; i < 6; i++) {
                System.out.printf("%-5d ", p[i][j]);
            }
            System.out.printf("%-8d\n", tp[i]);
        }

        // Fila de Totales
        System.out.print("TOTAL                ");
        System.out.printf("%-35s %-8d\n", "", producciones.getToTotProd());

        entrada.close();
    }
}
