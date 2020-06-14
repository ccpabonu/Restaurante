/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Login;
/**
 *
 * @author ccpabonu
 */
public class ControladorLogin implements ActionListener {

    private Login log;

    public ControladorLogin(Login log) {
        this.log = log;
        this.log.jButtonLogin.addActionListener(this);
        this.log.jButtonSalir.addActionListener(this);
    }   
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae==)
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
