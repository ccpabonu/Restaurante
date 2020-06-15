/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.LinkedQueue;
import modelo.Usuario;
import vista.Login;

/**
 *
 * @author ccpabonu
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login log = new Login();
        LinkedQueue <Usuario> us = new LinkedQueue();
        Usuario r=new Usuario("cpu","123");
        Usuario t=new Usuario("lol","123");
        us.enQueue(r);
        us.enQueue(t);
        ControladorLogin ctr =new ControladorLogin(log,us);
        log.setVisible(true);
    }
    
}
