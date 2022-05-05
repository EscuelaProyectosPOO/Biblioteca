
package libreria;

import java.awt.Color;
import Base_Datos_Conexion.ConsultasBD;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ventana_prestamos extends javax.swing.JFrame {

    public ventana_prestamos() {
        initComponents();
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
        nombre_caja = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Editorial = new javax.swing.JLabel();
        paterno_caja = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        ID = new javax.swing.JLabel();
        materno_caja = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addContainerGap())
        );

        bg.add(barra_lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 0, 190, 680));

        jLabel4.setFont(new java.awt.Font("Victor Mono Medium", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("PRESTAMOS");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, 30));

        Titulo.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Identificador ");
        bg.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 80, -1, 35));

        id_caja.setBackground(new java.awt.Color(255, 255, 255));
        id_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        id_caja.setForeground(new java.awt.Color(153, 153, 153));
        id_caja.setText("Ingrese el ID del prestamo aquí");
        id_caja.setBorder(null);
        id_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                id_cajaMousePressed(evt);
            }
        });
        bg.add(id_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 125, 490, 33));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 164, 490, 11));

        Autor.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Autor.setForeground(new java.awt.Color(0, 0, 0));
        Autor.setText("Nombre");
        bg.add(Autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 185, -1, 35));

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
        bg.add(nombre_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 230, 490, 33));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 269, 490, 11));

        Editorial.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Editorial.setForeground(new java.awt.Color(0, 0, 0));
        Editorial.setText("Apellido paterno");
        bg.add(Editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 290, -1, 35));

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
        bg.add(paterno_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 335, 490, 33));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 374, 490, 11));

        ID.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        ID.setForeground(new java.awt.Color(0, 0, 0));
        ID.setText("Apellido materno");
        bg.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 395, -1, 35));

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
        bg.add(materno_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 440, 490, 33));

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 479, 490, 11));

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

        bg.add(panel_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 610, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 589, 490, 11));

        prestamo_caja.setBackground(new java.awt.Color(255, 255, 255));
        prestamo_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        prestamo_caja.setForeground(new java.awt.Color(153, 153, 153));
        prestamo_caja.setText("Ingrese la fecha aquí");
        prestamo_caja.setBorder(null);
        prestamo_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                prestamo_cajaMousePressed(evt);
            }
        });
        bg.add(prestamo_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 550, 490, 33));

        Ejemplares.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Ejemplares.setForeground(new java.awt.Color(0, 0, 0));
        Ejemplares.setText("Fecha de inicio de prestamo");
        bg.add(Ejemplares, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 505, -1, 35));

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

        bg.add(panel_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, -1, -1));

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

        bg.add(panel_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 610, -1, -1));

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

        bg.add(panel_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 610, -1, -1));

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

    private void id_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_cajaMousePressed

        if(id_caja.getText().equals("Ingrese el nombre aquí")){
            id_caja.setText("");
            id_caja.setForeground(Color.BLACK);
        }
        if(nombre_caja.getText().equals("")){
            nombre_caja.setText("Ingrese el apellido paterno aquí");
            nombre_caja.setForeground(new Color (153, 153, 153));
        }
        if(paterno_caja.getText().equals("")){
            paterno_caja.setText("Ingrese el apellido materno aquí");
            paterno_caja.setForeground(new Color (153, 153, 153));
        }
        if(materno_caja.getText().equals("")){
            materno_caja.setText("Ingrese la direccion aquí");
            materno_caja.setForeground(new Color (153, 153, 153));
        }
        if(prestamo_caja.getText().equals("")){
            prestamo_caja.setText("Ingrese el telefono aquí");
            prestamo_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_id_cajaMousePressed

    private void nombre_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombre_cajaMousePressed
        if(id_caja.getText().equals("")){
            id_caja.setText("Ingrese el nombre aquí");
            id_caja.setForeground(new Color (153, 153, 153));
        }
        if(nombre_caja.getText().equals("Ingrese el apellido paterno aquí")){
            nombre_caja.setText("");
            nombre_caja.setForeground(Color.BLACK);
        }
        if(paterno_caja.getText().equals("")){
            paterno_caja.setText("Ingrese el apellido materno aquí");
            paterno_caja.setForeground(new Color (153, 153, 153));
        }
        if(materno_caja.getText().equals("")){
            materno_caja.setText("Ingrese la direccion aquí");
            materno_caja.setForeground(new Color (153, 153, 153));
        }
        if(prestamo_caja.getText().equals("")){
            prestamo_caja.setText("Ingrese el telefono aquí");
            prestamo_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_nombre_cajaMousePressed

    private void paterno_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paterno_cajaMousePressed
        if(id_caja.getText().equals("")){
            id_caja.setText("Ingrese el nombre aquí");
            id_caja.setForeground(new Color (153, 153, 153));
        }
        if(nombre_caja.getText().equals("")){
            nombre_caja.setText("Ingrese el apellido paterno aquí");
            nombre_caja.setForeground(new Color (153, 153, 153));
        }
        if(paterno_caja.getText().equals("Ingrese el apellido materno aquí")){
            paterno_caja.setText("");
            paterno_caja.setForeground(Color.BLACK);
        }
        if(materno_caja.getText().equals("")){
            materno_caja.setText("Ingrese la direccion aquí");
            materno_caja.setForeground(new Color (153, 153, 153));
        }
        if(prestamo_caja.getText().equals("")){
            prestamo_caja.setText("Ingrese el telefono aquí");
            prestamo_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_paterno_cajaMousePressed

    private void materno_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_materno_cajaMousePressed
        if(id_caja.getText().equals("")){
            id_caja.setText("Ingrese el nombre aquí");
            id_caja.setForeground(new Color (153, 153, 153));
        }
        if(nombre_caja.getText().equals("")){
            nombre_caja.setText("Ingrese el apellido paterno aquí");
            nombre_caja.setForeground(new Color (153, 153, 153));
        }
        if(paterno_caja.getText().equals("")){
            paterno_caja.setText("Ingrese el apellido materno aquí");
            paterno_caja.setForeground(new Color (153, 153, 153));
        }
        if(materno_caja.getText().equals("Ingrese la direccion aquí")){
            materno_caja.setText("");
            materno_caja.setForeground(Color.BLACK);
        }
        if(prestamo_caja.getText().equals("")){
            prestamo_caja.setText("Ingrese el telefono aquí");
            prestamo_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_materno_cajaMousePressed

    private void boton_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_registrarMouseClicked
        System.out.println(id_caja.getText());
        System.out.println(nombre_caja.getText());
        System.out.println(paterno_caja.getText());
        System.out.println(materno_caja.getText());
        System.out.println(prestamo_caja.getText());
      
//        try {
//            int idl = Integer.parseInt(id_caja.getText());
//        
//        
//            SimpleDateFormat formato = new SimpleDateFormat(prestamo_caja.getText());
//            
//            Date fecha_inicio_prestamo = formato.parse(prestamo_caja.getText());
//            //System.out.println(formato.format(fecha_inicio_prestamo));
//            
//            Date fecha_fin_prestamo = new Date(fecha_inicio_prestamo.getTime() + (1000 * 3600 * 24 * 3));
//
//            Base_Datos_Conexion.ConsultasBD conexion = new Base_Datos_Conexion.ConsultasBD();
//            conexion.insertarBaseDatos_TablaPrestamo(idl, nombre_caja.getText(), paterno_caja.getText(), materno_caja.getText(), fecha_inicio_prestamo, fecha_fin_prestamo);
//        } catch (ParseException ex) {
//            Logger.getLogger(ventana_prestamos.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_boton_registrarMouseClicked

    private void boton_registrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_registrarMouseEntered
        panel_registrar.setBackground(new Color(112, 98, 70));
        boton_registrar.setForeground(Color.white);
    }//GEN-LAST:event_boton_registrarMouseEntered

    private void boton_registrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_registrarMouseExited
        panel_registrar.setBackground(new Color (184, 183, 169));
    }//GEN-LAST:event_boton_registrarMouseExited

    private void prestamo_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prestamo_cajaMousePressed
        if(id_caja.getText().equals("")){
            id_caja.setText("Ingrese el nombre aquí");
            id_caja.setForeground(new Color (153, 153, 153));
        }
        if(nombre_caja.getText().equals("")){
            nombre_caja.setText("Ingrese el apellido paterno aquí");
            nombre_caja.setForeground(new Color (153, 153, 153));
        }
        if(paterno_caja.getText().equals("")){
            paterno_caja.setText("Ingrese el apellido materno aquí");
            paterno_caja.setForeground(new Color (153, 153, 153));
        }
        if(materno_caja.getText().equals("")){
            materno_caja.setText("Ingrese la direccion aquí");
            materno_caja.setForeground(new Color (153, 153, 153));
        }
        if(prestamo_caja.getText().equals("Ingrese el telefono aquí")){
            prestamo_caja.setText("");
            prestamo_caja.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_prestamo_cajaMousePressed

    private void boton_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_buscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_buscarMouseClicked

    private void boton_buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_buscarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_buscarMouseEntered

    private void boton_buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_buscarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_buscarMouseExited

    private void boton_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_eliminarMouseClicked

    private void boton_eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_eliminarMouseEntered

    private void boton_eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_eliminarMouseExited

    private void boton_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_actualizarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_actualizarMouseClicked

    private void boton_actualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_actualizarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_actualizarMouseEntered

    private void boton_actualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_actualizarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_actualizarMouseExited

    /**
     * @param args the command line arguments
     */
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autor;
    private javax.swing.JLabel Editorial;
    private javax.swing.JLabel Ejemplares;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel barra_lateral;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel boton_actualizar;
    private javax.swing.JLabel boton_buscar;
    private javax.swing.JLabel boton_eliminar;
    private javax.swing.JLabel boton_registrar;
    private javax.swing.JTextField id_caja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField materno_caja;
    private javax.swing.JTextField nombre_caja;
    private javax.swing.JPanel panel_actualizar;
    private javax.swing.JPanel panel_buscar;
    private javax.swing.JPanel panel_eliminar;
    private javax.swing.JPanel panel_registrar;
    private javax.swing.JTextField paterno_caja;
    private javax.swing.JTextField prestamo_caja;
    // End of variables declaration//GEN-END:variables
}
