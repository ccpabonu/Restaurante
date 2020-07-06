/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo_ventas;
import vista.Login;
import vista.Venta;


/**
 *
 * @author Asus
 */
public class Controlador_Ventas implements ActionListener {
    Venta view;
    Modelo_ventas modelo;
    

    public Controlador_Ventas(Venta view, Modelo_ventas modelo) {
        this.view = view;
        this.modelo = modelo;
        this.view.add.addActionListener(this);
        this.view.pagar.addActionListener(this);
        this.view.cerrar.addActionListener(this);
    }
        
    public void iniciar(){
        view.setTitle("Venta");
        view.setLocationRelativeTo(null);
        modelo.IngredientesCBV(Login.menu);
        view.T_pagar.setEditable(false);
        view.fecha.setEditable(false);
        view.T_vendido.setEditable(false);
        modelo.Fecha();
        view.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==view.add){
            modelo.pedido();
        }else if(e.getSource()==view.pagar){
            modelo.pagar();
        }else if(e.getSource()==view.cerrar){
            modelo.cerrar();
        }
            
    }

    
}
