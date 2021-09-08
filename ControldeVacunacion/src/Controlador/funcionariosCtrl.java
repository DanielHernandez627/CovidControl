
package Controlador;

import javax.swing.JComboBox;
import Modelo.Funcionarios;
import Modelo.Utilidades;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class funcionariosCtrl {
    
    /*Inicio Objetos Metodos*/
        Funcionarios objFuncionario = new Funcionarios();
        Utilidades objUtilidades = new Utilidades();
    /*Fin Objetos Metodos*/
    
    public void obtenerCargos(JComboBox ComboBoxCargos){ //Metodo para cargar el combo de cargos
        objFuncionario.callCargos(ComboBoxCargos);
    }
    
    public void obtenerFuncionarios(JComboBox ComboBoxFuncionarios){ //Metodo para cargar el combo de funcionarios
        objFuncionario.callFuncionarios(ComboBoxFuncionarios);
    }
    
    public boolean ControlContrasena(String password){ //Metodo para control de caracteres en la contraseña
        
        boolean result = false;
        
        if(objUtilidades.controlContrasenas(password) ==  true){
            result = true;
        }
        
        return result;
    }
    
    public boolean registroFuncionario(String nombres,String apellidos,String cedula,String celular,String email,int Idcargo,String contrasena){ //Metodo de registro del funcionario
        
        boolean result = false;
        
        if (objFuncionario.addFuncionarios(nombres, apellidos, cedula, celular, email, Idcargo, objUtilidades.Encriptar(contrasena)) == true) {
            result = true;
        }
        
        return result;
    }
    
    public void obtenerInfoFuncionarios(JTextField txt_nombres,JTextField txt_apellidos,JTextField txt_cedula,JTextField txt_email,JPasswordField txt_password,JTextField txt_celular,JComboBox ComboBoxCargos,int IdFuncionario){
        objFuncionario.callInfoFuncionarios(txt_nombres, txt_apellidos, txt_cedula, txt_email, txt_password, txt_celular, ComboBoxCargos,IdFuncionario);
    }
    
    public boolean editarFuncionario(String nombres,String apellidos,String cedula,String celular,String email,int Idcargo,String contrasena,int idFuncionario){
        
        boolean result = false;
        
        if(objFuncionario.editFuncionario(nombres, apellidos, cedula, celular, email, Idcargo, objUtilidades.Encriptar(contrasena), idFuncionario) == true){
           result = true;
        }
        
        return result;
    }
    
    public boolean eliminarFuncionario(int idFuncionario){

        boolean result = false;

        if(objFuncionario.deleteFuncionario(idFuncionario) == true){
           result = true;
        }

        return result;
    }
}
