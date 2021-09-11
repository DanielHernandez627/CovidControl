
package Modelo;

import DAO.Conexion;
import java.sql.ResultSet;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class Vacunas {
    
    private String nombreVacuna;
    private String siglaVacuna;
    private int diasVacuna;
    private int indactiva;
    
    public Vacunas() {
    }

    public Vacunas(String nombreVacuna, String siglaVacuna, int diasVacuna, int indactiva) {
        this.nombreVacuna = nombreVacuna;
        this.siglaVacuna = siglaVacuna;
        this.diasVacuna = diasVacuna;
        this.indactiva = indactiva;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public String getSiglaVacuna() {
        return siglaVacuna;
    }

    public int getDiasVacuna() {
        return diasVacuna;
    }

    public int getIndactiva() {
        return indactiva;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public void setSiglaVacuna(String siglaVacuna) {
        this.siglaVacuna = siglaVacuna;
    }

    public void setDiasVacuna(int diasVacuna) {
        this.diasVacuna = diasVacuna;
    }

    public void setIndactiva(int indactiva) {
        this.indactiva = indactiva;
    }
    
    
    public boolean addVacunas(String nombrevacuna,String siglaVacuna,int diasvacuna,int indactiva){
        
        Conexion conexion = new Conexion();
        boolean result = false;
        
        String query = "INSERT INTO tipovacuna (NombreVacuna,SiglaVacuna,DiasSegundaDosis,indActiva) VALUES ('"+nombrevacuna+"','"+siglaVacuna+"','"+diasvacuna+"',"+indactiva+")";
        
        if (conexion.ExeConsultaBasica(query) == true) {
            result = true;
        }
        
        return result;
    }
    
    public boolean editVacunas(String nombrevacuna,String siglaVacuna,int diasvacuna,int indactiva,int idvacuna){
        
        Conexion conexion = new Conexion();
        boolean result = false;
        
        String query = "UPDATE tipovacuna SET NombreVacuna='"+nombrevacuna+"',SiglaVacuna='"+siglaVacuna+"',DiasSegundaDosis='"+diasvacuna+"',indActiva="+indactiva+" WHERE IdVacuna = '"+idvacuna+"'";
        
        if (conexion.ExeConsultaBasica(query) == true) {
            result = true;
        }
        
        return result;
    }
    
    public boolean callVacunas(JComboBox ComboBoxVacunas){
        
        Conexion conexion = new Conexion();
        ResultSet rs = null;
        
        String query = "SELECT IdVacuna,SiglaVacuna FROM tipovacuna";
        
        rs = conexion.ExeConsulta(query);
        
        try{
            
            ComboBoxVacunas.addItem("Seleccione una opcion ...");
            
            while(rs.next()){
                ComboBoxVacunas.addItem(rs.getString("IdVacuna") + " - " + rs.getString("SiglaVacuna"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return false;
    }
    
    
    public void callInfoVacunas(JTextField txt_nombrevacuna,JTextField txt_siglavacuna,JTextField txt_diasvacunas,int idVacuna,JCheckBox checkactiva){
        
        Conexion conexion = new Conexion();
        ResultSet rs = null;
        
        
        String query = "SELECT NombreVacuna,SiglaVacuna,DiasSegundaDosis,indActiva FROM tipovacuna WHERE IdVacuna = '"+idVacuna+"'";
        
        rs = conexion.ExeConsulta(query);
        
        try{
            
            while(rs.next()){
                this.nombreVacuna = rs.getString("NombreVacuna");
                this.siglaVacuna = rs.getString("SiglaVacuna");
                this.diasVacuna = rs.getInt("DiasSegundaDosis");
                this.indactiva = rs.getInt("indActiva");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        txt_nombrevacuna.setText(getNombreVacuna());
        txt_siglavacuna.setText(getSiglaVacuna());
        txt_diasvacunas.setText(String.valueOf(getDiasVacuna()));
        
        if (getIndactiva() == 1) {
            checkactiva.setSelected(true);
        }else{
            checkactiva.setSelected(false);
        }
    }
}
