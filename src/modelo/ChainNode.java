/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.io.Serializable;
import java.util.*;

public class ChainNode<T> implements Serializable{
    T user;   
    ChainNode next;
    
    public ChainNode(){
        this(null,null);
    }
    public ChainNode (T user1){
        this(user1,null);
    }
    
    public ChainNode (T user1, ChainNode next){
        this.user = user1 ;        
        this.next = next;
    }

    public T getUser() {
        return user;
    }

    public void setUser(T user) {
        this.user = user;
    }

    public ChainNode getNext() {
        return next;
    }

    public void setNext(ChainNode next) {
        this.next = next;
    }
}