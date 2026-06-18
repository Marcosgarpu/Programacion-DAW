package Relacion9.Ej06;

public class Main {
    public static void main(String[] args) {
        
        Fraccion f1 = new Fraccion(5, 4);
        Fraccion f2 = new Fraccion(8, 4);

        System.out.println("La fraccion 2 simplificada es: " + f2.simplifica());
        System.out.println("La fracción 1 invertida es: " + f1.invertir());
        System.out.println("La multiplicación de las fracciones es: " + f1.multiplica(f2));
        System.out.println("La división de las fracciones es: " + f1.divide(f2));

        System.out.println(f1);
        System.out.println(f2);

    }  
}   
