package Relacion9.Ej06;

public class Fraccion {

    // Atributos
    private int numerador;
    private int denominador;

    // Constructor 
    public Fraccion(int num, int den){
        this.numerador = num;
        this.denominador = den;
    }

    // Métodos
    private int mcd(int a, int b) {
        if (b == 0) {
            return a;             // Si b es 0, el MCD es a (CASO BASE)
        } else {
            return mcd(b, a % b); // Si no, seguimos dividiendo (RECURSIVIDAD)
            } 
    }

    public Fraccion simplifica(){

        int comun = mcd(Math.abs(numerador), Math.abs(denominador));

        return new Fraccion(numerador/comun, denominador/comun);
    }

    public Fraccion invertir(){
    
        return new Fraccion(denominador, numerador);

    }

    public Fraccion multiplica(Fraccion a) {

        return new Fraccion(numerador*a.numerador, denominador*a.denominador);

    }

    public Fraccion divide(Fraccion a) {

        return new Fraccion(numerador*a.denominador, denominador*a.numerador);

    }

    @Override
    public String toString() {
        return numerador + "/" + denominador ;
    } 

    
}
