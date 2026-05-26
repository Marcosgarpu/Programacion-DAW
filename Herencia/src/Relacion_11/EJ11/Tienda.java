package Relacion_11.EJ11;

import java.util.ArrayList;
import java.util.Collections;

public class Tienda {
    public static void main(String[] args) {

        // Objetos creados de prueba
        Producto p1 = new Producto("Teclado", 80.88);
        Producto p2= new Producto("Ratón", 180.99);
        Producto p3 = new Producto("Ordenador Gaming", 999.99);
        Producto p4 = new Producto("Iphone 16 pro", 918.99);

        // ArrayList de productos
        ArrayList<Producto> tienda = new ArrayList<>();
        tienda.add(p4);
        tienda.add(p2);
        tienda.add(p1);
        tienda.add(p3);

        // Mostrar productos sin ordenar
        for (int i = 0; i < tienda.size(); i++) {
            System.out.println(tienda.get(i));
        }

        Collections.sort(tienda);

        System.out.println("---------------------------------");

        // Mostrar productos ordenados
        for (int i = 0; i < tienda.size(); i++) {
            System.out.println(tienda.get(i));
        }

    }
}
