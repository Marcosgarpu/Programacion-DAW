package Relacion_11.EJ11;

public class Producto implements Comparable<Producto>{
    // Atributos
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters 
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    // Metodos 
    public int compareTo(Producto p) {
        if (this.getPrecio() < (p.getPrecio())){
            return -1; // Si this es menor que p
        } else if (this.getPrecio() > (p.getPrecio()))  {
            return 1; // Si this es mayor que p
        } else { 
            return 0; // Si this es igual que p
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ". --> Precio:" + getPrecio() + ".";
    }

}
