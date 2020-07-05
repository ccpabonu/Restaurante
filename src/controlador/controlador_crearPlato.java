/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.ArrayLinearList;
import modelo.MinHeap;
import modelo.Plato;
import modelo.Producto;
import modelo.modelo_crearPlato;
import vista.Login;
import vista.crear_plato;
import vista.menu_Platos;

/**
 *
 * @author Asus
 */
public class controlador_crearPlato implements ActionListener{
    
    crear_plato view;
    modelo_crearPlato modelo=new modelo_crearPlato(view);
    
    
    
    public controlador_crearPlato(modelo_crearPlato modelo,crear_plato view){
        this.modelo=modelo;
        this.view=view;
        this.view.btnCrear.addActionListener(this);
        this.view.btnAtras.addActionListener(this);
        
    }

    
    public void iniciar(){
        view.setTitle("Crearplato");
        view.setLocationRelativeTo(null);
        modelo.IngredientesCB(Login.bodega);
        view.setVisible(true);
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
    public boolean Buscar_n(String name,ArrayLinearList <Plato> platos){
        boolean flag=false;
        for(int i=0; i<platos.size();i++){
            if(name.equals(platos.get(i).getNombre())){
                flag=true;
                break;
            }
        }
        return flag;
    }
    
    public double getValue(JTextField cantidad){//obtener valor de un jtext y volverlo double
    double x;
    if(cantidad.getText().equals("nulo")){
        x=000;
    }else{
        x=Double.parseDouble(cantidad.getText());
    } 
    return x;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        boolean flag_rep;
        if(e.getSource() == view.btnCrear){
            modelo.setName(view.Nombre.getText());
            flag_rep=Buscar_n(modelo.getName(),Login.menu);
            if (!modelo.getName().isEmpty() && flag_rep==false){
            modelo.setI1(Buscar(view.Ingrediente1.getSelectedItem().toString(),Login.bodega));
            modelo.setI2(Buscar(view.Ingrediente2.getSelectedItem().toString(), Login.bodega));
            modelo.setI3(Buscar(view.Ingrediente3.getSelectedItem().toString(), Login.bodega));
            modelo.setI4(Buscar(view.Ingrediente4.getSelectedItem().toString(), Login.bodega));
            modelo.setI5(Buscar(view.Ingrediente5.getSelectedItem().toString(), Login.bodega));
            modelo.setI6(Buscar(view.Ingrediente6.getSelectedItem().toString(), Login.bodega));
            modelo.setI7(Buscar(view.Ingrediente7.getSelectedItem().toString(), Login.bodega));
            modelo.setI8(Buscar(view.Ingrediente8.getSelectedItem().toString(), Login.bodega));
            modelo.setI9(Buscar(view.Ingrediente9.getSelectedItem().toString(), Login.bodega));
            modelo.setI10(Buscar(view.Ingrediente10.getSelectedItem().toString(), Login.bodega));

            modelo.setC1(getValue(view.Cantidad1));
            modelo.setC2(getValue(view.Cantidad2));
            modelo.setC3(getValue(view.Cantidad3));
            modelo.setC4(getValue(view.Cantidad4));
            modelo.setC5(getValue(view.Cantidad5));
            modelo.setC6(getValue(view.Cantidad6));
            modelo.setC7(getValue(view.Cantidad7));
            modelo.setC8(getValue(view.Cantidad8));
            modelo.setC9(getValue(view.Cantidad9));
            modelo.setC10(getValue(view.Cantidad10));
            
            modelo.crearplato();

            view.Nombre.setText("");
            view.Cantidad1.setText("nulo");
            view.Cantidad2.setText("nulo");
            view.Cantidad3.setText("nulo");
            view.Cantidad4.setText("nulo");
            view.Cantidad5.setText("nulo");
            view.Cantidad6.setText("nulo");
            view.Cantidad7.setText("nulo");
            view.Cantidad8.setText("nulo");
            view.Cantidad9.setText("nulo");
            view.Cantidad10.setText("nulo");

        }else{
            JOptionPane.showMessageDialog(null,"El espacio nombre se encuentra vacio o el nombre del plato ya existe");
        }
     }else if(e.getSource() == view.btnAtras){   
        menu_Platos mp=new menu_Platos();
        controlador_menup ctlr_mp=new controlador_menup(mp);
        ctlr_mp.iniciar();
        this.view.setVisible(false);
    }
   }
}
    

