/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;

/**
 *
 * @author sauky
 */
public class FrmLogin extends javax.swing.JFrame {

    int x,y;
   
    public FrmLogin() {
        this.setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        txtnombre.setBackground(new java.awt.Color(0,0,0,1));
        txtclave.setBackground(new java.awt.Color(0,0,0,1));
        XdeCerrar.setBackground(new java.awt.Color(0,0,0,0));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        LATiendaxd = new javax.swing.JLabel();
        LogoFMOcc = new javax.swing.JLabel();
        InicioSesion = new javax.swing.JLabel();
        Elusuario = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        contraxd = new javax.swing.JLabel();
        txtclave = new javax.swing.JPasswordField();
        btEntrar = new javax.swing.JButton();
        separador1 = new javax.swing.JSeparator();
        separador2 = new javax.swing.JSeparator();
        XdeCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        Bg.setBackground(new java.awt.Color(255, 255, 255));

        LATiendaxd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cafe.png"))); // NOI18N

        LogoFMOcc.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LogoFMOcc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/favicon.png"))); // NOI18N
        LogoFMOcc.setText("FMOcc");

        InicioSesion.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        InicioSesion.setText("INICIAR SESIÓN");

        Elusuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        Elusuario.setText("USUARIO");

        txtnombre.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        txtnombre.setToolTipText("Ingrese su correo o usuario\n");
        txtnombre.setBorder(null);
        txtnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtnombreMousePressed(evt);
            }
        });
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        contraxd.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        contraxd.setText("CONTRASEÑA");

        txtclave.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        txtclave.setBorder(null);
        txtclave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtclaveMousePressed(evt);
            }
        });
        txtclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclaveActionPerformed(evt);
            }
        });

        btEntrar.setBackground(new java.awt.Color(51, 204, 255));
        btEntrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btEntrar.setText("ENTRAR\n");
        btEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        XdeCerrar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        XdeCerrar.setText("X");
        XdeCerrar.setBorder(null);
        XdeCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        XdeCerrar.setOpaque(true);
        XdeCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XdeCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LogoFMOcc, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Elusuario)
                            .addComponent(txtnombre)
                            .addComponent(contraxd)
                            .addComponent(txtclave, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(InicioSesion)
                            .addComponent(separador1)
                            .addComponent(separador2)))
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(XdeCerrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addComponent(LATiendaxd, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(XdeCerrar)
                .addGap(18, 18, 18)
                .addComponent(LogoFMOcc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InicioSesion)
                .addGap(18, 18, 18)
                .addComponent(Elusuario)
                .addGap(18, 18, 18)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraxd)
                .addGap(18, 18, 18)
                .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEntrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BgLayout.createSequentialGroup()
                .addComponent(LATiendaxd, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclaveActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEntrarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        x=evt.getX();
        y=evt.getY();
        
          
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x-x,point.y-y) ;
    }//GEN-LAST:event_formMouseDragged

    private void XdeCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XdeCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_XdeCerrarActionPerformed

    private void txtnombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreMousePressed
        if(txtnombre.getText().equals("Ingrese su nombre de usuario")){
        txtnombre.setText("");
        txtnombre.setForeground(Color.black);
        }
        if(String.valueOf(txtclave.getPassword()).isEmpty())
        txtclave.setText("");
        txtclave.setForeground(Color.gray);
    }//GEN-LAST:event_txtnombreMousePressed

    private void txtclaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtclaveMousePressed
        if(String.valueOf(txtclave.getPassword()).equals("")){
        txtclave.setText("");
        txtclave.setForeground(Color.black);
        }
        if(txtnombre.getText().isEmpty()){
        txtnombre.setText("Ingrese su nombre de usuario");
        txtnombre.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtclaveMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JLabel Elusuario;
    private javax.swing.JLabel InicioSesion;
    private javax.swing.JLabel LATiendaxd;
    private javax.swing.JLabel LogoFMOcc;
    private javax.swing.JButton XdeCerrar;
    private javax.swing.JButton btEntrar;
    private javax.swing.JLabel contraxd;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JPasswordField txtclave;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
