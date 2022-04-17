package GUI;

import static GUI.Login.a;
import javax.swing.JOptionPane;

public class InterfazEmpresa extends javax.swing.JFrame {
    
    public InterfazEmpresa() {
        initComponents();
        setTitle("PCPartes - Empresa");
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoPCPartes = new javax.swing.JLabel();
        labelInterfaz = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnProveedores = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnArticulos = new javax.swing.JButton();
        btnContabilidad = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoPCPartes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        getContentPane().add(logoPCPartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        labelInterfaz.setFont(new java.awt.Font("Gadugi", 1, 60)); // NOI18N
        labelInterfaz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelInterfaz.setText("INTERFAZ EMPRESA");
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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 650));

        btnProveedores.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Proveedores.png"))); // NOI18N
        btnProveedores.setText("Proveedores");
        btnProveedores.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnProveedores.setPreferredSize(new java.awt.Dimension(250, 80));
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        btnClientes.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verClientes.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnClientes.setPreferredSize(new java.awt.Dimension(250, 80));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        btnArticulos.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        btnArticulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Articulos.png"))); // NOI18N
        btnArticulos.setText("Artículos");
        btnArticulos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnArticulos.setPreferredSize(new java.awt.Dimension(250, 80));
        btnArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArticulosActionPerformed(evt);
            }
        });
        getContentPane().add(btnArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

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
        
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        VisualizarClientes VC = new VisualizarClientes();
        VC.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        Login l = new Login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArticulosActionPerformed
        ArticulosUsuarioEmpresa aUE = new ArticulosUsuarioEmpresa();
        aUE.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnArticulosActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArticulos;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnContabilidad;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelInterfaz;
    private javax.swing.JLabel logoPCPartes;
    // End of variables declaration//GEN-END:variables
}