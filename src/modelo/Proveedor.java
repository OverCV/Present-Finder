package modelo;

public record Proveedor(String nombre, double precioEnvio) {

    public String getNombre() {
        return nombre;
    }

    public double getPrecioEnvio() {
        return precioEnvio;
    }

    @Override
    public String toString() {
        return nombre + " - precio envío: $" + precioEnvio + ",0.";
    }
}
