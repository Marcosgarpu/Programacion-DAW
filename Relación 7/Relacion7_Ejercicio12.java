public class Relacion7_Ejercicio12 {
    public static void main(String[] args) {
        // Datos de entrada
        int [][] array = new int[4][5];
        int sumaFila = 0, sumaCol = 0, sumaTot = 0;

        // Rellenar con números aleatorios        
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random()*50) + 1;
            }
        }

        // Mostrar numeros y obtener sumas de las filas
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d |", array[i][j]);
                sumaFila += array[i][j];
            }
            System.out.printf(" %d\n", sumaFila);
            sumaTot += sumaFila;
            sumaFila = 0;
        }
        System.out.println("--------------------------------------------");

        // Suma de las columnas

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[0][0]
            }
        }


    }
}
