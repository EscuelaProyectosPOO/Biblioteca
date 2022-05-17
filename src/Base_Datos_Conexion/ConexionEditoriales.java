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
 * @author Ana Isabel
 */
public class ConexionEditoriales {
    private static String Nombre_base_datos = "Biblioteca";
    private static String Nombre_usario_base_datos = "Prueba";
    private static String Password = "123";
    
    public void insertar(int ID, String nombre){
        Connection conexion = null;
        
        try{

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                String conexionUrl = "jdbc:sqlserver://;"
                    + "databaseName=" +Nombre_base_datos + ";"
                    + "user="+ Nombre_usario_base_datos + ";"
                    + "password=" + Password + ";"
                    + "encrypt=true;trustServerCertificate=true;";

                conexion = DriverManager.getConnection(conexionUrl);
                
                String consulta = "Insert Into Editoriales values (" + ID + ", " + nombre + ")";
                PreparedStatement pst = conexion.prepareStatement(consulta);
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Se ha guardado el registro", "Informacion",
                        JOptionPane.INFORMATION_MESSAGE);
                conexion.close();
                
         } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error",
                        JOptionPane.ERROR_MESSAGE);

            }
    }
    
    public ArrayList busqueda_id(int ID){
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
                
                
                String consulta = "select * from Editorial where ID_editorial = " + ID;
                PreparedStatement pst = conexion.prepareStatement(consulta);
                pst.executeUpdate();
                ResultSet rs;
                rs = pst.executeQuery();
               
                if(rs.next()){
                
                for (int i=1;i<=rs.getMetaData().getColumnCount();i++)
                    informacion_registro.add(rs.getString(i));
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Error en la consulta del campo ");
                
            
            }
            
            conexion.close();
                
         } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error",
                        JOptionPane.ERROR_MESSAGE);

            }
        return informacion_registro;
    }
    
    public ArrayList busqueda_nombre(String nombre){
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
                
                String consulta = "select * from Editorial where ID_editorial = '" + nombre + "'";
                PreparedStatement pst = conexion.prepareStatement(consulta);
                pst.executeUpdate();
                ResultSet rs;
                rs = pst.executeQuery();
               
                if(rs.next()){
                
                for (int i=1;i<=rs.getMetaData().getColumnCount();i++)
                    informacion_registro.add(rs.getString(i));
                
            }else{
                
                JOptionPane.showMessageDialog(null, "Error en la consulta del campo ");
                
            
            }
            
            conexion.close();
                
         } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error",
                        JOptionPane.ERROR_MESSAGE);

            }
        return informacion_registro;
    }
    
    public void eliminar(int ID, String nombre){
            Connection conexion = null;
        
        try{

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                String conexionUrl = "jdbc:sqlserver://;"
                    + "databaseName=" +Nombre_base_datos + ";"
                    + "user="+ Nombre_usario_base_datos + ";"
                    + "password=" + Password + ";"
                    + "encrypt=true;trustServerCertificate=true;";

                conexion = DriverManager.getConnection(conexionUrl);
                
                String consulta = "delete from Editoriales where ID_editorial = " + ID + "or editorial = '" + nombre + "'";
                PreparedStatement pst = conexion.prepareStatement(consulta);
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Se ha guardado el registro", "Informacion",
                        JOptionPane.INFORMATION_MESSAGE);
                conexion.close();
                
         } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error",
                        JOptionPane.ERROR_MESSAGE);

            }
        }
    
}
