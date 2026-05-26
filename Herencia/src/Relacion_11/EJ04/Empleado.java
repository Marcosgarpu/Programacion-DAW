package Relacion_11.EJ04;

public abstract class Empleado {

    // Atributos
    private String nombre;


    // Constructores
    public Empleado() {
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public abstract String toString();


}
