package Relacion10.Ej07;

public class Partido {
    private Jugador jugador1;
    private Jugador jugador2;
    private int setsJugador1;
    private int setsJugador2;
    private boolean resultadoRegristado;

    // Constructor
    public Partido(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.resultadoRegristado = false;
    }

    // Métodos
    public Jugador getJugador1() {
        return jugador1;
    }
    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }
    public Jugador getJugador2() {
        return jugador2;
    }
    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }
    public int getSetsJugador1() {
        return setsJugador1;
    }
    public void setSetsJugador1(int setsJugador1) {
        this.setsJugador1 = setsJugador1;
    }
    public int getSetsJugador2() {
        return setsJugador2;
    }
    public void setSetsJugador2(int setsJugador2) {
        this.setsJugador2 = setsJugador2;
    }
    public boolean isResultadoRegristado() {
        return resultadoRegristado;
    }

    public void registrarResul(int s1, int s2) {
        this.setsJugador1 = s1;
        this.setsJugador2 = s2;
        this.resultadoRegristado = true;
        jugador1.ActualizarSets(s1, s2);
        jugador2.ActualizarSets(s1, s2);
    }

}
