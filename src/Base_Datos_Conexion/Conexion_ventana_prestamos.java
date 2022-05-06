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
public class Conexion_ventana_prestamos {
    
    private static String Nombre_base_datos = "Biblioteca";
    private static String Nombre_usario_base_datos = "Prueba";
    private static String Password = "123";
    
    public static ArrayList ConsultarBaseDatos(String id_libro, String id_usuario){
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
            
            String consulta = "SELECT * FROM Prestamo WHERE  ID_libro = ? and ID_usuario = ?";
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
            
            pst.setString(1, id_libro);
            pst.setString(2, id_usuario);
            
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
    
    
    public static void eliminarRegistro(String id_libro, String id_usuario){
        //eliminar registro
        
        Connection conexion = null;
       
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String conexionUrl = "jdbc:sqlserver://;"
                + "databaseName=" +Nombre_base_datos + ";"
                + "user="+ Nombre_usario_base_datos + ";"
                + "password=" + Password + ";"
                + "encrypt=true;trustServerCertificate=true;";

            conexion = DriverManager.getConnection(conexionUrl);
            
            String consulta = "DELETE FROM Prestamo WHERE  ID_libro = ? AND ID_usuario = ?";
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
            pst.setString(1, id_libro);
            pst.setString(2, id_usuario);
           
            
            pst.executeUpdate();
            
          
            conexion.close();
            
            JOptionPane.showMessageDialog(null, "Se ha eliminado el registro", "Informacion",
                    JOptionPane.INFORMATION_MESSAGE);
            
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    
    
    public static void ActualizarBaseDatos_Prestamo(String id_libro, String id_usuario, java.sql.Date Fecha_prestamo_inicio, java.sql.Date Fecha_prestamo_fin){
        
        //actualiza pero solo de la base de datos Prestamos
        Connection conexion = null;
        
        
        
        try{

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String conexionUrl = "jdbc:sqlserver://;"
                + "databaseName=" +Nombre_base_datos + ";"
                + "user="+ Nombre_usario_base_datos + ";"
                + "password=" + Password + ";"
                + "encrypt=true;trustServerCertificate=true;";

            conexion = DriverManager.getConnection(conexionUrl);
            
            
            
            String consulta = "UPDATE Prestamo SET ID_libro = ?, ID_usuario = ?, Fecha_prestamo_inicio = ?, Fecha_prestamo_fin = ?   WHERE (ID_libro = " 
                    + id_libro + " AND ID_usuario = " + id_usuario + ")";
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
            
            pst.setString(1, id_libro);
            pst.setString(2, id_usuario);
            pst.setDate(3,Fecha_prestamo_inicio );
            pst.setDate(4,Fecha_prestamo_fin );
            
            pst.executeUpdate();//para que se ejecute
            
         
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se ha actualizado el registro", "Informacion",
                    JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
    }
    
    public static void insertarBaseDatos_TablaPrestamo(String id_libro, String id_usuario, java.sql.Date Fecha_prestamo_inicio, java.sql.Date Fecha_prestamo_fin){
        //Inserta un registro en la base dde datos
        Connection conexion = null;
        
        
        
        try{

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String conexionUrl = "jdbc:sqlserver://;"
                + "databaseName=" +Nombre_base_datos + ";"
                + "user="+ Nombre_usario_base_datos + ";"
                + "password=" + Password + ";"
                + "encrypt=true;trustServerCertificate=true;";

            conexion = DriverManager.getConnection(conexionUrl);
            
            
            
            String consulta = "INSERT INTO Prestamo VALUES(?,?,?,?)";
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
            
            pst.setString(1, id_libro);
            pst.setString(2, id_usuario);
            pst.setDate(3, Fecha_prestamo_inicio);
            pst.setDate(4, Fecha_prestamo_fin);
            
            
            pst.executeUpdate();//para que se ejecute
            
         
            JOptionPane.showMessageDialog(null, "Se ha guardado el registro", "Informacion",
                    JOptionPane.INFORMATION_MESSAGE);
            conexion.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error",
                    JOptionPane.ERROR_MESSAGE);
            
        }
            
     
    }
    
    
    
}
