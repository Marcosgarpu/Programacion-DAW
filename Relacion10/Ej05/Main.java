package Relacion10.Ej05;

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

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

    }
}
