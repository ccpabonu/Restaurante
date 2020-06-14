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
    void enQueue(T user1);
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
    
    
    public void enQueue(T user1){
        ChainNode<T> p =new ChainNode<T>(user1,null);
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
    
    public boolean buscar(T user1){        
        if(isEmpty()) return false;        
        ChainNode q = new ChainNode();
        q=front;
        if(user1 instanceof Usuario){            
            while (q!=null){                        
            if(((Usuario) q.user).equal((Usuario) user1)) return true;
            q=q.next;
            }           
        }
        return false;            
    }
    
    
    @Override
    public String toString(){
        StringBuilder g = new StringBuilder();
        ChainNode q;
        q=front;
        while(q!=null){
            g.append(Objects.toString(q.user)+", "); 
            q=q.next;
        }
        g.setLength( g.length( ) - 2 );       
        return new String (g);
    }
    
    
    
}

