package Visual;

import javax.swing.JOptionPane;

public class Loggin extends javax.swing.JFrame {

    public Loggin() {
        initComponents();

        //Yir. Instrucciones para que aparezca en el centro y no se pueda ajustar la pantalla. 
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    // ----------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnRecepcion = new javax.swing.JButton();
        btnTrainers = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loggin");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setBackground(new java.awt.Color(57, 57, 57));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo.jpeg"))); // NOI18N

        btnRecepcion.setBackground(new java.awt.Color(57, 57, 57));
        btnRecepcion.setFont(new java.awt.Font("Eras Medium ITC", 0, 17)); // NOI18N
        btnRecepcion.setForeground(new java.awt.Color(255, 255, 255));
        btnRecepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/bar-chart-outline.png"))); // NOI18N
        btnRecepcion.setText(" Recepción");
        btnRecepcion.setAlignmentY(0.0F);
        btnRecepcion.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnRecepcion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecepcion.setPreferredSize(new java.awt.Dimension(70, 20));
        btnRecepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecepcionActionPerformed(evt);
            }
        });

        btnTrainers.setBackground(new java.awt.Color(57, 57, 57));
        btnTrainers.setFont(new java.awt.Font("Eras Medium ITC", 0, 17)); // NOI18N
        btnTrainers.setForeground(new java.awt.Color(255, 255, 255));
        btnTrainers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/barbell-outline.png"))); // NOI18N
        btnTrainers.setText("Trainers");
        btnTrainers.setAlignmentY(0.0F);
        btnTrainers.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        btnTrainers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTrainers.setPreferredSize(new java.awt.Dimension(70, 20));
        btnTrainers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrainersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTrainers, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnTrainers, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecepcionActionPerformed
        String passResepcion = JOptionPane.showInputDialog("Digite la contraseña para ingresar a Recepción");
        if (passResepcion.equals("123")) {
            Recepcion ventana = new Recepcion();
            ventana.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(rootPane, "Contraseña Incorrecta");
        }
    }//GEN-LAST:event_btnRecepcionActionPerformed

    private void btnTrainersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrainersActionPerformed
        String passResepcion = JOptionPane.showInputDialog("Digite la contraseña para ingresar a Entrenadores");
        if (passResepcion.equals("456")) {
            Trainers ventana = new Trainers();
            ventana.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Contraseña Incorrecta");
        }
    }//GEN-LAST:event_btnTrainersActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loggin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRecepcion;
    private javax.swing.JButton btnTrainers;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
