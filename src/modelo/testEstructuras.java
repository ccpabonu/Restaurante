/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;


/**
 *
 * @author windows 10
 */
public class testEstructuras {

    public static String generateRandomText() {
        SecureRandom random = new SecureRandom();
        String text = new BigInteger(50, random).toString(32);
        return text;  
    }
    
    public static int generateRandomInt() {
        int num;
        num = (int) (Math.random() * 100000) + 1;
        return num;  
    }
    
    public static double generateRandomDouble() {
        double num;
        num = (Math.random() * 100000) + 1;
        return num;  
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        LinkedQueue <Usuario> us = new LinkedQueue();
        IOdoc2 doc = new IOdoc2();
        Usuario r=new Usuario("cpu","123");
        Usuario t=new Usuario("lol","123");
        Usuario s=new Usuario("cpu","123");        
        us.enQueue(r);
        us.enQueue(t);
        //us.enQueue(s);
        /*doc.GuardarInventario(us);       
        Usuario s=new Usuario("ccpabonu","1234");
        us.enQueue(s);
        doc.GuardarInventario(us);   */     
        us=IOdoc2.CargarUsuarios();
        System.out.println(us.getRearElement().getCuenta());
        System.out.println(us.getRearElement().getPass());
        System.out.println(us.buscar(s));        
             
        
        
    }
    
}
