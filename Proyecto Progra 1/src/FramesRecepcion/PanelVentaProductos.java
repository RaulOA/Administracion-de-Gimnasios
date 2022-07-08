
package FramesRecepcion;


import Datos.Venta;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelVentaProductos extends javax.swing.JPanel {
    
    // juan. info de la tabla, luego trasladarla a DATOS.
    String codigo [] ={"cod1","cod2","cod3","cod4","cod5","cod6","cod7","cod8","cod9"};//Juan:AÚN NO HACE NADA
    String productos []={"BEBIDAS ENERGETICAS","BATIDO DE PROTEÍNA","BOTELLA DE AGUA","SCOOP PREENTRENO","GUANTES","SCOOP DE KREATINA","BANANOS","CONFITES","INSCRIPCION"};
     double precios []={1000,1500,800,1000,5000,1000,100,25,15000};
     double precio=0;
     int cantidad=0;
    //--------------------------------------------------------------
     
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Venta> listaVentas=new ArrayList<Venta> () ;

    public PanelVentaProductos() {
        initComponents();
        
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel(productos);
        cboProducto.setModel(comboModel);
        //modelo.addColumn("Cód");
        modelo.addColumn("Prducto");
        modelo.addColumn("Precio U");
        modelo.addColumn("Cant.");
        modelo.addColumn("Importe");
        
        
        actualizarTabla();
        calcularPrecio();
          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboProducto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        spnCantidad = new javax.swing.JSpinner();
        lblPrecio = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblIVA = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblImporte = new javax.swing.JLabel();
        btnPagar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Venta de Productos.");

        jLabel2.setText("Elija el producto");

        cboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductoActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccione la  cantidad");

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Precio Unitario", "Cantidad", "Importe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrecio.setText("₡ 0.00");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Importe");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("SubTotal");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("TOTAL");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("I.V.A");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Precio");

        lblSubtotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSubtotal.setText("₡ 0.00");

        lblIVA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblIVA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIVA.setText("₡ 0.00");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("₡ 0.00");

        lblImporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblImporte.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblImporte.setText("₡ 0.00");

        btnPagar.setBackground(new java.awt.Color(0, 255, 0));
        btnPagar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(0, 0, 0));
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(153, 255, 204));
        btnEliminar.setForeground(new java.awt.Color(255, 0, 51));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(27, 27, 27)
                                        .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblIVA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(lblSubtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(1, 1, 1)
                        .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(lblPrecio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(lblImporte)))
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar)
                        .addGap(3, 3, 3)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblSubtotal))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblIVA))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblTotal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
        calcularPrecio();
    }//GEN-LAST:event_cboProductoActionPerformed

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        calcularPrecio();
    }//GEN-LAST:event_spnCantidadStateChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Venta venta=new Venta();
        venta.setId(cboProducto.getSelectedIndex());
        venta.setDescripcion(cboProducto.getSelectedItem().toString());
        venta.setPrecio(precio);
        venta.setCantidad(cantidad);
        venta.setImporte(precio*cantidad);
        if (!buscarVenta(venta)) { // Juan. solo si el producto no aparece en la lista de ventas lo agrega, en caso de que lo encuentre le suma la nueva cantidad
            listaVentas.add(venta);
        }
        
        actualizarTabla();// juan. para rellenar tabla y asignar datos a los labels de total
        borrarVenta(); // Juan. Regresa las variables a cero
        System.out.println(listaVentas);
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        JOptionPane.showMessageDialog(null,"City Fitness \n Gracias por su compra");
        
        listaVentas.clear();
        actualizarTabla();
        calcularPrecio();
        System.out.println(listaVentas);
        
        
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tblProductos.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(null, "No ha seleccionado el articulo a eliminar");
        }
        
        int seleccion =tblProductos.getSelectedRow();
        System.out.println(seleccion);
        modelo.removeRow(tblProductos.getSelectedRow());
        System.out.println(listaVentas);
        listaVentas.remove(seleccion);
        System.out.println(listaVentas);
        actualizarTabla();
        calcularPrecio();
               
           
                
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    public boolean  buscarVenta(Venta nueva) { // Juan. Revia la lista de ventas, para sumar las cantidades en caso de que se repita el prodcuto
        
        for (Venta v: listaVentas) {
            if (v.getId()==nueva.getId()){
                int nuevaCantidad=v.getCantidad()+nueva.getCantidad();
                v.setCantidad(nuevaCantidad);
                v.setImporte(v.getPrecio()*nuevaCantidad);
                return true;
            }
        }
        return false;
    }
    public void borrarVenta(){ // Juan. Regresa las variables a valores iniciales
        
        precio=0;
        cantidad=1;
        cboProducto.setSelectedIndex(0);
        spnCantidad.setValue(1);
        calcularPrecio();
    
    }
    public void calcularPrecio (){ //Juan. para obtener la selección del combo y el spinner y trasladarlos a los labels 
        
        precio = precios [cboProducto.getSelectedIndex()];
        cantidad=Integer.parseInt(spnCantidad.getValue().toString());
        lblPrecio.setText(aMoneda(precio));
        lblImporte.setText(aMoneda(precio*cantidad));
   
    }
    
   public void actualizarTabla() {  // juan. para rellenar tabla y asignar datos a los labels de total
       while (modelo.getRowCount()>0){ // juan. para remover registros anteriories
           modelo.removeRow(0);
       }
       double subtotal=0;
       for (Venta v : listaVentas) {  // Juan, recorrido para llenar nueva lista x
           Object x []=new Object[4];
           x[0]=v.getDescripcion();
           x[1]=aMoneda(v.getPrecio()); //JUAN para pasarlo a formato de moneda
           x[2]=v.getCantidad();
           x[3]=aMoneda(v.getImporte());
           subtotal+= v.getImporte();
           modelo.addRow(x);
           
       }
       double iva =subtotal * 0.13;
       double total=subtotal+iva;
       lblSubtotal.setText(aMoneda(subtotal));
       lblIVA.setText(aMoneda(iva));
       lblTotal.setText(aMoneda(total));
       
       tblProductos.setModel(modelo);
       
   
   }
    public String  aMoneda  (double precio){ // Juan. para transformar los labels a formatao de colones y redondear a un décimal
        return "₡"+Math.round(precio*100.0)/100.0;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnPagar;
    private javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIVA;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables

    private void ShowPanel(PanelOpciones p1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
