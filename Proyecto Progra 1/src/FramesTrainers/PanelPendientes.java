
package FramesTrainers;

//Yir. Importo el Array que contiene las citas agendadas antes en Recepcion;
import javax.swing.table.DefaultTableModel;
import Datos.Agendadas;
import javax.swing.JOptionPane;


public class PanelPendientes extends javax.swing.JPanel {

    //Yir. Hago la tabla
    DefaultTableModel modeloTabla = new DefaultTableModel();
    
    public PanelPendientes() {
        initComponents();
        
        tablaPendientes.setModel(modeloTabla);
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Número");
        modeloTabla.addColumn("Hora");
        modeloTabla.addColumn("Fecha");
 
    }
    
    public void mostrarPendientes(){
        
        /*Yir. Muestro la tabla con las citas agendadas, que en este caso van a ser las pendientes 
        para el instructor. Si no se agenda la cita primero en recepción, entonces no va a 
        salir nada acá */
        
        modeloTabla.setRowCount(0);
        for (int i = 0; i < Agendadas.citasAgendadas.size(); i++) {
            modeloTabla.addRow(new Object[]{
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPendientes = new javax.swing.JTable();
        btnCompletada = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        tablaPendientes.setFont(new java.awt.Font("Eras Medium ITC", 0, 17)); // NOI18N
        tablaPendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPendientes);

        btnCompletada.setBackground(new java.awt.Color(0, 0, 0));
        btnCompletada.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        btnCompletada.setForeground(new java.awt.Color(255, 255, 255));
        btnCompletada.setText("Completada");
        btnCompletada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCompletada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(btnCompletada)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompletadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletadaActionPerformed
        int filaSeleccionada = tablaPendientes.getSelectedRow();

        if (filaSeleccionada >= 0) {
            Agendadas.citasAgendadas.remove(filaSeleccionada);
            mostrarPendientes();

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una cita");
        }
    }//GEN-LAST:event_btnCompletadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompletada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPendientes;
    // End of variables declaration//GEN-END:variables
}
