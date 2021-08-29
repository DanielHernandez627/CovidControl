
package Modelo;


public class CustomException extends Exception{
    
    private static final long serialVersionUID = 402L;
    
    public CustomException(String mensaje){
        super(mensaje);
    }
    
}
