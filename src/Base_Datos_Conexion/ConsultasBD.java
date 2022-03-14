
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
    
    private static String Nombre_base_datos = "Libreria";
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
            
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e, "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        return informacion_registro;
        
    }
    
    public static void eliminarRegistro(String nombre_tabla,  String columna_identificadora, int valor_identificador){
        
    }
    
    public static void insertarBaseDatos_TablaLibros(int id_libro, String Titulo,String Autor, String Editorial, int Numero_ejemplares ){
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
            
            
            
            String consulta = "INSERT INTO Libros VALUES(?,?,?,?,?)";
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
            
            pst.setInt(1, id_libro);
            pst.setString(2, Titulo);
            pst.setString(3, Autor);
            pst.setString(4, Editorial);
            pst.setInt(5, Numero_ejemplares);
            
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
    
    
    
    
}   
