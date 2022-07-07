
package FramesRecepcion;


import Datos.Agendadas;
import Datos.DatosCitas;
import java.util.Date;
import javax.swing.JOptionPane;

public class PanelAgendarCita extends javax.swing.JPanel {

    public PanelAgendarCita() {
        initComponents();
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
        tabla = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setText("Nombre:");

        jLabel3.setText("Número:");

        jLabel4.setText("Apellido:");

        jLabel5.setText("Hora:");

        cbhora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00 ", "9:00 ", "10:00 ", "11:00 ", "14:00", "15:00", "16:00", "17:00" }));

        btnagendar.setText("Agendar cita");
        btnagendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagendarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addComponent(btnagendar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbhora, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dtcalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(dtcalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnagendar)
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(33, 33, 33))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnagendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagendarActionPerformed
        

        //Yir.Captuto datos. La fecha debe ir capturada en el formato date porque se está capturando
        //del jcalendar. En los get y set se establece que es de tipo date

            String nombre = txtnombre.getText();
            String apellido = txtapellido.getText();
            Date fechaseleccionada = dtcalendar.getCalendar().getTime();
            String numero = txtnumero.getText();
            String hora = (String)cbhora.getSelectedItem(); 
            
        //Yir. Verifico que todos los campos esten llenos.
        
            if (nombre.equals("")||apellido.equals("")||numero.equals("") ||hora.equals("")){
            JOptionPane.showMessageDialog(null, "Asegúrese que todos los campos estén completos");
            }else {
                
                //instancio el objeto y se agregan los datos al Array.
                DatosCitas ag = new DatosCitas();
                ag.setNombre(nombre);
                ag.setApellido(apellido);
                ag.setNumero (numero);
                ag.setHora(hora);
                ag.setFecha(fechaseleccionada);
                Agendadas.citasAgendadas.add(ag);

                JOptionPane.showMessageDialog(null, "Cita Registrada.");
           
                
            //Yir. Aquí le dejo el for para que vea que los datos si están entrando en el Array 
           
                for (int i = 0; i < Agendadas.citasAgendadas.size(); i++){
                    System.out.println("\nCita: " + i);
                    System.out.println("Nombre: " + Agendadas.citasAgendadas.get(i).getNombre());
                    System.out.println("Apellido: " + Agendadas.citasAgendadas.get(i).getApellido());
                    System.out.println("Numero: " + Agendadas.citasAgendadas.get(i).getNumero());
                    System.out.println("Hora: " +Agendadas.citasAgendadas.get(i).getHora());
                }
                
                
            }
            
        
    }//GEN-LAST:event_btnagendarActionPerformed
        /** Yir
         * NOTITA: la fecha va a salir en un formato raro, no se preocupe 
        por eso yo después lo arreglo :p
        
        * NOTITA2: la tabla no sale completa, pero no me dio tiempo de tocarle las dimensiones 
        a la ventana jaja
        * 
        * NOTITA3: por ahora se ve horrible, yo después lo arreglo también
        
        */
    

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
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
}
