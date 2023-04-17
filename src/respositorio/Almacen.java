package respositorio;

import modelo.Producto;
import modelo.Proveedor;
import modelo.Regalo;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private ILectorJson<Proveedor> provedoresJson = new ProveedorJson();
    private ILectorJson<Producto> productosJson = new ProductoJson();

    private List<Regalo> regalos = new ArrayList<Regalo>();

    public Almacen() {
    }

    public List<Regalo> getRegalos() {
        return regalos;
    }

    public boolean crearRegalos() {
        // TODO: Puede haber un error en la creación! No hay caso false!!!
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
}
