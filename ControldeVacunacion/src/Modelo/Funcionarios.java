
package Modelo;

import DAO.Conexion;
import java.sql.ResultSet;

public class Funcionarios {
    
    private String usuario;
    private String nombres;
    private String apellidos;
    private String email;
    private String password;
    private String celular;
    private int idCargo;
 
    /*Inicio objetos*/
        Utilidades util = new Utilidades();
    /*Fin objetos*/
    
    public Funcionarios() {
    }

    public Funcionarios(String usuario, String nombres, String apellidos, String email, String password, String celular) {
        this.usuario = usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;
        this.celular = celular;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCelular() {
        return celular;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }
        
    public boolean controlSesion(String usuarioingresado,String passwordingresado){
        
        Conexion conexion = new Conexion();
        ResultSet rs = null;
        boolean result = false;
        
        String query = "SELECT User,Password FROM usuarios WHERE User = '"+ usuarioingresado +"'";
        String contrasena = "",user = "";
        
        rs = conexion.ExeConsulta(query);
        
        try{
            
            while(rs.next()){
                contrasena = rs.getString("Password");
                user = rs.getString("User");
            }
            
            if(passwordingresado.equals(util.DesEncriptar(contrasena))){
                result = true;
            }else{
                
            }
    
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return result;
    }
        
}
