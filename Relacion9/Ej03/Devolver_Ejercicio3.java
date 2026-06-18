package Relacion9.Ej03;

public class Devolver_Ejercicio3 {
    public static void main(String[] args) {

        // Clase Animales
        Animales animal = new Animales();

        animal.nombre = "Cebra";

        animal.comer();
        System.out.println();

        animal.andar();
        System.out.println();

        animal.dormir();
        System.out.println();

        // Clase Mamífero
        Mamifero mamifero = new Mamifero();

        mamifero.colorPelo = "Amarillo";
        mamifero.nombre = "Perro";
        mamifero.temperatura = 38.7;

        mamifero.Pelo();
        System.out.println();

        mamifero.devolverNombre();
        System.out.println();

        mamifero.temperaturaCorporal();
        System.out.println();

    }
}
