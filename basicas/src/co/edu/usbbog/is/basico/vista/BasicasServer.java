/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.basico.vista;

import co.edu.usbbog.is.basico.controlador.Operador;
import co.edu.usbbog.is.basico.modelo.Operacion;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 204
 */
public class BasicasServer {

    private final static int PORT = 9990;

    public static void main(String[] args) {
        Object o = null;
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("BasicasServidor iniciando...");
            System.out.println("BasicasServidor esperando cliente...");
            Socket clienteSocket = null;
            FileWriter fw = null;
            ObjectOutputStream oos = null;
            ObjectInputStream ois = null;
            while (true) {
                clienteSocket = serverSocket.accept();
                System.out.println("Conexion aceptada");
                ois = new ObjectInputStream(clienteSocket.getInputStream());                
                o=(Object) ois.readObject();
                if (o==null)break;                
                Operador operador =new Operador();
                operador.operar((Operacion) o);
            }
            oos.close();
            ois.close();            
            clienteSocket.close();
        } catch (IOException e) {
            System.out.println("No se pudo conectar..");
            System.exit(-1);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BasicasServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
