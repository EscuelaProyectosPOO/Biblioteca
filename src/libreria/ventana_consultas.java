
package libreria;

import codigo_ventana.clase_ventanaVolver_inicio;
import java.awt.Color;

public class ventana_consultas extends javax.swing.JFrame {

   
    public ventana_consultas() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        addWindowListener(new clase_ventanaVolver_inicio());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg2 = new javax.swing.JPanel();
        panel_titulo2 = new javax.swing.JPanel();
        label_titulo2 = new javax.swing.JLabel();
        buscar_panel = new javax.swing.JPanel();
        buscar_boton = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        OpcionCombo = new javax.swing.JComboBox<>();
        caja_busquedas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaConsultas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg2.setBackground(new java.awt.Color(255, 255, 255));

        panel_titulo2.setBackground(new java.awt.Color(147, 146, 133));

        label_titulo2.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 30)); // NOI18N
        label_titulo2.setForeground(new java.awt.Color(255, 255, 255));
        label_titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo2.setText("VENTANA DE CONSULTAS\n");

        javax.swing.GroupLayout panel_titulo2Layout = new javax.swing.GroupLayout(panel_titulo2);
        panel_titulo2.setLayout(panel_titulo2Layout);
        panel_titulo2Layout.setHorizontalGroup(
            panel_titulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_titulo2Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(label_titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_titulo2Layout.setVerticalGroup(
            panel_titulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_titulo2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(label_titulo2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buscar_panel.setBackground(new java.awt.Color(184, 183, 169));

        buscar_boton.setFont(new java.awt.Font("Victor Mono SemiBold", 1, 14)); // NOI18N
        buscar_boton.setForeground(new java.awt.Color(0, 0, 0));
        buscar_boton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscar_boton.setText("BUSCAR");
        buscar_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscar_botonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscar_botonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscar_botonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout buscar_panelLayout = new javax.swing.GroupLayout(buscar_panel);
        buscar_panel.setLayout(buscar_panelLayout);
        buscar_panelLayout.setHorizontalGroup(
            buscar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscar_boton, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        buscar_panelLayout.setVerticalGroup(
            buscar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscar_boton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        OpcionCombo.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 15)); // NOI18N
        OpcionCombo.setMaximumRowCount(3);
        OpcionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libros", "Usuarios", "Prestamos" }));
        OpcionCombo.setBorder(null);
        OpcionCombo.setMinimumSize(new java.awt.Dimension(72, 30));
        OpcionCombo.setPreferredSize(new java.awt.Dimension(72, 30));
        OpcionCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionComboActionPerformed(evt);
            }
        });

        caja_busquedas.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        caja_busquedas.setForeground(new java.awt.Color(153, 153, 153));
        caja_busquedas.setText("Ingrese su consulta aquí");
        caja_busquedas.setBorder(null);
        caja_busquedas.setPreferredSize(new java.awt.Dimension(188, 30));
        caja_busquedas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                caja_busquedasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                caja_busquedasMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 16)); // NOI18N
        jLabel2.setText("Opciones:");

        jLabel3.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 16)); // NOI18N
        jLabel3.setText("Buscador: ");

        TablaConsultas.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 13)); // NOI18N
        TablaConsultas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TablaConsultas);

        javax.swing.GroupLayout bg2Layout = new javax.swing.GroupLayout(bg2);
        bg2.setLayout(bg2Layout);
        bg2Layout.setHorizontalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(buscar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(caja_busquedas, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(OpcionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addComponent(panel_titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bg2Layout.setVerticalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panel_titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(caja_busquedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(OpcionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(buscar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_botonMouseClicked
        panel_buscar.setBackground(new Color(132, 132, 122));
        boton_buscar.setForeground(Color.white);
    }//GEN-LAST:event_buscar_botonMouseClicked

    private void OpcionComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionComboActionPerformed
        
    }//GEN-LAST:event_OpcionComboActionPerformed

    private void caja_busquedasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caja_busquedasMouseEntered
        if(caja_busquedas.getText().equals("Ingrese su consulta aquí")){
            caja_busquedas.setText("");
            caja_busquedas.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_caja_busquedasMouseEntered

    private void caja_busquedasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caja_busquedasMouseExited
        if(caja_busquedas.getText().equals("")){
            caja_busquedas.setText("Ingrese su consulta aquí");
            caja_busquedas.setForeground(new Color(155, 155, 155));
        }
    }//GEN-LAST:event_caja_busquedasMouseExited

    private void buscar_botonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_botonMouseEntered
 
    }//GEN-LAST:event_buscar_botonMouseEntered

    private void buscar_botonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_botonMouseExited
        
    }//GEN-LAST:event_buscar_botonMouseExited

   
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
            java.util.logging.Logger.getLogger(ventana_consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_consultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> OpcionCombo;
    private javax.swing.JTable TablaConsultas;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg1;
    private javax.swing.JPanel bg2;
    private javax.swing.JLabel boton_buscar;
    private javax.swing.JLabel boton_buscar1;
    private javax.swing.JLabel buscar_boton;
    private javax.swing.JPanel buscar_panel;
    private javax.swing.JTextField caja_busquedas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_titulo;
    private javax.swing.JLabel label_titulo1;
    private javax.swing.JLabel label_titulo2;
    private javax.swing.JPanel panel_buscar;
    private javax.swing.JPanel panel_buscar1;
    private javax.swing.JPanel panel_titulo;
    private javax.swing.JPanel panel_titulo1;
    private javax.swing.JPanel panel_titulo2;
    // End of variables declaration//GEN-END:variables
}
