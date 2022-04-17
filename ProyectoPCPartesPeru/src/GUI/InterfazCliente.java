package GUI;
/*
import static GUI.Login.r;
*/
import static GUI.Login.r;
import Login.Cliente;
import Login.Registrado;
import java.util.ArrayList;
import java.util.Iterator;
import BaseDatos.BDcomprador;

public class InterfazCliente extends javax.swing.JFrame {
    
    
    public InterfazCliente() {
        initComponents();
        setTitle("PCPartes - Cliente");
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    //Instancia de cliente
    Cliente c = new Cliente();
    //Instancia de la base de datos de los clientes
    BDcomprador a = new BDcomprador();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoPCPartes = new javax.swing.JLabel();
        labelInterfaz = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnRetirarDinero = new javax.swing.JButton();
        btnCotizar = new javax.swing.JButton();
        btnFacturas = new javax.swing.JButton();
        btnContabilidad = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoPCPartes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        getContentPane().add(logoPCPartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        labelInterfaz.setFont(new java.awt.Font("Gadugi", 1, 60)); // NOI18N
        labelInterfaz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInterfaz.setText("INTERFAZ CLIENTE");
        getContentPane().add(labelInterfaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 620, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 650));

        btnRetirarDinero.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnRetirarDinero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/retirarDinero.png"))); // NOI18N
        btnRetirarDinero.setText("Retirar dinero");
        btnRetirarDinero.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRetirarDinero.setPreferredSize(new java.awt.Dimension(250, 80));
        btnRetirarDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarDineroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetirarDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        btnCotizar.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnCotizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cotizar.png"))); // NOI18N
        btnCotizar.setText("Cotizar y comprar");
        btnCotizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCotizar.setPreferredSize(new java.awt.Dimension(250, 80));
        btnCotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCotizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        btnFacturas.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnFacturas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Facturas.png"))); // NOI18N
        btnFacturas.setText("Facturas");
        btnFacturas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnFacturas.setPreferredSize(new java.awt.Dimension(250, 80));
        btnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturasActionPerformed(evt);
            }
        });
        getContentPane().add(btnFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        btnContabilidad.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnContabilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Contabilidad.png"))); // NOI18N
        btnContabilidad.setText("Contabilidad");
        btnContabilidad.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnContabilidad.setPreferredSize(new java.awt.Dimension(250, 80));
        getContentPane().add(btnContabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, -1, -1));

        btnConfiguracion.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Configuración.png"))); // NOI18N
        btnConfiguracion.setText("Configuración");
        btnConfiguracion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnConfiguracion.setPreferredSize(new java.awt.Dimension(250, 80));
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));

        btnCerrarSesion.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar sesión");
        btnCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(250, 80));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        ConfiguracionCliente c = new ConfiguracionCliente();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnCotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizarActionPerformed
       DispositivosCotizar d = new DispositivosCotizar();
       d.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnCotizarActionPerformed

    private void btnRetirarDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarDineroActionPerformed
       c.recargarDinero(r);
       //a.loginComprador(r.getUser(), apass);
    }//GEN-LAST:event_btnRetirarDineroActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        Login l = new Login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturasActionPerformed
        HistorialCompras a = new HistorialCompras();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFacturasActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnContabilidad;
    private javax.swing.JButton btnCotizar;
    private javax.swing.JButton btnFacturas;
    private javax.swing.JButton btnRetirarDinero;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelInterfaz;
    private javax.swing.JLabel logoPCPartes;
    // End of variables declaration//GEN-END:variables
}