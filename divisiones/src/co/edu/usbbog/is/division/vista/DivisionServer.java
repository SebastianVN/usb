/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.division.vista;

import co.edu.usbbog.is.calculadora.Operacion;
import co.edu.usbbog.is.division.controlador.Operador;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sebastian
 */
public class DivisionServer {
    private final static int PORT = 9990;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("DivisionServidor iniciando...");
            System.out.println("DivisionServidor esperando cliente...");
            Socket clienteSocket = null;
            FileWriter fw = null;
            ObjectOutputStream oos = null;
            ObjectInputStream ois = null;
            while (true) {
                clienteSocket = serverSocket.accept();
                System.out.println("Conexion aceptada");
                ois = new ObjectInputStream(clienteSocket.getInputStream());

                Operacion operacion = (Operacion) ois.readObject();
                System.out.println(operacion.getOpe());
                Operador op = new Operador();
                System.out.println(op.operar(operacion));
                if (operacion == null) {
                    System.out.println("Objeto NULL");
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("No se pudo conectar..");
            System.exit(0);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DivisionServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
