package respositorio;

import modelo.Producto;
import modelo.Proveedor;
import modelo.Regalo;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private final ILectorJson<Proveedor> provedoresJson = new ProveedorJson();
    private final ILectorJson<Producto> productosJson = new ProductoJson();

    private final List<Regalo> regalos = new ArrayList<>();

    public Almacen() {
    }

    public List<Regalo> getRegalos() {
        return regalos;
    }

    public boolean crearRegalos() {
        if (!provedoresJson.getTList().isEmpty() && !productosJson.getTList().isEmpty()) {
            for (Producto producto : productosJson.getTList()) {
                for (Proveedor proveedor : provedoresJson.getTList()) {
                    if (producto.getProveedor().equals(proveedor.getNombre())) {
                        Regalo nuevoRegalo = new Regalo(
                                producto.getNombre(), producto.getEdad(), producto.getPrecioBase(), proveedor.getPrecioEnvio()
                        );
                        regalos.add(nuevoRegalo);
                    }
                }
            }
            return true;
        }
        return false;
    }
}
