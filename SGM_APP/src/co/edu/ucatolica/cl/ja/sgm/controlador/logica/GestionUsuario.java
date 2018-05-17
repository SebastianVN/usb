/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucatolica.cl.ja.sgm.controlador.logica;

import co.edu.ucatolica.cl.ja.sgm.controlador.persistencia.UsuarioJpaController;
import co.edu.ucatolica.cl.ja.sgm.controlador.persistencia.exceptions.NonexistentEntityException;
import co.edu.ucatolica.cl.ja.sgm.modelo.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sala3
 */
public class GestionUsuario {
    UsuarioJpaController ujc;
    Usuario usuario;

    public GestionUsuario() {
        this.ujc = new UsuarioJpaController();
        this.usuario=null;
        
    }
    

    public boolean existeUsuario(String usuario) {
        this.usuario= ujc.findUsuario(usuario);
        if (this.usuario!=null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarClaveUsuario(String usuario, String password) {
        this.usuario =ujc.findUsuario(usuario);
        if (this.usuario!=null) {
            if (this.usuario.getPassword().equals(password)) {
                return true;
            } else {
                return false;
            }    
        } else {
            return false;
        }
    }

    public String[] obtenerDatosUsuario() {
        String[] datosUsuario = new String[4];
        datosUsuario[0] = usuario.getNickname();
        datosUsuario[1] = usuario.getNombre();
        datosUsuario[2] = membresiaToString();
        datosUsuario[3] = usuario.getCorreoElectronico();
        return datosUsuario;
    }

    private String membresiaToString() {
        if(usuario.getTipoMembresia()){
            return "Premium";
        }else{
            return "Básica";
        }
    }

    public boolean modificarCambiosUsuario(String nombre, String correo){
        try {
            usuario.setNombre(nombre);
            usuario.setCorreoElectronico(correo);
            ujc.edit(usuario);
            return true;
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(GestionUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {
            Logger.getLogger(GestionUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
