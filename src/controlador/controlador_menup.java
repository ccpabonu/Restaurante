/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.modelo_crearPlato;
import modelo.modelo_mostrar;
import static vista.Menu.contenedor;
import vista.MenuPrincipal;
import vista.Mostrar;
import vista.crearPlato;

/**
 *
 * @author Asus
 */
public class controlador_menup implements ActionListener {
    MenuPrincipal view;
    
    
    
    public controlador_menup(MenuPrincipal view){
        this.view=view;
        this.view.crearPlato.addActionListener(this);
        this.view.mostrar.addActionListener(this);
    }
    
    public void iniciar(){
    this.view.setSize(600,600);
    this.view.setLocation(60,0);
   
    contenedor.removeAll();
    contenedor.add(this.view,BorderLayout.CENTER);
    contenedor.revalidate();
    contenedor.repaint();
    
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==view.crearPlato){
            crearPlato crearp = new crearPlato(); 
            modelo_crearPlato mod_cp=new modelo_crearPlato(crearp);
            controlador_crearPlato ctrl_cp= new controlador_crearPlato(mod_cp,crearp);
            ctrl_cp.iniciar();
        
        }else if(e.getSource()==view.mostrar){
            Mostrar mostrar = new Mostrar(); 
            modelo_mostrar mod_m=new modelo_mostrar(mostrar);
            controlador_mostrar ctrl_m= new controlador_mostrar(mod_m,mostrar);
            ctrl_m.iniciar();
        }
    }
    
}
