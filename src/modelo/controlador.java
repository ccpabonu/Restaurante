/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Login;
import vista.Principal;

/**
 *
 * @author windows 10
 */
public class controlador implements ActionListener {
    private LinkedQueue q;
    private Login ventana1;
    
    public controlador(LinkedQueue q, Login ventana1){
        this.q=q;
        this.ventana1=ventana1;
    }
    public void iniciar() {
        ventana1.setTitle("Restaurante");
        ventana1.setLocation(null);
        ventana1.jDialog1.setLocationRelativeTo(null);
        ventana1.setVisible(true);
    }    

    
    public void actionPerformed(ActionEvent ae) {
        String a,b;
        Principal men = new Principal();
        a= ventana1.jTextFieldUser.getText();
        char[] arrayC = ventana1.jPasswordField1.getPassword();
        b = new String(arrayC);
        if(ae.getSource()== ventana1.jButtonLogin){
            if(q.comparar(a, b)) men.setVisible(true);
            else ventana1.jDialog1.setVisible(true);          
        }       
        
    }   
    
    
}
