/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



/**
 *
 * @author Asus
 * @param <T>
 * 
 */
public class DList <T> implements Dinamiclist <T>{
    T [] genericArray;
    public int size;
    public int capacity;

    public DList() {
        this.genericArray = (T[])  new  Object[2];
        this.size = 0;
        this.capacity = 2;
    }

    @Override
    public void add(T element) {
        if(this.size==this.capacity){
            resize();
        }
        this.genericArray[size]=element;
        size++;
     
    }
    public void resize(){
        this.capacity=this.capacity*2;
        T[] genericArrayCopy = (T[]) new Object[this.capacity];
        for(int i=0; i<this.genericArray.length;i++){
            genericArrayCopy[i]=this.genericArray[i];
        }
        this.genericArray=genericArrayCopy;
    }
    

    @Override
    public T remove(int index) {
        T object=genericArray[index];
        if(index<this.capacity && index>=0){
            genericArray[index]=null;
            this.size--;
        }
        for(int j=index;j<=size-1;j++){
            genericArray[j]=genericArray[j+1];
        }
        for(int j=size;j<capacity;j++){
         genericArray[j]=null;
        }
        return object;
    }

    @Override
    public int length() {
        return this.capacity;
    }

    @Override
    public void set(T element, int index) {
        if(index<this.capacity && index>=0){
            genericArray[index]=element;
        }
    }

    @Override
    public T get(int index) {
        if(index<this.capacity && index>=0){
            return genericArray[index];
        }       
        return null;
    }
    
    
   
}
