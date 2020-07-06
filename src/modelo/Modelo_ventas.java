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
 ;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import vista.Venta;
import static vista.Venta.venta;
import static vista.crear_plato.menu;


public class Modelo_ventas {
    Venta view;
    Plato plato;
    String name_c;
    String aux_plato;
    String fecha;
    int cantidad;
    double aux_precio,aux_tprecio=0;
    ArrayLinearList <Plato> aux_lp = new ArrayLinearList();
    ArrayLinearList <Integer> aux_lc = new ArrayLinearList();
    Calendar c = new GregorianCalendar();
   
    
    

    public Modelo_ventas(Venta view) {
        this.view = view;
    }
    
    
    
    
    public Plato Buscar(String nombre, ArrayLinearList <Plato> menu){
    if(nombre.equals("Seleccionar")){
        return null;
    }else{
        for(int i =0;i<=menu.size();i++){
            if(nombre.equals(menu.get(i).getNombre())){
                return menu.get(i);
            }
        }
     } 
      return null;
    }
    public void IngredientesCBV( ArrayLinearList <Plato> menu){//llenar Combo box con datos de un minheap
        view.Plato.addItem("Seleccionar"); 
        for(int i=0;i<menu.size();i++){
            view.Plato.addItem(menu.get(i).getNombre());
        }
    } 
    
    public void Fecha(){
        fecha=Integer.toString(c.get(Calendar.DATE))+"/"+Integer.toString(c.get(Calendar.MONTH))+"/"+Integer.toString(c.get(Calendar.YEAR));
        view.fecha.setText(fecha);
    }
    
    public void pedido(){
        aux_plato=view.Plato.getSelectedItem().toString();
        plato=Buscar(view.Plato.getSelectedItem().toString(),menu);
        cantidad=(Integer)view.sp_cantidad.getValue();
        aux_lp.add(plato);
        aux_lc.add(cantidad);
        aux_precio=aux_precio+(plato.getPrecio()*cantidad);        
        view.Mostrar.append(aux_plato+" "+"X"+String.valueOf(cantidad));
        view.Mostrar.append(System.getProperty("line.separator"));
        view.T_pagar.setText(String.valueOf(aux_precio));
    }
    
    
    
    
    public void restar_inv(Plato plato,MinHeap <Producto> ingredientes){
    
    }
    
    public void pagar(){
        //Pedido orden;
        name_c=view.nombre.getText();
        if(!name_c.isEmpty()){
            ArrayLinearList <Plato> borr_lp = new ArrayLinearList();
            ArrayLinearList <Integer> borr_lc = new ArrayLinearList();
            //orden=new Pedido(name_c,aux_precio,aux_lp,aux_lc);
            aux_tprecio=aux_tprecio+aux_precio;
            aux_precio=0;
            aux_lp=borr_lp;
            aux_lc=borr_lc;
            view.T_pagar.setText(" ");
            view.Mostrar.setText(null);
            view.nombre.setText(" ");
            name_c=view.nombre.getText();
            view.T_vendido.setText(String.valueOf(aux_tprecio));
        }else{
            JOptionPane.showMessageDialog(null,"El espacio nombre se encuentra");
        }
        
    }
    
    public void cerrar(){
        V_diaria dia= new V_diaria(fecha,aux_tprecio);
        venta.add(dia);
        fecha=" ";
        aux_tprecio=0;
        view.T_vendido.setText(" ");
        JOptionPane.showMessageDialog(null,"Dia cerrado");
    }   
}
