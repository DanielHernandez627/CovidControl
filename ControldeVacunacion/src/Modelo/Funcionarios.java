
package Modelo;

import DAO.Conexion;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Funcionarios {
    
    private String usuario;
    private String nombres;
    private String apellidos;
    private String email;
    private String password;
    private String celular;
    private String cedula;
    private int idCargo;
 
    /*Inicio objetos*/
        Utilidades util = new Utilidades();
    /*Fin objetos*/
    
    public Funcionarios() {
    }

    public Funcionarios(String usuario, String nombres, String apellidos, String email, String password, String celular, String cedula, int idCargo) {
        this.usuario = usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;
        this.celular = celular;
        this.cedula = cedula;
        this.idCargo = idCargo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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
    
    public void callFuncionarios(JComboBox ComboBoxFuncionarios){
        
        Conexion conexion = new Conexion();
        ResultSet rs = null;
        
        String query = "SELECT Id,User FROM usuarios WHERE IdCargo <> 2";
        
        rs = conexion.ExeConsulta(query);
        
        try{
            
            ComboBoxFuncionarios.addItem("Seleccione una opcion ...");
            
            while(rs.next()){
                ComboBoxFuncionarios.addItem(rs.getString("Id") + " - " + rs.getString("User"));
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
    
    public void callInfoFuncionarios(JTextField txt_nombres,JTextField txt_apellidos,JTextField txt_cedula,JTextField txt_email,JPasswordField txt_password,JTextField txt_celular,JComboBox ComboBoxCargos,int IdFuncionario){
        
        Conexion conexion = new Conexion();
        ResultSet rs = null;
        ResultSet rs1 = null;
        
        int idcargo=0;
        
        String query = "SELECT Id,User,Nombres,Apellidos,Email,Password,Celular,Cedula,IdCargo FROM usuarios WHERE IdCargo <> 2  AND Id = '"+IdFuncionario+"'";
        
        
        rs = conexion.ExeConsulta(query);
        
        try{
            
            while(rs.next()){
               this.password = rs.getString("Password");
               this.nombres = rs.getString("Nombres");
               this.apellidos = rs.getString("Apellidos");
               this.email = rs.getString("Email");
               this.cedula = rs.getString("Cedula");
               this.celular = rs.getString("Celular");
               idcargo = rs.getInt("IdCargo");
            }
            
            rs.close();
        }catch(Exception e){
             e.printStackTrace();
        }
        
        txt_nombres.setText(getNombres());
        txt_apellidos.setText(getApellidos());
        txt_cedula.setText(getCedula());
        txt_email.setText(getEmail());
        txt_password.setText(util.DesEncriptar(getPassword()));
        txt_celular.setText(getCelular());
        
        String querycargo = "SELECT IdCargo,NombreCargo FROM cargos WHERE IdCargo <> 2 AND IdCargo = '"+idcargo+"'";
        
        rs1 = conexion.ExeConsulta(querycargo);
    
        try{
            
            while(rs1.next()){
                ComboBoxCargos.addItem(rs1.getString("IdCargo")+" - "+rs1.getString("NombreCargo"));
            }
            rs1.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        String querycargos = "SELECT IdCargo,NombreCargo FROM cargos WHERE IdCargo <> 2 AND IdCargo <> '"+idcargo+"'";
        rs1 = conexion.ExeConsulta(querycargos);
        
        try{
            
            while(rs1.next()){
                ComboBoxCargos.addItem(rs1.getString("IdCargo")+" - "+rs1.getString("NombreCargo"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public boolean editFuncionario(String nombres,String apellidos,String cedula,String celular,String email,int Idcargo,String contrasena,int idFuncionario){
        
        Conexion conexion = new Conexion();
        boolean result = false;
        
        String query = "UPDATE usuarios SET User = '"+cedula+"',Nombres = '"+nombres+"',Apellidos = '"+apellidos+"',Email = '"+email+"',Password = '"+contrasena+"',Celular = '"+celular+"',Cedula = '"+cedula+"',IdCargo = '"+Idcargo+"' WHERE Id = '"+idFuncionario+"'";
        
        if (conexion.ExeConsultaBasica(query) == true) {
            result = true;
        }
        
        return result;
    }
    
    public boolean deleteFuncionario(int idFuncionario){
        
        Conexion conexion = new Conexion();
        boolean result = false;
        
        String query = "DELETE FROM usuarios WHERE  Id = '"+idFuncionario+"'";
        
        if (conexion.ExeConsultaBasica(query) == true) {
            result = true;
        }
        
        return result;
    }
}
