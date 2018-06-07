/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.paciente.vista;

import co.edu.usbbog.is.paciente.controlador.logica.Operar;
import javax.swing.JFrame;

/**
 *
 * @author Sebastian
 * @author Jose
 */
public class Principal extends JFrame {

    //relaciones
    //variable ventana
    private Ventana ventana;
    //variable Login
    private Login login;
    //variable p referente a la pantalla inicial del paciente
    private Pantalla_inicial_paciente p;
    //variable Registro
    private Registrar registro;
    //variable operar
    private Operar operar;
    //variable pa referente a la pantalla inicial del administrador
    private Pantalla_inicial_admin pa;
    //variable ul referente a la pantalla Usuarios_lista
    private Usuarios_lista ul;
    //variable s referente a la pantalla con los servicios
    private Servicios s;
    //variable f referente a la pantalla foro
    private Foro f;
    //variable pqr referente a la pantalla preguntas, quejas y reclamos
    private PQR pqr;
    //variable eps referente a la pantalla sobre las EPS
    private Eps eps;
    //variable pt referente a la pantalla puntos de atencion
    private Punto_atencion pt;
    //variable r referente a la pantalla reportes
    private Reportes r;
    //variable vp referente a la pantalla ver perfil
    private Ver_Perfil vp;
    //variable h referente a la pantalla historial
    private Historial h;
    //variable fp referente a la pantalla foro para el rol paciente
    private ForoPaciente fp;
    //variable pp referente a la pantalla puntos de atencion para el rol paciente
    private Punto_atencion_paciente pp;
    //variable ra referente a la pantalla rutas de atencion para el rol paciente
    private Rutas_Atencion ra;
    //Variable sa referente a la pantalla de servicio del rol paciente
    private ServiciosPaciente sa;

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
        operar = new Operar();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Odrivers");
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
    /**
     * Metodo para salir de la aplicación
     */
    protected void salir() {
        System.exit(0);
    }

    /**
     * Metodo para quitar el panel actual del marco
     */
    private void quitarPanelesDelMarco() {
        setVisible(false);
        //Quita el panel p
        if (p != null) {
            remove(p);
            p = null;
        }
        //Quita el panel registro
        if (registro != null) {
            remove(registro);
            registro = null;
        }
        //Quita el panel pa
        if (pa != null) {
            remove(pa);
            pa = null;
        }
        //Quita el panel ul
        if (ul != null) {
            remove(ul);
            ul = null;
        }
        //Quita el panel s
        if (s != null) {
            remove(s);
            s = null;
        }
        //Quita el panel pt
        if (pt != null) {
            remove(pt);
            pt = null;
        }
        //Quita el panel f
        if (f != null) {
            remove(f);
            f = null;
        }
        //Quita el panel eps
        if (eps != null) {
            remove(eps);
            eps = null;
        }
        //Quita el panel pqr
        if (pqr != null) {
            remove(pqr);
            pqr = null;
        }
        //Quita el panel r
        if (r != null) {
            remove(r);
            r = null;
        }
        //Quita el panel vp
        if (vp != null) {
            remove(vp);
            vp = null;
        }
        //Quita el panel h
        if (h != null) {
            remove(h);
            h = null;
        }
        //Quita el panel fp
        if (fp != null) {
            remove(fp);
            fp = null;
        }
        //Quita el panel pp
        if (pp != null) {
            remove(pp);
            pp = null;
        }
        //Quita el panel de rutas de atencion ra
        if (ra != null) {
            remove(ra);
            ra = null;
        }
        if (sa != null) {
            remove(sa);
            sa = null;
        }

        //hacer lo anterior parra cada panel que este en el marco
    }

    /**
     * Metodo para iniciar el marco
     */
    protected void iniciarMarco() {
        //inicia los componentes del frame
        this.quitarPanelesDelMarco();
        this.iniciarComponentesDePrincipal();
        this.setVisible(true);
    }

    /**
     * Metodo para cerrar la ventana
     */
    protected void cerrarVentana() {
        ventana.setVisible(false);
        ventana = null;
    }

    /**
     * Metodo para abrir la ventana
     */
    private void iniciarVentana() {
        if (ventana != null) {
            cerrarVentana();
        }
        setVisible(false);
    }

