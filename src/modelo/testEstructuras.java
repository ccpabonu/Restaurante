/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static vista.Login.generateRandomText;

/**
 *
 * @author windows 10
 */
public class testEstructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedQueue usuarios = new LinkedQueue();
        long TInicio, TFin,TInicio1, TFin1;
        TInicio = System.currentTimeMillis();
        int n=10000000;                      //numero de datos random a ingresar
        System.out.println("añade");
        usuarios.enQueue("ccpabonu", "1234");
        for (int i=0;i<n;i++) usuarios.enQueue(generateRandomText(), generateRandomText());  //enqueue de los n datos random
        TFin = System.currentTimeMillis();
        System.out.println(TFin-TInicio);
        usuarios.enQueue("demolinar", "1234");
        System.out.println("compara");
        TInicio1 = System.currentTimeMillis();
        System.out.println(usuarios.comparar("demolinar", "1234"));
        TFin1 = System.currentTimeMillis();
        System.out.println(TFin1-TInicio1);
        System.out.println(usuarios.toString());
        
    }
    
}
