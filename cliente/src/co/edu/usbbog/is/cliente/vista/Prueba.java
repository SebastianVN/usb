/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.cliente.vista;

import co.edu.usbbog.is.cliente.modelo.Operacion;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author 204
 */
public class Prueba {
    public final static int PUERTO_BASICAS = 9990;
    public final static String HOST_BASICAS = "127.0.0.1";
    public static void main(String[] args) {
        Operacion operacion = new Operacion(8.2, 3.0, '-');
        Socket clienteSocket = null;
        ObjectOutputStream oos = null;
        try {
            clienteSocket = new Socket(HOST_BASICAS, PUERTO_BASICAS);
            oos = new ObjectOutputStream(clienteSocket.getOutputStream());
            oos.writeObject(operacion);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            
        }
        
    }
}
