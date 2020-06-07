/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Asus
 */
public class Producto implements Comparable<Producto> {
    String nombre;
    int cantidad;
    double costo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    
    public double getCosto(){
        return costo;
    }
    public void setCosto(int costo){
        this.costo=costo;
    }

    public Producto(String nombre, int cantidad, double costo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public Producto() {
        
    }
    
       
    public Producto Buscar(String nombre, MinHeap <Producto> ingredientes){
        if(nombre.equals("Nulo")){
            return null;
        }else{
            for(int i =1;i<=ingredientes.size();i++){
                if(nombre.equals(ingredientes.getNode(i).getNombre())){
                    return ingredientes.getNode(i);
                }
            
            }
            
         }  
        return null;
    }   

    @Override
    public int compareTo(Producto ProductoC) {
        double comp= this.cantidad-ProductoC.cantidad;
        int re=(int)Math.round(comp);
        return re; 
    }
    
    }