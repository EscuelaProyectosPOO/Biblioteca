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
public class ConexionEditoriales {
    private static String Nombre_base_datos = "Biblioteca";
    private static String Nombre_usario_base_datos = "Prueba";
    private static String Password = "123";
    
    public void insertar(int ID, String nombre){
        Connection conexion = null;
        ArrayList b = busqueda_id(ID);
        System.out.println(b);
        
        if(b == null || b.size() == 0){
            try{

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                String conexionUrl = "jdbc:sqlserver://;"
                    + "databaseName=" +Nombre_base_datos + ";"
                    + "user="+ Nombre_usario_base_datos + ";"
                    + "password=" + Password + ";"
                    + "encrypt=true;trustServerCertificate=true;";

                conexion = DriverManager.getConnection(conexionUrl);
                
                String consulta = "Insert Into Editorial values (" + ID + ", '" + nombre + "')";
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
        else{
            JOptionPane.showMessageDialog(null, "Yaexiste una editorial registrada con este ID", "Error",
                        JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public ArrayList busqueda_id(int ID){
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
                
                
                String consulta = "select Editorial from Editorial where ID_editorial = " + ID;
                PreparedStatement pst = conexion.prepareStatement(consulta);
                ResultSet rs;
                rs = pst.executeQuery();
               
                if(rs != null){
                    while(rs.next()){
                        /*String id = String.valueOf(rs.getInt("ID_editorial"));
                        informacion_fila = Arrays.asList(id, rs.getString("Editorial"));*/
                        informacion_registro.add(rs.getString("Editorial"));
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
        return informacion_registro;
    }
    
    public ArrayList busqueda_nombre(String nombre){
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
                
                
                String consulta = "select ID_editorial from Editorial where Editorial = '" + nombre + "'";
                PreparedStatement pst = conexion.prepareStatement(consulta);
                ResultSet rs;
                rs = pst.executeQuery();
               
                if(rs != null){
                    while(rs.next()){
                        /*String id = String.valueOf(rs.getInt("ID_editorial"));
                        informacion_fila = Arrays.asList(id, rs.getString("Editorial"));*/
                        informacion_registro.add(rs.getInt("ID_editorial"));
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
                
                String consulta = "delete from Editorial where ID_editorial = " + ID + "or editorial = '" + nombre + "'";
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
    
    public void actualizar (int ID, String nombre){
            Connection conexion = null;
        
        try{

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                String conexionUrl = "jdbc:sqlserver://;"
                    + "databaseName=" +Nombre_base_datos + ";"
                    + "user="+ Nombre_usario_base_datos + ";"
                    + "password=" + Password + ";"
                    + "encrypt=true;trustServerCertificate=true;";

                conexion = DriverManager.getConnection(conexionUrl);
                
                String consulta = "update Editorial set ID_editorial = "+ ID + ", editorial= '" + nombre +"' where ID_editorial = " + ID + "or editorial = '" + nombre + "'";
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
