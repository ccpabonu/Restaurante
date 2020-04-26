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
public interface Dinamiclist <T>{
    void add(T element);
    T remove (int index);
    int length();
    void set(T element,int index);
    T get(int index);
    

}
