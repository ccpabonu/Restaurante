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
import modelo.LinkedQueue;
import modelo.ModeloPrincipal;
import modelo.Usuario;
import vista.Login;
import static vista.Login.bodega;
import vista.Principal;

/**
 *
 * @author ccpabonu
 */
public class ControladorLogin implements ActionListener {

    private Login log;
    private LinkedQueue l;

    public ControladorLogin(Login log, LinkedQueue k) {
        this.log = log;
        this.l=k;
        this.log.jButtonLogin.addActionListener(this);
        this.log.jButtonSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() ==log.jButtonLogin ) {
            String a, b;
            Principal p=new Principal();
            ModeloPrincipal mp = new ModeloPrincipal();
            ControladorPrincipal men = new ControladorPrincipal(p,mp);
            a = log.jTextFieldUser.getText();
            char[] arrayC = log.jPasswordField1.getPassword();
            b = new String(arrayC);            
            System.out.println(a);
            System.out.println(b);
            Usuario us1;
            a="cpu";
            b="123";
            us1 = new Usuario(a, b);
            us1=(Usuario) us1;
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

    }

}
