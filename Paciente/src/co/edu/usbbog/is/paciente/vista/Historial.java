/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.paciente.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author jofa7
 */
public class Historial extends javax.swing.JPanel {
    /**
     * Variable que me trae la clase Principal
     */
    private Principal p;

    /**
     * Creates new form Usuarios_lista
     */
    public Historial(Principal p) {
        this.p = p;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonCerrarSesion = new javax.swing.JButton();
        jButtonHistorial = new javax.swing.JButton();
        jButtonForoPaciente = new javax.swing.JButton();
        jButtonRutasAtencion = new javax.swing.JButton();
        jButtonPuntoPaciente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonVerPerfil = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 208, 255));
        jLabel1.setText("Historial:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/usbbog/is/paciente/imagenes/profile.png"))); // NOI18N
        jLabel4.setText("  Sebastian");

        jButtonCerrarSesion.setBackground(new java.awt.Color(0, 208, 255));
        jButtonCerrarSesion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonCerrarSesion.setText("Cerrar sesión");
        jButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarSesionActionPerformed(evt);
            }
        });

        jButtonHistorial.setBackground(new java.awt.Color(0, 208, 255));
        jButtonHistorial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonHistorial.setText("Historial");
        jButtonHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHistorialActionPerformed(evt);
            }
        });

        jButtonForoPaciente.setBackground(new java.awt.Color(0, 208, 255));
        jButtonForoPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonForoPaciente.setText("Foro");
        jButtonForoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForoPacienteActionPerformed(evt);
            }
        });

        jButtonRutasAtencion.setBackground(new java.awt.Color(0, 208, 255));
        jButtonRutasAtencion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonRutasAtencion.setText("Rutas de atención");
        jButtonRutasAtencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRutasAtencionActionPerformed(evt);
            }
        });

        jButtonPuntoPaciente.setBackground(new java.awt.Color(0, 208, 255));
        jButtonPuntoPaciente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonPuntoPaciente.setText("Puntos de atención");
        jButtonPuntoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPuntoPacienteActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 208, 255));
        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setText("Solicitar servicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonVerPerfil.setBackground(new java.awt.Color(0, 208, 255));
        jButtonVerPerfil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonVerPerfil.setText("Ver Perfil");
        jButtonVerPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerPerfilActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "RH", "Alergias", "Cirugias", "C. Salud", "Servicio", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("C. Salud: Condición de Salud");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(283, 283, 283)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCerrarSesion))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonVerPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonHistorial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonForoPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRutasAtencion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonPuntoPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jButtonCerrarSesion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVerPerfil)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonHistorial)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonForoPaciente)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRutasAtencion)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPuntoPaciente))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Metodod para ir al inicio de sesion
     * @param evt Muestra evento conforme una accion
     */
    private void jButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarSesionActionPerformed
        JOptionPane.showMessageDialog(null, "Cerrando Sesión...");
        p.irAInicioDeSesion();
    }//GEN-LAST:event_jButtonCerrarSesionActionPerformed
    /**
     * Metodo para ir al historial medico
     * @param evt Muestra evento conforme una accion
     */
    private void jButtonHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHistorialActionPerformed
        // TODO add your handling code here:
        p.IrAHistorial();
    }//GEN-LAST:event_jButtonHistorialActionPerformed
    /**
     * Metodo para ir al foro de los pacientes
     * @param evt Muestra evento conforme una accion
     */
    private void jButtonForoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForoPacienteActionPerformed
        // TODO add your handling code here:
        p.IrAForoPaciente();
    }//GEN-LAST:event_jButtonForoPacienteActionPerformed
    /**
     * Metodo paara ir al punto de atencion
     * @param evt Muestra evento conforme una accion
     */
    private void jButtonPuntoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPuntoPacienteActionPerformed
        // TODO add your handling code here:
        p.IrAPuntoPaciente();
    }//GEN-LAST:event_jButtonPuntoPacienteActionPerformed
    /**
     * Metodo para ir al servicio que solicita el paciente
     * @param evt Muestra evento conforme una accion
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        p.IrAServicioPaciente();
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Metodo para ir a ver el perfil del usuario
     * @param evt Muestra evento conforme una accion
     */
    private void jButtonVerPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerPerfilActionPerformed
        // TODO add your handling code here:
        p.IrAVerPerfil();
    }//GEN-LAST:event_jButtonVerPerfilActionPerformed
    /**
     * Metodo para ir a las rutas de atencion
     * @param evt Muestra evento conforme una accion
     */
    private void jButtonRutasAtencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRutasAtencionActionPerformed
        // TODO add your handling code here:
        p.IrARutasAtencion();
    }//GEN-LAST:event_jButtonRutasAtencionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCerrarSesion;
    private javax.swing.JButton jButtonForoPaciente;
    private javax.swing.JButton jButtonHistorial;
    private javax.swing.JButton jButtonPuntoPaciente;
    private javax.swing.JButton jButtonRutasAtencion;
    private javax.swing.JButton jButtonVerPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
