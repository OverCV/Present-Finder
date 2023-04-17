package servicio;

import modelo.Regalo;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroRegalos {

    public FiltroRegalos() {}

    public List<Regalo> filtroPorEdad(List<Regalo> regalos, int edad) {
        return regalos.stream().filter(regalo -> regalo.getEdad() == edad)
                .collect(Collectors.toList());
    }
    public List<Regalo> filtroPorCosto(List<Regalo> regalos, double costo) {
        return regalos.stream().filter(regalo -> regalo.getPrecioBase() < costo)
                .collect(Collectors.toList());
    }
}
