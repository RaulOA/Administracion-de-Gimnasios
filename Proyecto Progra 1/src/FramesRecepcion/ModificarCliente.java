package FramesRecepcion;

import Datos.BaseDeDatos;
import Datos.ListBook;
import java.io.IOException;

public class ModificarCliente extends javax.swing.JFrame {

    int filaSeleccionada;

    public ModificarCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtmCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtmNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtmApellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtmEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbmGenero = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtmPeso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtmAltura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtmTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtmPadecimientos = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Datos");
        setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel2.setText("Cédula:");

        txtmCedula.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        txtmNombre.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        txtmApellido.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel1.setText("Edad:");

        txtmEdad.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel5.setText("Género:");

        cbmGenero.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        cbmGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        cbmGenero.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel6.setText("Peso:");

        txtmPeso.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel7.setText("Altura:");

        txtmAltura.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        txtmAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmAlturaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel8.setText("Teléfono:");

        txtmTelefono.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel9.setText("Padecimientos:");

        txtmPadecimientos.setColumns(20);
        txtmPadecimientos.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        txtmPadecimientos.setRows(5);
        jScrollPane2.setViewportView(txtmPadecimientos);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Eras Medium ITC", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Aplicar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtmCedula)
                                    .addComponent(txtmNombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtmPeso)
                                    .addComponent(cbmGenero, 0, 173, Short.MAX_VALUE)
                                    .addComponent(txtmEdad)
                                    .addComponent(txtmApellido))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtmAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtmTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                            .addComponent(jLabel9))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtmNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtmApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtmEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbmGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtmPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtmAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtmTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // este metodo captura los nuevos datos y actualiza el arraylist y la tabla
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        ListBook.listbook.get(filaSeleccionada).setID(txtmCedula.getText());
        ListBook.listbook.get(filaSeleccionada).setNombre(txtmNombre.getText());
        ListBook.listbook.get(filaSeleccionada).setApellido(txtmApellido.getText());
        ListBook.listbook.get(filaSeleccionada).setEdad(txtmEdad.getText());
        ListBook.listbook.get(filaSeleccionada).setGenero(cbmGenero.getSelectedItem().toString());
        ListBook.listbook.get(filaSeleccionada).setPeso(txtmPeso.getText());
        ListBook.listbook.get(filaSeleccionada).setAltura(txtmAltura.getText());
        ListBook.listbook.get(filaSeleccionada).setTelefono(txtmTelefono.getText());
        ListBook.listbook.get(filaSeleccionada).setPadecimientos(txtmPadecimientos.getText());
        PanelListaClientes j = new PanelListaClientes();
        j.cargarDatos();

        BaseDeDatos t = new BaseDeDatos();
        try {
            t.refrescarBD();
        } catch (IOException ex) {
            System.out.println("Error al refrescar Base de datos");
        }

        this.dispose();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtmAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmAlturaActionPerformed

    // este metodo hace que los datos del cliente seleccionado se repliquen en sus respectivas cajas de texto
    public void modificar(String id, String no, String ap, String ed, String ge, String pe, String al, String te, String pa, int fila) {
        txtmCedula.setText(id);
        txtmNombre.setText(no);
        txtmApellido.setText(ap);
        txtmEdad.setText(ed);
        cbmGenero.setSelectedItem(ge);
        txtmPeso.setText(pe);
        txtmAltura.setText(al);
        txtmTelefono.setText(te);
        txtmPadecimientos.setText(pa);
        this.filaSeleccionada = fila;
    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbmGenero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtmAltura;
    private javax.swing.JTextField txtmApellido;
    private javax.swing.JTextField txtmCedula;
    private javax.swing.JTextField txtmEdad;
    private javax.swing.JTextField txtmNombre;
    private javax.swing.JTextArea txtmPadecimientos;
    private javax.swing.JTextField txtmPeso;
    private javax.swing.JTextField txtmTelefono;
    // End of variables declaration//GEN-END:variables
}
