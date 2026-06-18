package Relacion10.Ej06;

import Relacion10.Ej05.*;

public class Prestamos {
    
    // Atributos
    private String fechaPrestamo;
    private String devolucion;
    private Libro libro;
    private String cliente;
    private static int totPrestamos = 0;

    // Constructor
    public Prestamos(String fechaPrestamo, String devolucion, Libro libro, String cliente) {
        this.fechaPrestamo = fechaPrestamo;
        this.devolucion = devolucion;
        this.libro = libro;
        this.cliente = cliente;
        totPrestamos++;
    }

    // Métodos
    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(String devolucion) {
        this.devolucion = devolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "Prestamos:\nFechaPrestamo: " + fechaPrestamo + "Devolucion: " + devolucion + "Libro: " + libro;
    }


}
