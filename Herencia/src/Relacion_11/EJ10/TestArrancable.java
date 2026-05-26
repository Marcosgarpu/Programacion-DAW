package Relacion_11.EJ10;

import java.util.Scanner;

import Relacion_11.EJ07.Bicicleta;
import Relacion_11.EJ07.Coche;
import Relacion_11.EJ07.TestVehiculo;
import Relacion_11.EJ07.Vehiculo;


public class TestArrancable {
    public static void main(String[] args) {
        
        // Variables
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        // Objetos creados
        Coche c = new Coche();
        Bicicleta b = new Bicicleta();

        do {
            
            // Llamamos al menu creado en la clase TestVehiculo
            TestVehiculo.menuEjercicio10();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    b.andar(10);
                    break;
                case 2:
                    b.hacerCaballito();
                    break;
                case 3:
                    c.arrancar();
                    break;
                case 4:
                    c.detener();
                    break;
                case 5:
                    if (c.estaArrancado()) {
                        System.out.println("El coche está arrancado");
                    } else {
                        System.out.println("El coche está detenido");
                    }
                    break;
                case 6:
                    c.andar(88);
                    break;
                case 7:
                    c.quemarRueda();
                    break;
                case 8:
                    b.verKilometraje();
                    break;
                case 9:
                    c.verKilometraje();
                    break;
                case 10:
                    Vehiculo.verKilometrosTot();
                    break;
                case 11:
                    
                    break;
                default:
                    System.out.println("Elige una opción correcta (1-11)");
                    break;
            }

        } while (opcion != 11);

        entrada.close();

    }
}
