package Vista;

import Controlador.loginCtrl;

/**
 *
 * @author pillo
 */
public class Menu_Principal extends javax.swing.JFrame {

    /*Inicio objetos de Controladores*/
        loginCtrl login = new loginCtrl();
    /*Fin objetos de Controladores*/
    
    /**
     * Creates new form Menu_Principal
     */
    public Menu_Principal() {
        initComponents();
        controlSesion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_Admusuarios = new javax.swing.JButton();
        btn_Admfuncionarios = new javax.swing.JButton();
        btn_Admvacunas = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_Reporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Menu Principal");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        btn_Admusuarios.setText("Administracion de Usuarios");
        jPanel2.add(btn_Admusuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 210, -1));

        btn_Admfuncionarios.setText("Administracion de Funcionarios");
        btn_Admfuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdmfuncionariosActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Admfuncionarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 210, -1));

        btn_Admvacunas.setText("Administracion de Vacunas");
        btn_Admvacunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdmvacunasActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Admvacunas, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 210, -1));

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user_interface_exit_door_icon_191677.png"))); // NOI18N
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel2.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 50, 30));

        btn_Reporte.setText("Reporte de Vacunacion");
        jPanel2.add(btn_Reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        Index indx = new Index();
        indx.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_AdmfuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdmfuncionariosActionPerformed
        Control_Funcionarios ctrlFuncionarios = new Control_Funcionarios();
        ctrlFuncionarios.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_AdmfuncionariosActionPerformed

    private void btn_AdmvacunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdmvacunasActionPerformed
        Administracion_Vacunas admVacunas = new Administracion_Vacunas();
        admVacunas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_AdmvacunasActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Admfuncionarios;
    private javax.swing.JButton btn_Admusuarios;
    private javax.swing.JButton btn_Admvacunas;
    private javax.swing.JButton btn_Reporte;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    
    private void controlSesion(){
        if (login.TipoCargo() != 2) {
            btn_Admvacunas.setVisible(false);
        }
    }

}
