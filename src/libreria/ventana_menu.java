
package libreria;

import codigo_ventana.clase_ventanaVolver_inicio;
import java.awt.Color;

public class ventana_menu extends javax.swing.JFrame {

    public ventana_menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        addWindowListener(new clase_ventanaVolver_inicio());
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panel_prestamos = new javax.swing.JPanel();
        boton_prestamos = new javax.swing.JLabel();
        panel_usuarios = new javax.swing.JPanel();
        boton_usuarios = new javax.swing.JLabel();
        panel_libros = new javax.swing.JPanel();
        boton_libros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(147, 146, 133));

        jLabel1.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ESTEFANO'S ALPHA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MENÚ DEL USUARIO");

        panel_prestamos.setBackground(new java.awt.Color(184, 183, 169));

        boton_prestamos.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        boton_prestamos.setForeground(new java.awt.Color(51, 51, 51));
        boton_prestamos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_prestamos.setText("PRESTAMOS");
        boton_prestamos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_prestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_prestamosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_prestamosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_prestamosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_prestamosLayout = new javax.swing.GroupLayout(panel_prestamos);
        panel_prestamos.setLayout(panel_prestamosLayout);
        panel_prestamosLayout.setHorizontalGroup(
            panel_prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_prestamos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        panel_prestamosLayout.setVerticalGroup(
            panel_prestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_prestamosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_prestamos, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        );

        panel_usuarios.setBackground(new java.awt.Color(184, 183, 169));

        boton_usuarios.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        boton_usuarios.setForeground(new java.awt.Color(51, 51, 51));
        boton_usuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_usuarios.setText("USUARIOS");
        boton_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_usuariosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_usuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_usuariosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_usuariosLayout = new javax.swing.GroupLayout(panel_usuarios);
        panel_usuarios.setLayout(panel_usuariosLayout);
        panel_usuariosLayout.setHorizontalGroup(
            panel_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_usuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        panel_usuariosLayout.setVerticalGroup(
            panel_usuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_usuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        );

        panel_libros.setBackground(new java.awt.Color(184, 183, 169));

        boton_libros.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        boton_libros.setForeground(new java.awt.Color(51, 51, 51));
        boton_libros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_libros.setText("LIBROS");
        boton_libros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_libros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_librosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_librosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_librosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_librosLayout = new javax.swing.GroupLayout(panel_libros);
        panel_libros.setLayout(panel_librosLayout);
        panel_librosLayout.setHorizontalGroup(
            panel_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_libros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        panel_librosLayout.setVerticalGroup(
            panel_librosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_librosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_libros, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addComponent(panel_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(panel_libros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(panel_prestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(103, 103, 103)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_libros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_prestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    //Codigo del boton prestamos
    private void boton_prestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_prestamosMouseClicked
        new ventana_prestamos().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton_prestamosMouseClicked
    //Fin del codigo del boton prestamos
    
    
    private void boton_prestamosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_prestamosMouseEntered
        panel_prestamos.setBackground(new Color(132, 132, 122));
        boton_prestamos.setForeground(Color.white);
    }//GEN-LAST:event_boton_prestamosMouseEntered

    private void boton_prestamosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_prestamosMouseExited
        panel_prestamos.setBackground(new Color (184, 183, 169));
        boton_prestamos.setForeground(Color.black);
    }//GEN-LAST:event_boton_prestamosMouseExited

    
    //Codigo del boton prestamos
    private void boton_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_usuariosMouseClicked
        new ventana_usuarios().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton_usuariosMouseClicked
    //Fin del codigo del boton prestamos
    
    
    private void boton_usuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_usuariosMouseEntered
        panel_usuarios.setBackground(new Color(132, 132, 122));
        boton_usuarios.setForeground(Color.white);
    }//GEN-LAST:event_boton_usuariosMouseEntered

    private void boton_usuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_usuariosMouseExited
        panel_usuarios.setBackground(new Color (184, 183, 169));
        boton_usuarios.setForeground(Color.black);
    }//GEN-LAST:event_boton_usuariosMouseExited

    
    //Codigo del boton libros
    private void boton_librosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_librosMouseClicked
        new ventana_libros().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_boton_librosMouseClicked
    //Fin del codigo del boton libros
       
    
    private void boton_librosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_librosMouseEntered
        panel_libros.setBackground(new Color(132, 132, 122));
        boton_libros.setForeground(Color.white);
    }//GEN-LAST:event_boton_librosMouseEntered

    private void boton_librosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_librosMouseExited
        panel_libros.setBackground(new Color (184, 183, 169));
        boton_libros.setForeground(Color.black);
    }//GEN-LAST:event_boton_librosMouseExited

    
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
            java.util.logging.Logger.getLogger(ventana_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel boton_libros;
    private javax.swing.JLabel boton_prestamos;
    private javax.swing.JLabel boton_usuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel_libros;
    private javax.swing.JPanel panel_prestamos;
    private javax.swing.JPanel panel_usuarios;
    // End of variables declaration//GEN-END:variables
}
