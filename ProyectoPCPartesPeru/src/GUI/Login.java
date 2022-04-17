package GUI;
import Login.Registrado;
import Login.usuarioEmpresa;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import BaseDatos.BDcomprador;

public class Login extends javax.swing.JFrame {
    
    BDcomprador compradorBD = new BDcomprador(); 
    
    public Login() {
        initComponents();
        setTitle("PCPartes");
        setLocationRelativeTo(null);
        setResizable(false);
    } 
    
    public static Registrado  r;
    public static usuarioEmpresa a;
    
    public Registrado getR() {
        return r;
    }

    public void setR(Registrado r) {
        this.r = r;
    }
    
    public void IniciarSesion_C(ArrayList<Registrado> reg){
        Iterator <Registrado> it = reg.iterator();
        Registrado re = null;
        int i = 0;
        boolean aux = true;
        while(it.hasNext()){
            re = it.next();
            if(txtUser.getText().equals(re.getUser()) && txtPass.getText().equals(re.getPass())){
                JOptionPane.showMessageDialog(null, "Ha iniciado sesión exitosamente como"
                + " comprador"+"\nBienvenido(a) "+reg.get(i).getNombre());
                r = re;
                InterfazCliente ic = new InterfazCliente();
                ic.setVisible(true);
                dispose();
                i--;
            }
            i++; 
        }
        if(i==reg.size()){
            JOptionPane.showMessageDialog(null, "Correo y/o contraseña incorrectos o inexistentes");
        }
    }    
    public void mostrarArchivo_C(){
        try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Usuarios\\usuariosRegistrados.txt"));
            ArrayList<Registrado> r1 = (ArrayList<Registrado>)entrada.readObject();
            IniciarSesion_C(r1);
            entrada.close();
        }
        catch(IOException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch(ClassNotFoundException e1){
            JOptionPane.showMessageDialog(null, e1.getMessage());
        }
    }
    
    public void IniciarSesion_E(ArrayList<usuarioEmpresa> e){
        Iterator <usuarioEmpresa> it = e.iterator();
        usuarioEmpresa r = null;
        int i=0;
        
        while(it.hasNext()){
            r = it.next();
            if(txtUser.getText().equals(r.getRUC()) && txtPass.getText().equals(r.getPass())){
                JOptionPane.showMessageDialog(null, "Ha iniciado sesión exitosamente como"
                + " empresa"+"\nBienvenida "+e.get(i).getNombre());
                a =r; //Para que los datos del usuario empresa puedan permanecer en el siguiente formulario 
                /*
                Mirar en la clase InterfazEmpresa el import static GUI.Login.a;
                A traves de eso estamos botando todos los valores de ese usuarioEmpresa en especifico para 
                realizar las respectivas funciones 
                */
                InterfazEmpresa ie = new InterfazEmpresa();
                ie.setVisible(true);
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Correo y/o contraseña incorrectos o inexistentes");
            }
        }
    }      
    
     //Para que los datos del usuario empresa puedan permanecer en el siguiente formulario 
                /*
                Mirar en la clase InterfazEmpresa el import static GUI.Login.a;
                A traves de eso estamos botando todos los valores de ese usuarioEmpresa en especifico para 
                realizar las respectivas funciones 
     */
    
    public void mostrarArchivo_E(){
        try{
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Registros\\Usuarios\\usuariosEmpresa.txt"));
            ArrayList<usuarioEmpresa> r = (ArrayList<usuarioEmpresa>)entrada.readObject();
            IniciarSesion_E(r);
            entrada.close();
        }
        catch(IOException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch(ClassNotFoundException e1){
            JOptionPane.showMessageDialog(null, e1.getMessage());
        }
    }     
    
    public void IniciarSesion_A(){        
        if(txtUser.getText().equals("Admin") && txtPass.getText().equals("FISIUNMSM")){
            System.out.println("Sesión iniciada");
            JOptionPane.showMessageDialog(null, "Ha iniciado sesión exitosamente como"
            + " administrador"+"\nBienvenido a su sistema");
            InterfazCreador iC = new InterfazCreador();
            iC.setVisible(true);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Correo y/o contraseña incorrectos");
        }
    }      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoPCPartes = new javax.swing.JLabel();
        logoUser = new javax.swing.JLabel();
        logoPass = new javax.swing.JLabel();
        labelPass = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        btnOlvido = new javax.swing.JButton();
        btnInvitado = new javax.swing.JButton();
        cbxTipoLogin = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoPCPartes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        getContentPane().add(logoPCPartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        logoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/username.png"))); // NOI18N
        getContentPane().add(logoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        logoPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pass.png"))); // NOI18N
        getContentPane().add(logoPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        labelPass.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        labelPass.setText("CONTRASEÑA");
        getContentPane().add(labelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        labelLogin.setFont(new java.awt.Font("Gadugi", 1, 60)); // NOI18N
        labelLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLogin.setText("LOGIN");
        getContentPane().add(labelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 360, -1));

        labelUser.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        labelUser.setText("USUARIO");
        getContentPane().add(labelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

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

        txtUser.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 300, 30));

        txtPass.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 300, 30));

        btnIniciarSesion.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        btnIniciarSesion.setText("INGRESAR");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 220, 40));

        btnRegistro.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        btnRegistro.setText("Registrar nuevo usuario");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 360, 40));

        btnOlvido.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        btnOlvido.setText("¿Olvidó su contraseña?");
        btnOlvido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnOlvido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 360, 40));

        btnInvitado.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        btnInvitado.setText("Ingresar como invitado");
        btnInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvitadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInvitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 360, 40));

        cbxTipoLogin.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        cbxTipoLogin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comprador", "Empresa", "Administrador" }));
        cbxTipoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoLoginActionPerformed(evt);
            }
        });
        getContentPane().add(cbxTipoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 130, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        Registro r = new Registro();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvitadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInvitadoActionPerformed

    private void btnOlvidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlvidoActionPerformed
        
    }//GEN-LAST:event_btnOlvidoActionPerformed

    private void cbxTipoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoLoginActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String tipo  = (String)cbxTipoLogin.getSelectedItem();
        if(tipo.equals("Comprador")){
            if(!"".equals(txtUser.getText()) && !"".equals(txtPass.getText())){
                mostrarArchivo_C();
                /*
                Registrado ra = compradorBD.loginComprador(txtUser.getText(),txtPass.getText());
                r = ra;
                JOptionPane.showMessageDialog(null, "Se logro la funcion select" + " NOMBRE "+ r.getNombre());            }else{    
                JOptionPane.showMessageDialog(null, "Rellene todos los campos");*/
            }
        }
        else if(tipo.equals("Empresa")){
            if(!"".equals(txtUser.getText()) && !"".equals(txtPass.getText())){
                mostrarArchivo_E();
            }
            else{
                JOptionPane.showMessageDialog(null, "Rellene todos los campos");
            }
        }
        else if(tipo.equals("Administrador")){
            if(!"".equals(txtUser.getText()) && !"".equals(txtPass.getText())){
                IniciarSesion_A();
            }
            else{
                JOptionPane.showMessageDialog(null, "Rellene todos los campos");
            }
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnInvitado;
    private static javax.swing.JButton btnOlvido;
    private static javax.swing.JButton btnRegistro;
    private javax.swing.JComboBox<String> cbxTipoLogin;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelUser;
    private javax.swing.JLabel logoPCPartes;
    private javax.swing.JLabel logoPass;
    private javax.swing.JLabel logoUser;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}