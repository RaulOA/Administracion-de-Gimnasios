
package FramesRecepcion;


import Datos.Agendadas;
import Datos.DatosCitas;
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
        modelo.addColumn("Numero");
        modelo.addColumn("Hora");
        modelo.addColumn("Fecha");
    }
    
    public void cargarCitas(){
        modelo.setRowCount(0);
        for (int i = 0; i < Agendadas.citasAgendadas.size(); i++) {
            modelo.addRow(new Object[]{
                Agendadas.citasAgendadas.get(i).getNombre(),
                Agendadas.citasAgendadas.get(i).getApellido(),
                Agendadas.citasAgendadas.get(i).getNumero(),
                Agendadas.citasAgendadas.get(i).getHora(),
                Agendadas.citasAgendadas.get(i).getFecha(),
            
            });
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

        tablaCitas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaCitas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbhora, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnagendar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cbhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagendar))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnagendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagendarActionPerformed
        

        
        //Yir. Verifico que todos los campos esten llenos.
        
            if (txtnombre.getText().equals("")||txtapellido.getText().equals("")||txtnumero.getText().equals("") ||cbhora.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Asegúrese que todos los campos estén completos");
            }else {
                
                //instancio el objeto y se agregan los datos al Array.
                DatosCitas ag = new DatosCitas();
                //Yir.Captuto datos. La fecha debe ir capturada en el formato date porque se está capturando
                //del jcalendar. En los get y set se establece que es de tipo date    
                ag.setNombre(txtnombre.getText());
                ag.setApellido(txtapellido.getText());
                ag.setNumero ( txtnumero.getText());
                ag.setHora((String)cbhora.getSelectedItem());
                ag.setFecha(dtcalendar.getCalendar().getTime());
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
                cargarCitas();
                
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
    private javax.swing.JTable tablaCitas;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    // End of variables declaration//GEN-END:variables
}
