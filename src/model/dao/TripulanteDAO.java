
package model.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Conexion;
import model.Tripulante;


public class TripulanteDAO {
    
    Conexion conectar = new  Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public List listarT(){
        List<Tripulante> datos = new ArrayList<>();
        String sql = "select * from tripulante";
        try {
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Tripulante t = new Tripulante();
                t.setId(rs.getInt(1));
                t.setApellidos(rs.getString(2));
                t.setNombres(rs.getString(3));
                datos.add(t);
            }
            
        } catch (SQLException e){
        
        }
        
        return datos;
    }
    
    public int agregar(Tripulante t){
        String sql = "insert into tripulante (id,apellidos,nombres,codigo_est,codigo_ciu,codigo_gru) values(?,?,?,?,?,?) ";
        try{
            con=conectar.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1,t.getId());
            ps.setString(2,t.getApellidos());
            ps.setString(3,t.getNombres());
            ps.setInt(4,1);
            ps.setInt(5,1);
            ps.setString(6,"G69");
            ps.executeUpdate();
        } catch (Exception e){
        
        }
        
        return 1;
  
    }
    
}
