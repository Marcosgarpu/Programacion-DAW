package Relacion_11.EJ04;

public class Tecnico extends Operario {

    // Constructores
    public Tecnico() {
        super();
    }

    public Tecnico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Empleado " + getNombre() + " --> Operario --> Técnico";
    }

    
}
