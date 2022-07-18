package Visual;

//Yir. Importo los paneles que luego se van a mostrar
import FramesTrainers.PanelGenerarRutinas;
import FramesTrainers.PanelOpciones2;
import FramesTrainers.PanelPendientes;
import FramesTrainers.PanelRegistrarse;
import java.awt.BorderLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Trainers extends javax.swing.JFrame {

    public Trainers() {
        initComponents();

        //Yir. Panel que se va a mostrar de primero con la bienvenida.
        PanelOpciones2 p1 = new PanelOpciones2();
        ShowPanel(p1);

        //Yir. Instrucciones para que aparezca en el centro y no se pueda ajustar la pantalla. 
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelprincipal = new javax.swing.JPanel();
        panelmenu2 = new javax.swing.JPanel();
        btnopciones = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        btngenerar = new javax.swing.JButton();
        btnpendientes = new javax.swing.JButton();
        btnvolver2 = new javax.swing.JButton();
        PanelMostrar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entrenadores");

        panelprincipal.setBackground(new java.awt.Color(102, 102, 102));
        panelprincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelprincipal.setForeground(new java.awt.Color(102, 102, 102));
        panelprincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        panelmenu2.setBackground(new java.awt.Color(57, 57, 57));

        btnopciones.setBackground(new java.awt.Color(57, 57, 57));
        btnopciones.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btnopciones.setForeground(new java.awt.Color(255, 255, 255));
        btnopciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/menu.png"))); // NOI18N
        btnopciones.setText("Opciones                        ");
        btnopciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnopciones.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnopciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnopcionesMouseClicked(evt);
            }
        });
        btnopciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnopcionesActionPerformed(evt);
            }
        });

        btnregistrar.setBackground(new java.awt.Color(57, 57, 57));
        btnregistrar.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btnregistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/edit-3.png"))); // NOI18N
        btnregistrar.setText("Registrarse                     ");
        btnregistrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnregistrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btngenerar.setBackground(new java.awt.Color(57, 57, 57));
        btngenerar.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btngenerar.setForeground(new java.awt.Color(255, 255, 255));
        btngenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/clipboard.png"))); // NOI18N
        btngenerar.setText("Generar rutinas            ");
        btngenerar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btngenerar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btngenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarActionPerformed(evt);
            }
        });

        btnpendientes.setBackground(new java.awt.Color(57, 57, 57));
        btnpendientes.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btnpendientes.setForeground(new java.awt.Color(255, 255, 255));
        btnpendientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/scale-outline.png"))); // NOI18N
        btnpendientes.setText("Pendientes                     ");
        btnpendientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnpendientes.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnpendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpendientesActionPerformed(evt);
            }
        });

        btnvolver2.setBackground(new java.awt.Color(57, 57, 57));
        btnvolver2.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btnvolver2.setForeground(new java.awt.Color(255, 255, 255));
        btnvolver2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/return-down-back-outline.png"))); // NOI18N
        btnvolver2.setText("Volver                             ");
        btnvolver2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvolver2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnvolver2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnvolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolver2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelmenu2Layout = new javax.swing.GroupLayout(panelmenu2);
        panelmenu2.setLayout(panelmenu2Layout);
        panelmenu2Layout.setHorizontalGroup(
            panelmenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmenu2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelmenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelmenu2Layout.createSequentialGroup()
                        .addGroup(panelmenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnopciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnregistrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btngenerar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnpendientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnvolver2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelmenu2Layout.setVerticalGroup(
            panelmenu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmenu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnopciones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnpendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btngenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnvolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        PanelMostrar.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout PanelMostrarLayout = new javax.swing.GroupLayout(PanelMostrar);
        PanelMostrar.setLayout(PanelMostrarLayout);
        PanelMostrarLayout.setHorizontalGroup(
            PanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
        );
        PanelMostrarLayout.setVerticalGroup(
            PanelMostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelprincipalLayout = new javax.swing.GroupLayout(panelprincipal);
        panelprincipal.setLayout(panelprincipalLayout);
        panelprincipalLayout.setHorizontalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addComponent(panelmenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelprincipalLayout.setVerticalGroup(
            panelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelmenu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolver2ActionPerformed
        //Yir. Instrucción para volver al loggin
        Loggin volverloggin;
        try {
            volverloggin = new Loggin();
            volverloggin.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            System.out.println("Error");;
        }
    }//GEN-LAST:event_btnvolver2ActionPerformed

    private void btnopcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnopcionesMouseClicked

    }//GEN-LAST:event_btnopcionesMouseClicked

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        //Yir. Llamo al panel de registrarse
        PanelRegistrarse p2 = new PanelRegistrarse();
        ShowPanel(p2);
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnpendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpendientesActionPerformed
        //Yir. Llamo al panel de mostrar pendientes
        PanelPendientes p3 = new PanelPendientes();
        ShowPanel(p3);
        p3.mostrarPendientes();

    }//GEN-LAST:event_btnpendientesActionPerformed

    private void btngenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarActionPerformed
        //Yir. Llamo al panel de generar rutinas.
        PanelGenerarRutinas p4 = new PanelGenerarRutinas();
        ShowPanel(p4);
    }//GEN-LAST:event_btngenerarActionPerformed

    private void btnopcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnopcionesActionPerformed
        PanelOpciones2 p1 = new PanelOpciones2();
        ShowPanel(p1);
    }//GEN-LAST:event_btnopcionesActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trainers().setVisible(true);
            }
        });
    }

    private void ShowPanel(JPanel p) {
        //Yir. Instrucciones para mostrar los paneles
        p.setSize(800, 850);
        p.setLocation(0, 0);
        PanelMostrar.removeAll();
        PanelMostrar.add(p, BorderLayout.CENTER);
        PanelMostrar.revalidate();
        PanelMostrar.repaint();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMostrar;
    private javax.swing.JButton btngenerar;
    private javax.swing.JButton btnopciones;
    private javax.swing.JButton btnpendientes;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnvolver2;
    private javax.swing.JPanel panelmenu2;
    private javax.swing.JPanel panelprincipal;
    // End of variables declaration//GEN-END:variables
}
