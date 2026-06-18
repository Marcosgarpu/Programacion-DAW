package Relacion9.EJ04;

public class Autobus2 {
    
    // Atributos 
    String matricula, modelo;
    float potenciaCV;
    int numeroPlazas;

    // Método contructor 
    Autobus2(String mat, String mod, float poten, int numPlazas) {
        this.matricula = mat;
        this.modelo = mod;
        this.potenciaCV = poten;
        this.numeroPlazas = numPlazas;
    }

    // Métodos
    String getMatricula() {
        return matricula;
    }

    String getModelo(){
        return modelo;
    }

    float getPotenciaCV(){
        return potenciaCV;
    }

    int getNumPlazas(){
        return numeroPlazas;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    
}
