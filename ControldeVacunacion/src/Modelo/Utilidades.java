
package Modelo;

import java.nio.charset.StandardCharsets;
import java.util.Base64;


public class Utilidades {
    
    public String Encriptar(String password){
        
        String encriptada;
        
        Base64.Encoder encoder = Base64.getEncoder();
        
        encriptada = encoder.encodeToString(password.getBytes(StandardCharsets.UTF_8));
        
        return encriptada;
    }
    
    public String DesEncriptar(String password){
        
        String decodificada;
        
        Base64.Decoder decoder = Base64.getDecoder();
        
        byte[] decoderarray = decoder.decode(password);
        
        decodificada = new String(decoderarray);
        
        return decodificada;
    }
}