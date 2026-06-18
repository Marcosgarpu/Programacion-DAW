public class Relacion7_Ejercicio2 {
    public static void main(String[] args) {
        
       String mensajes[] = {"Hola", "mundo", "bienvenido"};
       int mayor = 0;
       int longitud;
       int posicionMayor = 0;

       for (int i = 0; i < mensajes.length; i++) {
        longitud = mensajes[i].length();
        if (longitud > mayor) {
            mayor = mensajes[i].length(); // mayor = longitud;
            posicionMayor = i;
        }
       }
       System.out.println("El mensaje de mayor longitud es: " + mensajes[posicionMayor]);
    }
}
