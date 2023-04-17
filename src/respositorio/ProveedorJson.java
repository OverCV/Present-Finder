package respositorio;

import modelo.Producto;
import modelo.Proveedor;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ProveedorJson implements ILectorJson<Proveedor> {
    private final List<Proveedor> listaProveedores = new ArrayList<Proveedor>();
    public ProveedorJson() {
        String contenidoArchivo = "";
        try {
            contenidoArchivo = new String(Files.readAllBytes(
                    Paths.get("src/datos/proveedores.json")), StandardCharsets.UTF_8
            );
        } catch (IOException e) {
            System.out.println("Error al leer el archivo JSON de proveedores: " + e.getMessage());
        }

        JSONArray jsonArray = new JSONArray(contenidoArchivo);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String nombre = jsonObject.getString("nombre");
            double precioEnvio = jsonObject.getDouble("precioEnvio");

            Proveedor proveedor = new Proveedor(nombre, precioEnvio);
            listaProveedores.add(proveedor);
        }
    }

    @Override
    public List<Proveedor> getTList() {
        return listaProveedores;
    }
}