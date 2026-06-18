package Relacion10.Ej03;

import Relacion10.Ej02.Articulo;

public class Main {
    public static void main(String[] args) {
        PruebaArticulo gestor = new PruebaArticulo(3);

        // Articulos
        Articulo a1 = new Articulo("T001", "Teclado");
        Articulo a2 = new Articulo("T002", "Ratón");
        Articulo a3 = new Articulo("T003", "Monitor");
        Articulo a4 = new Articulo("T004", "Falla (no cabrá)");

        // Almacenar y comprobar 
        System.out.println("Insertado: " + gestor.almacena(a1));
        System.out.println("Insertado: " + gestor.almacena(a2));
        System.out.println("Insertado: " + gestor.almacena(a3));
        System.out.println("Insertado: " + gestor.almacena(a4));

        // Mostrar
        System.out.println(gestor);

    }

}
