/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.ControladorAlmacen;
import vista.Almacen;
import vista.Menu;
import vista.MenuPrincipal;
import vista.Principal;

/**
 *
 * @author Brayan Estupiñan
 */
public class ModeloPrincipal {
    
    Principal P1=new Principal();
    public void Almacen(){
        Almacen F1 =  new Almacen();
        ModeloAlmacen mod=new ModeloAlmacen();
        Object o[]=null;
        ControladorAlmacen cont=new ControladorAlmacen(F1,mod);
        F1.setVisible(true);
        
    }
    public void Menu(){
         Menu ppal= new Menu();
        ppal.setVisible(true);
    Object o[]=null;
    }
}
