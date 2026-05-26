package Relacion_11.EJ02;

public class IngenieroInformatico extends Ingeniero {

    // Hereda los atributos de Ingeniero que son los de Persona

    // Constructores que heredan de Ingeniero que a su vez es de Persona
    public IngenieroInformatico() {
        super();
    }

    public IngenieroInformatico(String nIF, int altura, int edad, String nombre, String apellidos, String fechaNacim) {
        super(nIF, altura, edad, nombre, apellidos, fechaNacim);
    }

    // Metodos de un Ingeniero Infórmatico
    public void crearPrograma() {
        System.out.println("Programa creado....");
    }


}
