package Relacion10.Ej05;

public class Libro {
    
    // Atributos
    private String codigo;
    private String titulo;
    private Autor autor;
    private static int totLibros = 0;

    // Constructor
    public Libro(String codigo, String titulo, Autor autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        totLibros ++;
    }

    // Métodos
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public static int getTotLibros() {
        return totLibros;
    }

    public static void setTotLibros(int totLibros) {
        Libro.totLibros = totLibros;
    }

    @Override
    public String toString() {
        return "Libro:\nCódigo: " + codigo + "Título: " + titulo + "Autor: " + autor;
    }

    


}
