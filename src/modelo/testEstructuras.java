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
        int n=10000000;                      //numero de datos random a ingresar
        String[ ] users = new String[n];
        String[ ] pass = new String[n];
        for (int i=0;i<n;i++) {users[i]=generateRandomText();pass[i]=generateRandomText();} //guardar datos random en un arreglo de strings
        long TInicio, TFin,TInicio1, TFin1;
        TInicio = System.currentTimeMillis();        
        System.out.println("añade");        
        for (int i=0;i<n;i++) usuarios.enQueue(users[i], pass[i]);  //enqueue de los n datos random
        TFin = System.currentTimeMillis();
        System.out.println(TFin-TInicio);
        usuarios.enQueue("ccpabonu", "1234");
        usuarios.enQueue("cpu", "123");
        TInicio = System.currentTimeMillis();        
        System.out.println("busca");        
        System.out.println(usuarios.comparar("cpu", "jjj"));  //enqueue de los n datos random
        TFin = System.currentTimeMillis();
        System.out.println(TFin-TInicio);
        System.out.println(TFin-TInicio);
    }
    
}
