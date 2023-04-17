package modelo;

public record Producto(String nombre, int edad, double precioBase, String proveedor) {

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
        return nombre + " - precio base: $" + precioBase + ",0.";
    }
}