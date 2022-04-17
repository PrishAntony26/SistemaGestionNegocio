/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import static GUI.Login.a;
import Login.DiscoDuro;
import Login.Empresa;
import Login.Inventario;
import Login.MemoriaRAM;
import Login.Menu;
import Login.PlacaMadre;
import Login.Procesador;
import Login.TarjetaVideo;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ok
 */
public class ArticulosUsuarioEmpresa extends javax.swing.JFrame {

    DefaultTableModel tabla;
    int filaSeleccionada = -1;
    Inventario i = null;
    Menu m = new Menu();
    Empresa aux = null;
    ArrayList<PlacaMadre> p = new ArrayList<PlacaMadre>();
    ArrayList<Procesador> p1 = new ArrayList<Procesador>();
    ArrayList<TarjetaVideo> p2 = new ArrayList<TarjetaVideo>();
    ArrayList<DiscoDuro> p3 = new ArrayList<DiscoDuro>();
    ArrayList<MemoriaRAM> p4 = new ArrayList<MemoriaRAM>();
    
    public ArticulosUsuarioEmpresa() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        construccionTablaColumna();
        construccionTablaContenido();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaArticulosEmpresa = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaArticulosEmpresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo ", "Dispositivo", "Marca", "Stock", "Precio unitario (S/.)"
            }
        ));
        TablaArticulosEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaArticulosEmpresaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaArticulosEmpresa);

        jLabel1.setText("Lista de dispositivos de la empresa ");

        jLabel2.setText("jLabel2");

        jButton1.setText("Eliminar dispositivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar precio ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Regresar al menú ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccione un dispositivo para realizar las funciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(295, 295, 295)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jButton2)
                                .addGap(126, 126, 126)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(jButton3)))
                        .addGap(0, 140, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(105, 105, 105))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(37, 37, 37))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TablaArticulosEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaArticulosEmpresaMouseClicked
        // Metodo para seleccionar una fila en especifico a traves del mouse
        int seleccion = TablaArticulosEmpresa.getSelectedRow();
        filaSeleccionada = seleccion;
    }//GEN-LAST:event_TablaArticulosEmpresaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(filaSeleccionada!=-1){
            System.out.println("tamaño "+ p.size());
            System.out.println("tamaño "+ p1.size());
            System.out.println("tamaño "+ p2.size());
            System.out.println("tamaño "+ p3.size());
            System.out.println("tamaño "+ p4.size());
            String nuevoMonto = JOptionPane.showInputDialog("Ingrese el nuevo monto ");
            Double monto = Double.parseDouble(nuevoMonto);
            String descripcion = (String)tabla.getValueAt(filaSeleccionada, 1);
            System.out.println(" descripcion "+ descripcion);
            int codigo = Integer.parseInt((String)tabla.getValueAt(filaSeleccionada, 0));
            System.out.println(" codigo "+ codigo);
            if(descripcion.equals("Placa madre ")){
                //Recorremos el arraylist de placa madre
                for(int j=0;j<p.size();j++){
                    if(p.get(j).getCodigo()==codigo){
                        int confirmar = JOptionPane.showConfirmDialog(this," Mostrando los datos del dispositivo" +
                                   "\n Marca "+ p.get(j).getMarca()+
                                   "\n Tipo " + p.get(j).getTipo()+
                                   "\n Antiguedad "+ p.get(j).getAntiguedad() +
                                   "\n Precio "+ p.get(j).getPrecio()+
                                   "\n Nuevo precio "+ monto +
                                   "\n ¿Está seguro de realizar los cambios? ", "Confirmar cambio de precio", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        if(confirmar == JOptionPane.YES_OPTION){
                            p.get(j).setPrecio(monto);
                            // Actualizar el arraylist de placa madre con el dinero cambiado 
                            i.actualizarDatos(p, aux);
                            //Cambio de precio en el jTable
             tabla.setValueAt(monto, filaSeleccionada, 4);
             JOptionPane.showMessageDialog(null, " Se ha realizado el cambio de precio correctamente");
                        }
                    }
                }
            }
            if(descripcion.equals("Procesador ")){
                for(int j=0;j<p1.size();j++){
                    System.out.println("codigo "+ p1.get(j).getCodigo());
                    if(p1.get(j).getCodigo()==codigo){
                        int confirmar = JOptionPane.showConfirmDialog(this," Mostrando los datos del dispositivo" +
                                   "\n Marca "+ p1.get(j).getMarca()+
                                   "\n Nucleos " + p1.get(j).getNucleos()+
                                   "\n Antiguedad "+ p1.get(j).getAntiguedad() +
                                   "\n Precio "+ p1.get(j).getPrecio()+
                                   "\n Nuevo precio "+ monto +
                                   "\n ¿Está seguro de realizar los cambios? ", "Confirmar cambio de precio", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        if(confirmar == JOptionPane.YES_OPTION){
                            p1.get(j).setPrecio(monto);
                            // Actualizar el arraylist de placa madre con el dinero cambiado 
                            i.actualizarDatosprocesador(p1, aux);
                            //Cambio de precio en el jTable
             tabla.setValueAt(monto, filaSeleccionada, 4);
             JOptionPane.showMessageDialog(null, " Se ha realizado el cambio de precio correctamente");
                        }
                    }
                }    
            }
            if(descripcion.equals("Tarjeta de video ")){
                for(int j=0;j<p2.size();j++){
                    if(p2.get(j).getCodigo()==codigo){
                        int confirmar = JOptionPane.showConfirmDialog(this," Mostrando los datos del dispositivo" +
                                   "\n Marca "+ p2.get(j).getMarca()+
                                   "\n Modelo " + p2.get(j).getModelo()+
                                   "\n Antiguedad "+ p2.get(j).getAntiguedad() +
                                   "\n Precio "+ p2.get(j).getPrecio()+
                                   "\n Nuevo precio "+ monto +
                                   "\n ¿Está seguro de realizar los cambios? ", "Confirmar cambio de precio", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        if(confirmar == JOptionPane.YES_OPTION){
                            p2.get(j).setPrecio(monto);
                            // Actualizar el arraylist de placa madre con el dinero cambiado 
                            i.actualizarDatosTarjetaV(p2, aux);
                            //Cambio de precio en el jTable
             tabla.setValueAt(monto, filaSeleccionada, 4);
             JOptionPane.showMessageDialog(null, " Se ha realizado el cambio de precio correctamente");
                        }
                    }
                }    
            }
            if(descripcion.equals("Disco duro ")){
                for(int j=0;j<p3.size();j++){
                    if(p3.get(j).getCodigo()==codigo){
                        int confirmar = JOptionPane.showConfirmDialog(this," Mostrando los datos del dispositivo" +
                                   "\n Marca "+ p3.get(j).getMarca()+
                                   "\n Tipo " + p3.get(j).getTipo()+
                                   "\n Antiguedad "+ p3.get(j).getAntiguedad() +
                                   "\n Precio "+ p3.get(j).getPrecio()+
                                   "\n Nuevo precio "+ monto +
                                   "\n ¿Está seguro de realizar los cambios? ", "Confirmar cambio de precio", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        if(confirmar == JOptionPane.YES_OPTION){
                            p3.get(j).setPrecio(monto);
                            // Actualizar el arraylist de placa madre con el dinero cambiado 
                            i.actualizarDatosDiscoDuro(p3, aux);
                            //Cambio de precio en el jTable
             tabla.setValueAt(monto, filaSeleccionada, 4);
             JOptionPane.showMessageDialog(null, " Se ha realizado el cambio de precio correctamente");
                        }
                    }
                }            
            }
                            
            if(descripcion.equals("Memoria Ram ")){
                 for(int j=0;j<p4.size();j++){
                    if(p4.get(j).getCodigo()==codigo){
                        int confirmar = JOptionPane.showConfirmDialog(this," Mostrando los datos del dispositivo" +
                                   "\n Marca "+ p4.get(j).getMarca()+
                                   "\n Tipo " + p4.get(j).getTipo()+
                                   "\n Antiguedad "+ p4.get(j).getAntiguedad() +
                                   "\n Precio "+ p4.get(j).getPrecio()+
                                   "\n Nuevo precio "+ monto +
                                   "\n ¿Está seguro de realizar los cambios? ", "Confirmar cambio de precio", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        if(confirmar == JOptionPane.YES_OPTION){
                            p4.get(j).setPrecio(monto);
                            // Actualizar el arraylist de placa madre con el dinero cambiado 
                            i.actualizarDatosMemoriaRam(p4, aux);
                            //Cambio de precio en el jTable
                            tabla.setValueAt(monto, filaSeleccionada, 4);
                            JOptionPane.showMessageDialog(null, " Se ha realizado el cambio de precio correctamente");
                        }
                    }
                }               
             }
            
        }else{
            JOptionPane.showMessageDialog(null, " Debe seleccionar un dispositivo para realizar esta accion");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        InterfazEmpresa a = new InterfazEmpresa();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void construccionTablaColumna(){
        tabla = new DefaultTableModel();
        tabla.addColumn("Codigo");
        tabla.addColumn("Marca");
        tabla.addColumn("Tipo");
        tabla.addColumn("Stock");
        tabla.addColumn("Precio unitario (S/.) ");
        this.TablaArticulosEmpresa.setModel(tabla);
    }
   
    public void construccionTablaContenido(){
        m.insertarEmpresasInventario();
        ArrayList<Empresa> e = m.getListaE();
        Empresa e1 = null;
        /*Inventario i = null;*/
        Iterator<Empresa> it = e.iterator();
        //Recorrido para saber a que empresa pertenece el usuario empresa y poder sacar todos los dispositivos que maneja
        while(it.hasNext()){
            e1 = it.next();
            if(e1.getRUC().equals(a.getRUC())){
                aux = e1;
                jLabel2.setText(e1.getNombre());
                i = e1.getInv();
                i.MemoriaRamDefecto(e1);
                i.PlacaMadreDefecto(e1);
                i.ProcesadoresDefecto(e1);
                i.DiscoDuroDefecto(e1);
                i.TarjetaVideoDefecto(e1);
                p = i.rescatarArrayListPlacaMadre(e1);
                p1 = i.rescatarArrayListProcesador(e1);
                p2 = i.rescatarArrayListTarjetaVideo(e1);
                p3 = i.rescatarArrayListDiscoDuro(e1);
                p4 = i.rescatarArrayListMemoriaRam(e1);
            }
        }
        //Insertamos los dispositivos de placa madre
        for(int j=0;j<p.size();j++){
            String[] informacionTabla = new String[5];
            //Placa Madre
            informacionTabla[0] = String.valueOf(p.get(j).getCodigo());
            informacionTabla[1] = "Placa madre ";
            informacionTabla[2] = p.get(j).getMarca();
            informacionTabla[3] = String.valueOf(p.get(j).getStockEmpresa());
            informacionTabla[4] = String.valueOf(p.get(j).getPrecio());
            tabla.addRow(informacionTabla);
        }
        //Insertamos los dispositivos de Procesador
        for(int j=0;j<p1.size();j++){
            String[] informacionTabla = new String[5];
            //Placa Madre
            informacionTabla[0] = String.valueOf(p1.get(j).getCodigo());
            informacionTabla[1] = "Procesador ";
            informacionTabla[2] = p1.get(j).getMarca();
            informacionTabla[3] = String.valueOf(p1.get(j).getStockEmpresa());
            informacionTabla[4] = String.valueOf(p1.get(j).getPrecio());
            tabla.addRow(informacionTabla);
        }
        //Insertamos los dispositivos de tarjeta de video
        for(int j=0;j<p2.size();j++){
            String[] informacionTabla = new String[5];
            informacionTabla[0] = String.valueOf(p2.get(j).getCodigo());
            informacionTabla[1] = "Tarjeta de video ";
            informacionTabla[2] = p.get(j).getMarca();
            informacionTabla[3] = String.valueOf(p2.get(j).getStockEmpresa());
            informacionTabla[4] = String.valueOf(p2.get(j).getPrecio());
            tabla.addRow(informacionTabla);
        }
        //Insertamos los dispositivos de disco duro
        for(int j=0;j<p3.size();j++){
            String[] informacionTabla = new String[5];
            informacionTabla[0] = String.valueOf(p3.get(j).getCodigo());
            informacionTabla[1] = "Disco duro ";
            informacionTabla[2] = p3.get(j).getMarca();
            informacionTabla[3] = String.valueOf(p3.get(j).getStockEmpresa());
            informacionTabla[4] = String.valueOf(p3.get(j).getPrecio());
            tabla.addRow(informacionTabla);
        }
        //Insertamos los dispositivos de memoria ram
        for(int j=0;j<p4.size();j++){
            String[] informacionTabla = new String[5];
            informacionTabla[0] = String.valueOf(p4.get(j).getCodigo());
            informacionTabla[1] = "Memoria Ram ";
            informacionTabla[2] = p4.get(j).getMarca();
            informacionTabla[3] = String.valueOf(p4.get(j).getStockEmpresa());
            informacionTabla[4] = String.valueOf(p4.get(j).getPrecio());
            tabla.addRow(informacionTabla);
        }
    }
    
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
            java.util.logging.Logger.getLogger(ArticulosUsuarioEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArticulosUsuarioEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArticulosUsuarioEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArticulosUsuarioEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArticulosUsuarioEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaArticulosEmpresa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}