/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Producto;
import modelo.ArrayLinearList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brayan Estupiñan
 */
public class Almacen extends javax.swing.JFrame {
    
    
public static ArrayLinearList<Producto> bodega = new ArrayLinearList<>( );
public int buscar;    

/**
     * Creates new form Almacen
     */
    public Almacen() {
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
        jButton1 = new javax.swing.JButton();
        txNombre = new javax.swing.JTextField();
        txCantidad = new javax.swing.JTextField();
        txPrecio = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
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

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

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

        jButton2.setText("Mostrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 89, -1));

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jButton4.setText("Eliminar ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jLabel6.setText("gr");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        jLabel7.setText("gr");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLabel8.setText("gr");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String n=txNombre.getText();
        String c=txCantidad.getText();
        String p=txPrecio.getText();
        
        if(!n.isEmpty())    {
        
            if(!c.isEmpty()){
                if(!p.isEmpty()){
                    
                    Producto pro=new Producto(n,Integer.parseInt(c),Double.parseDouble(p));
                    bodega.add(0, pro);
                     JOptionPane.showMessageDialog(null,"Producto guardado con exito");
                     txNombre.setText("");
                     txCantidad.setText("");
                     txPrecio.setText("");
                     for(int i=0;i<bodega.size();i++){
                     System.out.println(bodega.get(i).getNombre());
                     }
                }else{
                JOptionPane.showMessageDialog(null,"El campo Precio por unidad esta vacio");
                }
            }else{
            JOptionPane.showMessageDialog(null,"El campo Cantidad esta vacio");
            }
            
        }else{
           JOptionPane.showMessageDialog(null,"El campo Nombre esta vacio");
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inventario i1=new Inventario();
        i1.setVisible(true);
       
        
     
        int a=bodega.size();
        System.out.println(a);
        Object o[]=null;
      
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txNombreKeyTyped
    
        // TODO add your handling code here:
        int press=evt.getKeyChar();
        if(press==10){
            String nombreEncontrado= txNombre.getText().trim();
            Producto p;
            for (int i = 0; i < bodega.size(); i++) {
                p=bodega.get(i);
                    if(nombreEncontrado.equalsIgnoreCase(p.getNombre())){
                        txCantidad.setText(String.valueOf(p.getCantidad()));
                        txPrecio.setText(String.valueOf(p.getCosto()));
                        buscar=i;
                        break;
                    }
                    
            
            }

        
        }
        
        
        
    }//GEN-LAST:event_txNombreKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String nombre=txNombre.getText();
        String cantidad=txCantidad.getText();
        String precio=txPrecio.getText();
        
        Producto pro1=new Producto (nombre,Integer.parseInt(cantidad),Double.parseDouble(precio));
       bodega.set(pro1,buscar);
       txNombre.setText("");
       txCantidad.setText("");
       txPrecio.setText("");
       
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       if(bodega.size()==0){jLabel9.setText("No hay productos que eliminar"); jDialog1.setVisible(true);}
       else {
           jLabel9.setText("Se Elimino correctamente");
           jDialog1.setVisible(true);
           bodega.remove(buscar);
           txNombre.setText("");
           txCantidad.setText("");
           txPrecio.setText("");           
       }
       
        
            
    }//GEN-LAST:event_jButton4ActionPerformed

    public void tamañoArreglo(){
   
    int a;
    a=bodega.size();
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txCantidad;
    private javax.swing.JTextField txNombre;
    private javax.swing.JTextField txPrecio;
    // End of variables declaration//GEN-END:variables
}
