/*
Queue con un stack Linkedlist implementado
 */
package modelo;

import java.util.*;
import modelo.ChainNode.*;


interface Queue{
    boolean isEmpty();
    String getFrontElement();
    String getRearElement();
    void enQueue(String user1,String pass);
    String deQueue();
}
public class LinkedQueue implements Queue{
    protected ChainNode front;
    protected ChainNode rear;
    
    public LinkedQueue(){
        front =rear=null;
    }
    public boolean isEmpty(){
        return front == null;
    }    

    @Override
    public String getFrontElement() {
        return isEmpty() ? null : front.user;                  
    }

    @Override
    public String getRearElement() {
        return isEmpty() ? null : rear.user; 
    }
    
    @Override
    public void enQueue(String user, String pass){
        ChainNode p =new ChainNode(user,pass,null);
        if(front==null) front =p;
        else rear.next=p;
        rear=p;
    }

    @Override
    public String deQueue() {
        if (isEmpty()) return null;
        String save = front.user;
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
    
    
    
    
    
}

