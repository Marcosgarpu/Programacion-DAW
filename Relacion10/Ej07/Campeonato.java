package Relacion10.Ej07;


public class Campeonato {
    private Jugador [] jugadores;
    private Partido [] partidos;
    private int numJugadores;
    private int numPartidos;

    public Campeonato(int maxJugadores, int maxPartidos) {
        this.jugadores = new Jugador[maxJugadores];
        this.partidos = new Partido[maxPartidos];

        this.numJugadores = 0;
        this.numPartidos = 0;
    }

    public boolean inscribirJugador(Jugador j) {
        if (numJugadores < jugadores.length) {
            jugadores[numJugadores++] = j; // numJugadores es la posición en la que se va a inscribir el jugador j
            return true;
        }
        return false;
    }

    public boolean agregarPartido(Partido p) {
        if (numPartidos < partidos.length) {
            partidos[numPartidos++] = p; // numPartidos es la posición en la que se va a inscribir el partido p
            return true;
        }
        return false;
    }

    public void registrarResul(int posPartido, int s1, int s2) {
        if (!(posPartido >= 0 && posPartido < numPartidos)) {
            System.out.println("El número del partido introducido no es correcto");
            return;
        }

        if ((s1 == 2 && (s2 == 0 || s2 == 1)) || 
            (s2 == 2 && (s1 == 0 || s1 == 2))) {

            partidos[posPartido].registrarResul(s1, s2);

        } else {
            System.out.println("El resultado no es al mejor de 3.");
        }
    }

    public Jugador[] obtenerClasificacion() {
        for (int i = 0; i < jugadores.length; i++) {
            int masVictorias = i;
            for (int j = i + 1; i < jugadores.length; j++) {
                if (jugadores[j].getVictorias() > jugadores[masVictorias].getVictorias()) {
                    masVictorias = j;
                }
            }
            Jugador temp = jugadores[i]; 
            jugadores[i] = jugadores[masVictorias];
            jugadores[masVictorias] = temp;
        }
        return jugadores;
    }



}
