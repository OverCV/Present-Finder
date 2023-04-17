package control;

import modelo.Regalo;
import respositorio.Almacen;
import sevicio.FiltroRegalos;

import java.util.List;

public class ControlRegalos {

    FiltroRegalos filtro = new FiltroRegalos();

    public ControlRegalos() {

    }

    public List<Regalo> buscarRegalos(int edad, double costo) {
        Almacen almacen = new Almacen();
        if (!almacen.crearRegalos()) {
        //            TODO: implementar uso de excepción.
        }
        List<Regalo> regalos = almacen.getRegalos();
        regalos = filtro.filtroPorEdad(regalos, edad);
        regalos = filtro.filtroPorCosto(regalos, costo);
        //        regalos = regalos.stream().filter(regalo -> regalo.getEdad() == edad && regalo.getPrecioBase() <= costo).collect(Collectors.toList());
        return regalos;
    }
}
