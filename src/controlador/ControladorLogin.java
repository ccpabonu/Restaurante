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
import static modelo.IOdoc.CargarInventario;
import modelo.IOdoc2;
import modelo.LinkedQueue;
import modelo.ModeloPrincipal;
import modelo.Usuario;
import vista.CrearUsers;
import vista.Login;
import static vista.Login.bodega;
import vista.Principal;

/**
 *
 * @author ccpabonu
 */
public class ControladorLogin implements ActionListener {

    private Login log=new Login();
    private LinkedQueue l=new LinkedQueue();

    public ControladorLogin(Login log) {
        this.log = log;        
        this.log.jButtonLogin.addActionListener(this);
        this.log.jButtonSalir.addActionListener(this);
        this.log.jButtonCrear.addActionListener(this);
    }
    
    
    public void iniciar(){
        this.log.setTitle("Inicio");
        this.log.setLocationRelativeTo(null);
        this.log.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        IOdoc2 doc = new IOdoc2();
        try {
            l=doc.CargarUsuarios();
        } catch (IOException ex) {
            Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (ae.getSource() ==log.jButtonLogin ) {
            String a, b;
            Principal p=new Principal();
            ModeloPrincipal mp = new ModeloPrincipal();
            ControladorPrincipal men = new ControladorPrincipal(p,mp);
            a = log.jTextFieldUser.getText();
            char[] arrayC = log.jPasswordField1.getPassword();
            b = new String(arrayC);            
            //System.out.println(a);
            //System.out.println(b);
            Usuario us1;
            //a="cpu";
            //b="123";
            us1 = new Usuario(a, b);
            
            if (l.buscar(us1)) {                 
                men.iniciar();
                log.setVisible(false);
            } else {
                log.jDialog1.setVisible(true);
            }
            try {
                CargarInventario(bodega);
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (ae.getSource() ==log.jButtonCrear ){
            CrearUsers use = new CrearUsers();
            ControladorCrear cre = new ControladorCrear(use,l);
            cre.iniciar();
                       
        }    
                

    }

}
