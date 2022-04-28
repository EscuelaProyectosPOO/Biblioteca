package libreria;
import codigo_ventana.clase_ventanaVolver_inicio;

import Base_Datos_Conexion.ConsultasBD;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ventana_libros extends javax.swing.JFrame {

    //Variables posicionales para mover la ventana, por favor, no mover
    int xMouse, yMouse;
    //Fin de las variables
    
    public ventana_libros() {
        initComponents();
        //Code for this window, do not touch
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
        titulo_caja = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Autor = new javax.swing.JLabel();
        autor_caja = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Editorial = new javax.swing.JLabel();
        editorial_caja = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        ID = new javax.swing.JLabel();
        id_caja = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        panel_entrar = new javax.swing.JPanel();
        boton_entrar = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        ejemplares_caja = new javax.swing.JTextField();
        Ejemplares = new javax.swing.JLabel();
        panel_buscar = new javax.swing.JPanel();
        boton_buscar = new javax.swing.JLabel();
        panel_actualizar = new javax.swing.JPanel();
        boton_actualizar = new javax.swing.JLabel();
        panel_eliminar = new javax.swing.JPanel();
        boton_eliminar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(147, 146, 133));
        jPanel2.setForeground(new java.awt.Color(114, 99, 71));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/book.gif"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Victor Mono Medium", 2, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("estefano´s");

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
        jLabel4.setText("REGISTRO DE LIBROS");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 40, -1, 30));

        Titulo.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Titulo");
        bg.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 80, -1, 35));

        titulo_caja.setBackground(new java.awt.Color(255, 255, 255));
        titulo_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        titulo_caja.setForeground(new java.awt.Color(153, 153, 153));
        titulo_caja.setText("Ingrese el titulo del libro aquí");
        titulo_caja.setBorder(null);
        titulo_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titulo_cajaMousePressed(evt);
            }
        });
        bg.add(titulo_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 125, 490, 33));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 164, 490, 11));

        Autor.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Autor.setForeground(new java.awt.Color(0, 0, 0));
        Autor.setText("Autor");
        bg.add(Autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 185, -1, 35));

        autor_caja.setBackground(new java.awt.Color(255, 255, 255));
        autor_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        autor_caja.setForeground(new java.awt.Color(153, 153, 153));
        autor_caja.setText("Ingrese el autor del libro aquí");
        autor_caja.setBorder(null);
        autor_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                autor_cajaMousePressed(evt);
            }
        });
        bg.add(autor_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 230, 490, 33));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 269, 490, 11));

        Editorial.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Editorial.setForeground(new java.awt.Color(0, 0, 0));
        Editorial.setText("Editorial");
        bg.add(Editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 290, -1, 35));

        editorial_caja.setBackground(new java.awt.Color(255, 255, 255));
        editorial_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        editorial_caja.setForeground(new java.awt.Color(153, 153, 153));
        editorial_caja.setText("Ingrese la editorial del libro aquí");
        editorial_caja.setBorder(null);
        editorial_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editorial_cajaMousePressed(evt);
            }
        });
        bg.add(editorial_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 335, 490, 33));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 374, 490, 11));

        ID.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        ID.setForeground(new java.awt.Color(0, 0, 0));
        ID.setText("Identificador");
        bg.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 395, -1, 35));

        id_caja.setBackground(new java.awt.Color(255, 255, 255));
        id_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        id_caja.setForeground(new java.awt.Color(153, 153, 153));
        id_caja.setText("Ingrese el ID del libro aquí");
        id_caja.setBorder(null);
        id_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                id_cajaMousePressed(evt);
            }
        });
        bg.add(id_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 440, 490, 33));

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

        bg.add(panel_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 610, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 589, 490, 11));

        ejemplares_caja.setBackground(new java.awt.Color(255, 255, 255));
        ejemplares_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        ejemplares_caja.setForeground(new java.awt.Color(153, 153, 153));
        ejemplares_caja.setText("Ingrese la cantidad de ejemplares aquí");
        ejemplares_caja.setBorder(null);
        ejemplares_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ejemplares_cajaMousePressed(evt);
            }
        });
        bg.add(ejemplares_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 550, 490, 33));

        Ejemplares.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Ejemplares.setForeground(new java.awt.Color(0, 0, 0));
        Ejemplares.setText("Ejemplares");
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

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
       
