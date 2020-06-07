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
 */
public interface MinPriorityQueue <T extends Comparable<? super T >> {
    
   boolean isEmpty( );
   int size( );
   T getMin( );
   void put( T theObject );
   T removeMin( ); 
}
