package servicio;

import java.util.ArrayList;
import java.util.List;

public class Logs {
    private static Logs instancia; // Instancia única de Logs
    private List<String> errores; // Lista para almacenar los errores

    private Logs() {
        errores = new ArrayList<>();
    }

    // Método estático para obtener la instancia única de Logs
    public static Logs getInstance() {
        if (instancia == null) {
            instancia = new Logs();
        }
        return instancia;
    }

    // Método para agregar un nuevo error al log
    public void nuevoLog(String error) {
        errores.add(error);
    }

    // Método para obtener los errores registrados en el log
    public List<String> getErrores() {
        return errores;
    }
}
