/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.ControladorAlmacen;
import controlador.ControladorLogin;
import controlador.ControladorPrincipal;
import controlador.Controlador_Ventas;
import controlador.controlador_menup;
import vista.Almacen;
import vista.Login;
import vista.Principal;
import vista.Venta;
import vista.menu_Platos;

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
         menu_Platos ppal= new menu_Platos();
        controlador_menup ctlr_menup= new controlador_menup(ppal);
        ctlr_menup.iniciar();
        Object o[]=null;
    }
    public void Venta(){
        Venta venta=new Venta();
        Modelo_ventas mod=new Modelo_ventas(venta);
        Controlador_Ventas ctlr_v=new Controlador_Ventas(venta,mod);
        ctlr_v.iniciar();
    
    }
    public void Atras(){
        Login log=new Login();
        ControladorLogin l = new ControladorLogin(log);
        l.iniciar();

    }
    
}
