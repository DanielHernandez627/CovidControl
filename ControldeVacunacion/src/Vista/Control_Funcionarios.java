
package Vista;

import Controlador.funcionariosCtrl;
import javax.swing.JOptionPane;

/**
 *
 * @author pillo
 */
public class Control_Funcionarios extends javax.swing.JFrame {
    
    /*Inicio Objetos Metodos*/
        funcionariosCtrl objFuncionarioctrl = new funcionariosCtrl();
    /*Fin Objetos Metodos*/
    
    private int idaction;
        
    /**
     * Creates new form Control_Funcionarios
     */
    public Control_Funcionarios() {
        initComponents();
        inicializarcomponentes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ComboBoxFuncionarios = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txt_celular = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ComboBoxCargos = new javax.swing.JComboBox();
        btn_Add = new javax.swing.JButton();
        btn_Edit = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_Accept = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Control de Funcionarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel2.setText("Funcionarios");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        ComboBoxFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxFuncionariosActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBoxFuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 260, -1));

        jLabel3.setText("Nombres");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txt_nombres.setEnabled(false);
        jPanel1.add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 260, -1));

        jLabel4.setText("Apellidos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        txt_apellidos.setEnabled(false);
        jPanel1.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 260, -1));

        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        txt_email.setEnabled(false);
        jPanel1.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 260, -1));

        jLabel6.setText("Contrase??a");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        txt_password.setEnabled(false);
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 260, -1));

        jLabel7.setText("Celular");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        txt_celular.setEnabled(false);
        jPanel1.add(txt_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 260, -1));

        jLabel8.setText("Cedula");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        txt_cedula.setEnabled(false);
        jPanel1.add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 260, -1));

        jLabel9.setText("Cargo");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        ComboBoxCargos.setEnabled(false);
        jPanel1.add(ComboBoxCargos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 260, -1));

        btn_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plus_add_insert_button_icon_191637.png"))); // NOI18N
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, 40));

        btn_Edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/test_tasks_list_clipboard_todo_icon_191634.png"))); // NOI18N
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, 40));

        btn_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trash_bin_delete_remove_icon_191682.png"))); // NOI18N
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, 40));

        btn_Accept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/approve_right_apply_done_checked_icon_191671.png"))); // NOI18N
        btn_Accept.setEnabled(false);
        btn_Accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AcceptActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, 40));

        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cross_wrong_close_delete_icon_191608.png"))); // NOI18N
        btn_cancel.setEnabled(false);
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, 40));

        btn_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/point_left_arrow_icon_191651.png"))); // NOI18N
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AcceptActionPerformed
        String cargoselect;
        String separador [];
        int cargo;
        String funcionarioselect;
        String separadorf[];
        int idfuncionario=0;

        
        if(idaction == 1){

            cargoselect = (String) ComboBoxCargos.getSelectedItem();
            separador = cargoselect.split("-");

            if (cargoselect.equals("Seleccione una opcion ...")) {
                cargo = 0;
            }else{
                cargo = Integer.parseInt(separador[0].trim());
            }

            addFuncionario(txt_nombres.getText(),txt_apellidos.getText(),txt_cedula.getText(),txt_celular.getText(),txt_email.getText(),cargo,txt_password.getText());   
        }else if(idaction == 2){

            funcionarioselect = (String) ComboBoxFuncionarios.getSelectedItem();
            separadorf = funcionarioselect.split("-");

            cargoselect = (String) ComboBoxCargos.getSelectedItem();
            separador = cargoselect.split("-");

            if (cargoselect.equals("Seleccione una opcion ...")) {
                cargo = 0;
            }else{
                cargo = Integer.parseInt(separador[0].trim());
            }
            
            if (funcionarioselect.equals("Seleccione una opcion ...")) {
            
            }else{
                idfuncionario = Integer.parseInt(separadorf[0].trim());
            }

            editFuncionario(txt_nombres.getText(), txt_apellidos.getText(),txt_cedula.getText(),txt_celular.getText(),txt_email.getText(), cargo,txt_password.getText(), idfuncionario);
        }
    }//GEN-LAST:event_btn_AcceptActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        ActivarCampos(true);
        limpiarCampos();
        ComboBoxCargos.removeAllItems();
        cargarListaCargos();
        this.idaction = 1;
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        Menu_Principal menp = new Menu_Principal();
        menp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void ComboBoxFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxFuncionariosActionPerformed
        String funcionarioselect;
        String separador[] = null;
        int idfuncionario;
        
        if (ComboBoxFuncionarios.getSelectedItem() == null) {
            
        }else{
            funcionarioselect = (String) ComboBoxFuncionarios.getSelectedItem();
       
            separador = funcionarioselect.split("-");

            if (funcionarioselect.equals("Seleccione una opcion ...")) {

            }else{
                idfuncionario = Integer.parseInt(separador[0].trim());
                ComboBoxCargos.removeAllItems();
                showFuncionario(idfuncionario);
            }
        }
        
        
    }//GEN-LAST:event_ComboBoxFuncionariosActionPerformed

    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed
        ActivarCampos(true);
        this.idaction = 2;
    }//GEN-LAST:event_btn_EditActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "??Esta por detener el proceso esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (resp == 0) {
            reset();
        }
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        String funcionarioselect;
        String separadorf[];
        int idfuncionario=0;
        funcionarioselect = (String) ComboBoxFuncionarios.getSelectedItem();
        separadorf = funcionarioselect.split("-");
        if (funcionarioselect.equals("Seleccione una opcion ...")) {
            
        }else{
            idfuncionario = Integer.parseInt(separadorf[0].trim());
        }
        
        if (idfuncionario != 0 && idfuncionario != 2) {
           int resp = JOptionPane.showConfirmDialog(null, "??Esta por eliminar a "+txt_nombres.getText()+" esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (resp == 0) {
                deleteFuncionario(idfuncionario);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Ningun Funcionario seleccionado");
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Control_Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Control_Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Control_Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Control_Funcionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Control_Funcionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxCargos;
    private javax.swing.JComboBox ComboBoxFuncionarios;
    private javax.swing.JButton btn_Accept;
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Edit;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JPasswordField txt_password;
    // End of variables declaration//GEN-END:variables

    private void inicializarcomponentes(){
        cargarListaFuncionarios();
        cargarListaCargos();
    }
    
    private void ActivarCampos(boolean e){
        txt_nombres.setEnabled(e);
        txt_apellidos.setEnabled(e);
        txt_cedula.setEnabled(e);
        txt_celular.setEnabled(e);
        txt_email.setEnabled(e);
        txt_password.setEnabled(e);
        ComboBoxCargos.setEnabled(e);
        btn_Accept.setEnabled(e);
        btn_cancel.setEnabled(e);
    }
    
    private void addFuncionario(String nombres,String apellidos,String cedula,String celular,String email,int Idcargo,String contrasena){
        
        if(objFuncionarioctrl.ControlContrasena(contrasena) == true){
            if (objFuncionarioctrl.registroFuncionario(nombres, apellidos, cedula, celular, email, Idcargo, contrasena) == true) {
                JOptionPane.showMessageDialog(null,"Registro realizado con Exito !!");
                reset();
            }else{
                JOptionPane.showMessageDialog(null,"Fallo en el registro");
            }
        }else{
            txt_password.setText("");
        }
        
    }
    
    private void showFuncionario(int idFuncionario){
        objFuncionarioctrl.obtenerInfoFuncionarios(txt_nombres, txt_apellidos, txt_cedula, txt_email, txt_password, txt_celular, ComboBoxCargos, idFuncionario);
    }
    
    private void editFuncionario(String nombres,String apellidos,String cedula,String celular,String email,int Idcargo,String contrasena,int idFuncionario){
        if(objFuncionarioctrl.ControlContrasena(contrasena) == true){
        
            if(objFuncionarioctrl.editarFuncionario(nombres, apellidos, cedula, celular, email, Idcargo, contrasena, idFuncionario) == true){
                JOptionPane.showMessageDialog(null,"Actualizacion realizada con Exito !!");
                reset();
            }else{
                JOptionPane.showMessageDialog(null,"Fallo en la actualizacion");
            }
        }else{
            txt_password.setText("");
        }

    }
    
    private void deleteFuncionario(int idFuncionario){
        if(objFuncionarioctrl.eliminarFuncionario(idFuncionario) == true){
            JOptionPane.showMessageDialog(null,"Eliminacion finalizada");
            reset();
        }else{
            JOptionPane.showMessageDialog(null,"Fallo en la eliminacion");
        }
    }
    
    
    private void limpiarCampos(){
        txt_nombres.setText("");
        txt_apellidos.setText("");
        txt_cedula.setText("");
        txt_celular.setText("");
        txt_email.setText("");
        txt_password.setText("");
    }
    
    private void reset(){
        limpiarCampos();
        ActivarCampos(false);
        ComboBoxCargos.removeAllItems();
        ComboBoxFuncionarios.removeAllItems();
        cargarListaCargos();
        cargarListaFuncionarios();
    }
    
    private void cargarListaFuncionarios(){
        objFuncionarioctrl.obtenerFuncionarios(ComboBoxFuncionarios);
    }
    
    private void cargarListaCargos(){
        objFuncionarioctrl.obtenerCargos(ComboBoxCargos);
    }
}
