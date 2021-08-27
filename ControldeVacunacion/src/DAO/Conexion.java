
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    
   Connection con=null;
   
   public Connection conect(){
        try 
          {
              //cargar nuestro driver
              Class.forName("com.mysql.jdbc.Driver");//jdbc:mysql://localhost:3306/programadores
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/covidcontrol","root","");
              System.out.println("conexion establecida");
              
          } 
         catch (ClassNotFoundException | SQLException e) 
          {
              System.out.println("error de conexion"+e);
          }
         return con;
   }
   
   public boolean ExeConsultaBasica(String Query){
       
       Connection reg = conect();
       boolean execution = false;
       
       try{
           PreparedStatement stm = reg.prepareStatement(Query);
           stm.executeQuery();
           reg.close();
           execution = true;
       }catch(SQLException ex){
           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
       }
       
       return execution;
   }
   
   public ResultSet ExeConsulta(String Query){
       
      Connection conect = conect();
      ResultSet rs = null;
      
      try{
          Statement st = conect.createStatement();
          rs = st.executeQuery(Query);    
      }catch(SQLException ex){
          Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
      }
      
      return rs;
      
   }
    
}
