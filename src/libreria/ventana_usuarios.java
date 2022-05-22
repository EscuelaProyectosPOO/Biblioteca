
package libreria;

import java.awt.Color;
import Base_Datos_Conexion.ConsultasBD;
import codigo_ventana.clase_ventanaVolver_inicio;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
//import Base_Datos_Conexion.ConexionUsuarios;

public class ventana_usuarios extends javax.swing.JFrame {
    
    public Base_Datos_Conexion.ConexionUsuarios obj = new Base_Datos_Conexion.ConexionUsuarios();
    
    public ventana_usuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        addWindowListener(new clase_ventanaVolver_inicio());
    }
    
    public void limpiar(){
        id_caja.setText("Ingrese la CURP aquí");
        id_caja.setForeground(new Color(153, 153, 153));

        nombre_caja.setText("Ingrese el nombre aquí");
        nombre_caja.setForeground(new Color(153, 153, 153));

        paterno_caja.setText("Ingrese el apellido paterno aquí");
        paterno_caja.setForeground(new Color(153, 153, 153));

        materno_caja.setText("Ingrese el apellido materno aquí");
        materno_caja.setForeground(new Color(153, 153, 153));

        direccion_caja.setText("Ingrese el dirección paterno aquí");
        direccion_caja.setForeground(new Color(153, 153, 153));

        telefono_caja.setText("Ingrese el telefono aquí");
        telefono_caja.setForeground(new Color(153, 153, 153));
    }
    public void ColorCajas(){
        id_caja.setForeground(Color.black);
        paterno_caja.setForeground(Color.black);
        materno_caja.setForeground(Color.black);
        direccion_caja.setForeground(Color.black);
        telefono_caja.setForeground(Color.black);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panel_buscar = new javax.swing.JPanel();
        boton_buscar = new javax.swing.JLabel();
        panel_entrar = new javax.swing.JPanel();
        boton_entrar = new javax.swing.JLabel();
        panel_eliminar = new javax.swing.JPanel();
        boton_eliminar = new javax.swing.JLabel();
        panel_actualizar = new javax.swing.JPanel();
        boton_actualizar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        id_caja = new javax.swing.JTextField();
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
        jSeparator6 = new javax.swing.JSeparator();
        telefono_caja = new javax.swing.JTextField();
        Ejemplares = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Titulo1 = new javax.swing.JLabel();
        nombre_caja = new javax.swing.JTextField();

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

        panel_buscar.setBackground(new java.awt.Color(184, 183, 169));

        boton_buscar.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        boton_buscar.setForeground(new java.awt.Color(51, 51, 51));
        boton_buscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_buscar.setText("BUSCAR");
        boton_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_buscarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_buscarLayout.setVerticalGroup(
            panel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_buscarLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(boton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_entrar.setBackground(new java.awt.Color(184, 183, 169));

        boton_entrar.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        boton_entrar.setForeground(new java.awt.Color(51, 51, 51));
        boton_entrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_entrar.setText("REGISTRAR");
        boton_entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
            .addGroup(panel_entrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_entrarLayout.setVerticalGroup(
            panel_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_entrarLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(boton_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_eliminar.setBackground(new java.awt.Color(184, 183, 169));

        boton_eliminar.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        boton_eliminar.setForeground(new java.awt.Color(51, 51, 51));
        boton_eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_eliminar.setText("ELIMINAR");
        boton_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_eliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_eliminarLayout.setVerticalGroup(
            panel_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_eliminarLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(boton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_actualizar.setBackground(new java.awt.Color(184, 183, 169));

        boton_actualizar.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        boton_actualizar.setForeground(new java.awt.Color(51, 51, 51));
        boton_actualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_actualizar.setText("ACTUALIZAR");
        boton_actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_actualizarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_actualizarLayout.setVerticalGroup(
            panel_actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_actualizarLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(boton_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(42, 42, 42))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(jLabel6))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panel_actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panel_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(129, 129, 129)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(panel_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(panel_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(panel_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(panel_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 0, 190, 940));

        jLabel4.setFont(new java.awt.Font("Victor Mono Medium", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("REGISTRO DE USUARIOS");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 40, -1, 30));

        Titulo.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("CURP");
        bg.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 35));

        id_caja.setBackground(new java.awt.Color(255, 255, 255));
        id_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        id_caja.setForeground(new java.awt.Color(153, 153, 153));
        id_caja.setText("Ingrese la CURP aquí");
        id_caja.setBorder(null);
        id_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                id_cajaMousePressed(evt);
            }
        });
        bg.add(id_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 490, 33));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 490, 20));

        Autor.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Autor.setForeground(new java.awt.Color(0, 0, 0));
        Autor.setText("Apellido paterno");
        bg.add(Autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 35));

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
        bg.add(paterno_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 490, 33));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 490, 11));

        Editorial.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Editorial.setForeground(new java.awt.Color(0, 0, 0));
        Editorial.setText("Apellido materno");
        bg.add(Editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, 35));

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
        bg.add(materno_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 490, 33));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 490, 11));

        ID.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        ID.setForeground(new java.awt.Color(0, 0, 0));
        ID.setText("Direccion");
        bg.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, 35));

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
        bg.add(direccion_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 490, 33));

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 660, 490, 11));

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 770, 490, 11));

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
        bg.add(telefono_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 730, 490, 33));

        Ejemplares.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Ejemplares.setForeground(new java.awt.Color(0, 0, 0));
        Ejemplares.setText("Telefono");
        bg.add(Ejemplares, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 690, -1, 35));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 490, 11));

        Titulo1.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(0, 0, 0));
        Titulo1.setText("Nombre");
        bg.add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, 35));

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
        bg.add(nombre_caja, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 490, 33));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_cajaMousePressed
        
        if(id_caja.getText().equals("Ingrese la CURP aquí")){
            id_caja.setText("");
            id_caja.setForeground(Color.BLACK);
        }
            
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
        if(telefono_caja.getText().equals("")){
            telefono_caja.setText("Ingrese el telefono aquí");
            telefono_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_id_cajaMousePressed

    private void paterno_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paterno_cajaMousePressed
        
        if(id_caja.getText().equals("")){
            id_caja.setText("Ingrese la CURP aquí");
            id_caja.setForeground(new Color (153, 153, 153));
        }
        
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
        
        if(id_caja.getText().equals("")){
            id_caja.setText("Ingrese la CURP aquí");
            id_caja.setForeground(new Color (153, 153, 153));
        }
        
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
        
        if(id_caja.getText().equals("")){
            id_caja.setText("Ingrese la CURP aquí");
            id_caja.setForeground(new Color (153, 153, 153));
        }
        
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

    private void telefono_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telefono_cajaMousePressed
        
        if(id_caja.getText().equals("")){
            id_caja.setText("Ingrese la CURP aquí");
            id_caja.setForeground(new Color (153, 153, 153));
        }
        
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

    private void boton_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_entrarMouseClicked
        try{
            obj.insertar(id_caja.getText(), nombre_caja.getText(), paterno_caja.getText(), materno_caja.getText(), 
                    telefono_caja.getText(), direccion_caja.getText());
            
            limpiar();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Error",
                        JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
        }
    }//GEN-LAST:event_boton_entrarMouseClicked

    private void boton_entrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_entrarMouseEntered
        panel_entrar.setBackground(new Color(132, 132, 122));
        boton_entrar.setForeground(Color.white);
    }//GEN-LAST:event_boton_entrarMouseEntered

    private void boton_entrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_entrarMouseExited
        panel_entrar.setBackground(new Color (184, 183, 169));
        boton_entrar.setForeground(Color.black);
    }//GEN-LAST:event_boton_entrarMouseExited

    private void boton_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_buscarMouseClicked
        
        try{
            ArrayList r = obj.busqueda(id_caja.getText());
            //Arrays.asList r;

            System.out.println(r);
            
            nombre_caja.setText(String.valueOf(r.get(1)));
            paterno_caja.setText(String.valueOf(r.get(2)));
            materno_caja.setText(String.valueOf(r.get(3)));
            telefono_caja.setText(String.valueOf(r.get(4)));
            direccion_caja.setText(String.valueOf(r.get(5)));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se han encontrado registros", "Error",
                        JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
        }
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
        try{
            obj.actualizar(id_caja.getText(), nombre_caja.getText(), paterno_caja.getText(), materno_caja.getText(), 
                    telefono_caja.getText(), direccion_caja.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Error",
                        JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
        }
        
        limpiar();
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
        obj.eliminar(id_caja.getText());
        limpiar();
    }//GEN-LAST:event_boton_eliminarMouseClicked

    private void boton_eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminarMouseEntered
        panel_eliminar.setBackground(new Color(132, 132, 122));
        boton_eliminar.setForeground(Color.white);
    }//GEN-LAST:event_boton_eliminarMouseEntered

    private void boton_eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminarMouseExited
        panel_eliminar.setBackground(new Color (184, 183, 169));
        boton_eliminar.setForeground(Color.black);
    }//GEN-LAST:event_boton_eliminarMouseExited

    private void nombre_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombre_cajaMousePressed
        if(id_caja.getText().equals("")){
            id_caja.setText("Ingrese la CURP aquí");
            id_caja.setForeground(new Color(153, 153, 153));
        }
        
        if("Ingrese el nombre aquí".equals(nombre_caja.getText())){
            nombre_caja.setText("");
            nombre_caja.setForeground(new Color(0, 0, 0));
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
        
       
    }//GEN-LAST:event_nombre_cajaMousePressed

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
    private javax.swing.JLabel Titulo1;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel boton_actualizar;
    private javax.swing.JLabel boton_buscar;
    private javax.swing.JLabel boton_eliminar;
    private javax.swing.JLabel boton_entrar;
    private javax.swing.JTextField direccion_caja;
    private javax.swing.JTextField id_caja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField materno_caja;
    private javax.swing.JTextField nombre_caja;
    private javax.swing.JPanel panel_actualizar;
    private javax.swing.JPanel panel_buscar;
    private javax.swing.JPanel panel_eliminar;
    private javax.swing.JPanel panel_entrar;
    private javax.swing.JTextField paterno_caja;
    private javax.swing.JTextField telefono_caja;
    // End of variables declaration//GEN-END:variables
}
