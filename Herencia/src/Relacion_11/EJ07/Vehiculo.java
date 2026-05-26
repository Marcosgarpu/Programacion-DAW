package Relacion_11.EJ07;

public abstract class Vehiculo {
    // Atributos
    protected static int vehiculosCreados = 0;
    protected static int kilometrosTotales = 0;
    protected int kilometrosRecorridos = 0;

    // Contructor
    public Vehiculo() {
        vehiculosCreados++;
    }

    // Metodos
    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public abstract void andar(int km);

    public abstract void verKilometraje();

    public static void verKilometrosTot() {
        System.out.println("Kilómetros totales de todos los vehículos; " + getKilometrosTotales());
    }

}
