package Relacion_11.EJ07;

import Relacion_11.EJ10.Arrancable;

public class Coche extends Vehiculo implements Arrancable {

    // Atributos de la clase Coche
    private boolean encendido;

    

    public Coche() {
        super();
        this.encendido = false;
    }

    public void quemarRueda() {
        System.out.println("Quemando rueda...");
    }

    @Override
    public void andar(int km) {
        kilometrosRecorridos += km;
        kilometrosTotales += km;
        System.out.println("El coche ha andado " + km + " km.");
    };

    @Override
    public void verKilometraje() {
        System.out.println("Kilometros recorridos: " + getKilometrosRecorridos());
    }

    @Override
    public void arrancar() {
        if (encendido) {
            System.out.println("El coche ya está arrancado, no se puede arrancar.");
        } else {
            encendido = true;
        }
    }

    @Override
    public void detener() {
        if (encendido) {
            encendido = false;
        } else {
            System.out.println("El coche que intentas detener ya está detenido.");
        }
    }

    @Override
    public boolean estaArrancado() {
        return encendido;
    }


}
