/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.*;

class ChainNode<T> {
    T user;
    T pass;
    ChainNode next;
    
    public ChainNode(){
        this(null,null,null);
    }
    public ChainNode (T user1,T pass1){
        this(user1,pass1,null);
    }
    
    public ChainNode (T user1,T pass1, ChainNode next){
        this.user = user1 ;
        this.pass = pass1;
        this.next = next;
    }
}