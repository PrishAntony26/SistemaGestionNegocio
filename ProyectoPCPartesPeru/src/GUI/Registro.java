package GUI;
import Login.Empresa;
import Login.Registrado;
import Login.usuarioEmpresa;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Login.Menu;
import java.util.Iterator;
import BaseDatos.BDcomprador;

public class Registro extends javax.swing.JFrame {
    
    public Registro() {
        initComponents();
        setTitle("PCPartes - Registro");
        setLocationRelativeTo(null);
        setResizable(false);
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoPCPartes = new javax.swing.JLabel();
        labelRegistro = new javax.swing.JLabel();
        labelTipo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        labelNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        labelDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        labelDocumento = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        labelTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        labelUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        labelPass = new javax.swing.JLabel();
        cbxtipoUsuario = new javax.swing.JComboBox<>();
        txtPass = new javax.swing.JPasswordField();
        btnRetroceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 650));
        setPreferredSize(new java.awt.Dimension(650, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoPCPartes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        getContentPane().add(logoPCPartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        labelRegistro.setFont(new java.awt.Font("Gadugi", 1, 60)); // NOI18N
        labelRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRegistro.setText("REGISTRO");
        getContentPane().add(labelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 360, -1));

        labelTipo.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        labelTipo.setText("TIPO DE USUARIO");
        getContentPane().add(labelTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(650, 650));

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

        btnRegistrar.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 230, 40));

        labelNombre.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        labelNombre.setText("NOMBRE");
        getContentPane().add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        txtNombre.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 270, 30));

        labelDireccion.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        labelDireccion.setText("DIRECCIÓN");
        getContentPane().add(labelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        txtDireccion.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 250, 30));

        labelDocumento.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        labelDocumento.setText("DNI");
        getContentPane().add(labelDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        txtDocumento.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 230, 30));

        labelTelefono.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        labelTelefono.setText("TELÉFONO");
        getContentPane().add(labelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 250, 30));

        labelUser.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        labelUser.setText("USUARIO");
        getContentPane().add(labelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, -1, -1));

        txtUser.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 270, 30));

        labelPass.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        labelPass.setText("CONTRASEÑA");
        getContentPane().add(labelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, -1, -1));

        cbxtipoUsuario.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        cbxtipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comprador", "Empresa" }));
        cbxtipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxtipoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(cbxtipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 180, 30));

        txtPass.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 220, 30));

        btnRetroceder.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        btnRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        btnRetroceder.setContentAreaFilled(false);
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 190, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    BDcomprador bdcomprador = new BDcomprador();
    Menu m = new Menu();
    private final ArrayList <Registrado> usuariosR = new ArrayList<>();
    private final ArrayList<usuarioEmpresa> usuariosE = new ArrayList<>();
    
    public ArrayList<Registrado> rescatarRegistrados(){
        try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Usuarios\\usuariosRegistrados.txt"));
            ArrayList<Registrado> r = (ArrayList<Registrado>)entrada.readObject();
            return r;
        }
        catch(IOException | ClassNotFoundException e){
            return null;
        }  
    }
    
    public ArrayList<usuarioEmpresa> rescatarusuarioEmpresa(){
        try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Usuarios\\usuariosEmpresa.txt"));
            ArrayList<usuarioEmpresa> r = (ArrayList<usuarioEmpresa>)entrada.readObject();
            return r;
        }
        catch(IOException | ClassNotFoundException e){
            return null;
        }  
    }    
    
    public void vaciarJTextField(){
        txtNombre.setText("");
        txtDireccion.setText("");
        txtDocumento.setText("");
        txtTelefono.setText("");
        txtUser.setText("");
        txtPass.setText("");    
    }
    
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String tipo  = (String)cbxtipoUsuario.getSelectedItem();
        if(tipo.equals("Comprador")){
            if(!"".equals(txtNombre.getText()) && !"".equals(txtDireccion.getText()) 
                && !"".equals(txtDocumento.getText()) && !"".equals(txtTelefono.getText()) 
                && !"".equals(txtUser.getText()) && !"".equals(txtPass.getText()))
            {
                double dinero = 0;
                
                Registrado r = new Registrado(Long.parseLong(txtTelefono.getText()),
                txtDireccion.getText(), txtNombre.getText(), Integer.parseInt(txtDocumento.getText()), 
                txtUser.getText(), txtPass.getText(), dinero);
                //Con esta sentencia estamos haciendo que se registre el comprador en la base de datos 
                //bdcomprador.registrarComprador(r);
                
                
                Registrado re = r;
                ArrayList<Registrado> aux2 = rescatarRegistrados();
                
                if(aux2==null){
                    try{
                        usuariosR.add(re);
                        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Usuarios\\usuariosRegistrados.txt"))) {
                            salida.writeObject(usuariosR);
                        }
                    }
                    catch(IOException e){
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
                else{
                    try{
                    aux2.add(re);
                    ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Usuarios\\usuariosRegistrados.txt"));
                    salida.writeObject(aux2);
                    salida.close();
                    }
                    catch(IOException e){
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }                
                JOptionPane.showMessageDialog(null, "Cuenta creada con éxito");
                vaciarJTextField();
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Rellene todos los campos");
            }
        }
        else if(tipo.equals("Empresa")){
            if(!"".equals(txtNombre.getText()) && !"".equals(txtUser.getText()) 
                && !"".equals(txtPass.getText()))
            {
                m.insertarEmpresasInventario();
                ArrayList<Empresa> aux = new ArrayList<Empresa>();
                aux = m.getListaE();
                Empresa e1 = null;
                Iterator<Empresa> it = aux.iterator();
                while(it.hasNext()){
                    e1 = it.next();
                    if(e1.getRUC().equals(txtUser.getText())){
                       usuarioEmpresa empresa = new usuarioEmpresa(txtUser.getText(),
                       txtNombre.getText(), txtPass.getText());
                
                       usuarioEmpresa ra = empresa;
                       ArrayList<usuarioEmpresa> aux2 = rescatarusuarioEmpresa();
                
                       if(aux2==null){
                       try{
                       usuariosE.add(ra);
                          try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Usuarios\\usuariosEmpresa.txt"))) {
                            salida.writeObject(usuariosE);
                            }
                           }
                        catch(IOException e){
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
                else{
                    try{
                    aux2.add(ra);
                        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Usuarios\\usuariosEmpresa.txt"))) {
                            salida.writeObject(aux2);
                        }
                    }
                    catch(IOException e){
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
                JOptionPane.showMessageDialog(null, "Cuenta creada con éxito"
                + "\nRecuerde que su usuario es su número de RUC");
                vaciarJTextField();
                        
                        
                    }
                }
                /*
                usuarioEmpresa empresa = new usuarioEmpresa(txtUser.getText(),
                txtNombre.getText(), txtPass.getText());
                
                usuarioEmpresa ra = empresa;
                ArrayList<usuarioEmpresa> aux2 = rescatarusuarioEmpresa();
                
                if(aux2==null){
                    try{
                    usuariosE.add(ra);
                        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Usuarios\\usuariosEmpresa.txt"))) {
                            salida.writeObject(usuariosE);
                        }
                    }
                    catch(IOException e){
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
                else{
                    try{
                    aux2.add(ra);
                        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("Registros\\Usuarios\\usuariosEmpresa.txt"))) {
                            salida.writeObject(aux2);
                        }
                    }
                    catch(IOException e){
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
                JOptionPane.showMessageDialog(null, "Cuenta creada con éxito"
                + "\nRecuerde que su usuario es su número de RUC");
                vaciarJTextField();
                */
            }
            else{
                JOptionPane.showMessageDialog(null, "Rellene todos los campos");
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed
    
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void cbxtipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxtipoUsuarioActionPerformed
        String tipo = (String)cbxtipoUsuario.getSelectedItem();
        if(tipo.equals("Comprador")){
            labelDireccion.setEnabled(true);
            txtDireccion.setEnabled(true);
            labelDocumento.setEnabled(true);
            txtDocumento.setEnabled(true);
            labelTelefono.setEnabled(true);
            txtTelefono.setEnabled(true);
            labelUser.setText("USUARIO");
        }
        if(tipo.equals("Empresa")){
            labelDireccion.setEnabled(false);
            txtDireccion.setEnabled(false);
            labelDocumento.setEnabled(false);
            txtDocumento.setEnabled(false);
            labelTelefono.setEnabled(false);
            txtTelefono.setEnabled(false);
            labelUser.setText("RUC");
        }
    }//GEN-LAST:event_cbxtipoUsuarioActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        Login l = new Login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRetrocederActionPerformed

    /**
     * @param args thew command line arguments
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private static javax.swing.JButton btnRetroceder;
    private javax.swing.JComboBox<String> cbxtipoUsuario;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelDocumento;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelRegistro;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel labelUser;
    private javax.swing.JLabel logoPCPartes;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}