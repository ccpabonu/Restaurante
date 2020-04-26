/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.*;

class ChainNode {
    String user;
    String pass;
    ChainNode next;
    
    public ChainNode(){
        this(null,null,null);
    }
    public ChainNode (String user1,String pass1){
        this(user1,pass1,null);
    }
    
    public ChainNode (String user1,String pass1, ChainNode next){
        this.user = user1 ;
        this.pass = pass1;
        this.next = next;
    }
}