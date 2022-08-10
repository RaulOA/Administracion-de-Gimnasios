package FramesRecepcion;

import Datos.Agendadas;
import Datos.DatosCitas;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelAgendarCita extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();

    public PanelAgendarCita() {
        initComponents();
        tablaCitas.setModel(modelo);
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Número");
        modelo.addColumn("Hora");
        modelo.addColumn("Fecha");
    }

    public void cargarCitas() {
        modelo.setRowCount(0);
        for (int i = 0; i < Agendadas.citasAgendadas.size(); i++) {
            modelo.addRow(new Object[]{
                Agendadas.citasAgendadas.get(i).getNombre(),
                Agendadas.citasAgendadas.get(i).getApellido(),
                Agendadas.citasAgendadas.get(i).getNumero(),
                Agendadas.citasAgendadas.get(i).getHora(),
                Agendadas.citasAgendadas.get(i).getFecha(),});
        }
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
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        cbhora = new javax.swing.JComboBox<>();
        btnagendar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCitas = new javax.swing.JTable();
        lblmostrar = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(102, 102, 102));
        setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Teléfono:");

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hora:");

        txtnombre.setBackground(new java.awt.Color(187, 187, 187));
        txtnombre.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N

        txtapellido.setBackground(new java.awt.Color(187, 187, 187));
        txtapellido.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N

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
                "Nombre", "Apellido", "Número", "Hora", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCitas);
        if (tablaCitas.getColumnModel().getColumnCount() > 0) {
            tablaCitas.getColumnModel().getColumn(3).setMinWidth(15);
            tablaCitas.getColumnModel().getColumn(3).setPreferredWidth(20);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dtcalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbhora, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addComponent(btnagendar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(lblmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(dtcalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnagendar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblmostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnagendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagendarActionPerformed

        //Yir. Verifico que todos los campos esten llenos.
        if (txtnombre.getText().equals("") || txtapellido.getText().equals("") || txtnumero.getText().equals("") || cbhora.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Asegúrese que todos los campos estén completos");
        
        } else {

            //instancio el objeto y se agregan los datos al Array.
            DatosCitas ag = new DatosCitas();
            Date fechas = this.dtcalendar.getCalendar().getTime();
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM");
            String fecha = formato.format(fechas);
            this.lblmostrar.setText(fecha);
            
              //Yir.Captuto datos. La fecha debe ir capturada en el formato date porque se está capturando
            //del jcalendar. En los get y set se establece que es de tipo date    
            ag.setNombre(txtnombre.getText());
            ag.setApellido(txtapellido.getText());
            ag.setNumero(txtnumero.getText());
            ag.setHora((String) cbhora.getSelectedItem());
            ag.setFecha(dtcalendar.getCalendar().getTime());
            Agendadas.citasAgendadas.add(ag);
            verificar();

            //Yir. Borro los datos una vez registrada la cita
            txtnombre.setText(null);
            txtapellido.setText(null);
            txtnumero.setText(null);
        }

     

    }//GEN-LAST:event_btnagendarActionPerformed

    public void verificar(){
        boolean verificar = false;
        String hora = (String)cbhora.getSelectedItem();
        Date fechaS = dtcalendar.getCalendar().getTime();
        
        for (int i = 0; i < Agendadas.citasAgendadas.size(); i++) {
            if ((Agendadas.citasAgendadas.get(i).equals(hora)) && (Agendadas.citasAgendadas.get(i).equals(fechaS))){
                verificar = true;
            }else{
                verificar = false;
            }
        }
        
        System.out.println(verificar);
        if (verificar == false){
            JOptionPane.showMessageDialog(null, "Cita Registrada.");
            cargarCitas();
        }else{
            JOptionPane.showMessageDialog(null, "La cita disponible este día en este horario se encuentra agendada.");
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagendar;
    private javax.swing.JComboBox<String> cbhora;
    private com.toedter.calendar.JCalendar dtcalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblmostrar;
    private javax.swing.JTable tablaCitas;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
}
