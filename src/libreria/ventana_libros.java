package libreria;
import codigo_ventana.clase_ventanaVolver_inicio;
import Base_Datos_Conexion.ConsultasBD;
import Base_Datos_Conexion.Conexion_libros;
import Base_Datos_Conexion.ConexionEditoriales;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ventana_libros extends javax.swing.JFrame {
    
    public Base_Datos_Conexion.Conexion_libros obj = new Base_Datos_Conexion.Conexion_libros();

    //Variables posicionales para mover la ventana, por favor, no mover
    int xMouse, yMouse;
    //Fin de las variables
    
    public ventana_libros() {
        initComponents();
        opciones_combo();
        
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
        jSeparator1 = new javax.swing.JSeparator();
        Autor = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Editorial = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        ID = new javax.swing.JLabel();
        id_libro = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        panel_entrar = new javax.swing.JPanel();
        boton_entrar = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        ejemplares_caja = new javax.swing.JTextField();
        Ejemplares = new javax.swing.JLabel();
        titulo_caja = new javax.swing.JTextField();
        Titulo1 = new javax.swing.JLabel();
        ID1 = new javax.swing.JLabel();
        id_autor = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        ID2 = new javax.swing.JLabel();
        id_editorial = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        panel_limpiar = new javax.swing.JPanel();
        boton_limpiar = new javax.swing.JLabel();
        panel_buscar = new javax.swing.JPanel();
        boton_buscar = new javax.swing.JLabel();
        panel_eliminar = new javax.swing.JPanel();
        boton_eliminar = new javax.swing.JLabel();
        panel_actualizar = new javax.swing.JPanel();
        boton_actualizar = new javax.swing.JLabel();
        autores_combo = new javax.swing.JComboBox<>();
        editoriales_combo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));

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
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)))
                .addContainerGap(15, Short.MAX_VALUE))
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
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Victor Mono Medium", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("REGISTRO DE LIBROS");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        Autor.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Autor.setForeground(new java.awt.Color(0, 0, 0));
        Autor.setText("Autor");

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));

        Editorial.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Editorial.setForeground(new java.awt.Color(0, 0, 0));
        Editorial.setText("Editorial");

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));

        ID.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        ID.setForeground(new java.awt.Color(0, 0, 0));
        ID.setText("ID libro");

        id_libro.setBackground(new java.awt.Color(255, 255, 255));
        id_libro.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        id_libro.setForeground(new java.awt.Color(153, 153, 153));
        id_libro.setText("Ingrese el ID del libro aquí");
        id_libro.setBorder(null);
        id_libro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                id_libroMousePressed(evt);
            }
        });

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));

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
        });

        javax.swing.GroupLayout panel_entrarLayout = new javax.swing.GroupLayout(panel_entrar);
        panel_entrar.setLayout(panel_entrarLayout);
        panel_entrarLayout.setHorizontalGroup(
            panel_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_entrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );
        panel_entrarLayout.setVerticalGroup(
            panel_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_entrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_entrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));

        ejemplares_caja.setBackground(new java.awt.Color(255, 255, 255));
        ejemplares_caja.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        ejemplares_caja.setForeground(new java.awt.Color(153, 153, 153));
        ejemplares_caja.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ejemplares_caja.setText("Ingrese la cantidad de ejemplares aquí");
        ejemplares_caja.setBorder(null);
        ejemplares_caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ejemplares_cajaMousePressed(evt);
            }
        });

        Ejemplares.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Ejemplares.setForeground(new java.awt.Color(0, 0, 0));
        Ejemplares.setText("Ejemplares");

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

        Titulo1.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(0, 0, 0));
        Titulo1.setText("Titulo");

        ID1.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        ID1.setForeground(new java.awt.Color(0, 0, 0));
        ID1.setText("ID Autor");

        id_autor.setEditable(false);
        id_autor.setBackground(new java.awt.Color(255, 255, 255));
        id_autor.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        id_autor.setForeground(new java.awt.Color(153, 153, 153));
        id_autor.setText("Ingrese el ID del autor aquí");
        id_autor.setBorder(null);
        id_autor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                id_autorMousePressed(evt);
            }
        });
        id_autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_autorActionPerformed(evt);
            }
        });

        jSeparator7.setBackground(new java.awt.Color(204, 204, 204));

        ID2.setFont(new java.awt.Font("Victor Mono Medium", 1, 18)); // NOI18N
        ID2.setForeground(new java.awt.Color(0, 0, 0));
        ID2.setText("ID Editorial");

        id_editorial.setEditable(false);
        id_editorial.setBackground(new java.awt.Color(255, 255, 255));
        id_editorial.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        id_editorial.setForeground(new java.awt.Color(153, 153, 153));
        id_editorial.setText("Ingrese el ID de la editorial aquí");
        id_editorial.setBorder(null);
        id_editorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                id_editorialMousePressed(evt);
            }
        });

        jSeparator9.setBackground(new java.awt.Color(204, 204, 204));

        panel_limpiar.setBackground(new java.awt.Color(184, 183, 169));

        boton_limpiar.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        boton_limpiar.setForeground(new java.awt.Color(51, 51, 51));
        boton_limpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_limpiar.setText("LIMPIAR");
        boton_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        boton_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_limpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_limpiarLayout = new javax.swing.GroupLayout(panel_limpiar);
        panel_limpiar.setLayout(panel_limpiarLayout);
        panel_limpiarLayout.setHorizontalGroup(
            panel_limpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_limpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        panel_limpiarLayout.setVerticalGroup(
            panel_limpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_limpiarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        );

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
            .addComponent(boton_actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        panel_actualizarLayout.setVerticalGroup(
            panel_actualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_actualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boton_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        );

        autores_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Autor" }));
        autores_combo.setBorder(null);
        autores_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                autores_comboItemStateChanged(evt);
            }
        });

        editoriales_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Editorial" }));
        editoriales_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                editoriales_comboItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(269, 269, 269))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(0, 29, Short.MAX_VALUE)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Titulo1)
                                            .addComponent(Autor)
                                            .addComponent(jSeparator2)
                                            .addComponent(jSeparator1)
                                            .addComponent(titulo_caja, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                            .addComponent(autores_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(editoriales_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(12, 12, 12)))
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                                    .addComponent(jSeparator9)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(id_editorial, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                                .addComponent(ID1)
                                                .addComponent(id_autor, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                                                .addComponent(jSeparator5)
                                                .addComponent(ID2)
                                                .addComponent(id_libro))
                                            .addComponent(ID))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Editorial, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(25, 25, 25))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(ejemplares_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Ejemplares)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(panel_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(panel_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panel_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panel_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(bgLayout.createSequentialGroup()
                                                .addComponent(Titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(titulo_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(bgLayout.createSequentialGroup()
                                                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(id_libro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(5, 5, 5)
                                        .addComponent(Autor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(autores_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(id_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, 0)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ID2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(id_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(editoriales_combo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ejemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(ejemplares_caja, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panel_entrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panel_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(panel_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void opciones_combo(){
        //autores_combo.removeAllItems();
        ArrayList autores;
        
        autores = obj.capturar_autores();
        
        if (autores != null){
            for (int i=0; i<autores.size(); i++){
                autores_combo.addItem(String.valueOf(autores.get(i)));
            }
        }
        
         ArrayList editoriales;
        
        editoriales = obj.capturar_editoriales();
        
        if (editoriales != null){
            for (int i=0; i<editoriales.size(); i++){
                editoriales_combo.addItem(String.valueOf(editoriales.get(i)));
            }
        }
        
    }
    
    public void color_cajas(){
       titulo_caja.setForeground(new Color (0, 0, 0));
       id_libro.setForeground(new Color (0, 0, 0));
       id_autor.setForeground(new Color (0, 0, 0));
       id_editorial.setForeground(new Color (0, 0, 0));
       ejemplares_caja.setForeground(new Color (0, 0, 0));
    }
    
    private void titulo_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titulo_cajaMousePressed
        if(titulo_caja.getText().equals("Ingrese el titulo del libro aquí")){
            titulo_caja.setText("");
            titulo_caja.setForeground(new Color (0, 0, 0));
        }       
        if(id_libro.getText().equals("")){
            id_libro.setText("Ingrese el ID del libro aquí");
            id_libro.setForeground(new Color (153, 153, 153));
        }
        if(ejemplares_caja.getText().equals("")){
            ejemplares_caja.setText("Ingrese la cantidad de ejemplares aquí");
            ejemplares_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_titulo_cajaMousePressed

    private void id_libroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_libroMousePressed
        if(titulo_caja.getText().equals("")){
            titulo_caja.setText("Ingrese el titulo del libro aquí");
            titulo_caja.setForeground(new Color (153, 153, 153));
        }
             
        if(id_libro.getText().equals("Ingrese el ID del libro aquí")){
            id_libro.setText("");
            id_libro.setForeground(new Color (0, 0, 0));
        }
        if(ejemplares_caja.getText().equals("")){
            ejemplares_caja.setText("Ingrese la cantidad de ejemplares aquí");
            ejemplares_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_id_libroMousePressed

    private void id_autorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_autorMousePressed
        if(titulo_caja.getText().equals("")){
            titulo_caja.setText("Ingrese el titulo del libro aquí");
            titulo_caja.setForeground(new Color (153, 153, 153));
        }      
        if(id_libro.getText().equals("")){
            id_libro.setText("Ingrese el ID del libro aquí");
            id_libro.setForeground(new Color (153, 153, 153));
        }
        if(ejemplares_caja.getText().equals("")){
            ejemplares_caja.setText("Ingrese la cantidad de ejemplares aquí");
            ejemplares_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_id_autorMousePressed

    private void id_editorialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_editorialMousePressed
        if(titulo_caja.getText().equals("")){
            titulo_caja.setText("Ingrese el titulo del libro aquí");
            titulo_caja.setForeground(new Color (153, 153, 153));
        }       
        if(id_libro.getText().equals("")){
            id_libro.setText("Ingrese el ID del libro aquí");
            id_libro.setForeground(new Color (153, 153, 153));
        }
        if(ejemplares_caja.getText().equals("")){
            ejemplares_caja.setText("Ingrese la cantidad de ejemplares aquí");
            ejemplares_caja.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_id_editorialMousePressed

    private void ejemplares_cajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ejemplares_cajaMousePressed
        if(titulo_caja.getText().equals("")){
            titulo_caja.setText("Ingrese el titulo del libro aquí");
            titulo_caja.setForeground(new Color (153, 153, 153));
        }
               
        if(id_libro.getText().equals("")){
            id_libro.setText("Ingrese el ID del libro aquí");
            id_libro.setForeground(new Color (153, 153, 153));
        }
        if(ejemplares_caja.getText().equals("Ingrese la cantidad de ejemplares aquí")){
            ejemplares_caja.setText("");
            ejemplares_caja.setForeground(new Color (0, 0, 0));
        }
    }//GEN-LAST:event_ejemplares_cajaMousePressed

    private void boton_limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_limpiarMouseClicked
        titulo_caja.setText("Ingrese el titulo del libro aquí");
        titulo_caja.setForeground(new Color (153, 153, 153));
        
        id_libro.setText("Ingrese el ID del libro aquí");
        id_libro.setForeground(new Color (153, 153, 153));
        
        id_autor.setText("Ingrese el ID del autor aquí");
        id_autor.setForeground(new Color (153, 153, 153));
        
        id_editorial.setText("Ingrese el ID de la editorial aquí");
        id_editorial.setForeground(new Color (153, 153, 153));
        
        ejemplares_caja.setText("Ingrese la cantidad de ejemplares aquí");
        ejemplares_caja.setForeground(new Color (153, 153, 153));
        
        autores_combo.setSelectedIndex(0);
        editoriales_combo.setSelectedIndex(0);
        
    }//GEN-LAST:event_boton_limpiarMouseClicked

    private void boton_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_buscarMouseClicked
        if(id_libro.getText() != "Ingrese el ID del libro aquí"){
            ArrayList resultado = obj.buscar_id(id_libro.getText());
            System.out.println(resultado);
            
            if(resultado.size() > 0){
                id_autor.setText(String.valueOf(resultado.get(1)));
                id_autor.setForeground(new Color(0, 0, 0));

                id_editorial.setText(String.valueOf(resultado.get(2)));
                id_editorial.setForeground(new Color(0, 0, 0));

                ejemplares_caja.setText(String.valueOf(resultado.get(3)));
                ejemplares_caja.setForeground(new Color(0, 0, 0));

                int autor = Integer.parseInt(id_autor.getText());
                int editorial = Integer.parseInt(id_editorial.getText());

                ArrayList titulo = obj.buscar_titulo(id_libro.getText());
                titulo_caja.setText(String.valueOf(titulo.get(0)));
                titulo_caja.setForeground(new Color(0, 0, 0));
                
                ArrayList autores = obj.buscar_autor(autor);
                autores_combo.setSelectedItem(String.valueOf(autores.get(0)));
                
                Base_Datos_Conexion.ConexionEditoriales edi = new Base_Datos_Conexion.ConexionEditoriales();
                ArrayList editoriales = edi.busqueda_id(editorial);
                editoriales_combo.setSelectedItem(String.valueOf(editoriales.get(0)));
                
            }
            else{
                JOptionPane.showMessageDialog(null, "No se han encontrado registros que coincidan", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_boton_buscarMouseClicked

    private void boton_buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_buscarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_buscarMouseEntered

    private void boton_buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_buscarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_buscarMouseExited

    private void boton_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminarMouseClicked
        obj.eliminar(id_libro.getText());
    }//GEN-LAST:event_boton_eliminarMouseClicked

    private void boton_eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_eliminarMouseEntered

    private void boton_eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_eliminarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_eliminarMouseExited

    private void boton_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_actualizarMouseClicked
        obj.actualizar(id_libro.getText(), titulo_caja.getText(), Integer.parseInt(id_autor.getText()), 
                Integer.parseInt(id_editorial.getText()) , Integer.parseInt(ejemplares_caja.getText()));
    }//GEN-LAST:event_boton_actualizarMouseClicked

    private void boton_actualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_actualizarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_actualizarMouseEntered

    private void boton_actualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_actualizarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_actualizarMouseExited

    private void boton_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_entrarMouseClicked
        //Base_Datos_Conexion.ConsultasBD conexion = new Base_Datos_Conexion.ConsultasBD();
        try{
        //int autor, editorial, ejemplares;
        int autor = Integer.parseInt(id_autor.getText());
        int editorial = Integer.parseInt(id_editorial.getText());
        int ejemplares = Integer.parseInt(ejemplares_caja.getText());
        
        obj.insertar(id_libro.getText(), titulo_caja.getText(), autor, editorial, ejemplares);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Asegúrese de que el número de ejemplares sea un entero \n"+e, "Error",
                        JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_boton_entrarMouseClicked

    private void id_autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_autorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_autorActionPerformed

    private void autores_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_autores_comboItemStateChanged
        System.out.println(autores_combo.getSelectedItem());
        ArrayList id = obj.buscar_id_autor(String.valueOf(autores_combo.getSelectedItem()));
        if(autores_combo.getSelectedItem() != "Seleccionar Autor" && id != null){
            id_autor.setText(String.valueOf(id.get(0)));
            id_autor.setForeground(new Color(0, 0, 0));
        }
        else{
            id_autor.setText("Ingrese el ID del autor aquí");
            id_autor.setForeground(new Color (153, 153, 153));
        }
        
        
        
    }//GEN-LAST:event_autores_comboItemStateChanged

    private void editoriales_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_editoriales_comboItemStateChanged

        Base_Datos_Conexion.ConexionEditoriales edi = new Base_Datos_Conexion.ConexionEditoriales();
        ArrayList id = edi.busqueda_nombre(String.valueOf(editoriales_combo.getSelectedItem()));
        if(editoriales_combo.getSelectedItem() != "Seleccionar Editorial" && id != null){
            id_editorial.setText(String.valueOf(id.get(0)));
            id_editorial.setForeground(new Color(0, 0, 0));
        }
        else{
            id_editorial.setText("Ingrese el ID de la editorial aquí");
            id_editorial.setForeground(new Color (153, 153, 153));
        }
    }//GEN-LAST:event_editoriales_comboItemStateChanged
      
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autor;
    private javax.swing.JLabel Editorial;
    private javax.swing.JLabel Ejemplares;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel ID1;
    private javax.swing.JLabel ID2;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JComboBox<String> autores_combo;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel boton_actualizar;
    private javax.swing.JLabel boton_buscar;
    private javax.swing.JLabel boton_eliminar;
    private javax.swing.JLabel boton_entrar;
    private javax.swing.JLabel boton_limpiar;
    private javax.swing.JComboBox<String> editoriales_combo;
    private javax.swing.JTextField ejemplares_caja;
    private javax.swing.JTextField id_autor;
    private javax.swing.JTextField id_editorial;
    private javax.swing.JTextField id_libro;
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
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel panel_actualizar;
    private javax.swing.JPanel panel_buscar;
    private javax.swing.JPanel panel_eliminar;
    private javax.swing.JPanel panel_entrar;
    private javax.swing.JPanel panel_limpiar;
    private javax.swing.JTextField titulo_caja;
    // End of variables declaration//GEN-END:variables
}
