/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.militarydininghall.view;

/**
 *
 * @author David Rodriguez,THEJAVABANDITS DCCO-ESPE
 */
public class FrmSeeAccountBalance extends javax.swing.JFrame {

    /**
     * Creates new form FrmSeeAccountBalance
     */
    public FrmSeeAccountBalance() {
        initComponents();

    }

    public void setAccountDetails(double currentBalance, double lastDeposit, double latestWithdrawals) {
        initComponents();
        lbldCurretBalance.setText("Current account balance: $" + String.format("%.2f", currentBalance));
        lbldLastDeposit.setText("Balance of the last deposit: $" + String.format("%.2f", lastDeposit));
        lbldLatestAccountWithdrawals.setText("Latest account withdrawals: $" + String.format("%.2f", latestWithdrawals));
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
        lbldCurretBalance = new javax.swing.JLabel();
        lbldLastDeposit = new javax.swing.JLabel();
        lbldLatestAccountWithdrawals = new javax.swing.JLabel();
        btmComensalMenu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(50, 91, 14));

        jLabel1.setFont(new java.awt.Font("Artifakt Element Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ver saldo de cuenta");

        lbldCurretBalance.setFont(new java.awt.Font("Artifakt Element", 0, 14)); // NOI18N
        lbldCurretBalance.setForeground(new java.awt.Color(255, 255, 255));
        lbldCurretBalance.setText("Saldo de la cuenta corriente:");

        lbldLastDeposit.setFont(new java.awt.Font("Artifakt Element", 0, 14)); // NOI18N
        lbldLastDeposit.setForeground(new java.awt.Color(255, 255, 255));
        lbldLastDeposit.setText("Saldo del último depósito depositado:");

        lbldLatestAccountWithdrawals.setFont(new java.awt.Font("Artifakt Element", 0, 14)); // NOI18N
        lbldLatestAccountWithdrawals.setForeground(new java.awt.Color(255, 255, 255));
        lbldLatestAccountWithdrawals.setText("últimos retiros de cuenta:");

        btmComensalMenu.setBackground(new java.awt.Color(132, 82, 31));
        btmComensalMenu.setText("Menu");
        btmComensalMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmComensalMenuActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(50, 54, 14));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(50, 54, 14));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldLatestAccountWithdrawals)
                    .addComponent(lbldLastDeposit)
                    .addComponent(lbldCurretBalance))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1)
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btmComensalMenu)
                .addGap(34, 34, 34))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lbldCurretBalance)
                .addGap(31, 31, 31)
                .addComponent(lbldLastDeposit)
                .addGap(37, 37, 37)
                .addComponent(lbldLatestAccountWithdrawals)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btmComensalMenu)
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmComensalMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmComensalMenuActionPerformed
        FrmCommensalMenu frmCommensalMenu = new FrmCommensalMenu();
        this.setVisible(false);
        frmCommensalMenu.setVisible(true);
    }//GEN-LAST:event_btmComensalMenuActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSeeAccountBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSeeAccountBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSeeAccountBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSeeAccountBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSeeAccountBalance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmComensalMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbldCurretBalance;
    private javax.swing.JLabel lbldLastDeposit;
    private javax.swing.JLabel lbldLatestAccountWithdrawals;
    // End of variables declaration//GEN-END:variables
}