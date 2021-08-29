
package Modelo;

import DAO.Conexion;
import java.sql.ResultSet;
import javax.swing.JComboBox;

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

    public Funcionarios(String usuario, String nombres, String apellidos, String email, String password, String celular, int idCargo) {
        this.usuario = usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;
        this.celular = celular;
        this.idCargo = idCargo;
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
        
        String query = "SELECT User,Password,IdCargo FROM usuarios WHERE User = '"+ usuarioingresado +"'";
        String contrasena = "",user = "";
        int id = 0;
        
        rs = conexion.ExeConsulta(query);
        
        try{
            
            while(rs.next()){
                contrasena = rs.getString("Password");
                user = rs.getString("User");
                id = rs.getInt("IdCargo");
            }
            
            if(passwordingresado.equals(util.DesEncriptar(contrasena))){
                result = true;
            }else{
                
            }
            
            this.idCargo = id;
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return result;
    }
    
    public void callCargos(JComboBox ComboBoxCargos){
        
        Conexion conexion = new Conexion();
        ResultSet rs = null;
        
        String query = "SELECT IdCargo,NombreCargo FROM cargos WHERE IdCargo <> 2";
        
        rs = conexion.ExeConsulta(query);
        
        try{
            
            ComboBoxCargos.addItem("Seleccione una opcion ...");
            
            while(rs.next()){
                ComboBoxCargos.addItem(rs.getString("IdCargo") + " - " + rs.getString("NombreCargo"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public boolean addFuncionarios(String nombres,String apellidos,String cedula,String celular,String email,int Idcargo,String contrasena){
        
        Conexion conexion = new Conexion();
        boolean result = false;
        
        String query = "INSERT INTO usuarios (User,Nombres,Apellidos,Email,Password,Celular,Cedula,IdCargo) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+email+"','"+contrasena+"','"+celular+"','"+cedula+"',"+Idcargo+")";
        
        if (conexion.ExeConsultaBasica(query) == true) {
            result = true;
        }
        
        return result;
    }
    
}
