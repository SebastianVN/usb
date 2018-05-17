/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucatolica.cl.ja.sgm.vista;

import co.edu.ucatolica.cl.ja.sgm.controlador.logica.GestionMusica;
import co.edu.ucatolica.cl.ja.sgm.controlador.logica.GestionReproductor;
import co.edu.ucatolica.cl.ja.sgm.controlador.logica.GestionUsuario;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 *
 * @author sala3
 */
public class Principal extends JFrame {
    //relaciones
    private Ventana ventana;
    private Ventana ventanaContrasena;
    private InicioDeSesionPanel inicioDeSesionPanel;
    private PrincipalPanel principalPanel;
    private RegistroPanel registroPanel;
    private PanelPerfil panelPerfil;
    private PerfilContrasena perfilContrasena;

    private final GestionReproductor gestionReproductor;
    private final GestionUsuario gestionUsuario;
    private final GestionMusica gestionMusica;
    //componentes
    //menubar
    private JMenuBar jMenuBarMenuPrincipal;
    //menu archivo
    private JMenu jMenuArchivo;
    //menu items de archivo
    private JMenuItem jMenuItemPerfil;
    private JMenuItem jMenuItemCerrarSesion;
    private JMenuItem jMenuItemSalir;
    private JMenuItem jMenuItemHome;
    //menu Ayuda
    private JMenu jMenuAyuda;
    //menu items de Ayuda
    private JMenuItem jMenuItemVersion;
    private JMenuItem jMenuItemSoporte;

    /**
     * metodo main
     *
     * @param args argumentos del programa
     */
    public static void main(String[] args) {
        Principal principal = new Principal();
    }

