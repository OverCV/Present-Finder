package respositorio;

import modelo.Producto;
import org.json.JSONArray;
import org.json.JSONObject;
import servicio.Logs;

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
            contenidoArchivo = new String(Files.readString(
                    Paths.get(ruta))
            );
            JSONArray jsonArray = new JSONArray(contenidoArchivo);
            for (Object obj : jsonArray) {
                JSONObject jsonObject = (JSONObject) obj;
                try {
                    // Puede ocurrir la excepción
                    String nombre = jsonObject.getString("nombre");
                    int edad = jsonObject.getInt("edad");
                    double precio = jsonObject.getDouble("precio");
                    String proveedor = jsonObject.getString("proveedor");

                    Producto producto = new Producto(nombre, edad, precio, proveedor);
                    listaProductos.add(producto);
                } catch (Exception e) {
                    Logs.getInstance().nuevoLog("Error al leer un producto del archivo JSON [ " + e.getMessage() + " ]");
                }
            }
        } catch (IOException e) {
            // Mensaje no en Log ya que el usuario requiere saber qué ha pasado en el programa.
            Logs.getInstance().nuevoLog("Error al leer el archivo JSON de productos: " + e.getMessage() + '.');
        }
    }

    @Override
    public List<Producto> getTList() {
        return listaProductos;
    }
}