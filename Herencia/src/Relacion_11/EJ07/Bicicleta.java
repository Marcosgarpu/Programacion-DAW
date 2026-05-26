package Relacion_11.EJ07;

public class Bicicleta extends Vehiculo {

    public Bicicleta() {
        super();
    }

    @Override
    public void andar(int km) {
        kilometrosRecorridos += km;
        kilometrosTotales += km;
        System.out.println("La bicicleta  ha andado " + km + " km.");
    };

    public void hacerCaballito() {
        System.out.println("Haciendo caballito....");
    }

    @Override
    public void verKilometraje() {
        System.out.println("Kilometros recorridos: " + getKilometrosRecorridos());
    }
}
