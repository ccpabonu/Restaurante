/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloAlmacen;
import vista.Almacen;

/**
 *
 * @author Brayan Estupiñan
 */
public class ControladorAlmacen implements ActionListener{
    private Almacen a2;
    private ModeloAlmacen m1; 
    
    
  public ControladorAlmacen(Almacen a2, ModeloAlmacen m1) {
        this.a2 = a2;
        this.m1 = m1;
        this.a2.Guardar.addActionListener(this);
        this.a2.Mostrar.addActionListener(this);
        this.a2.Eliminar.addActionListener(this);
        this.a2.Modificar.addActionListener(this);
        this.a2.btnAtras.addActionListener(this);
        
    }  
  public void iniciar(){
        a2.setTitle("Guardar producto");
        a2.setLocationRelativeTo(null);
    }
    
public void actionPerformed(ActionEvent a){

if(a.getSource()==a2.Guardar){    
            m1.setNombre(a2.txNombre.getText());
            m1.setCantidad(a2.txCantidad.getText());
            m1.setPrecio(a2.txPrecio.getText());
            m1.guardar();
            a2.txNombre.setText("");
            //System.out.println("LLEGA Aca");
            a2.txCantidad.setText("");
            a2.txPrecio.setText("");
        }if(a.getSource()==a2.Mostrar){
            m1.Mostrar();
        }if(a.getSource()==a2.Eliminar){
        
            m1.Eliminar();
            a2.txNombre.setText("");
            a2.txCantidad.setText("");
            a2.txPrecio.setText("");
        }if(a.getSource()== a2.Modificar){
            m1.setNombre(a2.txNombre.getText());
            m1.setCantidad(a2.txCantidad.getText());
            m1.setPrecio(a2.txPrecio.getText());
            m1.Modificar();
            a2.txNombre.setText("");
            //System.out.println("LLEGA Acax2");
            a2.txCantidad.setText("");
            a2.txPrecio.setText("");
        }if(a.getSource()==a2.btnAtras){
            
            m1.volver();
            
        }



}  
  
  
  
}
