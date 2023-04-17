package modelo;

public class Regalo {
    private String nombre;
    private double precioBase;
    private double precioEnvio;

    public Regalo(String nombre, double precioBase, double precioEnvio) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.precioEnvio = precioEnvio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getPrecioEnvio() {
        return precioEnvio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setPrecioEnvio(double precioEnvio) {
        this.precioEnvio = precioEnvio;
    }

    public double calcularPrecioFinal() {
        return precioBase + precioEnvio;
    }

    @Override
    public String toString() {
        return "Regalo{" +
                "nombre: '" + nombre + '\'' +
                ", precioBase: " + precioBase +
                ", precioEnvio: " + precioEnvio +
                '}';
    }
}
