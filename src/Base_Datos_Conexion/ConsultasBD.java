
package Base_Datos_Conexion;

import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author tetil
 */
public class ConsultasBD {
    
    private static String Nombre_base_datos = "Libreria";
    private static String Nombre_usario_base_datos = "Prueba";
    private static String Password = "123";
        
    
    public static String ConsultarBaseDatos(String nombre_campo, String nombre_tabla, String columna_identificadora, String valor_identificador){
        //Consultar en la base de datos
        String resultado = "";
        Connection conexion = null;
        
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            String conexionUrl = "jdbc:sqlserver://;"
                + "databaseName=" +Nombre_base_datos + ";"
                + "user="+ Nombre_usario_base_datos + ";"
                + "password=" + Password + ";"
                + "encrypt=true;trustServerCertificate=true;";

            conexion = DriverManager.getConnection(conexionUrl);
            
            String consulta = "SELECT "+ nombre_campo +" FROM " + nombre_tabla 
                    + " WHERE " +  columna_identificadora + " = ?";
            
            PreparedStatement pst = conexion.prepareStatement(consulta);
            
            pst.setString(1, valor_identificador.trim());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                
                 resultado = rs.getString(nombre_campo);
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Error en la consulta del campo "+ nombre_campo);
                
            
            }
            
            
            
        }catch(Exception e){
        }
        
        return resultado;
        
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
            
        } catch (Exception er) {
            System.out.println("Error " + er);
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
            
        } catch (Exception er) {
            System.out.println("Error " + er);
        }
            
     
    }
    
    
}   
