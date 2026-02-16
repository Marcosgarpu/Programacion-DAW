package Relacion10.Ej03;


import Relacion10.Ej02.Articulo;

import java.util.Scanner;

import Relacion10.Ej04.*;

public class PruebaArticulo {
    private Articulo [] listArticulos;
    private static int contador = 0;

    // Constructor
    public PruebaArticulo(int tamaño) {
        listArticulos  = new Articulo[tamaño];
        contador = 0;
    }

    // Método almacena
    public boolean almacena(Articulo nuevoArticulo) {
        if (contador < listArticulos.length) {
            listArticulos[contador] = nuevoArticulo;
            contador++;
            return true;
        }else {
            System.out.println("Ya no puedes añadir más articulos.");
            return false;
        }       
    }

    @Override
    public String toString() {
        String cadena = "";

        for (Articulo articulo : listArticulos) {
            cadena = cadena + "Articulo: " + articulo.getDescripcion();
        }

        return cadena;
    }

    // Métodos ejercicio 4
    
    public void entradaAutomatizada(PruebaArticulo almacen) {
        
        Articulo a1 = new Articulo("T001","Teclado", 18.99, 24.99, 30);
        Articulo a2 = new Articulo("T002","Ratón", 18.99, 24.99, 50);
        Articulo a3 = new Articulo("T003","Portátil", 1500, 24.99, 15);
        Articulo a4 = new Articulo("T004","PC Gaming", 2800, 24.99, 10);

        almacen.almacena(a1);
        almacen.almacena(a2);
        almacen.almacena(a3);
        almacen.almacena(a4);

    }

    public void lista(PruebaArticulo almacen){
        System.out.println(almacen);
    }

    public void alta(Scanner entrada, PruebaArticulo almacen) {

        System.out.println("Introduce el código del artículo: ");
        String codigo = entrada.nextLine();

        System.out.println("Introduce la descripcion (nombre) del artículo: ");
        String descripcion = entrada.nextLine();

        System.out.println("Introduce el precio de compra: ");
        double precioCompra = entrada.nextDouble();

        System.out.println("Introduce el precio de venta: ");
        double precioVenta = entrada.nextDouble();

        System.out.println("Introduce el stock inicial del producto: ");
        int stock = entrada.nextInt();

        Articulo articuloNuevo = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);

        if (almacen.almacena(articuloNuevo)) {
            System.out.println("Artículo dado de alta correctamente");
        } else {
            System.out.println("Error: Almacén lleno");
        }

    }

    // Metodo elimina para usar en el metodo baja
    public boolean elimina(String codigo) {

        for (int i = 0; i < contador; i++) {
            if (listArticulos[i].getCodigo().equals(codigo)) {
                // Desplazar elementos para llenar el hueco
                for (int j = i; j < contador - 1; j++) {
                    listArticulos[j] = listArticulos[j+1];
                }
                listArticulos[contador - 1] = null; // Limpiar el último
                contador--;
                return true;
            }
        }
        return false;

    }

    public void baja(Scanner entrada) {

        String codigo;
        System.out.println("Introduce el codigo del articulo que desea eliminar: ");
        codigo = entrada.nextLine();

        if (elimina(codigo)) {
            System.out.println("Artículo eliminado correctamente");
        } else {
            System.out.println("El artículo no se ha podido añadir");
        }

        entrada.close();

    }

    private Articulo buscarArticulo(String codigo) {
        for (int i = 0; i < contador; i++) {
            if (listArticulos[i].getCodigo().equals(codigo)) {
                return listArticulos[i];
            }
        }
        return null;
        
    }

    public boolean entradaMercancida (Scanner entrada) {

        String codigo;
        int cantidad;

        System.out.println("Introduce el código del artículo: ");
        codigo = entrada.nextLine();
        System.out.println("Introduce la cantidad que desea introducir: ");
        cantidad = entrada.nextInt();

        Articulo a = buscarArticulo(codigo);

        if (a != null) {
            a.setStock(a.getStock() + cantidad);
            return true;
        } else {
            return false;
        }

    }

    public boolean salidaMercancia(Scanner entrada){

        String codigo;
        int cantidad;

        System.out.println("Introduce el código del artículo: ");
        codigo = entrada.nextLine();
        System.out.println("Introduce la cantidad que desea introducir: ");
        cantidad = entrada.nextInt();

        Articulo a = buscarArticulo(codigo);

        if (a != null) {
            if (a.getStock() >= cantidad) {
                a.setStock(a.getStock() - cantidad);
                return true;
            } else {
                System.out.println("Error: No hay suficiente stock");
                return false;
            }
        } else {
            return false;
        }

    }
}
