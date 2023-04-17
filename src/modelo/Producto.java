package modelo;

public class Producto {
    private String nombre;
    private int edad;
    private double precioBase;
    private String proveedor;

    public Producto(String nombre, int edad, double precioBase, String proveedor) {
        this.nombre = nombre;
        this.edad = edad;
        this.precioBase = precioBase;
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return nombre + " - precio base: $" + precioBase + ",0";
    }
}