package Relacion_11.EJ06;

import Relacion_11.EJ01.Persona;

public class Profesor extends Persona {

    // Atributos
    protected String especialidad;
    protected double salario;

    // Constructor 
    public Profesor(String nIF, int altura, int edad, String nombre, String apellidos, String fechaNacim,
            String especialidad, double salario) {
        super(nIF, altura, edad, nombre, apellidos, fechaNacim);
        this.especialidad = especialidad;
        this.salario = salario;
    }


    // Metodos 
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Metodo mostrar
    @Override
    public void mostrar() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("NIF: " + getNIF());
        System.out.println("Altura: " + getAltura());
        System.out.println("Edad: " + getEdad());
        System.out.println("Especialidad: " + getEspecialidad());
        System.out.println("Salario: " + getSalario());
        System.out.println("Fecha de nacimiento: " + getFechaNacim());
    }


}
