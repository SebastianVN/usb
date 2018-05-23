/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.cliente.vista;

import javax.swing.JFrame;

/**
 *
 * @author Sebastian
 */
public class Principal extends JFrame {
    //relaciones
    private Ventana ventana;
    private Login login;
    private Calculadora calculadora;
    private Registro registro;
    

    //componentes

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
        this.setTitle("Calculadora");
        this.setResizable(false);
        this.setVisible(false);
        //inicia caracteristicas del Frame
        this.irAInicioDeSesion();
    }

    /**
     * inicia los componentes del frame, en este caso el menu bar y sus botones
     * y sus eventos.
     */
    private void iniciarComponentesDePrincipal() {
        
    }

    //metodos de eventos del menu bar    

    //metodos de navegacion
    protected void salir() {
        System.exit(0);
    }
    
    private void quitarPanelesDelMarco() {
        setVisible(false);
        if (calculadora!=null) {
            remove(calculadora);
            calculadora=null;
        }
        if (registro!=null) {
            remove(registro);
            registro=null;
        }
        //hacer lo anterior parra cada panel que este en el marco
    }

    protected  void iniciarMarco(){
        //inicia los componentes del frame
        this.quitarPanelesDelMarco();
        this.iniciarComponentesDePrincipal();
        this.setVisible(true);
    }
    
    protected void cerrarVentana() {
        ventana.setVisible(false);
        ventana = null;
    }
        
    private void iniciarVentana() {
        if (ventana!=null) {
            cerrarVentana();
        } 
        setVisible(false);
    }
    //metodos de navegacion
    protected void irACalculadora() {
        cerrarVentana();
        iniciarMarco();
        //agrega el panelinicial
        calculadora = new Calculadora(this);
        calculadora.setVisible(true);
        add(calculadora);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }
    
    protected  void irARegistrar() {
        cerrarVentana();
        iniciarMarco();
        //agrega el panelinicial
        registro = new Registro(this);
        registro.setVisible(true);
        add(registro);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }
        
    protected void irAInicioDeSesion() {
        iniciarVentana();
        login = new Login(this);
        ventana = new Ventana(this, login, "Ventana", false, false, DO_NOTHING_ON_CLOSE);
    }
    //metodos de logica
    protected  boolean validar(String usuario, String pass) {
        return true;
    }
    protected boolean validarRegistro(String nombre, String usuario, String pass, String confirPass){
        return true;
    }

    protected void irAlogin() {
        iniciarVentana();
    }

}
