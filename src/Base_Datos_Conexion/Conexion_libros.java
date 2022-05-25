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
 * @author Ania Isabel
 */
public class Conexion_libros {
    
    private static String Nombre_base_datos = "Biblioteca";
    private static String Nombre_usario_base_datos = "Prueba";
    private static String Password = "123";
    
    public void insertar(String id_libro, String libro, int autor, int editorial, int ejemplares){
        Connection conexion = null;
        
        try{

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                String conexionUrl = "jdbc:sqlserver://;"
                    + "databaseName=" +Nombre_base_datos + ";"
                    + "user="+ Nombre_usario_base_datos + ";"
                    + "password=" + Password + ";"
                    + "encrypt=true;trustServerCertificate=true;";

                conexion = DriverManager.getConnection(conexionUrl);
                String consulta_libros = "Insert into Libros values ('" + id_libro + "', '" + libro + "')";
                
                PreparedStatement pstl = conexion.prepareStatement(consulta_libros);
                pstl.executeUpdate();
                
                String consulta = "Insert Into Relacion_libros values ('" + id_libro + "', " + autor + ", " + editorial
                        + ", " + ejemplares + ")";
                
                
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
    
    public ArrayList capturar_autores(){
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
                
                
                String consulta = "select Nombre from Autores" ;
                PreparedStatement pst = conexion.prepareStatement(consulta);
                ResultSet rs;
                rs = pst.executeQuery();
               
                if(rs != null){
                    while(rs.next()){
                        /*String id = String.valueOf(rs.getInt("ID_editorial"));
                        informacion_fila = Arrays.asList(id, rs.getString("Editorial"));*/
                        informacion_registro.add(rs.getString("Nombre"));
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
    
    public ArrayList capturar_editoriales(){
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
                
                
                String consulta = "select editorial from Editorial" ;
                PreparedStatement pst = conexion.prepareStatement(consulta);
                ResultSet rs;
                rs = pst.executeQuery();
               
                if(rs != null){
                    while(rs.next()){
                        /*String id = String.valueOf(rs.getInt("ID_editorial"));
                        informacion_fila = Arrays.asList(id, rs.getString("Editorial"));*/
                        informacion_registro.add(rs.getString("editorial"));
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
    
    public ArrayList buscar_id_autor(String nombre){
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
                
                
                String consulta = "select ID_autor from Autores where Nombre = '" + nombre + "'";
                PreparedStatement pst = conexion.prepareStatement(consulta);
                ResultSet rs;
                rs = pst.executeQuery();
               
                if(rs != null){
                    while(rs.next()){
                        /*String id = String.valueOf(rs.getInt("ID_editorial"));
                        informacion_fila = Arrays.asList(id, rs.getString("Editorial"));*/
                        informacion_registro.add(rs.getInt("ID_autor"));
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
    
    public void actualizar(String id_libro, String libro, int autor, int editorial, int ejemplares){
        Connection conexion = null;
        
        try{

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                String conexionUrl = "jdbc:sqlserver://;"
                    + "databaseName=" +Nombre_base_datos + ";"
                    + "user="+ Nombre_usario_base_datos + ";"
                    + "password=" + Password + ";"
                    + "encrypt=true;trustServerCertificate=true;";

                conexion = DriverManager.getConnection(conexionUrl);
                String consulta_libros = "update Libros set ID_libro = '" + id_libro + "', Titulo = '" + libro
                        + "' where ID_libro = '" + id_libro + "' or Titulo = '" + libro +"'";
                
                PreparedStatement pstl = conexion.prepareStatement(consulta_libros);
                pstl.executeUpdate();
                
                String consulta = "update Relacion_libros set ID_autor = " + autor 
                        + ", ID_editorial = " + editorial + ", ejemplares = " + ejemplares + "where ID_libro = '" + id_libro + "'";
                
                
                PreparedStatement pst = conexion.prepareStatement(consulta);
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Se ha actualizado el registro", "Informacion",
                        JOptionPane.INFORMATION_MESSAGE);
                conexion.close();
                
         } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error",
                        JOptionPane.ERROR_MESSAGE);
                System.out.println(e);

        }
    }
    
    public ArrayList buscar_id(String ID){
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
                
                
                String consulta = "select * from Relacion_libros where ID_libro = '" + ID + "'";
                PreparedStatement pst = conexion.prepareStatement(consulta);
                ResultSet rs;
                rs = pst.executeQuery();
               
                if(rs != null){
                    while(rs.next()){
                        informacion_registro.add(rs.getString("ID_libro"));
                        informacion_registro.add(rs.getInt("ID_autor"));
                        informacion_registro.add(rs.getInt("ID_editorial"));
                        informacion_registro.add(rs.getInt("ejemplares"));
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
    
    public ArrayList buscar_titulo(String libro){
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
                
                
                String consulta = "select Titulo from Libros where ID_Libro = '" + libro + "'";
                PreparedStatement pst = conexion.prepareStatement(consulta);
                ResultSet rs;
                rs = pst.executeQuery();
               
                if(rs != null){
                    while(rs.next()){
                        /*String id = String.valueOf(rs.getInt("ID_editorial"));
                        informacion_fila = Arrays.asList(id, rs.getString("Editorial"));*/
                        informacion_registro.add(rs.getString("Titulo"));
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
    
    public ArrayList buscar_autor(int autor){
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
                
                
                String consulta = "select Nombre from Autores where ID_autor = '" + autor + "'";
                PreparedStatement pst = conexion.prepareStatement(consulta);
                ResultSet rs;
                rs = pst.executeQuery();
               
                if(rs != null){
                    while(rs.next()){
                        /*String id = String.valueOf(rs.getInt("ID_editorial"));
                        informacion_fila = Arrays.asList(id, rs.getString("Editorial"));*/
                        informacion_registro.add(rs.getString("Nombre"));
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
    
    public void eliminar (String ID){
        Connection conexion = null;
        
        try{

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
                String conexionUrl = "jdbc:sqlserver://;"
                    + "databaseName=" +Nombre_base_datos + ";"
                    + "user="+ Nombre_usario_base_datos + ";"
                    + "password=" + Password + ";"
                    + "encrypt=true;trustServerCertificate=true;";

                conexion = DriverManager.getConnection(conexionUrl);
                
                String consulta_relacion = "delete from Relacion_libros where ID_libro = '" + ID + "'";
                PreparedStatement pst = conexion.prepareStatement(consulta_relacion);
                pst.executeUpdate();
                
                String consulta_libros = "delete from Libros where ID_libro = '" + ID + "'";
                PreparedStatement pstl = conexion.prepareStatement(consulta_libros);
                pstl.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Se ha eliminado el registro", "Informacion",
                        JOptionPane.INFORMATION_MESSAGE);
                conexion.close();
                
         } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Error",
                        JOptionPane.ERROR_MESSAGE);

        }
    }
}