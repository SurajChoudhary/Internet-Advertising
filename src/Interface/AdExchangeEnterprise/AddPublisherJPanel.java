/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdExchangeEnterprise;

import System.Enterprise.AdExchange;
import System.Enterprise.Publisher;
import System.WorkQueue.AddPublisherWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author SURAJ
 */
public class AddPublisherJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private AddPublisherWorkRequest request;
    private AdExchange exchange;
    /**
     * Creates new form AddPublisherJPanel
     */
    public AddPublisherJPanel(JPanel userProcessContainer, AddPublisherWorkRequest request, AdExchange exchange) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.request=request;
        this.exchange= exchange;
        populateFields();
        for(Publisher p: exchange.getPublisherList())
            if(p == ((Publisher)request.getSenderEnterprise()))
            {
                publisherExistsLabel3.setText("This Publisher already exists in Exchange");
                approveJButton2.setEnabled(false);
                cancelJButton3.setEnabled(false);
                request.setStatus("Duplicate Request");
            }
    }

    private void populateFields()
    {
        nameJLabel3.setText((request.getSenderEnterprise()).getName());
        locationJLabel5.setText((request.getSenderEnterprise()).getLocation());   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        approveJButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameJLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        locationJLabel5 = new javax.swing.JLabel();
        cancelJButton3 = new javax.swing.JButton();
        publisherExistsLabel3 = new javax.swing.JLabel();
        imageJLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon-add.gif"))); // NOI18N
        jLabel1.setText("Add Publisher Work Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 420, 60));

        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbutton.png"))); // NOI18N
        backJButton1.setText("Back");
        backJButton1.setToolTipText("Back");
        backJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 80, -1));

        approveJButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/approve.png"))); // NOI18N
        approveJButton2.setText("Approve");
        approveJButton2.setToolTipText("Approve Request");
        approveJButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        approveJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveJButton2ActionPerformed(evt);
            }
        });
        add(approveJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 120, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Verify Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Apple Braille", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(2, 2, 0, 4));

        jLabel2.setText("            Name :");
        jPanel1.add(jLabel2);
        jPanel1.add(nameJLabel3);

        jLabel4.setText("            Location :");
        jPanel1.add(jLabel4);
        jPanel1.add(locationJLabel5);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 470, 110));

        cancelJButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_icon.png"))); // NOI18N
        cancelJButton3.setText("Cancel");
        cancelJButton3.setToolTipText("Cancel Request");
        cancelJButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJButton3ActionPerformed(evt);
            }
        });
        add(cancelJButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, 110, 30));
        add(publisherExistsLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 390, 30));

        imageJLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        imageJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdExchange Background.jpg"))); // NOI18N
        add(imageJLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed

        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void approveJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveJButton2ActionPerformed
       
        exchange.getPublisherList().add((Publisher)request.getSenderEnterprise());
        request.setStatus("Request Approved");
        JOptionPane.showMessageDialog(null, "Publisher added Successfully"," ", JOptionPane.INFORMATION_MESSAGE);
        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_approveJButton2ActionPerformed

    private void cancelJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJButton3ActionPerformed

        request.setStatus("Cancelled");
        JOptionPane.showMessageDialog(null, "Request Cancelled"," ", JOptionPane.INFORMATION_MESSAGE);
        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelJButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveJButton2;
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton cancelJButton3;
    private javax.swing.JLabel imageJLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel locationJLabel5;
    private javax.swing.JLabel nameJLabel3;
    private javax.swing.JLabel publisherExistsLabel3;
    // End of variables declaration//GEN-END:variables
}
