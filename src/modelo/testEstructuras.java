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
        LinkedQueue usuarios = new LinkedQueue();
        long TInicio, TFin,TInicio1, TFin1;
        TInicio = System.currentTimeMillis();
        int n=10000000;                      //numero de datos random a ingresar
        System.out.println("añade");        
        for (int i=0;i<n;i++) usuarios.enQueue(generateRandomText(), generateRandomText());  //enqueue de los n datos random
        TFin = System.currentTimeMillis();
        System.out.println(TFin-TInicio);
        
        
    }
    
}
