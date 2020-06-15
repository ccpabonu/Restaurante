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
    
    @Override
    public int compareTo(Producto ProductoC) {
        double comp= this.cantidad-ProductoC.cantidad;
        int re=(int)Math.round(comp);
        return re; 
    }
    
    }