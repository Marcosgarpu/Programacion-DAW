package Relacion9.Ej03;

public class Animales {

    // ESTA CLASE ES LA DE ANIMALES

    // Atributos
    String nombre;
    

    // Métodos
    void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    void andar() {
        System.out.println(nombre + " ha echado a andar.");
    }

    void dormir() {
        System.out.println(nombre + " se ha puesto a dormir.");
    }

}

class Mamifero {

    // Atributos
    String colorPelo;
    String nombre;
    double temperatura;

    // Metodos
    void Pelo() {
        System.out.println("El color de pelo es: " + colorPelo);
    }

    void devolverNombre() {
        System.out.println("El nombre del mamífero es: " + nombre);
    }

    void temperaturaCorporal() {
        System.out.println("La temperatura corporal del mamífero es: " + temperatura);
    }

}

class Ave {

    // Atributos
    int huevos;
    float tamaño;
    String nombre;

    // Metodos
    void nHuevos(){
        System.out.println("El ave ha tenido " + huevos + " huevos.");
    }

    void medida() {
        System.out.println("El tamaño del ave es: " + tamaño + " m.");
    }

    void volar() {
        System.out.println("El ave " + nombre + " puede volar.");
    }

}
