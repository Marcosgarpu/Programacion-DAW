package Relacion_11.EJ04;

public class Oficial extends Operario{

    // Constructores
    public Oficial() {
        super();
    }

    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Empleado " + getNombre() + " --> Operario --> Oficial";
    }

}
