
package libreria;

import java.awt.Color;
import Base_Datos_Conexion.Conexion_ventana_prestamos;
import codigo_ventana.clase_ventanaVolver_inicio;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ventana_prestamos extends javax.swing.JFrame {

    public ventana_prestamos() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        addWindowListener(new clase_ventanaVolver_inicio());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        barra_lateral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        id_caja = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Autor = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        panel_registrar = new javax.swing.JPanel();
        boton_registrar = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        prestamo_caja = new javax.swing.JTextField();
        Ejemplares = new javax.swing.JLabel();
        panel_buscar = new javax.swing.JPanel();
        boton_buscar = new javax.swing.JLabel();
        panel_eliminar = new javax.swing.JPanel();
        boton_eliminar = new javax.swing.JLabel();
        panel_actualizar = new javax.swing.JPanel();
        boton_actualizar = new javax.swing.JLabel();
        Ejemplares1 = new javax.swing.JLabel();
        caja_entregas = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        id_usuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        barra_lateral.setBackground(new java.awt.Color(147, 146, 133));
        barra_lateral.setForeground(new java.awt.Color(114, 99, 71));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/book.gif"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Victor Mono Medium", 2, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estefano´s");

        jLabel6.setFont(new java.awt.Font("Victor Mono Medium", 2, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("alpha");

        javax.swing.GroupLayout barra_lateralLayout = new javax.swing.GroupLayout(barra_lateral);
        barra_lateral.setLayout(barra_lateralLayout);
        barra_lateralLayout.setHorizontalGroup(
            barra_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra_lateralLayout.createSequentialGroup()
                .addGroup(barra_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barra_lateralLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1))
                    .addGroup(barra_lateralLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2))
                    .addGroup(barra_lateralLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel6)))
                .addGap(29, 29, 29))
        );
        barra_lateralLayout.setVerticalGroup(
            barra_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra_lateralLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(159, 159, 159)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Victor Mono Medium", 1, 24)); // NOI18N
        jLabel4.setText("PRESTAMOS");

        Titulo.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Titulo.setText("Identificador ");

        id_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        id_caja.setForeground(new java.awt.Color(153, 153, 153));
        id_caja.setText("Ingrese el ID del prestamo aquí");
        id_caja.setBorder(null);
        id_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                id_cajaMousePressed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        Autor.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Autor.setText("ID Usuario");

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));

        panel_registrar.setBackground(new java.awt.Color(184, 183, 169));

        boton_registrar.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        boton_registrar.setForeground(new java.awt.Color(51, 51, 51));
        boton_registrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_registrar.setText("REGISTRAR");
        boton_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_registrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_registrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_registrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_registrarLayout = new javax.swing.GroupLayout(panel_registrar);
        panel_registrar.setLayout(panel_registrarLayout);
        panel_registrarLayout.setHorizontalGroup(
            panel_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_registrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        panel_registrarLayout.setVerticalGroup(
            panel_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_registrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        );

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));

        prestamo_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        prestamo_caja.setForeground(new java.awt.Color(153, 153, 153));
        prestamo_caja.setText("Ingrese la fecha aquí en formato YYYY-MM-DD");
        prestamo_caja.setBorder(null);
        prestamo_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                prestamo_cajaMousePressed(evt);
            }
        });

        Ejemplares.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Ejemplares.setText("Fecha de inicio de prestamo");

        panel_buscar.setBackground(new java.awt.Color(184, 183, 169));

        boton_buscar.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        boton_buscar.setForeground(new java.awt.Color(51, 51, 51));
        boton_buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_buscar.setText("BUSCAR");
        boton_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_buscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_buscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_buscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_buscarLayout = new javax.swing.GroupLayout(panel_buscar);
        panel_buscar.setLayout(panel_buscarLayout);
        panel_buscarLayout.setHorizontalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        panel_buscarLayout.setVerticalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_buscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        );

        panel_eliminar.setBackground(new java.awt.Color(184, 183, 169));

        boton_eliminar.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        boton_eliminar.setForeground(new java.awt.Color(51, 51, 51));
        boton_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_eliminar.setText("ELIMINAR");
        boton_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_eliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_eliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_eliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_eliminarLayout = new javax.swing.GroupLayout(panel_eliminar);
        panel_eliminar.setLayout(panel_eliminarLayout);
        panel_eliminarLayout.setHorizontalGroup(
            panel_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        panel_eliminarLayout.setVerticalGroup(
            panel_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_eliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        );

        panel_actualizar.setBackground(new java.awt.Color(184, 183, 169));

        boton_actualizar.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        boton_actualizar.setForeground(new java.awt.Color(51, 51, 51));
        boton_actualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_actualizar.setText("ACTUALIZAR");
        boton_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_actualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton_actualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton_actualizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_actualizarLayout = new javax.swing.GroupLayout(panel_actualizar);
        panel_actualizar.setLayout(panel_actualizarLayout);
        panel_actualizarLayout.setHorizontalGroup(
            panel_actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        panel_actualizarLayout.setVerticalGroup(
            panel_actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_actualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        );

        Ejemplares1.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Ejemplares1.setText("Fecha de entrega");

        caja_entregas.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        caja_entregas.setForeground(new java.awt.Color(153, 153, 153));
        caja_entregas.setText("Ingrese la fecha aquí en formato YYYY-MM-DD");
        caja_entregas.setBorder(null);
        caja_entregas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                caja_entregasMousePressed(evt);
            }
        });

        jSeparator7.setBackground(new java.awt.Color(204, 204, 204));

        id_usuario.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        id_usuario.setForeground(new java.awt.Color(153, 153, 153));
        id_usuario.setText("Ingrese el ID del usuario aquí");
        id_usuario.setBorder(null);
        id_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                id_usuarioMousePressed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel4))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Titulo))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(id_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Ejemplares)
                    .addComponent(prestamo_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(panel_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(panel_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(panel_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(panel_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Ejemplares1)
                    .addComponent(caja_entregas, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Autor))))
                .addGap(36, 36, 36)
                .addComponent(barra_lateral, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(id_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Autor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(id_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Ejemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(prestamo_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ejemplares1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(caja_entregas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(barra_lateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_cajaMousePressed
        if(id_caja.getText().equals("Ingrese el ID del prestamo aquí")){
            id_caja.setText("");
            id_caja.setForeground(new Color (0, 0, 0));
        }
<<<<<<< HEAD
        if(id_usuario.getText().equals("")){
            id_usuario.setText("Ingrese el ID del usuario aquí");
            id_usuario.setForeground(new Color (153, 153, 153));
        }
=======
        
>>>>>>> 18b935f13d2bd79fb931d3b15f787cee94c99078
        if(prestamo_caja.getText().equals("")){
            prestamo_caja.setText("Ingrese la fecha aquí en formato YYYY-MM-DD");
            prestamo_caja.setForeground(new Color (153, 153, 153));
        }
        if(caja_entregas.getText().equals("")){
            caja_entregas.setText("Ingrese la fecha aquí en formato YYYY-MM-DD");
            caja_entregas.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_id_cajaMousePressed

    private void boton_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_registrarMouseClicked
<<<<<<< HEAD
        System.out.println(id_caja.getText());
        System.out.println(prestamo_caja.getText());
=======
>>>>>>> 18b935f13d2bd79fb931d3b15f787cee94c99078
      
      
        try {

            String id_libro = id_caja.getText();
            Date prestamo_inicio = Date.valueOf(prestamo_caja.getText());
            Date prestamo_fin = Date.valueOf(prestamo_caja1.getText());

            Conexion_prestamos.insertarBaseDatos_Prestamo(id_libro, id_usuario, prestamo_inicio, prestamo_fin);
            
            
            
        } catch (ParseException ex) {
            Logger.getLogger(ventana_prestamos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_boton_registrarMouseClicked

    private void boton_registrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_registrarMouseEntered
        panel_registrar.setBackground(new Color(132, 132, 122));
        boton_registrar.setForeground(Color.white);
    }//GEN-LAST:event_boton_registrarMouseEntered

    private void boton_registrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_registrarMouseExited
        panel_registrar.setBackground(new Color (184, 183, 169));
        boton_registrar.setForeground(Color.black);
    }//GEN-LAST:event_boton_registrarMouseExited

    private void prestamo_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamo_cajaMousePressed
        if(id_caja.getText().equals("")){
            id_caja.setText("Ingrese el ID del prestamo aquí");
            id_caja.setForeground(new Color (153, 153, 153));
        }
<<<<<<< HEAD
        if(id_usuario.getText().equals("")){
            id_usuario.setText("Ingrese el ID del usuario aquí");
            id_usuario.setForeground(new Color (153, 153, 153));
        }
        if(prestamo_caja.getText().equals("Ingrese la fecha aquí en formato YYYY-MM-DD")){
=======
        
        if(prestamo_caja.getText().equals("Ingrese el telefono aquí")){
>>>>>>> 18b935f13d2bd79fb931d3b15f787cee94c99078
            prestamo_caja.setText("");
            prestamo_caja.setForeground(new Color (0, 0, 0));
        }
        if(caja_entregas.getText().equals("")){
            caja_entregas.setText("Ingrese la fecha aquí en formato YYYY-MM-DD");
            caja_entregas.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_prestamo_cajaMousePressed

    private void boton_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_buscarMouseClicked
        
        Conexion_prestamos.ConsultarBaseDatos(id_caja.getText(), id_usuario)
        
    }//GEN-LAST:event_boton_buscarMouseClicked

    private void boton_buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_buscarMouseEntered
        panel_buscar.setBackground(new Color(132, 132, 122));
        boton_buscar.setForeground(Color.white);
    }//GEN-LAST:event_boton_buscarMouseEntered

    private void boton_buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_buscarMouseExited
        panel_buscar.setBackground(new Color (184, 183, 169));
        boton_buscar.setForeground(Color.black);
    }//GEN-LAST:event_boton_buscarMouseExited

    private void boton_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminarMouseClicked
        
        
        Conexion_prestamos.eliminarPrestamo(id_caja.getText(), id_usuario);
        
        
        
        
    }//GEN-LAST:event_boton_eliminarMouseClicked

    private void boton_eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminarMouseEntered
        panel_eliminar.setBackground(new Color(132, 132, 122));
        boton_eliminar.setForeground(Color.white);
    }//GEN-LAST:event_boton_eliminarMouseEntered

    private void boton_eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminarMouseExited
        panel_eliminar.setBackground(new Color (184, 183, 169));
        boton_eliminar.setForeground(Color.black);
    }//GEN-LAST:event_boton_eliminarMouseExited

    private void boton_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_actualizarMouseClicked
        
        String id_libro = id_caja.getText();
        Date prestamo_inicio = Date.valueOf(prestamo_caja.getText());
        Date prestamo_fin = Date.valueOf(prestamo_caja1.getText());
        
        Conexion_prestamos.ActualizarBaseDatosPrestamo(id_libro, id_usuario, prestamo_inicio, prestamo_fin);
        
        
        
    }//GEN-LAST:event_boton_actualizarMouseClicked

    private void boton_actualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_actualizarMouseEntered
        panel_actualizar.setBackground(new Color(132, 132, 122));
        boton_actualizar.setForeground(Color.white);
    }//GEN-LAST:event_boton_actualizarMouseEntered

    private void boton_actualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_actualizarMouseExited
        panel_actualizar.setBackground(new Color (184, 183, 169));
        boton_actualizar.setForeground(Color.black);
    }//GEN-LAST:event_boton_actualizarMouseExited

    private void caja_entregasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caja_entregasMousePressed
        if(id_caja.getText().equals("")){
            id_caja.setText("Ingrese el ID del prestamo aquí");
            id_caja.setForeground(new Color (153, 153, 153));
        }
        if(id_usuario.getText().equals("")){
            id_usuario.setText("Ingrese el ID del usuario aquí");
            id_usuario.setForeground(new Color (153, 153, 153));
        }
        if(prestamo_caja.getText().equals("")){
            prestamo_caja.setText("Ingrese la fecha aquí en formato YYYY-MM-DD");
            prestamo_caja.setForeground(new Color (153, 153, 153));
        }
        if(caja_entregas.getText().equals("Ingrese la fecha aquí en formato YYYY-MM-DD")){
            caja_entregas.setText("");
            caja_entregas.setForeground(new Color (0, 0, 0));
        }
    }//GEN-LAST:event_caja_entregasMousePressed

    private void id_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_usuarioMousePressed
        if(id_caja.getText().equals("")){
            id_caja.setText("Ingrese el ID del prestamo aquí");
            id_caja.setForeground(new Color (153, 153, 153));
        }
        if(id_usuario.getText().equals("Ingrese el ID del usuario aquí")){
            id_usuario.setText("");
            id_usuario.setForeground(new Color (0, 0, 0));
        }
        if(prestamo_caja.getText().equals("")){
            prestamo_caja.setText("Ingrese la fecha aquí en formato YYYY-MM-DD");
            prestamo_caja.setForeground(new Color (153, 153, 153));
        }
        if(caja_entregas.getText().equals("")){
            caja_entregas.setText("Ingrese la fecha aquí en formato YYYY-MM-DD");
            caja_entregas.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_id_usuarioMousePressed

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
            java.util.logging.Logger.getLogger(ventana_prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_prestamos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_prestamos().setVisible(true);
            }
        });
    }

    //variables propias 

    Conexion_ventana_prestamos Conexion_prestamos = new Conexion_ventana_prestamos();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autor;
    private javax.swing.JLabel Ejemplares;
    private javax.swing.JLabel Ejemplares1;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel barra_lateral;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel boton_actualizar;
    private javax.swing.JLabel boton_buscar;
    private javax.swing.JLabel boton_eliminar;
    private javax.swing.JLabel boton_registrar;
    private javax.swing.JTextField caja_entregas;
    private javax.swing.JTextField id_caja;
    private javax.swing.JTextField id_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel panel_actualizar;
    private javax.swing.JPanel panel_buscar;
    private javax.swing.JPanel panel_eliminar;
    private javax.swing.JPanel panel_registrar;
    private javax.swing.JTextField prestamo_caja;
    // End of variables declaration//GEN-END:variables
}
