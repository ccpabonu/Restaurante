/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.modelo_mostrar;
import static vista.Login.menu;
import vista.Mostrar_p;
import vista.menu_Platos;

/**
 *
 * @author Asus
 */
public class controlador_mostrar implements ActionListener{
    Mostrar_p view;
    modelo_mostrar modelo= new modelo_mostrar(view);
    
    
    public controlador_mostrar(modelo_mostrar modelo,Mostrar_p view){
        this.modelo=modelo;
        this.view=view;
        this.view.Atras.addActionListener(this);
    }
    
    public void iniciar(){
        view.setTitle("Platos");
        view.setLocationRelativeTo(null);
        modelo.crearModelo();
        modelo.llenarTabla(menu);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        menu_Platos mp=new menu_Platos();
        controlador_menup ctlr_mp=new controlador_menup(mp);
        ctlr_mp.iniciar();
        this.view.setVisible(false);
    }
    
}
