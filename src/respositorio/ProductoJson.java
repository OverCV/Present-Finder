package respositorio;

import modelo.Producto;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ProductoJson implements ILectorJson<Producto> {
    private final List<Producto> listaProductos = new ArrayList<>();
    protected String ruta = "src/datos/productos.json";
    public ProductoJson() {
        String contenidoArchivo = "";
        try {
            contenidoArchivo = new String(Files.readAllBytes(
                    Paths.get(ruta)), StandardCharsets.UTF_8
            );
        } catch (IOException e) {
            System.out.println("Error al leer el archivo JSON de proveedores: " + e.getMessage());
        }

        JSONArray jsonArray = new JSONArray(contenidoArchivo);
        for (Object o : jsonArray) {
            JSONObject jsonObject = (JSONObject) o;
            String nombre = jsonObject.getString("nombre");
            int edad = jsonObject.getInt("edad");
            double precio = jsonObject.getDouble("precio");
            String proveedor = jsonObject.getString("proveedor");

            Producto producto = new Producto(nombre, edad, precio, proveedor);
            listaProductos.add(producto);
        }

    }

    @Override
    public List<Producto> getTList() {
        return listaProductos;
    }
}