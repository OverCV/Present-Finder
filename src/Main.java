import modelo.Proveedor;
import respositorio.ILectorJson;
import respositorio.ProveedorJson;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        prueba();
    }

    public  static void prueba() {
            ILectorJson<Proveedor> lectorJson = new ProveedorJson();
            System.out.println("Lista de proveedores:");
            for (Proveedor proveedor : lectorJson.getTList()) {
                System.out.println(proveedor);
            }
    }
}