package Relacion_11.EJ07;

import java.util.Scanner;

public class TestVehiculo {
    public static void main(String[] args) {
        Coche c1 = new Coche();
        Bicicleta b1 = new Bicicleta();
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {

            menu();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    b1.andar(20);
                    break;
                case 2:
                    b1.hacerCaballito();
                    break;
                case 3:
                    c1.andar(28);
                    break;
                case 4:
                    c1.quemarRueda();
                    break;
                case 5:
                    b1.verKilometraje();
                    break;
                case 6:
                    c1.verKilometraje();
                    break;
                case 7:
                    Vehiculo.verKilometrosTot();
                    break;
                case 8:
                    System.out.println("¡Saliendo del programa! Hasta luego.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, introduce un número entre 1 y 8.");
                    break;
            }


        } while (opcion != 8);

        entrada.close();

    }

    public static void menu() {
        System.out.println("VEHÍCULOS");
        System.out.println("=========");
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Salir");
        System.out.print("Elige una opción (1-8): ");
    }

    public static void menuEjercicio10() {
        System.out.println("VEHÍCULOS");
        System.out.println("=========");
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Arranca el coche");
        System.out.println("4. Deten el coche");
        System.out.println("5. Ver estado del coche");
        System.out.println("6. Anda con el coche");
        System.out.println("7. Quema rueda con el coche");
        System.out.println("8. Ver kilometraje de la bicicleta");
        System.out.println("9. Ver kilometraje del coche");
        System.out.println("10. Ver kilometraje total");
        System.out.println("11. Salir");
        System.out.print("Elige una opción (1-11): ");
    }
}
