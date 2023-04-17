package vista;

import control.ControlRegalos;
import modelo.Regalo;

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

        for (Regalo regalo : regalosRecomendados) {
            System.out.println(regalo);
        }
    }
}
