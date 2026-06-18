package Relacion9.EJ12;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(4.2, 2);
        Punto p2 = new Punto(3, 8);

        Linea l1 = new Linea(p1, p2);

        System.out.println(l1);
    }
}
