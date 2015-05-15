/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.PublisherEnterprise.MarketingOrganization;

import Interface.PublisherEnterprise.AdvertismentPages.AmazonWebPageJPanel;
import Interface.PublisherEnterprise.AdvertismentPages.FacebookWebPageJPanel;
import System.Enterprise.Publisher;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author SURAJ
 */
public class ViewWebPageDetailsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Publisher publisher;
    /**
     * Creates new form ViewAdvertismentPageJPanel
     */
    public ViewWebPageDetailsJPanel(JPanel userProcessContainer, Publisher publisher) {
       initComponents();
       this.userProcessContainer= userProcessContainer;
       this.publisher= publisher;
       populateFields();
    }

   private void populateFields()
   {
       if(publisher.getName().equalsIgnoreCase("Amazon")){
       AmazonWebPageJPanel amazonWebPageJPanel= new AmazonWebPageJPanel(null, null, null, null);
       pageNameLabel5.setText(amazonWebPageJPanel.getPageName());
       pageHitsLabel2.setText(String.valueOf(amazonWebPageJPanel.getPageHits()));
       adSpaceNumberLabel7.setText(String.valueOf(amazonWebPageJPanel.getAdSpaces()));
       }
       else if(publisher.getName().equalsIgnoreCase("Facebook")){
       FacebookWebPageJPanel facebookWebPageJPanel= new FacebookWebPageJPanel(null, null, null, null);
       pageNameLabel5.setText(facebookWebPageJPanel.getPageName());
       pageHitsLabel2.setText(String.valueOf(facebookWebPageJPanel.getPageHits()));
       adSpaceNumberLabel7.setText(String.valueOf(facebookWebPageJPanel.getAdSpaces()));
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

        jLabel1 = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pageNameLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pageHitsLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adSpaceNumberLabel7 = new javax.swing.JLabel();
        imageJLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/View_icon.png"))); // NOI18N
        jLabel1.setText("View Website Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 420, 60));

        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbutton.png"))); // NOI18N
        backJButton1.setText("Back");
        backJButton1.setToolTipText("Back");
        backJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 100, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Web Page Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Apple Braille", 1, 14))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(3, 2, 0, 4));

        jLabel6.setText("          Page Name :");
        jPanel2.add(jLabel6);
        jPanel2.add(pageNameLabel5);

        jLabel4.setText("          Page Hits:");
        jPanel2.add(jLabel4);
        jPanel2.add(pageHitsLabel2);

        jLabel3.setText("          Number of AdSpaces :");
        jPanel2.add(jLabel3);
        jPanel2.add(adSpaceNumberLabel7);

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 530, 150));

        imageJLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        imageJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Publisher Back Ground.jpeg"))); // NOI18N
        add(imageJLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 690));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adSpaceNumberLabel7;
    private javax.swing.JButton backJButton1;
    private javax.swing.JLabel imageJLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel pageHitsLabel2;
    private javax.swing.JLabel pageNameLabel5;
    // End of variables declaration//GEN-END:variables
}