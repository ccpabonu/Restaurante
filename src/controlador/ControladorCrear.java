/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.HashMap;
import modelo.IOdoc2;
import modelo.LinkedQueue;
import modelo.Usuario;
import vista.CrearUsers;
import vista.Login;

/**
 *
 * @author ccpabonu
 */
public class ControladorCrear implements ActionListener {
    private CrearUsers log=new CrearUsers();
    public HashMap l=new HashMap();

    public ControladorCrear(CrearUsers log, HashMap<String,Usuario> k) {
        this.log=log;
        this.l=k;
        this.log.jButtonLogin2.addActionListener(this);
        this.log.jButtonSalir2.addActionListener(this);
    }
    public void iniciar(){
        this.log.setTitle("Crear Usuario");
        this.log.setLocationRelativeTo(null);
        this.log.setVisible(true);        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String a,b,c;
        Usuario u2;  
        IOdoc2 doc = new IOdoc2();
        if(ae.getSource()==log.jButtonLogin2){
            char[] arrayA = log.jPasswordField4.getPassword();     
            char[] arrayB = log.jPasswordField5.getPassword(); 
            a = new String(arrayA);
            b = new String(arrayB);
            c = log.jTextFieldUser2.getText();
            if(a.equalsIgnoreCase(b)){
                u2=new Usuario(c,a);
                l.add(c,u2);
                System.out.println(this.l.tabla[8].value);
                /*try {
                    doc.GuardarUsuarios(l);
                } catch (IOException ex) {
                    Logger.getLogger(ControladorCrear.class.getName()).log(Level.SEVERE, null, ex);
                }*/
                this.log.setVisible(false);
                Login log= new Login();                
                ControladorLogin h=new ControladorLogin(log,this.l);
                h.iniciar();
                
                
            }else log.jDialog1.setVisible(true);
                
        }
        if(ae.getSource()==log.jButtonSalir2){
            this.log.setVisible(false);
        }
        
        
        
    }

    
    

    
}
