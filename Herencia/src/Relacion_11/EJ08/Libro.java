package Relacion_11.EJ08;

public class Libro extends Publicacion implements Prestable{
    
    // Atributos
    private boolean prestado;


    // Constructor
    public Libro(String iSBN, String titulo, String añoPublicacion) {
        super(iSBN, titulo, añoPublicacion);
        this.prestado = false;
    }

    // Getters
    public boolean isPrestado() {
        return prestado;
    }

    // Metodos de la interfaz prestable
    @Override
    public void presta() {
        if (prestado) {
            System.out.println("Lo siento el libro está prestado");
        } else {
            System.out.println("El libro se ha prestado");
            prestado = true; 
        }
    }

    @Override
    public void devuelve() {
        prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    // Metodo toString
    public String toString() {
        return "ISBN: " + getISBN() + ", título: " + getTitulo()
            + ", año de publicación: " + getAñoPublicacion()
            + (prestado ? " (prestado)" : " (no prestado)");
    }

}
