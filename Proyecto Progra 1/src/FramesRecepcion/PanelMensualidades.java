package FramesRecepcion;

import Datos.ListBook;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

public class PanelMensualidades extends javax.swing.JPanel {
    
    DefaultTableModel modelo = new DefaultTableModel();

    public PanelMensualidades() {
        initComponents();
        TablaClientesFecha.setModel(modelo);
        modelo.addColumn("Cédula");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dias Restantes");
        modelo.addColumn("Estado");
    }
    
    public void cargarDatos() {
        Calendar calendario = Calendar.getInstance();
        int fechaActual = calendario.get(Calendar.DAY_OF_YEAR);
        modelo.setRowCount(0);
        for (int i = 0; i < ListBook.listbook.size(); i++) {
            int diaDePago= Integer.parseInt(ListBook.listbook.get(i).getDia());
            int vencimiento = diaDePago+30;
            int diasRestantes = vencimiento - fechaActual;
            String estado = "";
            if (diasRestantes<=0) {
                estado = "Atrasado";
            } else {
                estado = "Al Dia";
            }
            modelo.addRow(new Object[]{
                ListBook.listbook.get(i).getID(),
                ListBook.listbook.get(i).getApellido(),
                diasRestantes,
                estado,});
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaClientesFecha = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 102, 102));

        TablaClientesFecha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaClientesFecha);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(402, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaClientesFecha;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
