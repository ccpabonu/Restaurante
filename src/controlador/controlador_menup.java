/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloPrincipal;
import modelo.modelo_crearPlato;
import modelo.modelo_mostrar;
import vista.Mostrar_p;
import vista.Principal;
import vista.crear_plato;
import vista.menu_Platos;

/**
 *
 * @author Asus
 */
public class controlador_menup implements ActionListener {
    menu_Platos view;
    
    
    
    public controlador_menup(menu_Platos view){
        this.view=view;
        this.view.crearPlato.addActionListener(this);
        this.view.mostrar.addActionListener(this);
        this.view.Atras.addActionListener(this);
    }
    
    public void iniciar(){
        view.setTitle("MenuPlatos");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==view.crearPlato){
            crear_plato crearp = new crear_plato(); 
            modelo_crearPlato mod_cp=new modelo_crearPlato(crearp);
            controlador_crearPlato ctrl_cp= new controlador_crearPlato(mod_cp,crearp);
            ctrl_cp.iniciar();
            this.view.setVisible(false);
        }else if(e.getSource()==view.mostrar){
            Mostrar_p mostrar = new Mostrar_p(); 
            modelo_mostrar mod_m=new modelo_mostrar(mostrar);
            controlador_mostrar ctrl_m= new controlador_mostrar(mod_m,mostrar);
            ctrl_m.iniciar();
            this.view.setVisible(false);
        }else if(e.getSource()==view.Atras){
             
            Principal p=new Principal();
            ModeloPrincipal mp = new ModeloPrincipal();
            ControladorPrincipal men = new ControladorPrincipal(p,mp);
            men.iniciar();
            this.view.setVisible(false);
        }
    }
    
}
