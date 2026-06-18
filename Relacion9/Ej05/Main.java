package Relacion9.Ej05;

public class Main {
    public static void main(String[] args) {
        
        Bicicleta mBicicleta = new Bicicleta();

        System.out.println("El color de la bicicleta es: " + mBicicleta.getColor());
        System.out.println("La marcha en la que está la  bicicleta es: " + mBicicleta.getMarcha());
        System.out.println("La velocidad de la bicicleta es: " + mBicicleta.getVelocidad() + " km/h");

        mBicicleta.avanzar();
        System.out.println("La velocidad después de avanzar es: " + mBicicleta.getVelocidad() + " km/h");

        mBicicleta.cambiarMarcha(3);
        System.out.println("La bicicleta está en la marcha: " + mBicicleta.getMarcha());

    }
}
