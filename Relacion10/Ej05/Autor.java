package Relacion10.Ej05;

public class Autor {

    // Atributos 
    private String nombre;
    private String nacionalidad;
    private static int totAutores = 0;

    // Constructor
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        totAutores ++;
    }

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public static int getTotAutores() {
        return totAutores;
    }

    @Override
    public String toString() {
        return "Autor:\nNombre: " + nombre + ", nacionalidad: " + nacionalidad;
    }

}
