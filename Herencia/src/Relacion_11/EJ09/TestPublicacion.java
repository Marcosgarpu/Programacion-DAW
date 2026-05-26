package Relacion_11.EJ09;

import java.util.ArrayList;
import java.util.Collections;

import Relacion_11.EJ08.Libro;
import Relacion_11.EJ08.Publicacion;
import Relacion_11.EJ08.Revista;

public class TestPublicacion {
    public static void main(String[] args) {
        ArrayList<Publicacion> lista = new ArrayList<>();

        lista.add(new Libro("123456", "La Ruta Prohibida", "2007"));
        lista.add(new Revista("444555", "Año Cero", "2019", 344));
        lista.add(new Libro("112233", "Los Otros", "2016"));
        lista.add(new Revista("002244", "National Geographic", "2003", 255));
        lista.add(new Libro("456789", "La rosa del mundo", "1995"));

        System.out.println("--- Antes de ordenar ---");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        Collections.sort(lista);

        System.out.println("--- Después de ordenar ---");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
