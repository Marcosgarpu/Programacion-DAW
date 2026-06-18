package Relacion9.Ej05;

public class Bicicleta {
    
    // Atributos

    private String color = "Negro";
    private int velocidad = 0;
    private int marcha = 2;

    // Métodos 

    void avanzar() {
        velocidad = velocidad + 1;
    }

    void cambiarMarcha(int marcha){
        this.marcha = marcha;
    }

    void frenar(){
        velocidad = velocidad - 1;
    }

    public String getColor() {
        return color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getMarcha() {
        return marcha;
    }

    

}
