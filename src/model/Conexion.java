/*
*Javier Eduardo Vargas Alvis 
C2-G69
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {
    
    Connection con;
    
    public Connection  getConnection(){
        String url  = "jdbc:mysql://localhost:3306/c2g69";
        String user = "root";
        String pass = "Manchas1001";
        
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }
        
        return con;
        
    
    }
    
}
