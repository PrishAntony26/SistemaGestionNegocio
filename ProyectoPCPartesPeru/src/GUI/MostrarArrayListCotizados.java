/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.DispositivosCotizar.Placa;
import static GUI.Login.r;
import Login.PlacaMadre;
import Login.Registrado;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import Login.Cliente;
import Login.Empresa;
import Login.HistorialVenta;
import Login.Inventario;
import Login.Menu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ok
 */
public class MostrarArrayListCotizados extends javax.swing.JFrame {

    DefaultTableModel tabla;
    int filaSeleccionada;
    
    public MostrarArrayListCotizados() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        ConstrucciondeTablaPorDefecto();
        DatosEnTabla();
        
        /*
        Matriz();
        */
    }
    Menu m = new Menu();
    Cliente c = new Cliente(m);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPMcotizados = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaPMcotizados.setBorder(new javax.swing.border.MatteBorder(null));
        TablaPMcotizados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Marca", "Tipo", "Antiguedad", "Empresa", "Stock", "Precio"
            }
        ));
        TablaPMcotizados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPMcotizadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaPMcotizados);

        jButton1.setText("Realizar compra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Lista de dispositivos cotizados ");

        jLabel2.setText("Nombre de la empresa");

        jLabel3.setText("Codigo del producto");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Cantidad que desea comprar");

        jButton2.setText("Calcular el precio total");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Volver al menu principal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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
                        .addGap(309, 309, 309)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addContainerGap(331, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(144, 144, 144))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(33, 33, 33))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<String> nombreEmpresaComprada = new ArrayList<String>(1);
        ArrayList<Integer> codigoArticuloComprado = new ArrayList<Integer>(1);
        ArrayList<String> descripcionArticulo = new ArrayList<String>(1);
        ArrayList<Double> precioArticuloComprado = new ArrayList<Double>(1);
        ArrayList<Integer> cantidadCompradaArticulo = new ArrayList<Integer>(1);
        int nArticulo;
        String nombre;
        int cod;
        String descripcion;
        double precioUnitario;
        int cantidadC;
        if(!"".equals(jTextField1.getText())&&!"".equals(jTextField2.getText())&&!"".equals(jTextField3.getText())){
            int contadorAux=0;
            for(int contador= 0;contador<Placa.size();contador++){
                //Para buscar a la placa madre en especifico que se va a comprar 
                if(Placa.get(contador).getnEmpresa().equals(jTextField1.getText())&&Placa.get(contador).getCodigo()==Integer.parseInt(jTextField2.getText())){
                    nombre = Placa.get(contador).getnEmpresa();
                    nombreEmpresaComprada.add(nombre);
                    cod =  Placa.get(contador).getCodigo();
                    codigoArticuloComprado.add(cod);
                    descripcion = "Placa madre "+Placa.get(contador).getMarca();
                    descripcionArticulo.add(descripcion);
                    precioUnitario = Placa.get(contador).getPrecio();
                    precioArticuloComprado.add(precioUnitario);
                    cantidadC = Integer.parseInt(jTextField3.getText());
                    cantidadCompradaArticulo.add(cantidadC);
                    //Para revisar si el stock de la empresa alcanza para lo que esta pidiendo el comprador
                   if(Placa.get(contador).getStockEmpresa()>=Integer.parseInt(jTextField3.getText())){
                       Double d =  Double.parseDouble(jTextField4.getText());
                       System.out.println(r.getDinero());
                       //Para revisar si el dinero del comprador le alcanza al momento de comprar el dispositivo 
                       if(r.getDinero()>=d){
                           int respuesta = JOptionPane.showConfirmDialog(this," Mostrando los datos del dispositivo" +
                                   "\n Marca "+ Placa.get(contador).getMarca()+
                                   "\n Tipo " + Placa.get(contador).getTipo()+
                                   "\n Antiguedad "+ Placa.get(contador).getAntiguedad() +
                                   "\n Precio Total "+ jTextField4.getText() , "Confirmar venta", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                           if(respuesta == JOptionPane.YES_OPTION){
                               //Cambiamos la apariencia del 
                               //Cambio de dinero de un registrado en el arraylist de registrados y añadir la nueva compra en la lista de compras
                               double dinero = r.getDinero();
                               r.setDinero(r.getDinero()-Double.parseDouble(jTextField4.getText()));
                               ArrayList<Registrado> aux = new ArrayList<Registrado>();
                               aux = c.rescatarRegistrados();
                               Iterator<Registrado> it = aux.iterator();
                               Registrado a = null;
                               int contadorRegistrado = 0;
                               while(it.hasNext()){
                                   a = it.next();
                                   if(a.getUser().equals(r.getUser())&&a.getPass().equals(r.getPass())){
                                       //Reducimos el dinero del registrado y le agregamos su nueva factura por la compra realizada
                                       aux.get(contadorRegistrado).setDinero(dinero-Double.parseDouble(jTextField4.getText()));
                                       aux.get(contadorRegistrado).añadirFactura(nombreEmpresaComprada, codigoArticuloComprado, descripcionArticulo, precioArticuloComprado, cantidadCompradaArticulo, 1);
                                   }
                                   contadorRegistrado++;
                               }
                               //Con este metodo vamos a escribir el arraylist nuevo ya que se ha modificado el anterior en el dinero que tiene
                               //uno de ellos por que realizo una compra y tambien vamos a almacenar la nueva factura 
                               c.leerCambioDineroRegistrado(aux);
                               
                               //Cambio de stock de un prodcuto de una empresa del arraylist productos de empresa 
                               Menu m = new Menu();
                               ArrayList<Empresa> aux1 = new ArrayList<Empresa>();
                               m.insertarEmpresasInventario();
                               aux1 = m.getListaE();
                               Inventario i;
                               Iterator<Empresa> it5 = aux1.iterator();
                                Empresa empr = null;
                                Empresa aux2 = null;
                                Inventario in = null;
                                while(it5.hasNext()){
                                    empr = it5.next();
                                    if(empr.getNombre().equals(jTextField1.getText())){
                                        in = empr.getInv();
                                        ArrayList<PlacaMadre> aux3 = new ArrayList<PlacaMadre>();
                                        aux2 = empr;
                                        //Hacemos la escritura del archivo arraylist placa madre de una empresa para modificar el stock de la placa
                                        //madre en concreto que se ha comprado 
                                        aux3 = in.rescatarArrayListPlacaMadre(empr);
                                        int p = 0;
                                        Iterator<PlacaMadre> it6 = aux3.iterator();
                                        PlacaMadre pMD = null;
                                        while(it6.hasNext()){
                                            pMD = it6.next();
                                            // Se recorreran todo el arraylist de placa madre y a traves de la sentencia if (la cual comparará si 
                                            // el código de una de ellas coincide con el código del elemento el cual el comprador ha elegido) 
                                            // Si se cumple eso entonces ya tendriamos a nuestra placa madre que queremos y debemos cambiarle el stock
                                            if(pMD.getCodigo()==Integer.parseInt(jTextField2.getText())){
                                                 aux3.get(p).setStockEmpresa(aux3.get(p).getStockEmpresa()-Integer.parseInt(jTextField3.getText()));
                                            }
                                            p++;
                                        }
                                        in.actualizarDatos(aux3, empr);
                                        /*
                                        Con esto se actualizara en los archivos el stock de memoria ram 
                                        Aqui podria ir la funcion de generar una factura para la empresa 
                                        */
                                        // Añadir una nueva fila a la seccion de historial venta 
                                        
                                    }
                                }
                                //Para guardar el regitro de venta 
                                HistorialVenta h = new HistorialVenta(r.getNombre(), r.getDNI(), "Placa madre", Placa.get(contador).getPrecio(), 
                                        Placa.get(contador).getCodigo(), Integer.parseInt(jTextField3.getText()), Double.parseDouble(jTextField4.getText()));
                                if(Placa.get(contador).getnEmpresa().equals("TECHCOMPU")){
                                          c.EscrituraHistorialVenta(aux2,h);
                                }if(Placa.get(contador).getnEmpresa().equals("Yamoshi")){
                                          c.EscrituraHistorialVenta(aux2,h);
                                }if(Placa.get(contador).getnEmpresa().equals("MiPClista")){
                                          c.EscrituraHistorialVenta(aux2,h);
                                }
                                /*
                                CAMBIO DE STOCK EN EL JTABLE
                                Primero sacamos el Stock que queremos en especifico a traves de 
                                .getValueAt(filaSeleccionada, 5) el cual lleva como parametros el
                                filaSeleccionada que es lo que apuntara el cursor luego le indicaremos 
                                que columna exactamente queremos sacar y como queremos el stock esa se 
                                ubica en la columna 5
                                */
                                String sacarStock = (String)tabla.getValueAt(filaSeleccionada, 5);
                                int convertido = Integer.parseInt(sacarStock);
                                convertido = convertido -Integer.parseInt(jTextField3.getText());
                                tabla.setValueAt(convertido, filaSeleccionada, 5);
                                
                                // Por ultimo limpiamos los valores de compra que se digito 
                                limpiarJText();
                                   
                               
                                 
                               JOptionPane.showMessageDialog(null," La compra se ha realizado con exito ");
                           }
                       }else{
                           JOptionPane.showMessageDialog(null," No cuenta con suficiente dinero para realizar la compra");
                       }
                   }else{
                       JOptionPane.showMessageDialog(null, " No se tiene suficiente stock del producto para la venta ");
                   }
                }

            }
        }else{
            JOptionPane.showMessageDialog(null, "Rellene todos los campos de compra ");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void limpiarJText(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!"".equals(jTextField1.getText())&&!"".equals(jTextField2.getText())&&!"".equals(jTextField3.getText())){
            for(int contador= 0;contador<Placa.size();contador++){
                if(Placa.get(contador).getnEmpresa().equals(jTextField1.getText())&&Placa.get(contador).getCodigo()==Integer.parseInt(jTextField2.getText())){
                    Placa.get(contador).getPrecio();
                    jTextField4.setText(String.valueOf(Placa.get(contador).getPrecio()*Double.parseDouble(jTextField3.getText())));
                    jTextField4.getText();
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Rellene todos los campos de compra ");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        InterfazCliente a = new InterfazCliente();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TablaPMcotizadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPMcotizadosMouseClicked
        //METODO PARA SELECCIONAR UNA FILA EN ESPECIFICO
        int seleccion = TablaPMcotizados.getSelectedRow();
        jTextField1.setText(TablaPMcotizados.getValueAt(seleccion, 4).toString());
        jTextField2.setText(TablaPMcotizados.getValueAt(seleccion, 0).toString());
        /*
        Nos llevamos este valor ya que cuando querramos actualizar el stock cuando se venda sera en la fila en la cual se ha 
        seleccionado con el cursor 
        */
        filaSeleccionada = seleccion;
    }//GEN-LAST:event_TablaPMcotizadosMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void cambiarTotal(String a,String b){
        
    }
    
    /*
    public void Matriz(){
        DefaultTableModel tabla;
        String m[][] = new String[Placa.size()][7];
        for (int i = 0; i < Placa.size(); i++) {
            m[i][0] = String.valueOf(Placa.get(i).getCodigo());
            m[i][1] = Placa.get(i).getMarca();
            m[i][2] = Placa.get(i).getTipo();
            m[i][3] = String.valueOf(Placa.get(i).getAntiguedad());
            m[i][4] = Placa.get(i).getnEmpresa();
            m[i][5] = String.valueOf(Placa.get(i).getStockEmpresa());
            m[i][6] = String.valueOf(Placa.get(i).getPrecio());
        }
        TablaPMcotizados.setModel(new javax.swing.table.DefaultTableModel(
            m,
            new String [] {
                "Codigo", "Marca", "Tipo", "Antiguedad", "Empresa", "Stock", "Precio"
            }
        ));
    }
    */
 
    public void ConstrucciondeTablaPorDefecto(){
        tabla = new DefaultTableModel();
        tabla.addColumn("Codigo");
        tabla.addColumn("Marca");
        tabla.addColumn("Tipo");
        tabla.addColumn("Antiguedad");
        tabla.addColumn("Empresa");
        tabla.addColumn("Stock");
        tabla.addColumn("Precio");
        this.TablaPMcotizados.setModel(tabla);
    }
        
    public void DatosEnTabla(){
        for(int i=0;i<Placa.size();i++){
           String[] informacion= new String[7];
           informacion[0] = String.valueOf(Placa.get(i).getCodigo());;
           informacion[1] = Placa.get(i).getMarca();
           informacion[2] = Placa.get(i).getTipo();
           informacion[3] = String.valueOf(Placa.get(i).getAntiguedad());
           informacion[4] = Placa.get(i).getnEmpresa();
           informacion[5] = String.valueOf(Placa.get(i).getStockEmpresa());
           informacion[6] = String.valueOf(Placa.get(i).getPrecio());
           tabla.addRow(informacion);
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(MostrarArrayListCotizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarArrayListCotizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarArrayListCotizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarArrayListCotizados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarArrayListCotizados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPMcotizados;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
