package Relacion_11.EJ04;

public class Directivo extends Empleado {

    // Constructores
    public Directivo() {
        super();
    }

    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Empleado " + getNombre() + " --> Directivo";
    }

    
}
