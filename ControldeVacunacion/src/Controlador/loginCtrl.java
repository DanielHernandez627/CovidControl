
package Controlador;

import Modelo.Funcionarios;

public class loginCtrl {
    
    /*Inicio Objetos Metodos*/
    Funcionarios objFuncionario = new Funcionarios();
    /*Fin Objetos Metodos*/
    
    private static int IdCargo;
    
    public boolean ConsultaUsuario(String usuario,String password){
        
        boolean result = false;
        
        if (objFuncionario.controlSesion(usuario,password) == true) {
            result = true;
            IdCargo = objFuncionario.getIdCargo();
        }
        
        return result;
    }
    
    public int TipoCargo(){
        return IdCargo;
    }
    
}
