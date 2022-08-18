package FramesRecepcion;

import Datos.Agendadas;
import Datos.CorreoAgendarCita;
import Datos.DatosCitas;
import Datos.ListBook;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelAgendarCita extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();

    public PanelAgendarCita() {
        initComponents();
        comboClientes();
        tablaCitas.setModel(modelo);
        modelo.addColumn("Nombre");
        modelo.addColumn("Número");
        modelo.addColumn("Hora");
        modelo.addColumn("Fecha");
    }

 
    public void comboClientes() {

        for (int i = 0; i < ListBook.listbook.size(); i++) {
            cbClientes.addItem(ListBook.listbook.get(i).getNombre() + " " + ListBook.listbook.get(i).getApellido());
        }

    }
    public void cargarCitas() {
        modelo.setRowCount(0);
        for (int i = 0; i < Agendadas.citasAgendadas.size(); i++) {
            modelo.addRow(new Object[]{
                Agendadas.citasAgendadas.get(i).getNombre(),
                Agendadas.citasAgendadas.get(i).getNumero(),
                Agendadas.citasAgendadas.get(i).getHora(),
                Agendadas.citasAgendadas.get(i).getFecha(),});
        }
    }
    
    public void enviarCorreo() throws UnsupportedEncodingException, MessagingException {
        Date fechas = this.dtcalendar.getCalendar().getTime();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        String fecha = formato.format(fechas);
        this.lblmostrar.setText("Cita registrada para " + fecha);
            
        String asunto = "Recordatorio Cita Agendada";
        String cuerpo = cbClientes.getSelectedItem()+", la administración de City Fitness te recuerda que tienes una cita agendada a las " + cbhora.getSelectedItem()+ " el día " + fecha + 
                " ¡Te esperamos!";
        CorreoAgendarCita correo = new CorreoAgendarCita();
        
        correo.enviarMensaje(txtCorreo.getText(), asunto, cuerpo);
        
        JOptionPane.showMessageDialog(null, "Correo Enviado");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dtcalendar = new com.toedter.calendar.JCalendar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        cbhora = new javax.swing.JComboBox<>();
        btnagendar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCitas = new javax.swing.JTable();
        lblmostrar = new javax.swing.JLabel();
        cbClientes = new javax.swing.JComboBox<>();
        lbCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(102, 102, 102));
        setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cliente:");

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Teléfono:");

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Correo:");

        jLabel5.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hora:");

        txtnumero.setBackground(new java.awt.Color(187, 187, 187));
        txtnumero.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N

        cbhora.setBackground(new java.awt.Color(187, 187, 187));
        cbhora.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        cbhora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00 ", "9:00 ", "10:00 ", "11:00 ", "14:00", "15:00", "16:00", "17:00" }));

        btnagendar.setFont(new java.awt.Font("Eras Medium ITC", 1, 16)); // NOI18N
        btnagendar.setText("Agendar cita");
        btnagendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagendarActionPerformed(evt);
            }
        });

        tablaCitas.setFont(new java.awt.Font("Eras Medium ITC", 0, 13)); // NOI18N
        tablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Número", "Hora", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCitas);
        if (tablaCitas.getColumnModel().getColumnCount() > 0) {
            tablaCitas.getColumnModel().getColumn(2).setMinWidth(15);
            tablaCitas.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        lblmostrar.setFont(new java.awt.Font("Eras Medium ITC", 0, 15)); // NOI18N

        cbClientes.setBackground(new java.awt.Color(187, 187, 187));
        cbClientes.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        cbClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));

        txtCorreo.setBackground(new java.awt.Color(187, 187, 187));
        txtCorreo.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtcalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnagendar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbhora, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lbCorreo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dtcalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCorreo))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(22, 22, 22))
                            .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnagendar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(lblmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnagendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagendarActionPerformed

        //Yir. Verifico que todos los campos esten llenos.
        if (txtnumero.getText().equals("") || cbhora.getSelectedItem().equals("")|| cbClientes.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Asegúrese que todos los campos estén completos");
        
        } else {

            //instancio el objeto y se agregan los datos al Array.
            DatosCitas ag = new DatosCitas();
            
            Date fechas = this.dtcalendar.getCalendar().getTime();
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yy");
            String fecha = formato.format(fechas);
            this.lblmostrar.setText("Cita registrada para " + fecha);
            
              //Yir.Captuto datos. La fecha debe ir capturada en el formato date porque se está capturando
            //del jcalendar. En los get y set se establece que es de tipo date    
            ag.setNombre((String)cbClientes.getSelectedItem());
            ag.setNumero(txtnumero.getText());
            ag.setHora((String) cbhora.getSelectedItem());
            ag.setFecha(dtcalendar.getCalendar().getTime());
            Agendadas.citasAgendadas.add(ag);
            cargarCitas();
            JOptionPane.showMessageDialog(null, "Cita Registrada.");
            
            
            try {
                enviarCorreo();
            } catch (UnsupportedEncodingException | MessagingException ex) {
                Logger.getLogger(PanelAgendarCita.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Yir. Borro los datos una vez registrada la cita
            txtnumero.setText(null);
            txtCorreo.setText(null);
 
    }//GEN-LAST:event_btnagendarActionPerformed

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagendar;
    private javax.swing.JComboBox<String> cbClientes;
    private javax.swing.JComboBox<String> cbhora;
    private com.toedter.calendar.JCalendar dtcalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCorreo;
    private javax.swing.JLabel lblmostrar;
    private javax.swing.JTable tablaCitas;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
}
