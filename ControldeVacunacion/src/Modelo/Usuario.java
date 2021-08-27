
package Modelo;

import DAO.Conexion;
import java.sql.ResultSet;

public class Usuario {
    
    private String usuario;
    private String nombres;
    private String apellidos;
    private String email;
    private String password;
    private String celular;

    public Usuario() {
    }

    public Usuario(String usuario, String nombres, String apellidos, String email, String password, String celular) {
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
    
    public boolean controlSesion(String password){
        
        Conexion conexion = new Conexion();
        ResultSet rs = null;
        
        String query = "SELECT * FROM cargos";
        String prueba = "";
        
        rs = conexion.ExeConsulta(query);
        
        try{
            
            while(rs.next()){
                prueba = prueba + rs.getString("IdCargo");
                prueba = prueba + rs.getString("NombreCargo");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return false;
    }
    
}
