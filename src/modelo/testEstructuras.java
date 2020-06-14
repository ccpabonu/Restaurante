/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
    public static void main(String[] args) {
        LinkedQueue <Usuario> us = new LinkedQueue();
        Usuario r=new Usuario("cpu","123");
        Usuario t=new Usuario("lol","123");
        Usuario s=new Usuario("cpu","123");        
        us.enQueue(r);
        us.enQueue(t);
        
        System.out.print(us.buscar(s));
        
        
        
        
    }
    
}