    //metodos de navegacion
    /**
     * Metodo para pasar al panel de la calculadora
     */
    protected void irAPantalla() {
        cerrarVentana();
        iniciarMarco();
        //agrega el panelinicial
        p = new Pantalla_inicial_paciente(this);
        p.setVisible(true);
        add(p);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    /**
     * Metodo para ir al panel de registrar
     */
    protected void irARegistrar() {
        cerrarVentana();
        iniciarMarco();
        //agrega el panelinicial
        registro = new Registrar(this);
        registro.setVisible(true);
        add(registro);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    /**
     * Metodo para ir al inicio de sesion
     */
    protected void irAInicioDeSesion() {
        operar.cerrarSesion();
        iniciarVentana();
        login = new Login(this);
        ventana = new Ventana(this, login, "Ventana", false, false, DO_NOTHING_ON_CLOSE);
    }

    /**
     * Metodo para ir a la pantalla principal del Rol administrador
     */
    protected void irAPantallaAdmin() {
        cerrarVentana();
        iniciarMarco();
        //agrega el panelinicial
        pa = new Pantalla_inicial_admin(this);
        pa.setVisible(true);
        add(pa);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    /**
     * Metodo para ir al panel con la informacion de los usuarios
     */
    protected void irAUsuarios() {
        iniciarMarco();
        ul = new Usuarios_lista(this);
        ul.setVisible(true);
        add(ul);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    /**
     * Metodo para ir al panel de servicios
     */
    protected void IrAServicios() {
        iniciarMarco();
        s = new Servicios(this);
        s.setVisible(true);
        add(s);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    /**
     * Metodo para ir al panel con la inforacion de puntos de atencion por parte
     * del Rol Administrador
     */
    protected void IrAPunto() {
        iniciarMarco();
        pt = new Punto_atencion(this);
        pt.setVisible(true);
        add(pt);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    /**
     * Metodo para ir al panel de edicion de las EPS
     */
    protected void IrAEps() {
        iniciarMarco();
        eps = new Eps(this);
        eps.setVisible(true);
        add(eps);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    /**
     * Metodo para ir al panel con los reportes
     */
    protected void IrAReportes() {
        iniciarMarco();
        r = new Reportes(this);
        r.setVisible(true);
        add(r);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    /**
     * Metodo que redirecciona el panel actual al panel del foro para el Rol
     * administrador
     */
    protected void IrAForo() {
        iniciarMarco();
        f = new Foro(this);
        f.setVisible(true);
        add(f);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    /**
     * Metodo para ir al apartado de PQR(Preguntas, Quejas y Reclamos)
     */
    protected void IrAPqr() {
        iniciarMarco();
        pqr = new PQR(this);
        pqr.setVisible(true);
        add(pqr);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    /**
     * Metodo para ir a la pantalla de estadísticas del administrador
     */
    protected void IrADashBoard() {
        iniciarMarco();
        pa = new Pantalla_inicial_admin(this);
        pa.setVisible(true);
        add(pa);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    /**
     * Metodo para ir a la pantalla de informacion del usuario actual
     */
    protected void IrAVerPerfil() {
        iniciarMarco();
        vp = new Ver_Perfil(this);
        vp.setVisible(true);
        add(vp);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    /**
     * Metodo para ir a la pantalla de historial
     */
    protected void IrAHistorial() {
        iniciarMarco();
        h = new Historial(this);
        h.setVisible(true);
        add(h);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    /**
     * Metodo para ir a la pantalla del foro para los usuarios con Rol paciente
     */
    protected void IrAForoPaciente() {
        iniciarMarco();
        fp = new ForoPaciente(this);
        fp.setVisible(true);
        add(fp);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    /**
     * Metodo para ir a la pantalla puntos de atencion
     */
    protected void IrAPuntoPaciente() {
        iniciarMarco();
        pp = new Punto_atencion_paciente(this);
        pp.setVisible(true);
        add(pp);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    /**
     * Metodo para ir a la pantalla de rutas de atencion
     */
    protected void IrARutasAtencion() {
        iniciarMarco();
        ra = new Rutas_Atencion(this);
        ra.setVisible(true);
        add(ra);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    /**
     * Metodo para ir a la pantalla de rutas de atencion
     */
    protected void IrAServicioPaciente() {
        iniciarMarco();
        sa = new ServiciosPaciente(this);
        sa.setVisible(true);
        add(sa);
        //se ajusta el frame
        pack();
        //centra la aplicacion 
        setLocationRelativeTo(null);
    }

    //metodos de logica
    /**
     * Metodo para validar el inicio de sesion de un usuario
     *
     * @param usuario valor del usuario
     * @param pass valor contraseña
     * @return un verdadero o falso segun la condicion
     */
    protected boolean validar(String usuario, String pass) {
        return operar.iniciarSesion(usuario, pass);
    }

    /**
     * Metodo para validar la informacion de un nuevo usuario
     * @param nombre nombre del nuevo usuario
     * @param apellido apellido del nuevo usuario
     * @param cedula numero de identificacion del nuevo usuario
     * @param email correo electronico del nuevo usuario
     * @param rol rol del nuevo usuario
     * @param telefono numero telefonico del nuevo usuario
     * @param direccion direccion de domicilio del nuevo usuario
     * @param eps eps con la que esta ligado el nuevo usuario
     * @param pass contraeña del nuevo usuario
     * @param confirPass confirmacion de la nueva contraseaña
     * @return si el uevo usuario se registro o no
     */
    protected boolean validarRegistro(String nombre, String apellido, String cedula, String email, String rol, String telefono, String direccion, String eps, String pass, String confirPass) {
        if (operar.Registrar(nombre,apellido,cedula,email,rol,telefono,direccion,eps,pass,confirPass)) {
            return true;
        } else {
            return false;
        }
    }
}
