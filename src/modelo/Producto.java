package modelo;

public record Producto {
    private static String nombre;
    private static int edad;
    private static double precioBase;
    private static String proveedor;

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

    @Override
    public String toString() {
        return nombre + " - precio base: $" + precioBase + ",0";
    }
}