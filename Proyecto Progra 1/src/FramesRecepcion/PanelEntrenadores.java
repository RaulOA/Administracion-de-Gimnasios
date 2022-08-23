package FramesRecepcion;

import Datos.Entrenadores;
import javax.swing.table.DefaultTableModel;

public class PanelEntrenadores extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();
    
    public void limpiarDatos(){
    txtNombre.setText(null);
    txtEdad.setText(null);
    txtTelefono.setText(null);
    txtEspecialidad.setText(null);
    }

    public void cargarDatos() {
        modelo.setRowCount(0);
        for (int i = 0; i < Entrenadores.listrainers.size(); i++) {
            modelo.addRow(new Object[]{
                Entrenadores.listrainers.get(i).getNombre(),
                Entrenadores.listrainers.get(i).getEdad(),
                Entrenadores.listrainers.get(i).getTelefono(),
                Entrenadores.listrainers.get(i).getEspecialidad(),});
        }
    }

    public PanelEntrenadores() {
        initComponents();
        tablaListaEntrenadores.setModel(modelo);
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Especialidad");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListaEntrenadores = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        btnInscribirEntrenador = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        tablaListaEntrenadores.setFont(new java.awt.Font("Eras Medium ITC", 0, 15)); // NOI18N
        tablaListaEntrenadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaListaEntrenadores);

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        txtNombre.setBackground(new java.awt.Color(187, 187, 187));
        txtNombre.setFont(new java.awt.Font("Eras Medium ITC", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad:");

        txtEdad.setBackground(new java.awt.Color(187, 187, 187));
        txtEdad.setFont(new java.awt.Font("Eras Medium ITC", 0, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teléfono:");

        txtTelefono.setBackground(new java.awt.Color(187, 187, 187));
        txtTelefono.setFont(new java.awt.Font("Eras Medium ITC", 0, 15)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Especialidad:");

        txtEspecialidad.setBackground(new java.awt.Color(187, 187, 187));
        txtEspecialidad.setFont(new java.awt.Font("Eras Medium ITC", 0, 15)); // NOI18N

        btnInscribirEntrenador.setBackground(new java.awt.Color(0, 0, 0));
        btnInscribirEntrenador.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        btnInscribirEntrenador.setForeground(new java.awt.Color(255, 255, 255));
        btnInscribirEntrenador.setText("Inscribir");
        btnInscribirEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirEntrenadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInscribirEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnInscribirEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInscribirEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirEntrenadorActionPerformed
        Entrenadores nuevo = new Entrenadores();
        nuevo.inscribirentrenador(txtNombre.getText(), txtEdad.getText(), txtTelefono.getText(), txtEspecialidad.getText());
        cargarDatos();
        limpiarDatos();


    }//GEN-LAST:event_btnInscribirEntrenadorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscribirEntrenador;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaListaEntrenadores;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
