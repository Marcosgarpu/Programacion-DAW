package Relacion9.Ej07;

public class Pizza {

    private String sabor;
    private String tamaño;
    private String estado = "pedida";

    static int totPedidas = 0;
    static int totServidas = 0;


    public Pizza (String sabor, String tamaño) {
        this.sabor = sabor;
        this.tamaño = tamaño;

        totPedidas ++;
    }

    void sirve() {

        if (estado == "pedida") {

            estado = "servida";
            totServidas ++;
            totPedidas --;

        } else {
            System.out.println("La pizza ya está servida.");
        }

    }

    public static int getTotPedidas() {
        return totPedidas;
    }

    public static int getTotServidas() {
        return totServidas;
    }

    @Override
    public String toString() {
        return "Pizza " + sabor + ", " + tamaño + ", " + estado + ".";
    }

}
