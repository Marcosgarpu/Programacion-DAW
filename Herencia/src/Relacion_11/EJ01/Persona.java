package Relacion_11.EJ01;


public abstract class Persona {
    // Atributos
    protected String NIF = "11111111A";
    protected int altura = 175;
    protected int edad = 25;
    protected String nombre;
    protected String apellidos;
    protected String fechaNacim;

    // Constructores de persona
    public Persona() {
    }
    

    public Persona(String nIF, int altura, int edad, String nombre, String apellidos, String fechaNacim) {
        NIF = nIF;
        this.altura = altura;
        this.edad = edad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacim = fechaNacim;
    }



    // getters y setters
    public String getNIF() {
        return NIF;
    }
    
    public void setNIF(String nIF) {
        NIF = nIF;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }



    // Metodos
    public void comer() {
        System.out.println("La persona está comiendo.");
    }

    public void hablar() {
        System.out.println("La persona está hablando.");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public String getFechaNacim() {
        return fechaNacim;
    }


    public void setFechaNacim(String fechaNacim) {
        this.fechaNacim = fechaNacim;
    }


    @Override
    public String toString() {
        return "Persona [NIF=" + NIF + ", altura=" + altura + ", edad=" + edad + "]";
    }

    public abstract void mostrar();

}
