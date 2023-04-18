package control;

import modelo.Regalo;
import respositorio.Almacen;
import servicio.FiltroRegalos;

import java.util.List;

public class ControlRegalos {

    FiltroRegalos filtro = new FiltroRegalos();

    public ControlRegalos() {

    }

    public List<Regalo> buscarRegalos(int edad, double costo) {
        Almacen almacen = new Almacen();
        if (!almacen.crearRegalos()) {
            return null;
        }
        List<Regalo> regalos = almacen.getRegalos();
        regalos = filtro.filtroPorEdad(regalos, edad);
        regalos = filtro.filtroPorCosto(regalos, costo);
        return regalos;
    }
}
