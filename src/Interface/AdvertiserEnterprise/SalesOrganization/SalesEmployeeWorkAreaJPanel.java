/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdvertiserEnterprise.SalesOrganization;

import System.Enterprise.Advertiser;
import System.Enterprise.Enterprise;
import System.Organization.Organization;
import System.Person.Person;
import System.UserAccount.EmployeeUserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author SURAJ
 */
public class SalesEmployeeWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Advertiser advertiser;
    /**
     * Creates new form SalesEmployeeWorkAreaJPanel
     */
    public SalesEmployeeWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, EmployeeUserAccount ua) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.advertiser= (Advertiser)enterprise;
        for(Person p: organization.getPersonDirectory().getPersonlist())
        if(p.getPersonID()==(ua.getEmployee().getPerson().getPersonID()))
         nameJLabel3.setText(p.getFirstName()+" "+p.getLastName());
        enterpriseNameJLabel2.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageAdSolutionJButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameJLabel3 = new javax.swing.JLabel();
        enterpriseNameJLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        imageJLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageAdSolutionJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Manage Icon.png"))); // NOI18N
        manageAdSolutionJButton1.setText("Manage Ad Solutions");
        manageAdSolutionJButton1.setToolTipText("Manage Advertisment Solutions");
        manageAdSolutionJButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageAdSolutionJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageAdSolutionJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAdSolutionJButton1ActionPerformed(evt);
            }
        });
        add(manageAdSolutionJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 210, 50));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sales Employee Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 420, 60));

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 16)); // NOI18N
        jLabel2.setText("Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, 30));

        nameJLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 16)); // NOI18N
        add(nameJLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 170, 30));

        enterpriseNameJLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 20)); // NOI18N
        add(enterpriseNameJLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 190, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Manage icon large.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 800, 200));

        imageJLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        imageJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Advertiser BackGround.jpg"))); // NOI18N
        add(imageJLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageAdSolutionJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAdSolutionJButton1ActionPerformed

        ManageAdSolutionsJPanel manageAdSolutionsJPanel= new ManageAdSolutionsJPanel(userProcessContainer, advertiser);
        userProcessContainer.add("ManageAdSolutionsJPanel", manageAdSolutionsJPanel);
        ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_manageAdSolutionJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseNameJLabel2;
    private javax.swing.JLabel imageJLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton manageAdSolutionJButton1;
    private javax.swing.JLabel nameJLabel3;
    // End of variables declaration//GEN-END:variables
}