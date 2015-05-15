/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdExchangeEnterprise.MarketOrganization;

import System.Enterprise.AdExchange;
import System.Enterprise.Enterprise;
import System.Network.Network;
import System.Organization.Organization;
import System.Person.Person;
import System.UserAccount.EmployeeUserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author SURAJ
 */
public class MarketPlaceManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private AdExchange exchange;
    private Network network;
    /**
     * Creates new form FinanceOrganizationWorkAreaJPanel
     */
    public MarketPlaceManagerWorkAreaJPanel(JPanel userProcessContainer,Network network, Enterprise enterprise, Organization organization, EmployeeUserAccount ua) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.exchange= (AdExchange) enterprise;
        this.network= network;
        
        for(Person p: organization.getPersonDirectory().getPersonlist())
        if(p.getPersonID()==(ua.getEmployee().getPerson().getPersonID()))
         nameJLabel3.setText(p.getFirstName()+" "+p.getLastName());
       enterpriseNameJLabel2.setText(exchange.getName());
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
        jLabel2 = new javax.swing.JLabel();
        nameJLabel3 = new javax.swing.JLabel();
        manageMarketJButton1 = new javax.swing.JButton();
        manageUPJButton2 = new javax.swing.JButton();
        viewAdvertisersJButton3 = new javax.swing.JButton();
        viewPublisherJButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        enterpriseNameJLabel2 = new javax.swing.JLabel();
        imageJLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Market Manager Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 420, 60));

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 16)); // NOI18N
        jLabel2.setText("Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, 30));

        nameJLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 16)); // NOI18N
        add(nameJLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 170, 30));

        manageMarketJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Manage Icon.png"))); // NOI18N
        manageMarketJButton1.setText("Manage Market");
        manageMarketJButton1.setToolTipText("Manage Market");
        manageMarketJButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageMarketJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageMarketJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMarketJButton1ActionPerformed(evt);
            }
        });
        add(manageMarketJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 220, 50));

        manageUPJButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon_big.gif"))); // NOI18N
        manageUPJButton2.setText("View User Profiles");
        manageUPJButton2.setToolTipText("View User Profiles");
        manageUPJButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageUPJButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageUPJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUPJButton2ActionPerformed(evt);
            }
        });
        add(manageUPJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 220, 50));

        viewAdvertisersJButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon_big.gif"))); // NOI18N
        viewAdvertisersJButton3.setText("View Advertisers");
        viewAdvertisersJButton3.setToolTipText("View Advertisers");
        viewAdvertisersJButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewAdvertisersJButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewAdvertisersJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAdvertisersJButton3ActionPerformed(evt);
            }
        });
        add(viewAdvertisersJButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 220, 50));

        viewPublisherJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon_big.gif"))); // NOI18N
        viewPublisherJButton1.setText("View Publishers");
        viewPublisherJButton1.setToolTipText("View Publishers");
        viewPublisherJButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewPublisherJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewPublisherJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPublisherJButton1ActionPerformed(evt);
            }
        });
        add(viewPublisherJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 220, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Manage icon large.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 770, 200));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/View Folder Icon Small.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 770, 210));

        enterpriseNameJLabel2.setFont(new java.awt.Font("Cambria", 0, 28)); // NOI18N
        enterpriseNameJLabel2.setForeground(new java.awt.Color(153, 51, 0));
        add(enterpriseNameJLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 330, 40));

        imageJLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        imageJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdExchange Background Title.jpg"))); // NOI18N
        add(imageJLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageMarketJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMarketJButton1ActionPerformed

        ManageMarketJPanel manageMarketJPanel= new ManageMarketJPanel(userProcessContainer, exchange);
        userProcessContainer.add("ManageMarketJPanel", manageMarketJPanel);
        ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_manageMarketJButton1ActionPerformed

    private void manageUPJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUPJButton2ActionPerformed

        ManageEndUserProfilesJPanel manageUserProfilesJPanel= new ManageEndUserProfilesJPanel(userProcessContainer, exchange);
        userProcessContainer.add("ManageUserProfilesJPanel", manageUserProfilesJPanel);
        ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_manageUPJButton2ActionPerformed

    private void viewAdvertisersJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAdvertisersJButton3ActionPerformed

        ViewAdvertiserJPanel viewAdvertiserJPanel= new ViewAdvertiserJPanel(userProcessContainer, network, exchange);
        userProcessContainer.add("ViewAdvertiserJPanel", viewAdvertiserJPanel);
        ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_viewAdvertisersJButton3ActionPerformed

    private void viewPublisherJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPublisherJButton1ActionPerformed

        ViewPublisherJPanel managePublisherJPanel= new ViewPublisherJPanel(userProcessContainer, network, exchange);
        userProcessContainer.add("ManagePublisherJPanel", managePublisherJPanel);
        ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_viewPublisherJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseNameJLabel2;
    private javax.swing.JLabel imageJLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton manageMarketJButton1;
    private javax.swing.JButton manageUPJButton2;
    private javax.swing.JLabel nameJLabel3;
    private javax.swing.JButton viewAdvertisersJButton3;
    private javax.swing.JButton viewPublisherJButton1;
    // End of variables declaration//GEN-END:variables
}
