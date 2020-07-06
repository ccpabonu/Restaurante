/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.ControladorPrincipal;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static modelo.IOdoc.GuardarInventario;
import vista.Almacen;
import static vista.Almacen.bodega;
import static vista.Almacen.buscar;
import vista.Inventario;
import vista.Principal;

/**
 *
 * @author Brayan Estupiñan
 */
public class ModeloAlmacen {
    Almacen A=new Almacen();
    private String nombre;
    private String cantidad;
    private String precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }
    
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    public boolean Buscar_n(String nombre, MinHeap <Producto> ingredientes){
        boolean flag=false;
        for(int i=1; i<=ingredientes.size();i++){
            if(nombre.equals(ingredientes.getNode(i).getNombre())){
                flag=true;
                break;
            }
        }
        return flag;
    }
    

    
    public void guardar(){
    boolean flag_rep;
    flag_rep=Buscar_n(nombre,bodega);
    if(!nombre.isEmpty() && flag_rep==false){
            if(!cantidad.isEmpty()){
                if(!precio.isEmpty()){
                Producto pro=new Producto(nombre,Integer.parseInt(cantidad),Double.parseDouble(precio));
                bodega.put(pro);
               
                JOptionPane.showMessageDialog(null,"Producto guardado con exito");
                 }else{
                      JOptionPane.showMessageDialog(null,"El campo Precio por unidad esta vacio");
            }
            }else{
                  JOptionPane.showMessageDialog(null,"El campo Cantidad esta vacio");
            }         
    }else{
             JOptionPane.showMessageDialog(null,"El campo Nombre esta vacio o el nombre ya existe");
        }
    try {
        GuardarInventario(bodega);
    } catch (IOException ex) {
        Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
   
    public void Mostrar(){
       Inventario i1=new Inventario();
        i1.setVisible(true);
        Object o[]=null;
        System.out.println("perro");

    }
    public void volver(){
        Principal p=new Principal();
        ModeloPrincipal mp = new ModeloPrincipal();
        ControladorPrincipal men = new ControladorPrincipal(p,mp);
        men.iniciar();
        A.setVisible(false);
    }
     public void Eliminar(){
        if(bodega.size()==0){
            JOptionPane.showMessageDialog(null,"No hay elementos que eliminar");
        }else{
        
           bodega.remove(Almacen.buscar);
            JOptionPane.showMessageDialog(null,"Producto eliminado con éxito");
        }try {
        GuardarInventario(bodega);
        } catch (IOException ex) {
        Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
     public void Modificar(){
     Producto pro1=new Producto (nombre,Integer.parseInt(cantidad),Double.parseDouble(precio));
     bodega.set(pro1, buscar);
     JOptionPane.showMessageDialog(null,"Producto modificado con éxito");
     try {
        GuardarInventario(bodega);
        } catch (IOException ex) {
        Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
}