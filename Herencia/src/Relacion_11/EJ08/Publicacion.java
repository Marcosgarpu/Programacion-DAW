package Relacion_11.EJ08;

public class Publicacion implements Comparable<Publicacion>{
    
    // Atributos
    private String ISBN;
    private String titulo;
    private String añoPublicacion;


    // Constructor
    public Publicacion(String iSBN, String titulo, String añoPublicacion) {
        this.ISBN = iSBN;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }


    // Getters y setters 
    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAñoPublicacion() {
        return añoPublicacion;
    }

    // CompareTo
    @Override 
    public int compareTo(Publicacion p) {
        if (this.getTitulo().compareTo(p.getTitulo()) < 0) { // this va antes
            return -1;
        } else if (this.getTitulo().compareTo(p.getTitulo()) > 1) { // this va después
            return 1;
        } else { // están en la misma posición
            return 0;
        }
    }

}