//Trabajar en la recoleccion de datos en este modulo
    private void boton_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_entrarMouseClicked
        //se registran los datos en la tabla libros
        try{
            int id_libro = Integer.parseInt(id_caja.getText());
            String Titulo_libro = titulo_caja.getText();
            String autor = autor_caja.getText();
            String editorial = editorial_caja.getText();
            int numero_ejemplares = Integer.parseInt(ejemplares_caja.getText());
            
            if(Titulo_libro.isEmpty() || Titulo_libro.equals("Ingrese el titulo del libro aquí") ||
                    autor.isEmpty() || autor.equals("Ingrese el titulo del libro aquí") ||
                    editorial.isEmpty() || editorial.equals("Ingrese la editorial del libro aquí")){
                
                JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos \n", "No se han podido registrar los datos",
                    JOptionPane.ERROR_MESSAGE);
            }else{
                
                ConsultasBD.insertarBaseDatos_TablaLibros(id_libro, Titulo_libro, autor, editorial, numero_ejemplares);
                limpiar_campos();
            }
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos \n" + e, "No se han podido registrar los datos",
                    JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_boton_entrarMouseClicked
    //Fin de funcion para trabajo
    
        
    //Inicio de las funciones de posicionamiento de la ventana, por favor, no mover
    private void boton_entrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_entrarMouseEntered
        panel_entrar.setBackground(new Color(132, 132, 122));
        boton_entrar.setForeground(Color.white);
    }//GEN-LAST:event_boton_entrarMouseEntered

    private void boton_entrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_entrarMouseExited
        panel_entrar.setBackground(new Color (184, 183, 169));
        boton_entrar.setForeground(Color.black);
    }//GEN-LAST:event_boton_entrarMouseExited

    private void titulo_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titulo_cajaMousePressed
        
        if(titulo_caja.getText().equals("Ingrese el titulo del libro aquí")){
            titulo_caja.setText("");
            titulo_caja.setForeground(Color.BLACK);
        }
        if(autor_caja.getText().equals("")){
            autor_caja.setText("Ingrese el autor del libro aquí");
            autor_caja.setForeground(new Color (153, 153, 153));
        }
        if(editorial_caja.getText().equals("")){
           editorial_caja.setText("Ingrese la editorial del libro aquí");
            editorial_caja.setForeground(new Color (153, 153, 153)); 
        }
        if(id_caja.getText().equals("")){
            id_caja.setText("Ingrese el ID del libro aquí");
            id_caja.setForeground(new Color (153, 153, 153));
        }
        if(ejemplares_caja.getText().equals("")){
            ejemplares_caja.setText("Ingrese la cantidad de ejemplares aquí");
            ejemplares_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_titulo_cajaMousePressed

    private void autor_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_autor_cajaMousePressed
        if(titulo_caja.getText().equals("")){
            titulo_caja.setText("Ingrese el titulo del libro aquí");
            titulo_caja.setForeground(new Color (153, 153, 153));
        }
        if(autor_caja.getText().equals("Ingrese el autor del libro aquí")){
            autor_caja.setText("");
            autor_caja.setForeground(Color.BLACK);
        }
        if(editorial_caja.getText().equals("")){
           editorial_caja.setText("Ingrese la editorial del libro aquí");
            editorial_caja.setForeground(new Color (153, 153, 153)); 
        }
        if(id_caja.getText().equals("")){
            id_caja.setText("Ingrese el ID del libro aquí");
            id_caja.setForeground(new Color (153, 153, 153));
        }
        if(ejemplares_caja.getText().equals("")){
            ejemplares_caja.setText("Ingrese la cantidad de ejemplares aquí");
            ejemplares_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_autor_cajaMousePressed

    private void editorial_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editorial_cajaMousePressed
        if(titulo_caja.getText().equals("")){
            titulo_caja.setText("Ingrese el titulo del libro aquí");
            titulo_caja.setForeground(new Color (153, 153, 153));
        }
        if(autor_caja.getText().equals("")){
            autor_caja.setText("Ingrese el autor del libro aquí");
            autor_caja.setForeground(new Color (153, 153, 153));
        }
        if(editorial_caja.getText().equals("Ingrese la editorial del libro aquí")){
           editorial_caja.setText("");
            editorial_caja.setForeground(Color.BLACK); 
        }
        if(id_caja.getText().equals("")){
            id_caja.setText("Ingrese el ID del libro aquí");
            id_caja.setForeground(new Color (153, 153, 153));
        }
        if(ejemplares_caja.getText().equals("")){
            ejemplares_caja.setText("Ingrese la cantidad de ejemplares aquí");
            ejemplares_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_editorial_cajaMousePressed

    private void id_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_cajaMousePressed
        if(titulo_caja.getText().equals("")){
            titulo_caja.setText("Ingrese el titulo del libro aquí");
            titulo_caja.setForeground(new Color (153, 153, 153));
        }
        if(autor_caja.getText().equals("")){
            autor_caja.setText("Ingrese el autor del libro aquí");
            autor_caja.setForeground(new Color (153, 153, 153));
        }
        if(editorial_caja.getText().equals("")){
           editorial_caja.setText("Ingrese la editorial del libro aquí");
            editorial_caja.setForeground(new Color (153, 153, 153)); 
        }
        if(id_caja.getText().equals("Ingrese el ID del libro aquí")){
            id_caja.setText("");
            id_caja.setForeground(Color.BLACK);
        }
        if(ejemplares_caja.getText().equals("")){
            ejemplares_caja.setText("Ingrese la cantidad de ejemplares aquí");
            ejemplares_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_id_cajaMousePressed

    private void ejemplares_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ejemplares_cajaMousePressed
        if(titulo_caja.getText().equals("")){
            titulo_caja.setText("Ingrese el titulo del libro aquí");
            titulo_caja.setForeground(new Color (153, 153, 153));
        }
        if(autor_caja.getText().equals("")){
            autor_caja.setText("Ingrese el autor del libro aquí");
            autor_caja.setForeground(new Color (153, 153, 153));
        }
        if(editorial_caja.getText().equals("")){
           editorial_caja.setText("Ingrese la editorial del libro aquí");
            editorial_caja.setForeground(new Color (153, 153, 153)); 
        }
        if(id_caja.getText().equals("")){
            id_caja.setText("Ingrese el ID del libro aquí");
            id_caja.setForeground(new Color (153, 153, 153));
        }
        if(ejemplares_caja.getText().equals("Ingrese la cantidad de ejemplares aquí")){
            ejemplares_caja.setText("");
            ejemplares_caja.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_ejemplares_cajaMousePressed

    private void boton_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_buscarMouseClicked
        // TODO add your handling code here:
        
        id_libro = Integer.parseInt(id_caja.getText());
        
        ArrayList informacion_registro;
        informacion_registro = ConsultasBD.ConsultarBaseDatos("Libros", "Id_libro", id_libro);
        
        titulo_caja.setText(String.valueOf(informacion_registro.get(1)));
        autor_caja.setText(String.valueOf(informacion_registro.get(2)));
        editorial_caja.setText(String.valueOf(informacion_registro.get(3)));
        ejemplares_caja.setText(String.valueOf(informacion_registro.get(4)));
        
        titulo_caja.setForeground(Color.black);
        autor_caja.setForeground(Color.black);
        editorial_caja.setForeground(Color.black);
        id_caja.setForeground(Color.black);
        ejemplares_caja.setForeground(Color.black);
        
        
        
        
        
        
        
    }//GEN-LAST:event_boton_buscarMouseClicked

    private void boton_buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_buscarMouseEntered
        panel_buscar.setBackground(new Color(132, 132, 122));
        boton_buscar.setForeground(Color.white);
    }//GEN-LAST:event_boton_buscarMouseEntered

    private void boton_buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_buscarMouseExited
        panel_buscar.setBackground(new Color (184, 183, 169));
        boton_buscar.setForeground(Color.black);
    }//GEN-LAST:event_boton_buscarMouseExited

    private void boton_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_actualizarMouseClicked
        // TODO add your handling code here:
        id_libro = Integer.parseInt(id_caja.getText());
        Titulo_libro = titulo_caja.getText();
        autor = autor_caja.getText();
        editorial = editorial_caja.getText();
        numero_ejemplares = Integer.parseInt(ejemplares_caja.getText());
        
        ConsultasBD.ActualizarBaseDatos_Libro(id_libro, Titulo_libro, autor, editorial, numero_ejemplares);
        
        
        
        
        
        
        
    }//GEN-LAST:event_boton_actualizarMouseClicked

    private void boton_actualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_actualizarMouseEntered
        panel_actualizar.setBackground(new Color(132, 132, 122));
        boton_actualizar.setForeground(Color.white);
    }//GEN-LAST:event_boton_actualizarMouseEntered

    private void boton_actualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_actualizarMouseExited
        panel_actualizar.setBackground(new Color (184, 183, 169));
        boton_actualizar.setForeground(Color.black);
    }//GEN-LAST:event_boton_actualizarMouseExited

    private void boton_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminarMouseClicked
        // TODO add your handling code here:
        
        
        
        id_libro = Integer.parseInt(id_caja.getText());
        ConsultasBD.eliminarRegistro("Libros", "ID_libro", id_libro);
        
    }//GEN-LAST:event_boton_eliminarMouseClicked

    private void boton_eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminarMouseEntered
        panel_eliminar.setBackground(new Color(132, 132, 122));
        boton_eliminar.setForeground(Color.white);
    }//GEN-LAST:event_boton_eliminarMouseEntered

    private void boton_eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminarMouseExited
        panel_eliminar.setBackground(new Color (184, 183, 169));
        boton_eliminar.setForeground(Color.black);
    }//GEN-LAST:event_boton_eliminarMouseExited
    //Fin de las funciones de posicionamiento
    
    //esta es para limpiara los campos y colocar las indicaciones
    public void limpiar_campos(){
        titulo_caja.setText("Ingrese el titulo del libro aquí");
        autor_caja.setText("Ingrese el autor del libro aquí");
        editorial_caja.setText("Ingrese la editorial del libro aquí");
        id_caja.setText("Ingrese el ID del libro aquí");
        ejemplares_caja.setText("Ingrese la cantidad de ejemplares aquí");
        
        titulo_caja.setForeground(new Color (153, 153, 153));
        autor_caja.setForeground(new Color (153, 153, 153));
        editorial_caja.setForeground(new Color (153, 153, 153)); 
        id_caja.setForeground(new Color (153, 153, 153));
        ejemplares_caja.setForeground(new Color (153, 153, 153));
        
        
    }
    
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
            java.util.logging.Logger.getLogger(ventana_libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_libros().setVisible(true);
            }
        });
    }
    private int id_libro ;
    private String Titulo_libro;
    private String autor;
    private String editorial;
    private int numero_ejemplares;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autor;
    private javax.swing.JLabel Editorial;
    private javax.swing.JLabel Ejemplares;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField autor_caja;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel boton_actualizar;
    private javax.swing.JLabel boton_buscar;
    private javax.swing.JLabel boton_eliminar;
    private javax.swing.JLabel boton_entrar;
    private javax.swing.JTextField editorial_caja;
    private javax.swing.JTextField ejemplares_caja;
    private javax.swing.JTextField id_caja;
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
    private javax.swing.JPanel panel_actualizar;
    private javax.swing.JPanel panel_buscar;
    private javax.swing.JPanel panel_eliminar;
    private javax.swing.JPanel panel_entrar;
    private javax.swing.JTextField titulo_caja;
    // End of variables declaration//GEN-END:variables
}
