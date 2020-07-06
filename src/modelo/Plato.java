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

public class Plato {
    String nombre;
    Producto []ingredientes;
    double [] cantidades;
    double precio;

    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public Producto[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Producto[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double[] getCantidades() {
        return cantidades;
    }

    public void setCantidades(double[] cantidades) {
        this.cantidades = cantidades;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Plato(String nombre, Producto[] ingredientes, double[] cantidades, double precio) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.cantidades = cantidades;
        this.precio = precio;
    }

    public Plato(String nombre) {
        this.nombre = nombre;
    }
       
}
