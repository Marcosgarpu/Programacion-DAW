package Relacion9.EJ04;

public class Main {
    public static void main(String[] args) {
        
        Autobus miAutobus = new Autobus();

        miAutobus.matricula = "4344JYR";
        miAutobus.modelo = "Golf 7000";
        miAutobus.potenciaCV = 380;
        miAutobus.setNumeroPlazas(35);

        System.out.println("La matrícula del autobús es: " + miAutobus.getMatricula());
        System.out.println("El modelo del autobus es: " + miAutobus.getModelo());
        System.out.println("La potencia del autobús es de " + miAutobus.getPotenciaCV() + " CV");
        System.out.println("El número de plazas del autobús es: " + miAutobus.getNumPlazas());

    }

}
