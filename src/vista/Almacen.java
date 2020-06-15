/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Producto;
//import modelo.ArrayLinearList;
import javax.swing.JOptionPane;
import static modelo.IOdoc.GuardarInventario;
import modelo.MinHeap;

/**
 *
 * @author Brayan Estupiñan
 */
public class Almacen extends javax.swing.JFrame {
    
    
public static MinHeap <Producto> bodega = Login.bodega;
public static int buscar;    


/**
     * Creates new form Almacen
     */
    public Almacen()  {
        initComponents();
        this.setLocationRelativeTo(null);
        jDialog1.setLocationRelativeTo(null);
        
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        txNombre = new javax.swing.JTextField();
        txCantidad = new javax.swing.JTextField();
        txPrecio = new javax.swing.JTextField();
        Mostrar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jDialog1.setSize(new java.awt.Dimension(300, 100));

        jLabel9.setText("No hay productos que eliminar");
        jDialog1.getContentPane().add(jLabel9, java.awt.BorderLayout.PAGE_START);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 48)); // NOI18N
        jLabel1.setText("INVENTARIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setText("Cantidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setText("Precio por unidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        txNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNombreActionPerformed(evt);
            }
        });
        txNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 150, -1));
        getContentPane().add(txCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 150, -1));

        txPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(txPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 150, -1));

        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        getContentPane().add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 89, -1));

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        Eliminar.setText("Eliminar ");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jLabel7.setText("gr");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLabel8.setText("Pesos");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        btnAtras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAtras.setText("Volver ");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 100, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Inventario-de-perdida.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -10, 540, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNombreActionPerformed

    private void txPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txPrecioActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
    
        
    }//GEN-LAST:event_GuardarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        
        
      
    }//GEN-LAST:event_MostrarActionPerformed

    private void txNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNombreKeyTyped
    
        // TODO add your handling code here:
        int press=evt.getKeyChar();
        if(press==10){
            String nombreEncontrado= txNombre.getText().trim();
            Producto p;
            for (int i = 1; i <= bodega.size(); i++) {
                p=bodega.getNode(i);
                    if(nombreEncontrado.equalsIgnoreCase(p.getNombre())){
                        txCantidad.setText(String.valueOf(p.getCantidad()));
                        txPrecio.setText(String.valueOf(p.getCosto()));
                        buscar=i;
                        break;
                    }
                    
            
            }

        
        }
        
        
        
    }//GEN-LAST:event_txNombreKeyTyped

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        
       
       
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        
        
            
    }//GEN-LAST:event_EliminarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    public void tamañoArreglo(){
   
    int a;
    a=bodega.size();
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Eliminar;
    public javax.swing.JButton Guardar;
    public javax.swing.JButton Modificar;
    public javax.swing.JButton Mostrar;
    public javax.swing.JButton btnAtras;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField txCantidad;
    public javax.swing.JTextField txNombre;
    public javax.swing.JTextField txPrecio;
    // End of variables declaration//GEN-END:variables
}
