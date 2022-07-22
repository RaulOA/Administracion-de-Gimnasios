
package FramesTrainers;

import javax.swing.table.DefaultTableModel;
import Datos.ListBook;
import Datos.Book;
public class PanelRegistrarse extends javax.swing.JPanel {
    
    
    DefaultTableModel model = new DefaultTableModel();
    
    public PanelRegistrarse() {
        initComponents();
        
        tablaRegitros.setModel(model);
        model.addColumn("Nombre");
        model.addColumn("Apellidos");
        model.addColumn("Peso");
        model.addColumn("Altura");
        model.addColumn("Padecimientos");
    }
    
    public void cargarRegistro(){
        model.setRowCount(0);
        for (int i = 0; i < ListBook.listbook.size(); i++) {
            model.addRow(new Object[]{
                ListBook.listbook.get(i).getNombre(),
                ListBook.listbook.get(i).getApellido(),
                ListBook.listbook.get(i).getPeso(),
                ListBook.listbook.get(i).getAltura(),
                ListBook.listbook.get(i).getPadecimientos(),});
        }
        }
            
        
  


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaRegitros = new javax.swing.JTable();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setBackground(new java.awt.Color(102, 102, 102));

        tablaRegitros.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        tablaRegitros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaRegitros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaRegitros;
    // End of variables declaration//GEN-END:variables
}
