/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import controlador.ControladorAlmacen;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.LinkedQueue;
import modelo.ModeloAlmacen;

/**
 *
 * @author windows 10
 */
public class Principal extends javax.swing.JFrame {

    private LinkedQueue k;

    /**
     * Creates new form Login
     */
    public Principal() {
        initComponents(); 
        this.setLocationRelativeTo(null);
    }
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAtras = new javax.swing.JButton();
        btnBodega = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAtras.setBackground(new java.awt.Color(255, 153, 153));
        jButtonAtras.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonAtras.setText("Atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 30));

        btnBodega.setBackground(new java.awt.Color(255, 153, 153));
        btnBodega.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBodega.setText("Bodega");
        btnBodega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBodegaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 150, 30));

        btnMenu.setBackground(new java.awt.Color(255, 153, 153));
        btnMenu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnMenu.setText("Crear Menú");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 160, 30));

        jButtonSalir.setBackground(new java.awt.Color(255, 153, 153));
        jButtonSalir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 100, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        Login mainW = new Login();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void btnBodegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBodegaActionPerformed
         
    }//GEN-LAST:event_btnBodegaActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
      
    }//GEN-LAST:event_btnMenuActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBodega;
    public javax.swing.JButton btnMenu;
    public javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}
