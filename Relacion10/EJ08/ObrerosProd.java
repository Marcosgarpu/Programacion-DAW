package Relacion10.EJ08;

public class ObrerosProd {
    private String [] nombres = new String[20];
    private int [][] produccion = new int[20][6];
    private int [] totProd = new int[20];
    private int [] totMes = new int[6];
    private int toTotProd;

    // Setters y getters
    public String[] getNombres() {
        return nombres;
    }
    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }
    public int[][] getProduccion() {
        return produccion;
    }
    public void setProduccion(int[][] produccion) {
        this.produccion = produccion;
    }
    public int[] getTotProd() {
        return totProd;
    }
    
    public int[] getTotMes() {
        return totMes;
    }
    
    public int getToTotProd() {
        return toTotProd;
    }

    // Métodos
    public void calcularTotProd() {
        int suma;
        for (int i = 0; i < 20; i++) {
            suma = 0;
            for (int j = 0; j < 6; j++) {
                suma += produccion[i][j];
            }
            totProd[i] = suma;
        }
    }

    public void calcularTotMes() {
        int suma;
        for (int i = 0; i < 6; i++) {
            suma = 0;
            for (int j = 0; j < 20; j++) {
                suma += produccion[i][j];
            }
            totMes[i] = suma;
        }
    }

    public void calcularToTotProd() {
        this.toTotProd = 0;
        for (int i = 0; i < 20; i++) {
            this.toTotProd += totProd[i];
        }
    }

}
