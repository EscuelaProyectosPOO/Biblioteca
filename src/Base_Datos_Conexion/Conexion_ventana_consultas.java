/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Base_Datos_Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author tetil
 */
public class Conexion_ventana_consultas {
    
    private static String Nombre_base_datos = "Biblioteca";
    private static String Nombre_usario_base_datos = "Prueba";
    private static String Password = "123";
    
    public static ArrayList ConsultarTodosLosUsuarios(){
        //Consultar en la base de datos
        
        Connection conexion = null;
        ArrayList informacion_registro = new ArrayList();
        List<String> informacion_fila = new ArrayList();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String conexionUrl = "jdbc:sqlserver://;"
                + "databaseName=" +Nombre_base_datos + ";"
                + "user="+ Nombre_usario_base_datos + ";"
                + "password=" + Password + ";"
                + "encrypt=true;trustServerCertificate=true;";

            conexion = DriverManager.getConnection(conexionUrl);
            
            String consulta = "SELECT * FROM Usuarios ";
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
           
            ResultSet rs = pst.executeQuery();
            
//            if(rs.next()){
//                
                while(rs.next()){
                    
                    informacion_fila = Arrays.asList(rs.getString("ID_usuario"),
                            rs.getString("Nombre"),
                            rs.getString("Apellido_paterno"),
                            rs.getString("Apellido_materno"),
                            rs.getString("Direccion"),
                            rs.getString("Telefono"));
                    
                  
                   
                    
                    informacion_registro.add(informacion_fila);
                    
               }
//                
//                
//            }else{
//                
//                JOptionPane.showMessageDialog(null, "Error en la consulta del campo ");
//                
//            
//            }
            
            conexion.close();
            
            JOptionPane.showMessageDialog(null, "Datos encontrados con exito", "Informacion",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        return informacion_registro;
        
    }
    
    public static ArrayList ConsultaTodosLosLibros(){
        /*en esta consulta se traeran el nombre del idlibro, nombre del libro, su autor, su editorial y su numero de ejemplares*/
        
        
        Connection conexion = null;
        ArrayList informacion_registro = new ArrayList();
        List<String> informacion_fila = new ArrayList();
                    
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String conexionUrl = "jdbc:sqlserver://;"
                + "databaseName=" +Nombre_base_datos + ";"
                + "user="+ Nombre_usario_base_datos + ";"
                + "password=" + Password + ";"
                + "encrypt=true;trustServerCertificate=true;";

            conexion = DriverManager.getConnection(conexionUrl);
            
            String consulta = "select Libros.ID_libro, Libros.Titulo, Autores.Nombre, Editorial.Editorial, " +
                                "Relacion_libros.Ejemplares from Libros, Editorial, Autores, Relacion_libros " +
                                "where Relacion_libros.ID_autor = Autores.ID_autor " +
                                "and Relacion_libros.ID_editorial = Editorial.ID_editorial " +
                                "and Relacion_libros.ID_libro = Libros.ID_libro";
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
            
            
            ResultSet rs = pst.executeQuery();
            
//            if(rs.next()){
                
                while(rs.next()){
                    
                    informacion_fila = Arrays.asList(rs.getString("ID_libro"),
                            rs.getString("Titulo"),
                            rs.getString("Nombre"),
                            rs.getString("Editorial"),
                            String.valueOf(rs.getInt("Ejemplares")));
                    

                    
                    informacion_registro.add(informacion_fila);
                    
                }
                
                  
                
//            }else{
//                
//                JOptionPane.showMessageDialog(null, "Error en la consulta del campo ");
//                
//            
//            }
//            
            conexion.close();
            
            JOptionPane.showMessageDialog(null, "Datos encontrados con exito", "Informacion",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        return informacion_registro;
        
    }
    
    public static ArrayList ConsultarTodosLosPrestamos(){
        //Consultar en la base de datos
        
        Connection conexion = null;
        ArrayList informacion_registro = new ArrayList();
        List<String> informacion_fila = new ArrayList();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String conexionUrl = "jdbc:sqlserver://;"
                + "databaseName=" +Nombre_base_datos + ";"
                + "user="+ Nombre_usario_base_datos + ";"
                + "password=" + Password + ";"
                + "encrypt=true;trustServerCertificate=true;";

            conexion = DriverManager.getConnection(conexionUrl);
            
            String consulta = "select Libros.Titulo as titulo, Usuarios.Nombre as nombre," +
                                "Prestamo.Fecha_prestamo_inicio as inicio, Prestamo.Fecha_de_retorno as retorno " +
                                "from Prestamo, Libros, Usuarios " +
                                "where Prestamo.ID_libro = Libros.ID_libro " +
                                "and Prestamo.ID_usuario = Usuarios.ID_usuario";
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
            
            
            ResultSet rs = pst.executeQuery();
            
//            if(rs.next()){
                
                while(rs.next()){
                    
                   
                    informacion_fila = Arrays.asList( rs.getString("titulo"),
                                rs.getString("nombre"),
                                String.valueOf(rs.getDate("inicio")),
                                String.valueOf(rs.getDate("retorno")));
                    
                    
                    
                    informacion_registro.add(informacion_fila);
                    
                }
                
                
//            }else{
//                
//                JOptionPane.showMessageDialog(null, "Error en la consulta del campo ");
//                
//            
//            }
            
            conexion.close();
            
            JOptionPane.showMessageDialog(null, "Datos encontrados con exito", "Informacion",
                    JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        return informacion_registro;
        
    }
    
    
}
