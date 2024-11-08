/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.medicalappoimentsystem.view;

/**
 *
 * @author MSI-PULSE
 */
public class FrmMedicalAppoimentSystem extends javax.swing.JFrame {

    /**
     * Creates new form FrmMedicalAppoimentSystem
     */
    public FrmMedicalAppoimentSystem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuMedicalAppoimentSystem = new javax.swing.JMenu();
        itmLogout = new javax.swing.JMenuItem();
        itmExit = new javax.swing.JMenuItem();
        mnuAppoiment = new javax.swing.JMenu();
        itmAddAppoiment = new javax.swing.JMenuItem();
        itmViewAppoiment = new javax.swing.JMenuItem();
        mnuEditAppoiment = new javax.swing.JMenu();
        itmRescheduleAppointment = new javax.swing.JMenuItem();
        itmCancelAppoiment = new javax.swing.JMenuItem();
        mnuDoctor = new javax.swing.JMenu();
        itmAddDoctor = new javax.swing.JMenuItem();
        itmViewDoctor = new javax.swing.JMenuItem();
        mnuCalendar = new javax.swing.JMenu();
        itmViewAppoimentInCalendar = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuMedicalAppoimentSystem.setText("Medical Appoiment System ");

        itmLogout.setText("Logout");
        itmLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmLogoutActionPerformed(evt);
            }
        });
        mnuMedicalAppoimentSystem.add(itmLogout);

        itmExit.setText("Exit");
        itmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExitActionPerformed(evt);
            }
        });
        mnuMedicalAppoimentSystem.add(itmExit);

        jMenuBar1.add(mnuMedicalAppoimentSystem);

        mnuAppoiment.setText("Citas");

        itmAddAppoiment.setText("Agregar Cita");
        itmAddAppoiment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAddAppoimentActionPerformed(evt);
            }
        });
        mnuAppoiment.add(itmAddAppoiment);

        itmViewAppoiment.setText("Ver citas");
        itmViewAppoiment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmViewAppoimentActionPerformed(evt);
            }
        });
        mnuAppoiment.add(itmViewAppoiment);

        mnuEditAppoiment.setText("Editar Cita");

        itmRescheduleAppointment.setText("Reagendar Cita");
        mnuEditAppoiment.add(itmRescheduleAppointment);

        itmCancelAppoiment.setText("Cancelar Cita");
        itmCancelAppoiment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCancelAppoimentActionPerformed(evt);
            }
        });
        mnuEditAppoiment.add(itmCancelAppoiment);

        mnuAppoiment.add(mnuEditAppoiment);

        jMenuBar1.add(mnuAppoiment);

        mnuDoctor.setText("Doctor");

        itmAddDoctor.setText("Agregar Doctor");
        itmAddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAddDoctorActionPerformed(evt);
            }
        });
        mnuDoctor.add(itmAddDoctor);

        itmViewDoctor.setText("Ver Doctor");
        mnuDoctor.add(itmViewDoctor);

        jMenuBar1.add(mnuDoctor);

        mnuCalendar.setText("Calendario");

        itmViewAppoimentInCalendar.setText("Ver citas en el calendario ");
        mnuCalendar.add(itmViewAppoimentInCalendar);

        jMenuBar1.add(mnuCalendar);

        mnuHelp.setText("Ayuda");
        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmAddAppoimentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAddAppoimentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmAddAppoimentActionPerformed

    private void itmViewAppoimentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmViewAppoimentActionPerformed
        FrmViewAppoiment frmViewAppoiment = new FrmViewAppoiment();
            this.setVisible(false);
            frmViewAppoiment.setVisible(true);
    }//GEN-LAST:event_itmViewAppoimentActionPerformed

    private void itmCancelAppoimentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCancelAppoimentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itmCancelAppoimentActionPerformed

    private void itmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itmExitActionPerformed

    private void itmAddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAddDoctorActionPerformed
        FrmAddDoctor frmAddDoctor = new FrmAddDoctor();
            this.setVisible(false);
            frmAddDoctor.setVisible(true);
    }//GEN-LAST:event_itmAddDoctorActionPerformed

    private void itmLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmLogoutActionPerformed
        FrmLogin frmLogin = new FrmLogin();
        this.setVisible(false);
        frmLogin.setVisible(true);
    }//GEN-LAST:event_itmLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMedicalAppoimentSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMedicalAppoimentSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMedicalAppoimentSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMedicalAppoimentSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMedicalAppoimentSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAddAppoiment;
    private javax.swing.JMenuItem itmAddDoctor;
    private javax.swing.JMenuItem itmCancelAppoiment;
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenuItem itmLogout;
    private javax.swing.JMenuItem itmRescheduleAppointment;
    private javax.swing.JMenuItem itmViewAppoiment;
    private javax.swing.JMenuItem itmViewAppoimentInCalendar;
    private javax.swing.JMenuItem itmViewDoctor;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuAppoiment;
    private javax.swing.JMenu mnuCalendar;
    private javax.swing.JMenu mnuDoctor;
    private javax.swing.JMenu mnuEditAppoiment;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuMedicalAppoimentSystem;
    // End of variables declaration//GEN-END:variables
}
