/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.paciente.vista;

import java.awt.Image;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author Sebastian
 * @author Jose
 */
public class Ventana extends JDialog {

    /**
     * Variable que trae la clase Principal
     */
    private Principal principal;
    /**
     * Variable que tare la clase Jpanel para utilizar paneles en la apliacion
     */
    private JPanel jPanel;

    /**
     * Metodo constructor de la ventana que me almacenara solo el inicio de
     * sesion
     *
     * @param principal escoge el frame a utilizar 
     * @param jPanel escoge el panel a utilizar
     * @param titulo nombre de la aplicacion
     * @param modal si aparece la ventana emergente con el contenido
     * @param marco si aparece los bordes del modal
     * @param opcionDeCerrado numero que define si se cierra o no
     */
    public Ventana(Principal principal, JPanel jPanel, String titulo, boolean modal, boolean marco, int opcionDeCerrado) {
        super(principal, titulo, modal);
        this.setDefaultCloseOperation(opcionDeCerrado);
        this.setUndecorated(marco);
        this.principal = principal;
        this.jPanel = jPanel;
        this.jPanel.setVisible(true);
        this.add(this.jPanel);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(this.principal);
    }

}
