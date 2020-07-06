 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author Asus
 * @param <T>
 */
public class MinHeap <T extends  Comparable<? super T>> implements MinPriorityQueue<T>{
  
    T[] heap;
    
    int size;

    public T getNode(int index) {
        return (T) heap[index];
    }
    public MinHeap (int initCap){
        if(initCap<1){
            throw new IllegalArgumentException ("initCap must be >=1");
        }else{
            heap=(T[]) new Comparable [initCap+1];
            size=0;
        }
    }
    
    public MinHeap(){
        this(10);
    }
    
    
    @Override
    public boolean isEmpty() {
        return (size==0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T getMin() {
        return ( size == 0 ) ? null : heap[ 1 ];
    }

    @Override
    public void put(T theObject) {
        if (size==heap.length-1){
            T[] old= heap;
            heap = (T[]) new Comparable[2*heap.length];
            for(int i=1;i< old.length;i++){
                heap[i]=old[i];
            }
        }
        
        int currentNode= ++size;
        while(currentNode !=1 && heap[currentNode/2].compareTo(theObject) >0){
            heap[currentNode]=heap[currentNode/2];
            currentNode /= 2;
    }
        heap[currentNode]=theObject;
    }
    

    @Override
    public T removeMin() {
        if(size == 0) return null;
        
        T minElement= heap[1];
        
        T lastElement = heap[ size-- ];
         
        int currentNode=1;
        int child=2;
        while(child <= size){
        
                if (child< size && heap[child].compareTo(heap[child+1])>0) child++;
                
                if (lastElement.compareTo(heap[child])<=0) 
                    break;
                
                heap[currentNode]= heap[child];
                currentNode=child;
                child *= 2;
        }
        heap[currentNode]=lastElement;
        
        return minElement;
    }
    
    
    public void undo(T theObject, int index){
        if(index<size-1){
        int child=index*2;
        if(child < size && heap[child].compareTo(theObject)<0){
            heap[index]=heap[child];
        }else{
            child++;
            if(child < size && heap[child].compareTo(theObject)<0)heap[index]=heap[child];
        }
        heap[child]=theObject;
        undo(theObject,child); 
        }
}
    public void set(T theObject, int index){
        
        int currentNode=index;
        if(currentNode !=1 && heap[currentNode/2].compareTo(theObject)>0){
            while(currentNode !=1 && heap[currentNode/2].compareTo(theObject)>0){
                heap[currentNode]=heap[currentNode/2];
                currentNode /=2;
            }
            heap[currentNode]=theObject;
        }else if((currentNode*2) < size && heap[currentNode*2].compareTo(theObject)>0 && heap[(currentNode*2)+1].compareTo(theObject)>0
                 ||(currentNode*2)==size && heap[currentNode*2].compareTo(theObject)>0 ){
            heap[index]=theObject;
        }else{
           undo(theObject,index);
        }
    }
        
    public void remove(int index){
        
        T lastElement = heap[ size-- ];
         
        int currentNode=index;
        int child=index*2;
        while(child <= size){
        
                if (child< size && heap[child].compareTo(heap[child+1])>0) child++;
                
                if (lastElement.compareTo(heap[child])<=0) 
                    break;
                
                heap[currentNode]= heap[child];
                currentNode=child;
                child *= 2;
        }
        heap[currentNode]=lastElement;
}

    @Override
      public String toString( )
   {
      StringBuilder s = new StringBuilder( );
      s.append( "The " + size + " elements are [ " );
      if( size > 0 )
      {  // nonempty heap
         // do first element
         s.append( Objects.toString( heap[ 1 ] ) );
         // do remaining elements
         for( int i = 2; i <= size; i++ )
            s.append( ", " + Objects.toString( heap[ i ] ) );
      }
      s.append( " ]" );

      return new String( s );
   }
}
