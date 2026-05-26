package Relacion_11.EJ02;

import Relacion_11.EJ01.Persona;

public class Ingeniero extends Persona {

    // Los atributos se heredan

    // Constructores que hereda de persona
    public Ingeniero() {
        super();
    }

    public Ingeniero(String nIF, int altura, int edad, String nombre, String apellidos, String fechaNacim) {
        super(nIF, altura, edad, nombre, apellidos, fechaNacim);
    }


    // Métodos de la clase Ingeniero
    public void razonar() {
        System.out.println("El ingeniero está razonando....");
    }

    public void trabajarEnGrupo() {
        System.out.println("El ingeniero está trabajando en grupo.");
    }

    // Metodo mostrar
    @Override
    public void mostrar() {
        System.out.print("Nombre: " + getNombre());
        System.out.print("Apellidos: " + getApellidos());
        System.out.print("NIF: " + getNIF());
        System.out.print("Altura: " + getAltura());
        System.out.print("Edad: " + getEdad());
        System.out.print("Fecha de nacimiento: " + getFechaNacim());
    }
}
