package Relacion10.Ej06;

import Relacion10.Ej05.*;

public class Main {
    public static void main(String[] args) {

        Autor a1 = new Autor("Federico Garcia Lorca", "España");
        Autor a2 = new Autor("Fdsfsadfasa", "Espasadfsña");
        Autor a3 = new Autor("Federsdfsdfarcia Lorca", "sdfsdfsdf");
        Autor a4 = new Autor("Federico Gsdfsdfsdfacira Lorca", "Espsdfsdfaña");

        Libro l1 = new Libro("0001", "Hola", a1);
        Libro l2 = new Libro("0002", "Mundo", a2);
        Libro l3 = new Libro("0003", "Que", a3);
        Libro l4 = new Libro("0004", "Tal", a4);  

        Prestamos p1 = new Prestamos("02/02/2026", "21/03/2026", l1, "Manuel");
        Prestamos p2 = new Prestamos("02/02/2026", "21/03/2026", l2, "Manuel");
        Prestamos p3 = new Prestamos("02/02/2026", "21/03/2026", l3, "Manuel");
        Prestamos p4 = new Prestamos("02/02/2026", "21/03/2026", l4, "Manuel");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
