package Relacion_11.EJ04;

public class Operario extends Empleado {

    // Constructores
    public Operario() {
        super();
    }

    public Operario(String nombre) {
        super(nombre);
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Empleado " + getNombre() + " --> Operario";
    }

}
