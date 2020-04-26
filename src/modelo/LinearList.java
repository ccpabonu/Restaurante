/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Brayan Estupiñan
 * @param <T>
 */
public interface LinearList<T>
{
   boolean isEmpty( );
   int size( );
   T get( String index );
   int indexOf( T theElement );
   T remove( int index );
   void add( int index, T theElement );
   String toString( );
   void set(T element,int index);
}