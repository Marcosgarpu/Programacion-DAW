import java.util.Scanner;

public class Relacion6_Ejercicio5 {
    public static void main(String[] args) {
        //Datos de enntrada
        String nombre = "";
        Scanner entrada = new Scanner(System.in);

        //Datos auxiliares
        int posicion, numApellidos = 0;

        System.out.println("Escribe tu nombre y apellidos: ");
        nombre = entrada.nextLine();

        nombre = nombre.trim(); //Elimina espacios al principio y al final de cada palabra.
        System.out.println("Inicial del nombre: " + nombre.substring(0,1).toUpperCase());

        posicion = nombre.indexOf(" ");

        while (posicion != -1){
            numApellidos++;
            nombre = nombre.substring(posicion + 1, nombre.length() - 1);
            nombre = nombre.trim(); // Elimina espacios al principio de los apellidos.
            System.out.println("Inicial apellido " + numApellidos + ": " + nombre.substring(0, 1).toUpperCase());
            posicion = nombre.indexOf(" ");
        }
    }
}
