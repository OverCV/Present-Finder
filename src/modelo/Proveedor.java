package modelo;
public class Proveedor {
    private String nombre;
    private double precioEnvio;

    public Proveedor(String nombre, double precioEnvio) {
        this.nombre = nombre;
        this.precioEnvio = precioEnvio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioEnvio() {
        return precioEnvio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioEnvio(double precioEnvio) {
        this.precioEnvio = precioEnvio;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nombre: '" + nombre + '\'' +
                ", precioEnvio. " + precioEnvio +
                '}';
    }
}