/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.modelo_mostrar;
import vista.Menu;
import static vista.Menu.contenedor;
import vista.MenuPrincipal;
import vista.Mostrar;

/**
 *
 * @author Asus
 */
public class controlador_mostrar implements ActionListener{
    Mostrar view;
    modelo_mostrar modelo= new modelo_mostrar(view);
    
    
    public controlador_mostrar(modelo_mostrar modelo,Mostrar view){
        this.modelo=modelo;
        this.view=view;
        this.view.Atras.addActionListener(this);
    }
    
    public void iniciar(){
        modelo.crearModelo();
        modelo.llenarTabla(Menu.menu);
        
        view.setSize(600,600);
        view.setLocation(50,0);
        
        Menu.contenedor.removeAll();
        Menu.contenedor.add(view,BorderLayout.CENTER);
        Menu.contenedor.revalidate();
        Menu.contenedor.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MenuPrincipal mp=new MenuPrincipal();
        controlador_menup ctlr_mp=new controlador_menup(mp);
        ctlr_mp.iniciar();
        
    }
    
}
