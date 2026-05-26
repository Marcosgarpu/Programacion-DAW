package Relacion_11.EJ03;

public class Yogur {

    // Atributos
    protected double calorias = 120.5;

    // Constructor
    public Yogur() {
    }

    public double getCalorias() {
        return calorias;
    }

    @Override
    public String toString() {
        return "Yogur --> Calorias: " + getCalorias();
    }

}
