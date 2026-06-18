package Relacion10.Ej07;

public class Jugador {
    // Atributos
    private String nombre;
    private int edad;
    private int ranking;
    private int victorias;
    private int derrotas;
    private int setsGanados;
    private int setsPerdidos;
    private int numJugadores;

    // Setters y getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getRanking() {
        return ranking;
    }
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    public int getVictorias() {
        return victorias;
    }
    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getSetsGanados() {
        return setsGanados;
    }
    public void setSetsGanados(int setsGanados) {
        this.setsGanados = setsGanados;
    }
    public int getSetsPerdidos() {
        return setsPerdidos;
    }
    public void setSetsPerdidos(int setsPerdidos) {
        this.setsPerdidos = setsPerdidos;
    }
    public int getNumJugadores() {
        return numJugadores;
    }
    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }
    
    // Actualizar estadísticas tras un partido
    public void ActualizarSets(int setsG, int setsP) {
        this.setsGanados += setsG;
        this.setsPerdidos +=  setsP;
        if (setsG > setsP) {
            this.victorias++;
        } else {
            this.derrotas++;
        }
    }
}
