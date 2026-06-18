package Relacion9.Ej08;

public class Zona {
    private int entradasPorVender;

    public Zona(int entradasPorVender) {
        this.entradasPorVender = entradasPorVender;
    }

    public int getEntradasPorVender() {
        return entradasPorVender;
    }

    public void vender(int n) {
        if (this.entradasPorVender == 0) {
            System.out.println("Lo siento, las entradas para esa zona estan agotados.");
        } else if (this.entradasPorVender < n) {
            System.out.println("Solo me quedan " + this.entradasPorVender + " entradas para esa zona.");
        }

        if (this.entradasPorVender >= n) {
            entradasPorVender -= n;
            System.out.println("Aqui tiene sus " + n + " entradas, gracias.");
        }
    }
}
