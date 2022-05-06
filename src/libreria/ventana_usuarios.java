
package libreria;

import java.awt.Color;
import Base_Datos_Conexion.ConsultasBD;
import codigo_ventana.clase_ventanaVolver_inicio;

public class ventana_usuarios extends javax.swing.JFrame {

    public ventana_usuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        addWindowListener(new clase_ventanaVolver_inicio());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        nombre_caja = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Autor = new javax.swing.JLabel();
        paterno_caja = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Editorial = new javax.swing.JLabel();
        materno_caja = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        ID = new javax.swing.JLabel();
        direccion_caja = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        panel_entrar = new javax.swing.JPanel();
        boton_entrar = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        telefono_caja = new javax.swing.JTextField();
        Ejemplares = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(147, 146, 133));
        jPanel2.setForeground(new java.awt.Color(114, 99, 71));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/book.gif"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Victor Mono Medium", 2, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estefano´s");

        jLabel6.setFont(new java.awt.Font("Victor Mono Medium", 2, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("alpha");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel6)))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(159, 159, 159)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 0, 190, 680));

        jLabel4.setFont(new java.awt.Font("Victor Mono Medium", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("REGISTRO DE USUARIOS");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 40, -1, 30));

        Titulo.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Nombre");
        bg.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 80, -1, 35));

        nombre_caja.setBackground(new java.awt.Color(255, 255, 255));
        nombre_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        nombre_caja.setForeground(new java.awt.Color(153, 153, 153));
        nombre_caja.setText("Ingrese el nombre aquí");
        nombre_caja.setBorder(null);
        nombre_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombre_cajaMousePressed(evt);
            }
        });
        bg.add(nombre_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 125, 490, 33));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 164, 490, 11));

        Autor.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Autor.setForeground(new java.awt.Color(0, 0, 0));
        Autor.setText("Apellido paterno");
        bg.add(Autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 185, -1, 35));

        paterno_caja.setBackground(new java.awt.Color(255, 255, 255));
        paterno_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        paterno_caja.setForeground(new java.awt.Color(153, 153, 153));
        paterno_caja.setText("Ingrese el apellido paterno aquí");
        paterno_caja.setBorder(null);
        paterno_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                paterno_cajaMousePressed(evt);
            }
        });
        bg.add(paterno_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 230, 490, 33));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 269, 490, 11));

        Editorial.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Editorial.setForeground(new java.awt.Color(0, 0, 0));
        Editorial.setText("Apellido materno");
        bg.add(Editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 290, -1, 35));

        materno_caja.setBackground(new java.awt.Color(255, 255, 255));
        materno_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        materno_caja.setForeground(new java.awt.Color(153, 153, 153));
        materno_caja.setText("Ingrese el apellido materno aquí");
        materno_caja.setBorder(null);
        materno_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                materno_cajaMousePressed(evt);
            }
        });
        bg.add(materno_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 335, 490, 33));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 374, 490, 11));

        ID.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        ID.setForeground(new java.awt.Color(0, 0, 0));
        ID.setText("Direccion");
        bg.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 395, -1, 35));

        direccion_caja.setBackground(new java.awt.Color(255, 255, 255));
        direccion_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        direccion_caja.setForeground(new java.awt.Color(153, 153, 153));
        direccion_caja.setText("Ingrese la direccion aquí");
        direccion_caja.setBorder(null);
        direccion_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                direccion_cajaMousePressed(evt);
            }
        });
        bg.add(direccion_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 440, 490, 33));

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 479, 490, 11));

        panel_entrar.setBackground(new java.awt.Color(184, 183, 169));

        boton_entrar.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        boton_entrar.setForeground(new java.awt.Color(51, 51, 51));
        boton_entrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_entrar.setText("REGISTRAR");
        boton_entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_entrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_entrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_entrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_entrarLayout = new javax.swing.GroupLayout(panel_entrar);
        panel_entrar.setLayout(panel_entrarLayout);
        panel_entrarLayout.setHorizontalGroup(
            panel_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_entrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        panel_entrarLayout.setVerticalGroup(
            panel_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_entrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        );

        bg.add(panel_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 610, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 589, 490, 11));

        telefono_caja.setBackground(new java.awt.Color(255, 255, 255));
        telefono_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        telefono_caja.setForeground(new java.awt.Color(153, 153, 153));
        telefono_caja.setText("Ingrese el telefono aquí");
        telefono_caja.setBorder(null);
        telefono_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                telefono_cajaMousePressed(evt);
            }
        });
        bg.add(telefono_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 550, 490, 33));

        Ejemplares.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Ejemplares.setForeground(new java.awt.Color(0, 0, 0));
        Ejemplares.setText("Telefono");
        bg.add(Ejemplares, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 505, -1, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombre_cajaMousePressed

        if(nombre_caja.getText().equals("Ingrese el nombre aquí")){
            nombre_caja.setText("");
            nombre_caja.setForeground(Color.BLACK);
        }
        if(paterno_caja.getText().equals("")){
            paterno_caja.setText("Ingrese el apellido paterno aquí");
            paterno_caja.setForeground(new Color (153, 153, 153));
        }
        if(materno_caja.getText().equals("")){
            materno_caja.setText("Ingrese el apellido materno aquí");
            materno_caja.setForeground(new Color (153, 153, 153));
        }
        if(direccion_caja.getText().equals("")){
            direccion_caja.setText("Ingrese la direccion aquí");
            direccion_caja.setForeground(new Color (153, 153, 153));
        }
        if(telefono_caja.getText().equals("")){
            telefono_caja.setText("Ingrese el telefono aquí");
            telefono_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_nombre_cajaMousePressed

    private void paterno_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paterno_cajaMousePressed
        if(nombre_caja.getText().equals("")){
            nombre_caja.setText("Ingrese el nombre aquí");
            nombre_caja.setForeground(new Color (153, 153, 153));
        }
        if(paterno_caja.getText().equals("Ingrese el apellido paterno aquí")){
            paterno_caja.setText("");
            paterno_caja.setForeground(Color.BLACK);
        }
        if(materno_caja.getText().equals("")){
            materno_caja.setText("Ingrese el apellido materno aquí");
            materno_caja.setForeground(new Color (153, 153, 153));
        }
        if(direccion_caja.getText().equals("")){
            direccion_caja.setText("Ingrese la direccion aquí");
            direccion_caja.setForeground(new Color (153, 153, 153));
        }
        if(telefono_caja.getText().equals("")){
            telefono_caja.setText("Ingrese el telefono aquí");
            telefono_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_paterno_cajaMousePressed

    private void materno_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materno_cajaMousePressed
        if(nombre_caja.getText().equals("")){
            nombre_caja.setText("Ingrese el nombre aquí");
            nombre_caja.setForeground(new Color (153, 153, 153));
        }
        if(paterno_caja.getText().equals("")){
            paterno_caja.setText("Ingrese el apellido paterno aquí");
            paterno_caja.setForeground(new Color (153, 153, 153));
        }
        if(materno_caja.getText().equals("Ingrese el apellido materno aquí")){
            materno_caja.setText("");
            materno_caja.setForeground(Color.BLACK);
        }
        if(direccion_caja.getText().equals("")){
            direccion_caja.setText("Ingrese la direccion aquí");
            direccion_caja.setForeground(new Color (153, 153, 153));
        }
        if(telefono_caja.getText().equals("")){
            telefono_caja.setText("Ingrese el telefono aquí");
            telefono_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_materno_cajaMousePressed

    private void direccion_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_direccion_cajaMousePressed
        if(nombre_caja.getText().equals("")){
            nombre_caja.setText("Ingrese el nombre aquí");
            nombre_caja.setForeground(new Color (153, 153, 153));
        }
        if(paterno_caja.getText().equals("")){
            paterno_caja.setText("Ingrese el apellido paterno aquí");
            paterno_caja.setForeground(new Color (153, 153, 153));
        }
        if(materno_caja.getText().equals("")){
            materno_caja.setText("Ingrese el apellido materno aquí");
            materno_caja.setForeground(new Color (153, 153, 153));
        }
        if(direccion_caja.getText().equals("Ingrese la direccion aquí")){
            direccion_caja.setText("");
            direccion_caja.setForeground(Color.BLACK);
        }
        if(telefono_caja.getText().equals("")){
            telefono_caja.setText("Ingrese el telefono aquí");
            telefono_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_direccion_cajaMousePressed

    private void boton_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_entrarMouseClicked
        System.out.println(nombre_caja.getText());
        System.out.println(paterno_caja.getText());
        System.out.println(materno_caja.getText());
        System.out.println(direccion_caja.getText());
        System.out.println(telefono_caja.getText());
        
        ConsultasBD.insertarBaseDatos_TablaUsuarios(nombre_caja.getText(), paterno_caja.getText(),
                materno_caja.getText(), direccion_caja.getText(), telefono_caja.getText());
    }//GEN-LAST:event_boton_entrarMouseClicked

    private void boton_entrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_entrarMouseEntered
        panel_entrar.setBackground(new Color(112, 98, 70));
        boton_entrar.setForeground(Color.white);
    }//GEN-LAST:event_boton_entrarMouseEntered

    private void boton_entrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_entrarMouseExited
        panel_entrar.setBackground(new Color (184, 183, 169));
    }//GEN-LAST:event_boton_entrarMouseExited

    private void telefono_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefono_cajaMousePressed
        if(nombre_caja.getText().equals("")){
            nombre_caja.setText("Ingrese el nombre aquí");
            nombre_caja.setForeground(new Color (153, 153, 153));
        }
        if(paterno_caja.getText().equals("")){
            paterno_caja.setText("Ingrese el apellido paterno aquí");
            paterno_caja.setForeground(new Color (153, 153, 153));
        }
        if(materno_caja.getText().equals("")){
            materno_caja.setText("Ingrese el apellido materno aquí");
            materno_caja.setForeground(new Color (153, 153, 153));
        }
        if(direccion_caja.getText().equals("")){
            direccion_caja.setText("Ingrese la direccion aquí");
            direccion_caja.setForeground(new Color (153, 153, 153));
        }
        if(telefono_caja.getText().equals("Ingrese el telefono aquí")){
            telefono_caja.setText("");
            telefono_caja.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_telefono_cajaMousePressed

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
            java.util.logging.Logger.getLogger(ventana_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autor;
    private javax.swing.JLabel Editorial;
    private javax.swing.JLabel Ejemplares;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel boton_entrar;
    private javax.swing.JTextField direccion_caja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField materno_caja;
    private javax.swing.JTextField nombre_caja;
    private javax.swing.JPanel panel_entrar;
    private javax.swing.JTextField paterno_caja;
    private javax.swing.JTextField telefono_caja;
    // End of variables declaration//GEN-END:variables
}
