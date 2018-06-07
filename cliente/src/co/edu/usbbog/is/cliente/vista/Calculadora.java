/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.cliente.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian
 * @author Jose
 */
public class Calculadora extends javax.swing.JPanel {

    /**
     * Variable que me hace la conexion con el frame principal
     */
    String memoria1;
    String signo;
    String memoria2;

    private Principal p;
    /**
     * @author sebastian barriga Creates new form Calculadora
     */

    private String numero1;
    private String numero2;
    private boolean operacionNueva;
    private String ecuacion;
    private String operador;

    public boolean isOperacionNueva() {
        return operacionNueva;
    }

    public void setOperacionNueva(boolean operacionNueva) {
        this.operacionNueva = operacionNueva;
    }

    public Calculadora(Principal p) {
        this.p = p;
        initComponents();
        operacionNueva = true;
        numero1 = "";
        numero2 = "";
        operador = "";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton19 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonPunto = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonLogout = new javax.swing.JButton();
        jButtonRaiz = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonPotencia = new javax.swing.JButton();
        jButtonReal = new javax.swing.JButton();
        jButtonDivision = new javax.swing.JButton();
        jButtonModular = new javax.swing.JButton();
        jButtonMultiplicacion = new javax.swing.JButton();
        jButtonResta = new javax.swing.JButton();
        jButtonSuma = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        txtpantalla = new javax.swing.JTextField();
        jButtonSuma1 = new javax.swing.JButton();

        jButton19.setText("+");

        jButton10.setBackground(new java.awt.Color(0, 102, 102));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("+/-");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtonPunto.setText(".");
        jButtonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPuntoActionPerformed(evt);
            }
        });

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonLogout.setText("Cerrar Sesión");
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        jButtonRaiz.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonRaiz.setText("y√a");
        jButtonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRaizActionPerformed(evt);
            }
        });

        jButtonIgual.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonIgual.setText("=");
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        jButtonPotencia.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonPotencia.setText("a^y");
        jButtonPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPotenciaActionPerformed(evt);
            }
        });

        jButtonReal.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonReal.setText("\\");
            jButtonReal.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonRealActionPerformed(evt);
                }
            });

            jButtonDivision.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            jButtonDivision.setText("÷");
            jButtonDivision.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonDivisionActionPerformed(evt);
                }
            });

            jButtonModular.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            jButtonModular.setText("%");
            jButtonModular.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonModularActionPerformed(evt);
                }
            });

            jButtonMultiplicacion.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            jButtonMultiplicacion.setText("X");
            jButtonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonMultiplicacionActionPerformed(evt);
                }
            });

            jButtonResta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            jButtonResta.setText("-");
            jButtonResta.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonRestaActionPerformed(evt);
                }
            });

            jButtonSuma.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            jButtonSuma.setText("+");
            jButtonSuma.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonSumaActionPerformed(evt);
                }
            });

            jButtonBorrar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            jButtonBorrar.setText("←\t");
            jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonBorrarActionPerformed(evt);
                }
            });

            jButtonLimpiar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            jButtonLimpiar.setText("CE");
            jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonLimpiarActionPerformed(evt);
                }
            });

            jLabelUsuario.setText("Usuario:");

            jLabelHora.setText("Hora");

            txtpantalla.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtpantallaActionPerformed(evt);
                }
            });

            jButtonSuma1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
            jButtonSuma1.setText("+/-");
            jButtonSuma1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonSuma1ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonReal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonPotencia, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButtonPunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton3))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton0)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonIgual))
                                        .addComponent(jButtonSuma1))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonMultiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jButtonSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addComponent(txtpantalla))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                .addComponent(jButtonModular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonDivision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonResta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonLogout)))
                    .addGap(8, 8, 8))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelUsuario)
                        .addComponent(jLabelHora))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtpantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton9)
                                .addComponent(jButton8)
                                .addComponent(jButton7)
                                .addComponent(jButtonPotencia))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton4)
                                .addComponent(jButton5)
                                .addComponent(jButton6)
                                .addComponent(jButtonReal))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3)
                                    .addComponent(jButton2)
                                    .addComponent(jButton1))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonMultiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(1, 1, 1)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonPunto)
                                .addComponent(jButton0)
                                .addComponent(jButtonIgual)
                                .addComponent(jButtonSuma)
                                .addComponent(jButtonResta))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonSalir)
                                .addComponent(jButtonLogout)
                                .addComponent(jButtonSuma1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(jButtonLimpiar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonBorrar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonRaiz)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonModular)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonDivision)))
                    .addContainerGap(49, Short.MAX_VALUE))
            );
        }// </editor-fold>//GEN-END:initComponents
    /**
     * Void jButton encargado el boton 9
     */
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        txtpantalla.setText(txtpantalla.getText() + "9");
        txtpantalla.setText("9");
    }//GEN-LAST:event_jButton9ActionPerformed
    /**
     * Void jButton encargado el boton 8
     */
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        txtpantalla.setText(txtpantalla.getText() + "8");
        txtpantalla.setText("8");
    }//GEN-LAST:event_jButton8ActionPerformed
    /**
     * Void jButton encargado el boton 7
     */
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        txtpantalla.setText(txtpantalla.getText() + "7");
        txtpantalla.setText("7");
    }//GEN-LAST:event_jButton7ActionPerformed
    /**
     * Void jButton encargado el boton Punto (.)
     */
    private void jButtonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPuntoActionPerformed
        String cadena;
        cadena = txtpantalla.getText();

        if (cadena.length() <= 0) {
            txtpantalla.setText("0.");

        } else {
            if (!existepunto(txtpantalla.getText())) {
                txtpantalla.setText(txtpantalla.getText() + ".");

            }
        }
    }//GEN-LAST:event_jButtonPuntoActionPerformed

    private void txtpantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpantallaActionPerformed
    /**
     * Void jButton encargado el boton 1
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtpantalla.setText(txtpantalla.getText() + "1");
      txtpantalla.setText("1");
  
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Void jButton encargado el boton 2
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtpantalla.setText(txtpantalla.getText() + "2");
        txtpantalla.setText("2");
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * Void jButton encargado el boton 3
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        txtpantalla.setText(txtpantalla.getText() + "3");
     txtpantalla.setText("3");
    }//GEN-LAST:event_jButton3ActionPerformed
    /**
     * Void jButton encargado el boton 4
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        txtpantalla.setText(txtpantalla.getText() + "4");
        txtpantalla.setText("4");
    }//GEN-LAST:event_jButton4ActionPerformed
    /**
     * Void jButton encargado el boton 5
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        txtpantalla.setText(txtpantalla.getText() + "5");
        txtpantalla.setText("5");
    }//GEN-LAST:event_jButton5ActionPerformed
    /**
     * Void jButton encargado el boton 6
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        txtpantalla.setText(txtpantalla.getText() + "6");
        txtpantalla.setText("6");
    }//GEN-LAST:event_jButton6ActionPerformed
    /**
     * Void jButton encargado el boton salir
     */
    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        System.out.println("Hasta Luego");
        JOptionPane.showMessageDialog(jButtonLogout, "Gracias, vuelva pronto xD");
        p.salir();
    }//GEN-LAST:event_jButtonSalirActionPerformed
    /**
     * Void jButton encargado el boton Cerrar sesión
     */
    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        // TODO add your handling code here:
        System.out.println("Cerrando sesión");
        p.irAInicioDeSesion();
    }//GEN-LAST:event_jButtonLogoutActionPerformed
    /**
     * Void jButton encargado el boton Limpiar tablero
     */
    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        numero1 = "";
        numero2 = "";
        operador = "";
        txtpantalla.setText("");
        operacionNueva = true;
    }//GEN-LAST:event_jButtonLimpiarActionPerformed
    /**
     * Void jButton encargado el boton Borrar
     */
    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        String cadena;
        cadena = txtpantalla.getText();

        if (cadena.length() > 0) {
            cadena = cadena.substring(0, cadena.length() - 1);
            txtpantalla.setText(cadena);
        }
    }//GEN-LAST:event_jButtonBorrarActionPerformed
    /**
     * Void jButton encargado el boton Potencia
     */
    private void jButtonPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPotenciaActionPerformed
        if (numero1.equals("")) {
            operador = "";
        } else {
            operador = "^";
            if (hayOperador()) {
                calcular();
            } else {
                crearEcuacion(2);
            }
        }
    }//GEN-LAST:event_jButtonPotenciaActionPerformed
    /**
     * Void jButton encargado el boton Division real
     */
    private void jButtonRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealActionPerformed
        if (!txtpantalla.getText().equals("")) {
            memoria1 = txtpantalla.getText();
            signo = "\\";
            txtpantalla.setText("\\");
        }
    }//GEN-LAST:event_jButtonRealActionPerformed
    /**
     * Void jButton encargado el boton Multiplicacion
     */
    private void jButtonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicacionActionPerformed
        if (!txtpantalla.getText().equals("")) {
            memoria1 = txtpantalla.getText();
            signo = "*";
            txtpantalla.setText("*");
        }
    }//GEN-LAST:event_jButtonMultiplicacionActionPerformed
    /**
     * Void jButton encargado el boton Suma
     */
    private void jButtonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumaActionPerformed
        if (!txtpantalla.getText().equals("")) {
            memoria1 = txtpantalla.getText();
            signo = "+";
            txtpantalla.setText("+");
      
        }
       
    }//GEN-LAST:event_jButtonSumaActionPerformed
    /**
     * Void jButton encargado el boton Resta
     */
    private void jButtonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestaActionPerformed
        if (!txtpantalla.getText().equals("")) {
            memoria1 = txtpantalla.getText();
            signo = "-";
            txtpantalla.setText("-");
        }
    }//GEN-LAST:event_jButtonRestaActionPerformed
    /**
     * Void jButton encargado el boton Division
     */
    private void jButtonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisionActionPerformed
        if (!txtpantalla.getText().equals("")) {
            memoria1 = txtpantalla.getText();
            signo = "÷";
            txtpantalla.setText("÷");
        }
    }//GEN-LAST:event_jButtonDivisionActionPerformed
    /**
     * Void jButton encargado el boton Division Modular
     */
    private void jButtonModularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModularActionPerformed

        if (!txtpantalla.getText().equals("")) {
            memoria1 = txtpantalla.getText();
            signo = "%";
            txtpantalla.setText("%");
        }
    }//GEN-LAST:event_jButtonModularActionPerformed
    /**
     * Void jButton encargado el boton Raiz n
     */
    private void jButtonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRaizActionPerformed

        if (!txtpantalla.getText().equals("")) {
            memoria1 = txtpantalla.getText();
            signo = "√";
            txtpantalla.setText("√");
        }
    }//GEN-LAST:event_jButtonRaizActionPerformed
    /**
     * Void jButton encargado el boton 0
     */
    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        txtpantalla.setText(txtpantalla.getText() + "0");
    }//GEN-LAST:event_jButton0ActionPerformed
    /**
     * Void jButton encargado el boton Igual (=)
     */
    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        String resultado;
        memoria2 = txtpantalla.getText();

        if (!memoria2.equals("")) {
            resultado = calculadora(memoria1, memoria2, signo);
            txtpantalla.setText(resultado);
        }
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        Double num;
        String cadena;
        cadena = txtpantalla.getText();
        if (cadena.length() > 0) {
            num = (-1) * Double.parseDouble(cadena);
            txtpantalla.setText(num.toString());
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButtonSuma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuma1ActionPerformed
        Double num;
        String cadena;
        cadena = txtpantalla.getText();
        if (cadena.length() > 0) {
            num = (-1) * Double.parseDouble(cadena);
            txtpantalla.setText(num.toString());
        }

    }//GEN-LAST:event_jButtonSuma1ActionPerformed
    public static String calculadora(String memoria1, String memoria2, String signo) {
        Double resultado = 0.0;
        String respuesta;

        if (signo.equals("-")) {
            resultado = Double.parseDouble(memoria1) - Double.parseDouble(memoria2);

        }
        if (signo.equals("+")) {
            resultado = Double.parseDouble(memoria1) + Double.parseDouble(memoria2);

        }
        if (signo.equals("*")) {
            resultado = Double.parseDouble(memoria1) * Double.parseDouble(memoria2);

        }
        if (signo.equals("÷")) {
            resultado = Double.parseDouble(memoria1) / Double.parseDouble(memoria2);

        }
        if (signo.equals("\\")) {
            resultado = Double.parseDouble(memoria1) / Double.parseDouble(memoria2);

        }
        if (signo.equals("%")) {
            resultado = Double.parseDouble(memoria1) / Double.parseDouble(memoria2);
        }
        if (signo.equals("√")) {
            resultado = Double.parseDouble(memoria1) / Double.parseDouble(memoria2);

        }

        respuesta = resultado.toString();
        return respuesta;
    }

    void operaciones() {
        /*double n1, n2;
        if (jTextField1.getText().equals("")) {
            if (contador == 0) {
                numero2 = numero1;
                jTextField1.setText(numero2);
            }
            if (numero2.equals("")) {
                numero2 = "0";
            }
            n1 = Double.valueOf(numero2);
            n2 = Double.valueOf(numero1);
            if (jTextField1.getText().equals("-")) {
                numero2 = String.valueOf(n1 - n2);
            }
            if (jTextField1.getText().equals("+")) {
                numero2 = String.valueOf(n1 + n2);
            }
            if (jTextField1.getText().equals("x")) {
                numero2 = String.valueOf(n1 * n2);
            }
            if (jTextField1.getText().equals("/")) {
                numero2 = String.valueOf(n1 / n2);
            }
            jTextField1.setText("");
            numero1 = "";
            contador++;
            jTextField1.setText(numero2);
        }*/

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonDivision;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonModular;
    private javax.swing.JButton jButtonMultiplicacion;
    private javax.swing.JButton jButtonPotencia;
    private javax.swing.JButton jButtonPunto;
    private javax.swing.JButton jButtonRaiz;
    private javax.swing.JButton jButtonReal;
    private javax.swing.JButton jButtonResta;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSuma;
    private javax.swing.JButton jButtonSuma1;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JTextField txtpantalla;
    // End of variables declaration//GEN-END:variables

    private void crearEcuacion(int tipo) {
        switch (tipo) {
            case 0:
                ecuacion = numero1;
                break;
            case 1:
                ecuacion += " " + numero2 + " ";
                break;
            case 2:
                ecuacion += " " + operador;
                operacionNueva = false;
                break;
        }
        txtpantalla.setText(ecuacion);
        System.out.println(ecuacion);
    }

    private boolean hayOperador() {
        if (operador.equals("-")) {
            if (ecuacion.indexOf("+") != -1) {
                numero2 = "-";
                return true;
            } else if (ecuacion.indexOf("-") != -1) {
                if (ecuacion.indexOf("-") == 0) {
                    return false;
                } else {
                    numero2 = "-";
                    return true;
                }

            } else if (ecuacion.indexOf("*") != -1) {
                numero2 = "-";
                return true;
            } else if (ecuacion.indexOf("d") != -1) {
                numero2 = "-";
                return true;
            } else if (ecuacion.indexOf("e") != -1) {
                numero2 = "-";
                return true;
            } else if (ecuacion.indexOf("m") != -1) {
                numero2 = "-";
                return true;
            } else if (ecuacion.indexOf("p") != -1) {
                numero2 = "-";
                return true;
            } else if (ecuacion.indexOf("r") != -1) {
                numero2 = "-";
                return true;
            } else {
                return false;
            }
        } else {
            if (ecuacion.indexOf("+") != -1) {
                return true;
            } else if (ecuacion.indexOf("-") != -1) {
                if (ecuacion.indexOf("-") == 0) {
                    return false;
                } else {
                    return true;
                }

            } else if (ecuacion.indexOf("*") != -1) {
                return true;
            } else if (ecuacion.indexOf("d") != -1) {
                return true;
            } else if (ecuacion.indexOf("e") != -1) {
                return true;
            } else if (ecuacion.indexOf("m") != -1) {
                return true;
            } else if (ecuacion.indexOf("p") != -1) {
                return true;
            } else if (ecuacion.indexOf("r") != -1) {
                return true;
            } else {
                return false;
            }
        }

    }

    private void calcular() {
        operacionNueva = false;
        numero1 = p.calcular(ecuacion);
        crearEcuacion(0);

        System.out.println("calculando...");

    }

    public static boolean existepunto(String cadena) {
        boolean resultado;
        resultado = false;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i + 1).equals(".")) {
                resultado = true;
                break;

            }

        }
        return resultado;

    }
}
