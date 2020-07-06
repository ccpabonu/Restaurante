/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.FileNotFoundException;
import java.io.IOException;
import modelo.HashMap;
import modelo.IOdoc2;
import modelo.LinkedQueue;
import modelo.Usuario;
import vista.Login;

/**
 *
 * @author ccpabonu
 */
public class NewMain {

    /**
     * @param args  
     * @throws java.io.IOException
     * @throws java.io.FileNotFoundException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        Login log = new Login();
        HashMap <String,Usuario> us = new HashMap();
        
        //System.out.println(us.getFrontElement().getCuenta());
        //System.out.println(us.getFrontElement().getPass());         
        ControladorLogin ctr =new ControladorLogin(log,us);
        ctr.iniciar();
    }
    
}
