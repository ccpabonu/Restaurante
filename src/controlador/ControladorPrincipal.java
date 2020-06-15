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
import modelo.IOdoc2;
import modelo.LinkedQueue;
import modelo.ModeloPrincipal;
import modelo.Usuario;

import vista.Login;
import vista.Principal;

/**
 *
 * @author Brayan Estupiñan
 */
public class ControladorPrincipal implements ActionListener {

    private Principal p = new Principal();
    private ModeloPrincipal mp;

    public ControladorPrincipal(Principal p, ModeloPrincipal mp) {
        this.p = p;
        this.mp = mp;
        this.p.btnBodega.addActionListener(this);
        this.p.btnMenu.addActionListener(this);

    }

    public void iniciar() {
        p.setTitle("Guardar producto");
        p.setLocationRelativeTo(null);
        p.setVisible(true);
        
    }

    public void actionPerformed(ActionEvent a) {
        IOdoc2 doc = new IOdoc2();
        if (a.getSource() == p.btnBodega) {
            mp.Almacen();
        }
        if (a.getSource() == p.btnMenu) {
            mp.Menu();
        }
        if (a.getSource() == p.jButtonAtras) {

            Login log = new Login();

            ControladorLogin crt = new ControladorLogin(log);
            crt.iniciar();

        }

    }
}
