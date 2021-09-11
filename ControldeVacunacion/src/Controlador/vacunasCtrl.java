
package Controlador;

import Modelo.Utilidades;
import Modelo.Vacunas;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class vacunasCtrl {
    
    /*Inicio Objetos Metodos*/
        Vacunas objVacunas = new Vacunas();
        Utilidades objUtilidades = new Utilidades();
    /*Fin Objetos Metodos*/

    
    public void obtenerVacunas(JComboBox ComboBoxVacunas){
        objVacunas.callVacunas(ComboBoxVacunas);
    }
    
    public boolean registroVacunas(String nombrevacuna,String siglaVacuna,int diasvacuna,int indactiva){
        
        boolean result = false;
        
        if (objVacunas.addVacunas(nombrevacuna, siglaVacuna, diasvacuna,indactiva) == true) {
            result = true;
        }
        
        return result;
    }
    
    public boolean editarVacuna(String nombrevacuna,String siglaVacuna,int diasvacuna,int indactiva,int idvacuna){
        
        boolean result = false;
        
        if (objVacunas.editVacunas(nombrevacuna, siglaVacuna, diasvacuna,indactiva,idvacuna) == true) {
            result = true;
        }
        
        return result;
    }
    
    public void obtenerInfoVacuna(JTextField txt_nombrevacuna,JTextField txt_siglavacuna,JTextField txt_diasvacunas,int idVacuna,JCheckBox checkactiva){
        objVacunas.callInfoVacunas(txt_nombrevacuna, txt_siglavacuna, txt_diasvacunas, idVacuna, checkactiva);
    }
}
