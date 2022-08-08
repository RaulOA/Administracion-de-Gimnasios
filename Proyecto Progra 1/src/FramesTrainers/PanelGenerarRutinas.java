package FramesTrainers;

import Datos.BaseDeDatos;
import Datos.ListBook;
import Datos.ReporteRutina;
import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class PanelGenerarRutinas extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();
    BaseDeDatos t = new BaseDeDatos();

    public PanelGenerarRutinas() {
        initComponents();
        llenarCombo();
        jpanelDiasEntreno.setVisible(false);
        fecha();
        panelGruposMusculares.setVisible(false);
        int n = Integer.parseInt(spnSemanas.getValue().toString());
    }

    public void llenarCombo() {

        for (int i = 0; i < ListBook.listbook.size(); i++) {
            jComboClientes.addItem(ListBook.listbook.get(i).getID() + " " + ListBook.listbook.get(i).getNombre() + " " + ListBook.listbook.get(i).getApellido());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jpanelDiasEntreno = new javax.swing.JPanel();
        lbldia2 = new javax.swing.JLabel();
        lbldia3 = new javax.swing.JLabel();
        lbldia4 = new javax.swing.JLabel();
        lbldia5 = new javax.swing.JLabel();
        lbldia6 = new javax.swing.JLabel();
        btnGenerarRutina = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jComboClientes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spnSemanas = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        spnDias = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelPeso = new javax.swing.JLabel();
        labelEstatura = new javax.swing.JLabel();
        labelEdad = new javax.swing.JLabel();
        txtIMC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblIMC1 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        panelGruposMusculares = new javax.swing.JPanel();
        btnMostrar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Generador de Rutinas");

        lbldia2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/2_dias.png"))); // NOI18N

        lbldia3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/3_dias.png"))); // NOI18N

        lbldia4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/4_dias.png"))); // NOI18N

        lbldia5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/5_dias.png"))); // NOI18N

        lbldia6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/6_dias.png"))); // NOI18N

        javax.swing.GroupLayout jpanelDiasEntrenoLayout = new javax.swing.GroupLayout(jpanelDiasEntreno);
        jpanelDiasEntreno.setLayout(jpanelDiasEntrenoLayout);
        jpanelDiasEntrenoLayout.setHorizontalGroup(
            jpanelDiasEntrenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelDiasEntrenoLayout.createSequentialGroup()
                .addGroup(jpanelDiasEntrenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldia2)
                    .addComponent(lbldia3)
                    .addComponent(lbldia4, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldia5)
                    .addComponent(lbldia6))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpanelDiasEntrenoLayout.setVerticalGroup(
            jpanelDiasEntrenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelDiasEntrenoLayout.createSequentialGroup()
                .addComponent(lbldia2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldia3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldia4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldia5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldia6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGenerarRutina.setBackground(new java.awt.Color(153, 255, 153));
        btnGenerarRutina.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGenerarRutina.setText("Generar Rutina");
        btnGenerarRutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarRutinaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jComboClientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));
        jComboClientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboClientesItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Cliente");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Cantidad de semanas para la rutina");

        spnSemanas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spnSemanas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 6, 1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Nivel de avance del Cliente: ");

        jSpinner2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerListModel(new String[] {"Principiante", "Intermedio", "Avanzado"}));

        spnDias.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spnDias.setModel(new javax.swing.SpinnerNumberModel(2, 2, 6, 1));
        spnDias.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnDiasStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Cantidad de días a entrenar por semana ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jComboClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(134, 134, 134)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(137, 137, 137))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnDias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnSemanas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnSemanas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spnDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        labelPeso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelPeso.setText("Peso");

        labelEstatura.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelEstatura.setText("Estatura");

        labelEdad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelEdad.setText("Edad");

        txtIMC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtIMC.setText("IMC");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("IMC=Peso(Kg)/altura^2(m)");

        lblIMC1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIMC1.setText("IMC");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(labelEstatura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIMC1)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPeso)
                            .addComponent(labelEdad))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(txtIMC, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEdad)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEstatura)
                    .addComponent(jLabel6))
                .addGap(2, 2, 2)
                .addComponent(lblIMC1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelPeso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIMC)
                .addContainerGap())
        );

        btnImprimir.setBackground(new java.awt.Color(255, 204, 153));
        btnImprimir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnImprimir.setText("Imprimir Rutina");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        lblFecha.setText("Fecha de Hoy");

        panelGruposMusculares.setBackground(new java.awt.Color(102, 102, 102));

        btnMostrar.setText("Mostrar Ejercicios por Grupos Musculares");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGruposMuscularesLayout = new javax.swing.GroupLayout(panelGruposMusculares);
        panelGruposMusculares.setLayout(panelGruposMuscularesLayout);
        panelGruposMuscularesLayout.setHorizontalGroup(
            panelGruposMuscularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGruposMuscularesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMostrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGruposMuscularesLayout.setVerticalGroup(
            panelGruposMuscularesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGruposMuscularesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelGruposMusculares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanelDiasEntreno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGenerarRutina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnImprimir)))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFecha)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblFecha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGenerarRutina)
                            .addComponent(btnImprimir))))
                .addGap(18, 18, 18)
                .addComponent(jpanelDiasEntreno, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGruposMusculares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarRutinaActionPerformed
        panelDias();
        jpanelDiasEntreno.setVisible(true);
        panelGruposMusculares.setVisible(true);

    }//GEN-LAST:event_btnGenerarRutinaActionPerformed
    public void panelDias() {
        int n = Integer.parseInt(spnDias.getValue().toString());

        if (n == 2) {
            lbldia2.setVisible(true);
            lbldia3.setVisible(false);
            lbldia4.setVisible(false);
            lbldia5.setVisible(false);
            lbldia6.setVisible(false);
        } else if (n == 3) {
            lbldia2.setVisible(false);
            lbldia3.setVisible(true);
            lbldia4.setVisible(false);
            lbldia5.setVisible(false);
            lbldia6.setVisible(false);

        } else if (n == 4) {
            lbldia2.setVisible(false);
            lbldia3.setVisible(false);
            lbldia4.setVisible(true);
            lbldia5.setVisible(false);
            lbldia6.setVisible(false);

        } else if (n == 5) {
            lbldia2.setVisible(false);
            lbldia3.setVisible(false);
            lbldia4.setVisible(false);
            lbldia5.setVisible(true);
            lbldia6.setVisible(false);

        } else if (n == 6) {
            lbldia2.setVisible(false);
            lbldia3.setVisible(false);
            lbldia4.setVisible(false);
            lbldia5.setVisible(false);
            lbldia6.setVisible(true);

        }

    }
    private void jComboClientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboClientesItemStateChanged
        jpanelDiasEntreno.setVisible(false);
        panelGruposMusculares.setVisible(false);
        spnDias.setValue(2);
        spnSemanas.setValue(1);

        int n = jComboClientes.getSelectedIndex();
        float peso = Float.parseFloat(ListBook.listbook.get(n - 1).getPeso());
        float estatura = Float.parseFloat(ListBook.listbook.get(n - 1).getAltura());
        float imc = peso / (estatura * estatura);

        labelEdad.setText("Edad: " + ListBook.listbook.get(n - 1).getEdad());
        labelEstatura.setText("Estatura en (m): " + ListBook.listbook.get(n - 1).getAltura());
        labelPeso.setText("Peso (kg): " + ListBook.listbook.get(n - 1).getPeso());
        lblIMC1.setText("IMC: " + imc);

        if (imc >= 10 && imc < 18.5) {
            txtIMC.setText("Rango de peso bajo");
        } else if (imc >= 18.5 && imc <= 25) {
            txtIMC.setText("Rango de peso Normal");
        } else if (imc > 25 && imc <= 30) {
            txtIMC.setText("Sobre peso");
        } else if (imc > 30 && imc <= 40) {
            txtIMC.setText("Obeso");
        } else {
            txtIMC.setText("Revisar los datos");
        }


    }//GEN-LAST:event_jComboClientesItemStateChanged

    private void spnDiasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnDiasStateChanged
        jpanelDiasEntreno.setVisible(false);
        panelGruposMusculares.setVisible(false);
    }//GEN-LAST:event_spnDiasStateChanged

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed

        MostraGruposMusculares ventana = new MostraGruposMusculares();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);


    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        panelDias();
        jpanelDiasEntreno.setVisible(true);
        panelGruposMusculares.setVisible(true);
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("MM-dd-YY HH:mm");
        
        String nombreArchivo = jComboClientes.getSelectedItem().toString();
        //Ruta de imagen
        int d = Integer.parseInt(spnSemanas.getValue().toString());
        int n = jComboClientes.getSelectedIndex();
        String nivel = jSpinner2.getValue().toString();
        String dias = spnDias.getValue().toString();
        String imc = txtIMC.getText();
        String edad = labelEdad.getText();
        String altura = labelEstatura.getText();
        String peso = labelPeso.getText();
        String padecimiento = ListBook.listbook.get(n - 1).getPadecimientos();
        
        
        ReporteRutina reporteR = new ReporteRutina("Rutina de "+nombreArchivo, "C:\\Users\\PC\\OneDrive - Ministerio de Educación\\CastroCarazo\\progra 1\\prueba2\\Proyecto-Final-Java\\Proyecto Progra 1\\src\\Recursos\\logo.jpeg", formato.format(fecha),d,nivel,dias,imc,nombreArchivo,edad,altura,peso,padecimiento);
        try {
            reporteR.generarReporte();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PanelGenerarRutinas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(PanelGenerarRutinas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    public void fecha() {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("MM-dd-YY HH:mm");
        lblFecha.setText(formato.format(fecha));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarRutina;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JComboBox<String> jComboClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpanelDiasEntreno;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelEstatura;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIMC1;
    private javax.swing.JLabel lbldia2;
    private javax.swing.JLabel lbldia3;
    private javax.swing.JLabel lbldia4;
    private javax.swing.JLabel lbldia5;
    private javax.swing.JLabel lbldia6;
    private javax.swing.JPanel panelGruposMusculares;
    private javax.swing.JSpinner spnDias;
    private javax.swing.JSpinner spnSemanas;
    private javax.swing.JTextField txtIMC;
    // End of variables declaration//GEN-END:variables
}
