package Relacion_11.EJ08;

public class Revista extends Publicacion {

    // Atributos de la clase revista
    private int numero;

    // Constructor
    public Revista(String iSBN, String titulo, String añoPublicacion, int numero) {
        super(iSBN, titulo, añoPublicacion);
        this.numero = numero;
    }

    // Getter
    public int getNumero() {
        return numero;
    }


    // Métodos
    @Override
    public String toString() {
        return "ISBN: " + getISBN() + ", título: " + getTitulo()
            + ", año de publicación: " + getAñoPublicacion();
    }

    
}
