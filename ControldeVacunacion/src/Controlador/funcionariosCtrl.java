
package Controlador;

import javax.swing.JComboBox;
import Modelo.Funcionarios;
import Modelo.Utilidades;

public class funcionariosCtrl {
    
    /*Inicio Objetos Metodos*/
        Funcionarios objFuncionario = new Funcionarios();
        Utilidades objUtilidades = new Utilidades();
    /*Fin Objetos Metodos*/
    
    public void obtenerCargos(JComboBox ComboBoxCargos){
        objFuncionario.callCargos(ComboBoxCargos);
    }
    
    public boolean ControlContrasena(String password){
        
        boolean result = false;
        
        if(objUtilidades.controlContrasenas(password) ==  true){
            result = true;
        }
        
        return result;
        
    }
    
    public boolean registroFuncionario(String nombres,String apellidos,String cedula,String celular,String email,int Idcargo,String contrasena){
        
        boolean result = false;
        
        if (objFuncionario.addFuncionarios(nombres, apellidos, cedula, celular, email, Idcargo, objUtilidades.Encriptar(contrasena)) == true) {
            result = true;
        }
        
        return result;
    }
    
}
