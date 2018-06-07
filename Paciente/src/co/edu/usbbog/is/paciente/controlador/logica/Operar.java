/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.paciente.controlador.logica;

import co.edu.usbbog.is.paciente.controlador.jpa.UsuarioJpaController;
import co.edu.usbbog.is.paciente.modelo.Usuario;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 * Clase de logica e interaccion con la base de datos
 *
 * @author Sebastian
 */
public class Operar {

    /**
     * Metodo principal que envia un objeto al servidor que es una operacion
     *
     * @param args
     */
    /**
     * Variable que guarda la sesion activa de un usuario
     */
    private Usuario currentUser;

    /**
     * Metodod para realizar la autenticacion al iniciar sesion con la base de
     * datos
     *
     * @param user nombre del usuario
     * @param pass contraseña del usuario
     * @return si el usuario existe en la base de datos
     */
    public boolean iniciarSesion(String user, String pass) {
        UsuarioJpaController ujc = new UsuarioJpaController(Persistence.createEntityManagerFactory("PacientePU"));
        Usuario u = ujc.findUsuarioByLogin(user);
        if (u != null) {
            if (u.getNombres().equals(user) && u.getContraseña().equals(pass)) {
                currentUser = u;
                return true;
            } else {
                currentUser = null;
                return false;
            }
        } else {
            currentUser = null;
            return false;
        }
    }
    /**
     * Metodod que cierra la sesion del usuario actual
     */
    public void cerrarSesion() {
        currentUser = null;
    }
    /**
     * Metodo para registrar un Usuario en la base de datos
     * @param nombre nombre del nuevo usuario
     * @param apellido apellido del nuevo usuario
     * @param cedula numero de identificacion del usuario
     * @param email correo electronico del nuevo usuario
     * @param rol rol del usuario en la plataforma
     * @param telefono numero telefonico del nuevo usuario
     * @param direccion direccion del nuevo usuario
     * @param eps eps con la que el nuevo usuario esta ligado
     * @param pass contraseña del nuevo usuario
     * @param confirPass confirmacion de su contraseña
     * @return confirma si se creo el nuevo usuario o no se creo
     */
    public boolean Registrar(String nombre, String apellido, String cedula, String email, String rol, String telefono, String direccion, String eps, String pass, String confirPass) {

        UsuarioJpaController ujc = new UsuarioJpaController(Persistence.createEntityManagerFactory("PacientePU"));
        Usuario u = new Usuario();
        try {
            u.setNombres(nombre);
            u.setApellidos(apellido);
            u.setContraseña(pass);
            u.setCedula(Integer.parseInt(cedula));
            u.setEmail(email);
            u.setRole(rol);
            u.setTelefono(Integer.parseInt(telefono));
            u.setDireccion(direccion);
            ujc.create(u);
            JOptionPane.showMessageDialog(null, "Se Guardaron Los datos");
            return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "error");
            return false;
        }
    }
}
