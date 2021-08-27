
package Controlador;

import Modelo.Usuario;

public class loginCtrl {
    
    /*Inicio Objetos Metodos*/
    Usuario objusuario = new Usuario();
    /*Fin Objetos Metodos*/
    
    public void ConsultaUsuario(String usuario,String password){
        
        objusuario.controlSesion(password);

    }
    
}
