package Relacion_11.EJ01;

import Relacion_11.EJ06.Alumno;
import Relacion_11.EJ06.Profesor;

public class TestPersona {
    public static void main(String[] args) {
        // Crear personas
        Alumno a = new Alumno(null, 0, 0, null, null, null, null, 0);
        Profesor p = new Profesor(null, 0, 0, null, null, null, null, 0);

        // Mostrar resultados
        a.mostrar();
        System.out.println("----");
        p.mostrar();

    }
}
