/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloPrincipal;

import vista.Almacen;
import vista.Principal;

/**
 *
 * @author Brayan Estupiñan
 */
public class ControladorPrincipal implements ActionListener {

      private Principal p;
      private ModeloPrincipal mp; 
      
        public ControladorPrincipal(Principal p, ModeloPrincipal mp) {
        this.p=p;
        this.mp = mp;
        this.p.btnBodega.addActionListener(this);
        this.p.btnMenu.addActionListener(this);
        
    } 
        
         public void iniciar(){
        p.setTitle("Guardar producto");
        p.setLocationRelativeTo(null);
    }
         
     public void actionPerformed(ActionEvent a){
        if(a.getSource()==p.btnBodega){  
            mp.Almacen();
        }
        if(a.getSource()==p.btnMenu){  
            mp.Menu();
        }
         
}
}