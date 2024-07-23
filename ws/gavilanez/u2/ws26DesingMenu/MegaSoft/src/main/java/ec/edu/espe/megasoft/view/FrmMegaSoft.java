/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.megasoft.view;

/**
 *
 * @author Kenny Gavilanez, Dev Dynasty, DCCO-ESPE
 */
public class FrmMegaSoft extends javax.swing.JFrame {

    /**
     * Creates new form FrmMegaSoft
     */
    public FrmMegaSoft() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuMegaSoft = new javax.swing.JMenu();
        itmExit = new javax.swing.JMenuItem();
        itmLogOut = new javax.swing.JMenuItem();
        mnuCategory = new javax.swing.JMenu();
        itmGadget = new javax.swing.JMenuItem();
        itmCell = new javax.swing.JMenuItem();
        itmLenovo = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        itmDell = new javax.swing.JCheckBoxMenuItem();
        mnuAccount = new javax.swing.JMenu();
        mnuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuMegaSoft.setText("MegaSoft");

        itmExit.setText("Exit");
        itmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExitActionPerformed(evt);
            }
        });
        mnuMegaSoft.add(itmExit);

        itmLogOut.setText("Log Out");
        itmLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmLogOutActionPerformed(evt);
            }
        });
        mnuMegaSoft.add(itmLogOut);

        jMenuBar1.add(mnuMegaSoft);

        mnuCategory.setText("Category");

        itmGadget.setText("Accesorios");
        itmGadget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmGadgetActionPerformed(evt);
            }
        });
        mnuCategory.add(itmGadget);

        itmCell.setText("Celulares");
        mnuCategory.add(itmCell);

        itmLenovo.setText("Computadoras");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Lenovo");
        itmLenovo.add(jCheckBoxMenuItem2);

        itmDell.setSelected(true);
        itmDell.setText("Dell");
        itmDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDellActionPerformed(evt);
            }
        });
        itmLenovo.add(itmDell);

        mnuCategory.add(itmLenovo);

        jMenuBar1.add(mnuCategory);

        mnuAccount.setText("Account");
        jMenuBar1.add(mnuAccount);

        mnuHelp.setText("Help");
        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void itmGadgetActionPerformed(java.awt.event.ActionEvent evt) {                                          
        FrmAddProduct frmAddProduct= new FrmAddProduct();
        this.setVisible(false);
        frmAddProduct.setVisible(true);
    }                                         

    private void itmExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        System.exit(0);
    }                                       

    private void itmDellActionPerformed(java.awt.event.ActionEvent evt) {                                        
        FrmAddProduct frmAddProduct = new FrmAddProduct();
        this.setVisible(false);
        frmAddProduct.setVisible(true);
    }                                       

    private void itmLogOutActionPerformed(java.awt.event.ActionEvent evt) {                                          
        FrmLogin frmLogin = new FrmLogin();
        this.setVisible(false);
        frmLogin.setVisible(true);
        
    }                                         

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
            java.util.logging.Logger.getLogger(FrmMegaSoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMegaSoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMegaSoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMegaSoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMegaSoft().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JMenuItem itmCell;
    private javax.swing.JCheckBoxMenuItem itmDell;
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenuItem itmGadget;
    private javax.swing.JMenu itmLenovo;
    private javax.swing.JMenuItem itmLogOut;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuAccount;
    private javax.swing.JMenu mnuCategory;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuMegaSoft;
    // End of variables declaration                   
}
