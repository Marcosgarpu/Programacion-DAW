package Relacion_11.EJ03;

public class YogurDesnatado extends Yogur {
    
    //Constructor
    public YogurDesnatado() {
        super();
    }

    // Metodo para obtener las calorias de un yogur desnatado
    @Override
    public double getCalorias() {
        return super.getCalorias() / 2;
    }

    @Override
    public String toString() {
        return "Yogur Desnatado --> Calorias: " + getCalorias();
    }

    
}
