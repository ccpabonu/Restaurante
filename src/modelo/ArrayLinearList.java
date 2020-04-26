/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Brayan Estupiñan
 */
import java.util.*;

public class ArrayLinearList<T> implements LinearList<T>, Iterable<T>
{
   // fields
   protected T[] element;  // array of elements
   protected int size;   // number of elements in array
   // constructors
   /** create a list with initial capacity initialCapacity
    * @throws IllegalArgumentException when
    * initialCapacity < 1 */
   @SuppressWarnings( "unchecked" )
   public ArrayLinearList(int initialCapacity)
   {
      if( initialCapacity < 1 )
         throw new IllegalArgumentException
            ( "initialCapacity must be >= 1" );
      element = ( T[] ) new Object[ initialCapacity ];
      size = 0;
   }

   /** create a list with initial capacity 10 */
   public ArrayLinearList( )
   {
      this( 10 );
   }

   // methods
   /** @return true iff list is empty */
   public boolean isEmpty( )
   {
      return size == 0;
   }

   /** @return current number of elements in list */
   public int size( )
   {
      return size;
   }
   
   
   /** @throws IndexOutOfBoundsException when
    * index is not between 0 and size - 1 */
   void checkIndex( int index )
   {
      if( index < 0 || index >= size )
         throw new IndexOutOfBoundsException
            ( "index = " + index + "  size = " + size );
   }

   /** @return element with specified index
    * @throws IndexOutOfBoundsException when
    * index is not between 0 and size - 1 */
   public T get( int index )
   {
      checkIndex( index );
      return element[ index ];
   }

   /** @return index of first occurrence of theElement,
    * return -1 if theElement not in list */
   public int indexOf( T theElement )
   {
      // search element[ ] for theElement
      for( int i = 0; i < size; i++ )
         if( element[ i ].equals( theElement ) )
            return i;
      // theElement not found
      return -1;
   }

   /** Remove the element with specified index.
    * All elements with higher index have their
    * index reduced by 1.
    * @throws IndexOutOfBoundsException when
    * index is not between 0 and size - 1
    * @return removed element */
   public T remove( int index )
   {
      checkIndex( index );

      // valid index, shift elements with higher index
      T removedElement = element[ index ];
      for( int i = index + 1; i < size; i++ )
         element[ i - 1 ] = element[ i ];

      element[ --size ] = null;   // enable garbage collection
      return removedElement;
   }

   /** Insert an element with specified index.
    * All elements with equal or higher index
    * have their index increased by 1.
    * @throws IndexOutOfBoundsException when
    * index is not between 0 and size */
   @SuppressWarnings( "unchecked" )
   public void add( int index, T theElement )
   {
      if( index < 0 || index > size )
         // invalid list position
         throw new IndexOutOfBoundsException
            ( "index = " + index + "  size = " + size );

      // valid index, make sure we have space
      if( size == element.length )
      {
         // no space, double capacity
         T[] old = element;
         element = ( T[] ) new Object[ size*2 ];
         System.arraycopy( old, 0, element, 0, size );
          
      }

      // shift elements right one position
      for( int i = size - 1; i >= index; i-- )
         element[ i + 1 ] = element[ i ];
      element[ index ] = theElement;
      size++;
   }

   /** convert to a string */
   @Override
   public String toString( )
   {
      StringBuilder s = new StringBuilder( "[" );

      // put elements into the buffer
      for( T x : this )
         s.append( Objects.toString( x ) + ", " );

      if( size > 0 )
         s.setLength( s.length( ) - 2 );  // remove last ", "

      s.append( "]" );

      // create equivalent String
      return new String( s );
   }

   /** create and return an iterator */
   @Override
   public Iterator<T> iterator( )
   {
      return new ArrayLinearListIterator<T>( this );
   }

   /** test program */
   


    public T get(String index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void set(T elemento, int i) {
      
         if(i<size && i>=0){
            element[i]=elemento;
        }
        
        }

    
   }

class ArrayLinearListIterator<T> implements Iterator<T>
{
   // fields
   private ArrayLinearList<T> list;  // list to be iterated
   private int nextIndex;  // index of next element

   // constructor
   public ArrayLinearListIterator( ArrayLinearList<T> theList )
   {
      list = theList;
      nextIndex = 0;
   }

   // methods
   /** @return true iff the list has a next element */
   public boolean hasNext( )
   {
      return nextIndex < list.size;
   }

   /** @return next element in list
    * @throws NoSuchElementException
    * when there is no next element */
   public T next( )
   {
      if( nextIndex < list.size )
         return list.element[ nextIndex++ ];
      else
         throw new NoSuchElementException( "No next element" );
   }

   /** unsupported method */
   public void remove( )
   {
      throw new UnsupportedOperationException
         ( "remove not supported" );
   }
  
}

