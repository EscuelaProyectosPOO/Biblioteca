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
 * @author Ana Isabel
 */
public class ConexionUsuarios {
    private static String Nombre_base_datos = "Biblioteca";
    private static String Nombre_usario_base_datos = "Prueba";
    private static String Password = "123";
    
    public void insertar(String ID, String nombre, String paterno, String materno, String tel, String direccion){
        Connection conexion = null;
        
        try{

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                String conexionUrl = "jdbc:sqlserver://;"
                    + "databaseName=" +Nombre_base_datos + ";"
                    + "user="+ Nombre_usario_base_datos + ";"
                    + "password=" + Password + ";"
                    + "encrypt=true;trustServerCertificate=true;";

                conexion = DriverManager.getConnection(conexionUrl);
                
                String consulta = "Insert Into Usuarios values ('" + ID + "', '" + nombre + "', '" + paterno +"', '" 
                        + materno + "', '" + tel +"', '" + direccion+"')";
                PreparedStatement pst = conexion.prepareStatement(consulta);
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Se ha guardado el registro", "Informacion",
                        JOptionPane.INFORMATION_MESSAGE);
                conexion.close();
                
         } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error",
                        JOptionPane.ERROR_MESSAGE);
                System.out.println(e);

            }
    }
    
    public ArrayList busqueda(String ID){
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
                
                
                String consulta = "select * from Usuarios where ID_usuario = '" + ID + "'";
                PreparedStatement pst = conexion.prepareStatement(consulta);
                ResultSet rs;
                rs = pst.executeQuery();
               
                if(rs != null){
                    while(rs.next()){
                        informacion_registro.add(rs.getString("ID_usuario"));
                        informacion_registro.add(rs.getString("Nombre"));
                        informacion_registro.add(rs.getString("Apellido_paterno"));
                        informacion_registro.add(rs.getString("Apellido_materno"));
                        informacion_registro.add(rs.getString("Telefono"));
                        informacion_registro.add(rs.getString("Direccion"));
                            
                    }
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Error en la consulta del campo ");
                
            
            }
            
            conexion.close();
                
         } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error",
                        JOptionPane.ERROR_MESSAGE);
                
                System.out.println(e);

            }
        //System.out.println(informacion_fila);
        return informacion_registro;
    }
    
    public void eliminar(String ID){
            Connection conexion = null;
        
        try{

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                String conexionUrl = "jdbc:sqlserver://;"
                    + "databaseName=" +Nombre_base_datos + ";"
                    + "user="+ Nombre_usario_base_datos + ";"
                    + "password=" + Password + ";"
                    + "encrypt=true;trustServerCertificate=true;";

                conexion = DriverManager.getConnection(conexionUrl);
                
                String consulta = "delete from Usuarios where ID_usuario = '" + ID + "'";
                PreparedStatement pst = conexion.prepareStatement(consulta);
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Se ha eliminado el registro", "Informacion",
                        JOptionPane.INFORMATION_MESSAGE);
                conexion.close();
                
         } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error",
                        JOptionPane.ERROR_MESSAGE);

        }
    }
    
    public void actualizar (String ID, String nombre, String paterno, String materno, String tel, String direccion){
            Connection conexion = null;
        
        try{

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                String conexionUrl = "jdbc:sqlserver://;"
                    + "databaseName=" +Nombre_base_datos + ";"
                    + "user="+ Nombre_usario_base_datos + ";"
                    + "password=" + Password + ";"
                    + "encrypt=true;trustServerCertificate=true;";

                conexion = DriverManager.getConnection(conexionUrl);
                
                String consulta = "update Usuarios set ID_usuario = '"+ ID + "', nombre= '" + nombre +"', Apellido_paterno = '" + paterno
                        +"', Apellido_materno = '" + materno + "', Telefono = '" + tel + "', Direccion = '" + direccion + "' "
                        + " where ID_usuario = '" + ID + "'";
                PreparedStatement pst = conexion.prepareStatement(consulta);
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Se ha actualizado el registro", "Informacion",
                        JOptionPane.INFORMATION_MESSAGE);
                conexion.close();
                
         } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error",
                        JOptionPane.ERROR_MESSAGE);

        }
    
    }
}