    /**
     * Metodo Constructor
     */
    public Principal() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Sistema de Gestion de Musica");
        this.setIconImage(new ImageIcon("src/recursos/imagenes/iconos/sgm.png").getImage());
        this.setResizable(false);
        this.setVisible(false);
        //iniciar ralacion con la logica
        this.gestionMusica = new GestionMusica();
        this.gestionReproductor = new GestionReproductor();
        this.gestionUsuario = new GestionUsuario();
        //inicia caracteristicas del Frame
        this.irAInicioDeSesion();
    }

    /**
     * inicia los componentes del frame, en este caso el menu bar y sus botones
     * y sus eventos.
     */
    private void iniciarComponentesDePrincipal() {
        this.setJMenuBar(null);
        this.jMenuBarMenuPrincipal = new JMenuBar();
        this.jMenuArchivo = new JMenu();
        this.jMenuItemPerfil = new JMenuItem();
        this.jMenuItemCerrarSesion = new JMenuItem();
        this.jMenuItemSalir = new JMenuItem();
        this.jMenuItemHome = new JMenuItem();
        this.jMenuAyuda = new JMenu();
        this.jMenuItemVersion = new JMenuItem();
        this.jMenuItemSoporte = new JMenuItem();
        //this.jMenuArchivo.setText("Archivo");
        this.jMenuArchivo.setIcon(new ImageIcon("src/recursos/imagenes/iconos/archivo.png"));
        this.jMenuItemHome.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
        this.jMenuItemHome.setText("Home");
        this.jMenuItemHome.setIcon(new ImageIcon("src/recursos/imagenes/iconos/home.png"));
        this.jMenuItemHome.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHomeActionPerformed(evt);
            }
        });
        this.jMenuArchivo.add(jMenuItemHome); 
        this.jMenuItemPerfil.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
        this.jMenuItemPerfil.setText("Perfil");
        this.jMenuItemPerfil.setIcon(new ImageIcon("src/recursos/imagenes/iconos/perfil.png"));
        this.jMenuItemPerfil.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPerfilActionPerformed(evt);
            }
        });
        this.jMenuArchivo.add(jMenuItemPerfil);
        this.jMenuItemCerrarSesion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
        this.jMenuItemCerrarSesion.setText("Cerrar Sesion");
        this.jMenuItemCerrarSesion.setIcon(new ImageIcon("src/recursos/imagenes/iconos/cerrarSesion.png"));
        this.jMenuItemCerrarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCerrarSesionActionPerformed(evt);
            }
        });
        this.jMenuArchivo.add(jMenuItemCerrarSesion);
        this.jMenuItemSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
        this.jMenuItemSalir.setText("Salir");
        this.jMenuItemSalir.setIcon(new ImageIcon("src/recursos/imagenes/iconos/salir.png"));
        this.jMenuItemSalir.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        this.jMenuArchivo.add(jMenuItemSalir);       
        this.jMenuBarMenuPrincipal.add(jMenuArchivo);
        //this.jMenuAyuda.setText("Ayuda");
        this.jMenuAyuda.setIcon(new ImageIcon("src/recursos/imagenes/iconos/ayuda.png"));
        this.jMenuItemVersion.setText("Version");
        this.jMenuItemVersion.setIcon(new ImageIcon("src/recursos/imagenes/iconos/version.png"));
        this.jMenuItemVersion.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVersionActionPerformed(evt);
            }
        });
        this.jMenuAyuda.add(jMenuItemVersion);
        this.jMenuItemSoporte.setText("Soporte");
        this.jMenuItemSoporte.setIcon(new ImageIcon("src/recursos/imagenes/iconos/soporte.png"));
        this.jMenuItemSoporte.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSoporteActionPerformed(evt);
            }
        });
        this.jMenuAyuda.add(jMenuItemSoporte);
        this.jMenuBarMenuPrincipal.add(jMenuAyuda);
        this.setJMenuBar(jMenuBarMenuPrincipal);
    }

    //metodos de eventos del menu bar    
    private void jMenuItemHomeActionPerformed(ActionEvent evt) {
        irAPrincipal();
    }
    
    private void jMenuItemPerfilActionPerformed(ActionEvent evt) {
        irAPerfil();
    }
    
    private void jMenuItemSalirActionPerformed(ActionEvent evt) {
        salir();
    }

    private void jMenuItemCerrarSesionActionPerformed(ActionEvent evt) {
        irAInicioDeSesion();
    }

    private void jMenuItemVersionActionPerformed(ActionEvent evt) {
        mostrarVersion();
    }

    private void jMenuItemSoporteActionPerformed(ActionEvent evt) {
        mostrarSoporte();
    }

    //metodos de navegacion
    protected void salir() {
        System.exit(0);
    }
    
    private void quitarPanelesDelMarco() {
        setVisible(false);
        if (principalPanel!=null) {
            remove(principalPanel);
            principalPanel=null;
        }
        if (panelPerfil!=null) {
            remove(panelPerfil);
            panelPerfil=null;
        }
        //hacer lo anterior parra cada panel que este en el marco
    }

    private void iniciarMarco(){
        //inicia los componentes del frame
        this.quitarPanelesDelMarco();
        this.iniciarComponentesDePrincipal();
        this.setVisible(true);
    }
    
    protected void cerrarVentana() {
        ventana.dispose();
        ventana = null;
        irAPrincipal();
    }
    
    protected void cerrarVentanaContrasenia() {
        ventanaContrasena.dispose();
        ventanaContrasena = null;
    }
        
    private void iniciarVentana() {
        if (ventana!=null) {
            cerrarVentana();
        } 
        setVisible(false);
    }

    private void mostrarVersion() {
        JOptionPane.showMessageDialog(this, "Version: 1.0@beta", "Ayuda", JOptionPane.INFORMATION_MESSAGE);
    }

    private void mostrarSoporte() {
        JOptionPane.showMessageDialog(this, "Soporte: aasanchez@ucatolica.edu.co", "Ayuda", JOptionPane.INFORMATION_MESSAGE);
    }

    protected void irAPrincipal() {
        iniciarMarco();
        //agrega el panelinicial
        principalPanel = new PrincipalPanel(this);
        principalPanel.setVisible(true);
        add(principalPanel);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }
        
    protected void irAInicioDeSesion() {
        iniciarVentana();
        inicioDeSesionPanel = new InicioDeSesionPanel(this);
        Image imagen = new ImageIcon("src/recursos/imagenes/iconos/inicioDeSesion.png").getImage();
        ventana = new Ventana(this, inicioDeSesionPanel, "Ventana", false, false, imagen, DO_NOTHING_ON_CLOSE);
    }
    
    protected void irARegistro() {
        iniciarVentana();
        registroPanel=new RegistroPanel(this);
        Image imagen = new ImageIcon("src/recursos/imagenes/iconos/registro.png").getImage();
        ventana=new Ventana(this, registroPanel, "Registro", false , false, imagen, DO_NOTHING_ON_CLOSE);
    }
    
    protected void irAPerfil() {
        iniciarMarco();
        //agrega el panelinicial
        panelPerfil = new PanelPerfil(this);
        panelPerfil.setVisible(true);
        add(panelPerfil);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }
    
    protected void irACambioContrasenia() {
        //iniciarVentana();
        //ventana.setVisible(true);
        perfilContrasena=new PerfilContrasena(this);
        Image imagen = new ImageIcon("src/recursos/imagenes/iconos/registro.png").getImage();
        ventanaContrasena =new Ventana(this, perfilContrasena, "Registro", false , false, imagen, DO_NOTHING_ON_CLOSE);
    }
    
    protected void irAMusica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    protected void irAAlbum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    protected void irAReproductor(int idLista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //metodos de paso de mensajes.
    protected boolean existeUsuario(String usuario) {
        return gestionUsuario.existeUsuario(usuario);
    }
    
    protected boolean verificarClaveUsuario(String usuario, String password) {
        return gestionUsuario.verificarClaveUsuario( usuario, password);
    }

    protected String[] obtenerDatosUsuario() {
        return gestionUsuario.obtenerDatosUsuario();
    }

    protected boolean modificarCambiosUsuario(String nombre, String correo) {
        return gestionUsuario.modificarCambiosUsuario(nombre,correo);
    }

    

}
