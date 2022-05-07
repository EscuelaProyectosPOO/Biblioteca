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
import javax.swing.JOptionPane;

/**
 *
 * @author tetil
 */
public class Conexion_ventana_consultas {
    
    private static String Nombre_base_datos = "Biblioteca";
    private static String Nombre_usario_base_datos = "Prueba";
    private static String Password = "123";
    
     public static ArrayList ConsultarBaseDatos(String nombre_tabla,  String columna_identificadora, int valor_identificador){
        //Consultar en la base de datos
        
        Connection conexion = null;
        ArrayList informacion_registro = new ArrayList();
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String conexionUrl = "jdbc:sqlserver://;"
                + "databaseName=" +Nombre_base_datos + ";"
                + "user="+ Nombre_usario_base_datos + ";"
                + "password=" + Password + ";"
                + "encrypt=true;trustServerCertificate=true;";

            conexion = DriverManager.getConnection(conexionUrl);
            
            String consulta = "SELECT * FROM " + nombre_tabla 
                    + " WHERE " +  columna_identificadora + " = ?";
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
            
            pst.setInt(1, valor_identificador);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                
                for (int i=1;i<=rs.getMetaData().getColumnCount();i++)
                    informacion_registro.add(rs.getString(i));
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Error en la consulta del campo ");
                
            
            }
            
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
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String conexionUrl = "jdbc:sqlserver://;"
                + "databaseName=" +Nombre_base_datos + ";"
                + "user="+ Nombre_usario_base_datos + ";"
                + "password=" + Password + ";"
                + "encrypt=true;trustServerCertificate=true;";

            conexion = DriverManager.getConnection(conexionUrl);
            
            String consulta = "select Libros.ID_libro, Libros.Titulo, Editorial.Editorial, Autores.Nombre, " +
                                "Relacion_libros.Ejemplares from Libros, Editorial, Autores, Relacion_libros" +
                                "where Relacion_libros.ID_autor = Autores.ID_autor " +
                                "and Relacion_libros.ID_editorial = Editorial.ID_editorial " +
                                "and Relacion_libros.ID_libro = Libros.ID_libro";
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
            
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                
                for (int i=1;i<=rs.getMetaData().getColumnCount();i++)
                    informacion_registro.add(rs.getString(i));
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Error en la consulta del campo ");
                
            
            }
            
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
