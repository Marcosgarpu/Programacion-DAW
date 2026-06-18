public class Relacion7_Ejercicio11 {
    public static void main(String[] args) {
        // Declaracion de variables de entrada
        int [][] num = {{0,30,2,100,100,5},{75,100,100,100,0,100},{100,100,-2,9,100,11}};
        String vacio = " ";
        //Cabecera de la tabla
        System.out.printf("%-2s %-2s %-2s %-2s %-2s %-2s %-2s\n",
                        "Array num", "Columna 0", "Columna 1", "Columna 2", "Columna 3", "Columna 4", "Columna 5");
        
        // Escribe la tabla 
        for (int i = 0; i < num.length; i++) {

            System.out.printf("Fila %3d: ", i);

            for (int j = 0; j < num[0].length; j++) {

                if (num[i][j] == 100) {
                    System.out.printf("%9s", vacio);
                } else {
                    System.out.printf("%9d ", num[i][j]);
                }

            }
            System.out.println("");
        }


    }
}
