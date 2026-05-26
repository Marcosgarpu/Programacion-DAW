package Relacion_11.EJ06;

import Relacion_11.EJ01.Persona;

public class Alumno extends Persona {

    // Atributos de la clase Alumno
    protected String grupo;
    protected double notaMedia;

    // Constructor
    public Alumno(String nIF, int altura, int edad, String nombre, String apellidos, String fechaNacim, String grupo,
            double notaMedia) {
        super(nIF, altura, edad, nombre, apellidos, fechaNacim);
        this.grupo = grupo;
        this.notaMedia = notaMedia;
    }

    // Getters y setters
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    // Metodo mostrar
    @Override
    public void mostrar() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("NIF: " + getNIF());
        System.out.println("Altura: " + getAltura());
        System.out.println("Edad: " + getEdad());
        System.out.println("Grupo: " + getGrupo());
        System.out.println("Nota media: " + getNotaMedia());
        System.out.println("Fecha de nacimiento: " + getFechaNacim());
    }


}
