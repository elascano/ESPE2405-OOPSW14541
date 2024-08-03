
package ec.edu.espe.Speakers.view;

import ec.edu.espe.Speakers.utils.MongoDBConection;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author David Rodriguez,THEJAVABANDITS DCCO-ESPE
 */
public class SellSpeakers extends javax.swing.JFrame {

    private MongoDBConection mongoDBConnection;

    /**
     * Creates new form SellCellPhone
     */
    public SellSpeakers() {
        initComponents();
        mongoDBConnection = new MongoDBConection("Speakers");
        txtSellAmount.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                calculateTotalPrice();
            }
        });
        txtSellAmount.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    calculateTotalPrice();
                }
            }
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        btnSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellActionPerformed(evt);
            }
        });
    }

    private void calculateTotalPrice() {
        try {
            int id = Integer.parseInt(txtSellId.getText());
            int amount = Integer.parseInt(txtSellAmount.getText());

            Document query = new Document("Id", id);
            Document document = mongoDBConnection.getCollection().find(query).first();

            if (document != null) {
                double price = document.getDouble("Price");
                double totalPrice = price * amount;
                DecimalFormat decimalFormat = new DecimalFormat("#.00");
                String formatTotalPrice = decimalFormat.format(totalPrice);
                txtTotalPrice.setText(String.valueOf(formatTotalPrice));
            } else {
                JOptionPane.showMessageDialog(this, "That Speakers id doesn't exist");
            }
        } catch (NumberFormatException e) {
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        btnSell = new javax.swing.JButton();
        txtSellId = new javax.swing.JTextField();
        txtSellPrice = new javax.swing.JTextField();
        txtSellAmount = new javax.swing.JTextField();
        txtTotalPrice = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sell Speakers");

        jLabel2.setText("Enter Id to search");

        jLabel3.setText("Speakers Price");

        jLabel4.setText("Amount to Sell");

        jLabel5.setText("Total Price");

        btnReturn.setText("Return");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        btnSell.setText("Sell");
        btnSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellActionPerformed(evt);
            }
        });

        txtTotalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPriceActionPerformed(evt);
            }
        });

        btnSearch.setText("Load Id information");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnReturn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)
                        .addGap(27, 27, 27)
                        .addComponent(btnSell))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSellPrice)
                                .addComponent(txtSellAmount)
                                .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSellId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSellId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSellAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturn)
                    .addComponent(btnSearch)
                    .addComponent(btnSell))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        FrmSpeakers cellPhoneGui=new FrmSpeakers();
        this.dispose();
        cellPhoneGui.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellActionPerformed
        try {
            int id = Integer.parseInt(txtSellId.getText());
            int amount = Integer.parseInt(txtSellAmount.getText());

            Document query = new Document("Id", id);
            Document document = mongoDBConnection.getCollection().find(query).first();

            if (document != null) {
                double price = document.getDouble("Price");
                int stock = document.getInteger("Stock");

                double totalPrice = price * amount;
                DecimalFormat decimalFormat = new DecimalFormat("#.00");
                String formatTotalPrice = decimalFormat.format(totalPrice);
                txtTotalPrice.setText(String.valueOf(formatTotalPrice));

                int newStock = stock - amount;
                Document updateDocument = new Document("$set", new Document("Stock", newStock));
                mongoDBConnection.getCollection().updateOne(query, updateDocument);

                JOptionPane.showMessageDialog(this, "Sale complete by a price of " + formatTotalPrice);

                txtSellId.setText("");
                txtSellPrice.setText("");
                txtSellAmount.setText("");
                txtTotalPrice.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "That Speaker id doesn't exist");
            }
        } catch (NumberFormatException e) {
        }

    }//GEN-LAST:event_btnSellActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            int id = Integer.parseInt(txtSellId.getText());

            Document query = new Document("Id", id);
            Document document = mongoDBConnection.getCollection().find(query).first();

            if (document != null) {
                double price = document.getDouble("Price");
                DecimalFormat decimalFormat = new DecimalFormat("#.00");
                String formattedPrice = decimalFormat.format(price);
                txtSellPrice.setText(formattedPrice);
            } else {
                JOptionPane.showMessageDialog(this, "That Speaker Id doesn't exist");
                txtSellPrice.setText("");
            }
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtTotalPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPriceActionPerformed

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
            java.util.logging.Logger.getLogger(SellSpeakers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellSpeakers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellSpeakers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellSpeakers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellSpeakers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSell;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtSellAmount;
    private javax.swing.JTextField txtSellId;
    private javax.swing.JTextField txtSellPrice;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables
}