package Relacion10.Ej02;

public class Articulo {

    // Atributos
    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;

    // Constructor
    public Articulo(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    // Constructor ejercicio 4
    public Articulo(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }


    // Métodos
    public String getCodigo() {
        return codigo;
    }
    

    public String getDescripcion() {
        return descripcion;
    }
    public double getPrecioCompra() {
        return precioCompra;
    }
    public double getPrecioVenta() {
        return precioVenta;
    }
    public int getStock() {
        return stock;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Método toString
    @Override
    public String toString() {
        return "Articulo [codigo=" + codigo + ", descripcion=" + descripcion + ", precioCompra=" + precioCompra
                + ", precioVenta=" + precioVenta + ", stock=" + stock + "]";
    }

    

}
