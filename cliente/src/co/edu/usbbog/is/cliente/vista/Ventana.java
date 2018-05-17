/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.cliente.vista;

import java.awt.Image;
import javax.swing.JDialog;
import javax.swing.JPanel;

/**
 *
 * @author sala3
 */
public class Ventana extends JDialog {

    private Principal principal;
    private JPanel jPanel;

    public Ventana(Principal principal, JPanel jPanel, String titulo, boolean modal, boolean marco,  int opcionDeCerrado) {
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
