/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author crist
 */


interface IHashMap<K, V>  {

    HashNode add(K keys, V values); //myhash.add("1032", student1);

    HashNode remove(K key);

    boolean hashKey(K key);

    V get(K key);

}

public class HashMap<K, V> {

    int size=0;
    int cardinalidad;
    public HashNode<K, V>[] tabla;

    public HashMap() {
        this.tabla = new HashNode[10];
        this.cardinalidad = 10;
        
    }

    public HashMap(int m) {
        this.tabla = new HashNode[m];
        this.cardinalidad = m;
    }
    

    int getIndex(K key) {
        int index = 0;
        if (key instanceof Integer) {
            index = this.intHash(key);
        }
        if (key instanceof String){
            ((String) key).toLowerCase();
            index = this.stringHash((String)key);
        }
        return index;
    }

    public HashNode add(K keys, V values) {
        int ind = getIndex(keys);
        //System.out.println("indice "+ind);
        HashNode<K, V> save = this.tabla[ind];
        if (save == null) {
            this.tabla[ind] = new HashNode(keys, values);
            this.size++;
            //System.out.println("agrego");
            return this.tabla[ind];
        } else {
            while (save.next != null && save.key != (K) keys) {
                save = save.next;
            }
            if (save.key == keys) {
                System.out.println("Imposible agregar ya existe el usuario");
                return null;
            }
            save.next = new HashNode<K, V>(keys, values);
            return save.next;
        }
    }

    public HashNode remove(K keys) {
        int ind = getIndex(keys);
        //System.out.println("indice "+ind);
        HashNode<K, V> save = this.tabla[ind];
        if (save != null) {
            HashNode<K, V> tracer = null;
            while (save.next != null && save.key != keys) {
                tracer = save;
                save = save.next;
            }
            if(save.key==keys){
                if (tracer!=null) tracer.next=save.next;
                else this.tabla[ind]=save.next;
            }else{
                return null;
            }                
        } else {
            return null;            
        }
        return save;       
    }

    public HashNode get (String keys) {
        int ind=getIndex((K) keys);
        HashNode<K, V> save=this.tabla[ind];
        if(save==null) return null;
        else{
            
            while(save.next != null && save.key != keys){
                
                save=save.next;
            }
            if(keys.equalsIgnoreCase((String) save.key)){
                return save;                
            }else return null;
        }
        
    }
    

    int intHash(K key) {
        int x;        
        int a = 25;
        int b = 102;
        int p = 552493;
        x = (int) key;
        return ((a * x + b) % p) % this.cardinalidad;
    }
    
    int stringHash(String key){
        int x=0;
        int y=key.length();
        
        for(int i=0;i<y;i++){
            x=x+key.charAt(i)*11;
        }
        return x%this.cardinalidad;       
    }
    public static void main(String[] args) {
        HashMap<String,String> map =new HashMap();
        map.add("cpu", "hola");
        map.add("h", "hello");
        //System.out.println(map.tabla[7].next.value);
        
        System.out.println(map.get("cpu").value);
        
        
        
    }

}
