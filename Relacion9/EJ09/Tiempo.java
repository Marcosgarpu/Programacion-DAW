package Relacion9.EJ09;

public class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;

    // Constructor
    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void sumaTiempo(int horasSumar, int minSumar, int segSumar) {
        int resultadoHoras = 0, resultadoMin = 0, resultadoSeg = 0;
        resultadoHoras = this.horas + horasSumar;
        resultadoMin = this.minutos + minSumar;
        resultadoMin = this.segundos + minSumar;

        if (resultadoMin > 60) {
            resultadoHoras = resultadoHoras + 1;
            resultadoMin = resultadoMin - minSumar;
        }

        if (resultadoSeg > 60) {
            resultadoMin = resultadoMin + 1;
            resultadoSeg = resultadoSeg - segSumar;
        }

        resultadoHoras = this.horas;
        resultadoMin = this.minutos;
        resultadoSeg = this.segundos;
    }

    @Override
    public String toString() {
        return "Tiempo: " + horas + "h " + minutos + "m " + segundos + "s";
    }

}
