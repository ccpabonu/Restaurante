/*
Queue con un stack Linkedlist implementado
 */
package modelo;

import java.util.*;
import modelo.ChainNode.*;



interface Queue<T>{
    boolean isEmpty();
    T getFrontElement();
    T getRearElement();
    void enQueue(T user1,T pass);
    T deQueue();
    String toString();
}
public class LinkedQueue<T> implements Queue<T>{
    protected ChainNode<T> front;
    protected ChainNode<T> rear;
    
    public LinkedQueue(){
        front =rear=null;
    }
    @Override
    public boolean isEmpty(){
        return front == null;
    }    

    @Override
    public T getFrontElement() {
        return isEmpty() ? null : front.user;                  
    }

    @Override
    public T getRearElement() {
        return isEmpty() ? null : rear.user; 
    }
    
    @Override
    public void enQueue(T user1, T pass1){
        ChainNode<T> p =new ChainNode<T>(user1,pass1,null);
        if(front==null) front =p;
        else rear.next=p;
        rear=p;
    }

    @Override
    public T deQueue() {
        if (isEmpty()) return null;
        T save = front.user;
        front=front.next;
        if(isEmpty())rear=null;
        return save;        
    }
    
    public boolean comparar (String user, String pass){
        if(isEmpty()) return false;
        ChainNode q = new ChainNode();
        q=front;
        while (q!=null){
            if((q.user.equals(user)) && (q.pass.equals(pass))) return true;
            q=q.next;
        }
        return false;      
    }
    public void cambiarcontraseña ( T user1, T pass1){        
        if (front.user.equals(user1))front.pass=pass1 ;
        else  cambiarcontraseña(front.next, user1,pass1);                       
    }
    public void cambiarcontraseña ( ChainNode s,T user1, T pass1){
        if(s!=null){
            if (s.user.equals(user1))s.pass=pass1 ;
            else  cambiarcontraseña(s.next, user1,pass1);
        }                     
    }
    
    @Override
    public String toString(){
        StringBuilder g = new StringBuilder();
        ChainNode q;
        q=front;
        while(q!=null){
            g.append(Objects.toString(q.user)+"--"+Objects.toString(q.pass)+", "); 
            q=q.next;
        }
        g.setLength( g.length( ) - 2 );       
        return new String (g);
    }
    
    
    
}

