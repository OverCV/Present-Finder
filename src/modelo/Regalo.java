package modelo;

public class Regalo {
    private String nombre;
    private int edad;
    private double precioBase;
    private double precioEnvio;

    public Regalo(String nombre, int edad, double precioBase, double precioEnvio) {
        this.nombre = nombre;
        this.edad = edad;
        this.precioBase = precioBase;
        this.precioEnvio = precioEnvio;
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

    public double getPrecioEnvio() {
        return precioEnvio;
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

    public void setPrecioEnvio(double precioEnvio) {
        this.precioEnvio = precioEnvio;
    }

    public double calcularPrecioFinal() {
        return precioBase + precioEnvio;
    }

    @Override
    public String toString() {
        return nombre
                + " - precio base: $" + precioBase
                + " - precio de envío: $" + precioEnvio
                + " - precio final: $" + calcularPrecioFinal() + '.';
    }
}
