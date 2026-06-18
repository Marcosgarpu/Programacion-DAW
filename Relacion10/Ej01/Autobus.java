package Relacion10.Ej01;

public class Autobus {

    String matricula, modelo;
    int potenciaCV;
    int numPlazas;

    public Autobus(String matricula, String modelo, int potenciaCV, int numPlazas) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
        this.numPlazas = numPlazas;
    }

    // Métodos
    void setNumeroPlazas(int numero) {
        numPlazas = numero;
    }

    String getMatricula() {
        return matricula;
    }

    String getModelo(){
        return modelo;
    }

    int getPotenciaCV(){
        return potenciaCV;
    }

    int getNumPlazas(){
        return numPlazas;
    }

    @Override
    public String toString() {
        return "Autobus [matricula=" + matricula + ", modelo=" + modelo + ", potenciaCV=" + potenciaCV + ", numPlazas="
                + numPlazas + "]";
    }

    

}
