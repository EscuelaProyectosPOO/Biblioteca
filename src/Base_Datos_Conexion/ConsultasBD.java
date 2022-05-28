

package Base_Datos_Conexion;

import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;
import java.util.ArrayList;


/**
 *
 * @author tetil
 */
public class ConsultasBD {
    
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
                if(rs == null){
                    JOptionPane.showMessageDialog(null, "Error en la consulta del campo ");
                }
                
                
            
            }
            
            conexion.close();
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        return informacion_registro;
        
    }
    
    public static void eliminarRegistro(String nombre_tabla,  String columna_identificadora, int valor_identificador){
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
            
            String consulta = "DELETE FROM " + nombre_tabla 
                    + " WHERE " +  columna_identificadora + " = ?";
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
            pst.setInt(1, valor_identificador);
           
            
            pst.executeUpdate();
            
          
            conexion.close();
            
            JOptionPane.showMessageDialog(null, "Se ha eliminado el registro", "Informacion",
                    JOptionPane.INFORMATION_MESSAGE);
            
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    
    public static void ActualizarBaseDatos_Libro(String id_libro, String Titulo){
        
        //actualiza pero solo de la tabla de datos libro
        Connection conexion = null;
        
        
        
        try{

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String conexionUrl = "jdbc:sqlserver://;"
                + "databaseName=" +Nombre_base_datos + ";"
                + "user="+ Nombre_usario_base_datos + ";"
                + "password=" + Password + ";"
                + "encrypt=true;trustServerCertificate=true;";

            conexion = DriverManager.getConnection(conexionUrl);
            
            
            
            String consulta = "UPDATE Libros set Titulo = ? WHERE ID_libro = " + String.valueOf(id_libro);
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
            
            pst.setString(1, Titulo);

            
            pst.executeUpdate();//para que se ejecute
            
         
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se ha Actualizado el registro", "Informacion",
                    JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
    }
    
    
    public static void ActualizarBaseDatos_Prestamo(int id_libro, String Nombre, String Apellido_paterno, String Apellido_materno, java.sql.Date Fecha_prestamo_inicio, java.sql.Date Fecha_prestamo_fin){
        
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
            
            
            
            String consulta = "UPDATE Prestamo set ID_libro = ?, Nombre = ?, Apellido_paterno = ?, Apellido_materno = ?, Fecha_prestamo_inicio = ?, Fecha_prestamo_fin = ?   WHERE (ID_libro = " 
                    + String.valueOf(id_libro) + " and Nombre =  " + Nombre + " and Apellido_paterno = " + Apellido_paterno +")";
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
            
            pst.setInt(1, id_libro);
            pst.setString(2, Nombre);
            pst.setString(3,Apellido_paterno);
            pst.setString(4, Apellido_materno);
            pst.setDate(5,Fecha_prestamo_inicio );
            pst.setDate(6,Fecha_prestamo_fin );
            
            pst.executeUpdate();//para que se ejecute
            
         
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se ha actualizado el registro", "Informacion",
                    JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
    }
   
    public static void ActualizarBaseDatos_Usuarios(String Nombre, String Apellido_paterno, String Apellido_materno, String Direccion, String Telefono){
        
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
            
            
            
            String consulta = ("UPDATE Usuarios set Nombre = ?, Apellido_paterno = ?, Apellido_materno = ?, Direccion = ?, Telefono = ? where Nombre = " 
                    + Nombre + " and Apellido_paterno = " + Apellido_paterno + " and Apellido_materno = " + Apellido_materno);
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
           
            pst.setString(1, Nombre);
            pst.setString(2,Apellido_paterno);
            pst.setString(3, Apellido_materno);
            pst.setString(4,Direccion);
            pst.setString(5,Telefono);
            
            pst.executeUpdate();//para que se ejecute
            
         
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se ha actualizado el registro", "Informacion",
                    JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
    }
    
    
    
    public static void insertarBaseDatos_TablaLibros(int id_libro, String Titulo){
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
            
            
            
            String consulta = "INSERT INTO Libros VALUES(?,?)";
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
            
            pst.setInt(1, id_libro);
            pst.setString(2, Titulo);
            
            pst.executeUpdate();//para que se ejecute
            
         
            JOptionPane.showMessageDialog(null, "Se ha guardado el registro", "Informacion",
                    JOptionPane.INFORMATION_MESSAGE);
            conexion.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
            
     
    }
    
    public static void insertarBaseDatos_TablaUsuarios(String Nombre, String Apellido_paterno, String Apellido_materno, String Direccion, String Telefono){
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
            
            
            
            String consulta = "INSERT INTO Usuarios VALUES(?,?,?,?,?)";
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
            
            pst.setString(1, Nombre);
            pst.setString(2, Apellido_paterno);
            pst.setString(3, Apellido_materno);
            pst.setString(4, Direccion);
            pst.setString(5, Telefono);
            
            pst.executeUpdate();//para que se ejecute
            
         
            JOptionPane.showMessageDialog(null, "Se ha guardado el registro", "Informacion",
                    JOptionPane.INFORMATION_MESSAGE);
            conexion.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
            
     
    }
    
    public static void insertarBaseDatos_TablaPrestamo(int id_libro, String Nombre, String Apellido_paterno, String Apellido_materno, java.sql.Date Fecha_prestamo_inicio, java.sql.Date Fecha_prestamo_fin){
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
            
            
            
            String consulta = "INSERT INTO Prestamo VALUES(?,?,?,?,?,?)";
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
            
            pst.setInt(1, id_libro);
            pst.setString(2, Nombre);
            pst.setString(3, Apellido_paterno);
            pst.setString(4, Apellido_materno);
            pst.setDate(5, Fecha_prestamo_inicio);
            pst.setDate(6, Fecha_prestamo_fin);
            
            
            pst.executeUpdate();//para que se ejecute
            
         
            JOptionPane.showMessageDialog(null, "Se ha guardado el registro", "Informacion",
                    JOptionPane.INFORMATION_MESSAGE);
            conexion.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error",
                    JOptionPane.ERROR_MESSAGE);
            
        }
            
     
    }
    
    public static void insertarTablaAutor(int Id_autor, String nombre_autor){
        Connection conexion = null;
  
        
        try{

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String conexionUrl = "jdbc:sqlserver://;"
                + "databaseName=" +Nombre_base_datos + ";"
                + "user="+ Nombre_usario_base_datos + ";"
                + "password=" + Password + ";"
                + "encrypt=true;trustServerCertificate=true;";

            conexion = DriverManager.getConnection(conexionUrl);
            
            
            
             String consulta = "INSERT INTO Autores VALUES(?,?)";
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
            
            pst.setInt(1, Id_autor);
            pst.setString(2, nombre_autor);
            
            
            pst.executeUpdate();//para que se ejecute
            
         
            JOptionPane.showMessageDialog(null, "Se ha guardado el registro", "Informacion",
                    JOptionPane.INFORMATION_MESSAGE);
            conexion.close();
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error",
                    JOptionPane.ERROR_MESSAGE);
            
        }
            
     
    }
    
    
    public static void ActualizarBaseDatos_Autores(int Id_autor, String nombre_autor){
        
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
            
            
            
            String consulta = ("UPDATE Autores set Nombre = ? where ID_autor =" + String.valueOf(Id_autor) );
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
           
            pst.setString(1, nombre_autor);
            
            pst.executeUpdate();//para que se ejecute
            
         
            conexion.close();
            JOptionPane.showMessageDialog(null, "Se ha actualizado el registro", "Informacion",
                    JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
    }
    
    
    
    
    
    public static void main(String args[]) {
    
        //ConsultasBD.ActualizarBaseDatos("Libros","Editorial", "me batearon banda", "ID_libro", 1);
        //ConsultasBD.eliminarRegistro("Libros", "ID_libro", 1);
    
    }
    
    
    
}   
