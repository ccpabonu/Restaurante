/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.Mostrar_p;

/**
 *
 * @author Asus
 */
public class modelo_mostrar {
    Mostrar_p view;
    
    
    public modelo_mostrar(Mostrar_p view){
        this.view=view;
    }
    
    
    DefaultTableModel ver;
    
    public void crearModelo(){
        try{
            ver=(new DefaultTableModel(
            null, new String[]{
               "Numero","Nombre"}) {});
            this.view.jTable1.setModel(ver);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        
        }
    }
    public void llenarTabla(ArrayLinearList <Plato> menu){
        if(menu==null){
            JOptionPane.showMessageDialog(null,"No hay contactos");
        }
        else{     
           Object o[]=null;
           for(int i=0;i < menu.size();i++){
               Plato plato = menu.get(i);
               ver.addRow(o);
               ver.setValueAt(Integer.toString(i+1), i, 0);
               ver.setValueAt(plato.getNombre(), i, 1);

        }
       }
    }
    
}
