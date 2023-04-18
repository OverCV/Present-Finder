package vista;

import control.ControlRegalos;
import modelo.Regalo;
import servicio.Logs;

import javax.swing.*;
import java.util.List;

public class MenuUsuario {

    ControlRegalos controlador = new ControlRegalos();

    public MenuUsuario() {
    }

    public void inciar() {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: ", null));
        double costo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio máximo: ", null));
        List<Regalo> regalosRecomendados = controlador.buscarRegalos(edad, costo);

        if (regalosRecomendados == null) {
            System.out.println("Hubo un error en la ruta para la carga de archivos.");
            Logs.getInstance().getErrores().forEach(System.out::println);
        } else {
            System.out.println("\nResultado de la búsqueda:");
            for (Regalo regalo : regalosRecomendados) {
                System.out.println(regalo);
            }
            System.out.println("\nErrores de lectura:");
            Logs.getInstance().getErrores().forEach(System.out::println);
        }

    }
}
