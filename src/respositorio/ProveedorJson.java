package respositorio;

import modelo.Proveedor;
import org.json.JSONArray;
import org.json.JSONObject;
import servicio.Logs;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ProveedorJson implements ILectorJson<Proveedor> {
    private final List<Proveedor> listaProveedores = new ArrayList<>();
    protected String ruta = "src/datos/proveedores.json";

    public ProveedorJson() {
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
                    double precioEnvio = jsonObject.getDouble("precioEnvio");

                    Proveedor proveedor = new Proveedor(nombre, precioEnvio);
                    listaProveedores.add(proveedor);
                } catch (Exception e) {
                    Logs.getInstance().nuevoLog("Error al leer un proveedor del archivo JSON [ " + e.getMessage() + " ]");
                }
            }
        } catch (IOException e) {
            // Mensaje no en Log ya que el usuario requiere saber qué ha pasado en el programa.
            Logs.getInstance().nuevoLog("Error al leer el archivo JSON de proveedores: " + e.getMessage() + ".");
        }
    }

    @Override
    public List<Proveedor> getTList() {
        return listaProveedores;
    }
}