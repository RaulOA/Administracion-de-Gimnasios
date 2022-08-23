package Visual;

//raul. imports que se utilizan en cada evento de boton, para llamar a los paneles de FrameRecepcion --------------
import FramesRecepcion.PanelAgendarCita;
import FramesRecepcion.PanelEntrenadores;
import FramesRecepcion.PanelListaClientes;
import FramesRecepcion.PanelMensualidades;
import FramesRecepcion.PanelNuevaInscripcion;
import FramesRecepcion.PanelOpciones;
import FramesRecepcion.PanelVentaProductos;
//------------------------------------------------------------

import java.awt.BorderLayout;
import java.io.IOException;

//raul. import que se utiliza en el metodo ShowPanel()-----------
import javax.swing.JPanel;
//------------------------------------------------------------

public class Recepcion extends javax.swing.JFrame {
    
    public Recepcion() {
        initComponents();

        //raul. Este es el primer panel que se mostrara una vez se abra la pantalla de recepcion---------------
        PanelOpciones p1 = new PanelOpciones();
        ShowPanel(p1);

        //Yir. Instrucciones para que aparezca en el centro y no se pueda ajustar la pantalla. 
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        //------------------------------------------------------------
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        btndesplegar = new javax.swing.JButton();
        btninscribir = new javax.swing.JButton();
        btnlistaclientes = new javax.swing.JButton();
        btnmensualidad = new javax.swing.JButton();
        btnagendar = new javax.swing.JButton();
        btnvender = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();
        btnlistaEntrenadores = new javax.swing.JButton();
        CentralFrame = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recepcion");

        panelPrincipal.setBackground(new java.awt.Color(102, 102, 102));
        panelPrincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelPrincipal.setForeground(new java.awt.Color(102, 102, 102));

        panelMenu.setBackground(new java.awt.Color(57, 57, 57));

        btndesplegar.setBackground(new java.awt.Color(57, 57, 57));
        btndesplegar.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btndesplegar.setForeground(new java.awt.Color(255, 255, 255));
        btndesplegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/menu.png"))); // NOI18N
        btndesplegar.setText("Opciones                         ");
        btndesplegar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndesplegar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btndesplegar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btndesplegar.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                btndesplegarComponentAdded(evt);
            }
        });
        btndesplegar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndesplegarMouseClicked(evt);
            }
        });
        btndesplegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndesplegarActionPerformed(evt);
            }
        });

        btninscribir.setBackground(new java.awt.Color(57, 57, 57));
        btninscribir.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btninscribir.setForeground(new java.awt.Color(255, 255, 255));
        btninscribir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/user-plus.png"))); // NOI18N
        btninscribir.setText("Nueva Inscripción          ");
        btninscribir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btninscribir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btninscribir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btninscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninscribirActionPerformed(evt);
            }
        });

        btnlistaclientes.setBackground(new java.awt.Color(57, 57, 57));
        btnlistaclientes.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btnlistaclientes.setForeground(new java.awt.Color(255, 255, 255));
        btnlistaclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/users.png"))); // NOI18N
        btnlistaclientes.setText("Lista de clientes             ");
        btnlistaclientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlistaclientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnlistaclientes.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnlistaclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistaclientesActionPerformed(evt);
            }
        });

        btnmensualidad.setBackground(new java.awt.Color(57, 57, 57));
        btnmensualidad.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btnmensualidad.setForeground(new java.awt.Color(255, 255, 255));
        btnmensualidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cash-outline (1).png"))); // NOI18N
        btnmensualidad.setText("Mensualidades              ");
        btnmensualidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmensualidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnmensualidad.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnmensualidad.setMaximumSize(new java.awt.Dimension(638, 520));
        btnmensualidad.setMinimumSize(new java.awt.Dimension(638, 520));
        btnmensualidad.setPreferredSize(new java.awt.Dimension(638, 520));
        btnmensualidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmensualidadActionPerformed(evt);
            }
        });

        btnagendar.setBackground(new java.awt.Color(57, 57, 57));
        btnagendar.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btnagendar.setForeground(new java.awt.Color(255, 255, 255));
        btnagendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/calendar-outline.png"))); // NOI18N
        btnagendar.setText("Agendar cita                  ");
        btnagendar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnagendar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnagendar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnagendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagendarActionPerformed(evt);
            }
        });

        btnvender.setBackground(new java.awt.Color(57, 57, 57));
        btnvender.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btnvender.setForeground(new java.awt.Color(255, 255, 255));
        btnvender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/shopping-bag.png"))); // NOI18N
        btnvender.setText("Venta de productos      ");
        btnvender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnvender.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnvender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvenderActionPerformed(evt);
            }
        });

        btnvolver.setBackground(new java.awt.Color(57, 57, 57));
        btnvolver.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btnvolver.setForeground(new java.awt.Color(255, 255, 255));
        btnvolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/return-down-back-outline.png"))); // NOI18N
        btnvolver.setText("Volver                             ");
        btnvolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvolver.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnvolver.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });

        btnlistaEntrenadores.setBackground(new java.awt.Color(57, 57, 57));
        btnlistaEntrenadores.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btnlistaEntrenadores.setForeground(new java.awt.Color(255, 255, 255));
        btnlistaEntrenadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/id-card-outline (1).png"))); // NOI18N
        btnlistaEntrenadores.setText("Lista de Entrenadores   ");
        btnlistaEntrenadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlistaEntrenadores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnlistaEntrenadores.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnlistaEntrenadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistaEntrenadoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnlistaEntrenadores, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnmensualidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnagendar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnvender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndesplegar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnvolver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btninscribir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnlistaclientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btndesplegar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btninscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlistaclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmensualidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnagendar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnvender, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlistaEntrenadores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CentralFrame.setBackground(new java.awt.Color(102, 102, 102));
        CentralFrame.setRequestFocusEnabled(false);

        javax.swing.GroupLayout CentralFrameLayout = new javax.swing.GroupLayout(CentralFrame);
        CentralFrame.setLayout(CentralFrameLayout);
        CentralFrameLayout.setHorizontalGroup(
            CentralFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 764, Short.MAX_VALUE)
        );
        CentralFrameLayout.setVerticalGroup(
            CentralFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CentralFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CentralFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        // Yir. Instrucción para volver a la ventana de loggin
        Loggin volverloggin;
        try {
            volverloggin = new Loggin();
            volverloggin.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_btnvolverActionPerformed

    private void btnvenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvenderActionPerformed
        //raul. Esto es lo que se ejecutara una vez oprimas el boton de venta de productos ---------------
        PanelVentaProductos p6 = new PanelVentaProductos();
        ShowPanel(p6);
        //------------------------------------------------------------
    }//GEN-LAST:event_btnvenderActionPerformed

    private void btnagendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagendarActionPerformed
        //raul. Esto es lo que se ejecutara una vez oprimas el boton de agendar cita --------------
        PanelAgendarCita p5 = new PanelAgendarCita();
        ShowPanel(p5);
        p5.cargarCitas();
        //------------------------------------------------------------
    }//GEN-LAST:event_btnagendarActionPerformed

    private void btnmensualidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmensualidadActionPerformed
        //raul. Esto es lo que se ejecutara una vez oprimas el boton de mensualidades ---------------
        PanelMensualidades p4 = new PanelMensualidades();
        ShowPanel(p4);
        p4.cargarDatos();
        //------------------------------------------------------------
    }//GEN-LAST:event_btnmensualidadActionPerformed

    private void btnlistaclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistaclientesActionPerformed
        //raul. Esto es lo que se ejecutara una vez oprimas el boton de lista clientes ---------------
        PanelListaClientes p3 = new PanelListaClientes();
        ShowPanel(p3);
        p3.cargarDatos();

        //------------------------------------------------------------
    }//GEN-LAST:event_btnlistaclientesActionPerformed

    private void btninscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninscribirActionPerformed
        //raul. Esto es lo que se ejecutara una vez oprimas el boton de nueva inscripcion -----------------------
        PanelNuevaInscripcion p2 = new PanelNuevaInscripcion();
        ShowPanel(p2);
        //------------------------------------------------------------
    }//GEN-LAST:event_btninscribirActionPerformed

    private void btndesplegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndesplegarActionPerformed
        //raul. Esto es lo que se ejecutara una vez oprimas el boton de Opciones -----------------------
        PanelOpciones p1 = new PanelOpciones();
        ShowPanel(p1);
        //------------------------------------------------------------
    }//GEN-LAST:event_btndesplegarActionPerformed

    private void btndesplegarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndesplegarMouseClicked

    }//GEN-LAST:event_btndesplegarMouseClicked

    private void btndesplegarComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_btndesplegarComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btndesplegarComponentAdded

    private void btnlistaEntrenadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistaEntrenadoresActionPerformed
        PanelEntrenadores p9 = new PanelEntrenadores();
        ShowPanel(p9);
        p9.cargarDatos();
    }//GEN-LAST:event_btnlistaEntrenadoresActionPerformed
    
    public void run() {
        new Recepcion().setVisible(true);
    }
    
    private void ShowPanel(JPanel p) {
        //raul. Metodo para mostrar paneles ------------
        p.setSize(800, 850);
        p.setLocation(0, 0);
        CentralFrame.removeAll();
        CentralFrame.add(p, BorderLayout.CENTER);
        CentralFrame.revalidate();
        CentralFrame.repaint();
        //------------------------------------------------------------    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CentralFrame;
    private javax.swing.JButton btnagendar;
    private javax.swing.JButton btndesplegar;
    private javax.swing.JButton btninscribir;
    private javax.swing.JButton btnlistaEntrenadores;
    private javax.swing.JButton btnlistaclientes;
    private javax.swing.JButton btnmensualidad;
    private javax.swing.JButton btnvender;
    private javax.swing.JButton btnvolver;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
