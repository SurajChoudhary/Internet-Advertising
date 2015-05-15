/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Organizations;

import System.EcoSystem;
import System.Enterprise.Enterprise;
import System.Organization.Organization;
import System.Person.Person;
import System.UserAccount.EmployeeUserAccount;
import System.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SURAJ
 */
public class ManageOrganizationUserAccountJPanel extends javax.swing.JPanel {

     private EcoSystem system;
     private JPanel userProcessContainer;
     private Enterprise enterprise;
    /**
     * Creates new form CreateEnterpriceJPanel
     */
    public ManageOrganizationUserAccountJPanel(JPanel userProcessContainer,EcoSystem system, Enterprise enterprise, Person p) {
        initComponents();
        this.enterprise= enterprise;
        this.system= system;
        this.userProcessContainer= userProcessContainer;
        nameJLabel3.setText(p.getFirstName()+" "+p.getLastName());
        populateComboBox();
        
    }
    
    private void populateComboBox()
    {
        organizationJComboBox1.removeAllItems();
        for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
            organizationJComboBox1.addItem(organization);
    }
     
    private void populateUserAccountTable(Organization o)
    {
        DefaultTableModel model = (DefaultTableModel) userAccountJTable1.getModel();
        model.setRowCount(0);
        for(UserAccount ua: o.getUserAccountDirectory().getUserAccountList()){
            Object[] row = new Object[2];
            row[0]= (EmployeeUserAccount) ua;
            row[1]= ua.getUsername();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        userAccountJTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameJLabel3 = new javax.swing.JLabel();
        createUserAccountJButton1 = new javax.swing.JButton();
        backJButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        refreshButton3 = new javax.swing.JButton();
        deleteUserAccountJButton2 = new javax.swing.JButton();
        organizationJComboBox1 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        imageJLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userAccountJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Person Name", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userAccountJTable1.setToolTipText("Enterprise Table");
        userAccountJTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userAccountJTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userAccountJTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userAccountJTable1);
        userAccountJTable1.getColumnModel().getColumn(0).setResizable(false);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 650, 190));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Manage Icon.png"))); // NOI18N
        jLabel5.setText("Manage Organization Accounts");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 440, 60));

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 1, 16)); // NOI18N
        jLabel6.setText("Name :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, 30));

        nameJLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 16)); // NOI18N
        add(nameJLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 170, 30));

        createUserAccountJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GoIcon.gif"))); // NOI18N
        createUserAccountJButton1.setText("Add Account");
        createUserAccountJButton1.setToolTipText("Add New Account");
        createUserAccountJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createUserAccountJButton1.setEnabled(false);
        createUserAccountJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserAccountJButton1ActionPerformed(evt);
            }
        });
        add(createUserAccountJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 130, 30));

        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbutton.png"))); // NOI18N
        backJButton1.setText("Back");
        backJButton1.setToolTipText("Back");
        backJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 100, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setText("User Accounts :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setText("Create New Account :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 160, 30));

        refreshButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reset-icon.png"))); // NOI18N
        refreshButton3.setText("Refresh");
        refreshButton3.setToolTipText("Refresh Table");
        refreshButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButton3ActionPerformed(evt);
            }
        });
        add(refreshButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 110, 30));

        deleteUserAccountJButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_icon.png"))); // NOI18N
        deleteUserAccountJButton2.setText("Delete Account");
        deleteUserAccountJButton2.setToolTipText("Delete User Account");
        deleteUserAccountJButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteUserAccountJButton2.setEnabled(false);
        deleteUserAccountJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserAccountJButton2ActionPerformed(evt);
            }
        });
        add(deleteUserAccountJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 150, -1));

        organizationJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBox1ActionPerformed(evt);
            }
        });
        add(organizationJComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 210, 30));

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel14.setText("Select an Organization :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, 30));

        imageJLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        imageJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Organization Background.jpg"))); // NOI18N
        add(imageJLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 690));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void createUserAccountJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserAccountJButton1ActionPerformed

       Organization o= (Organization) organizationJComboBox1.getSelectedItem();
        if(o == null)
        {
             JOptionPane.showMessageDialog(null, "Please select an Enterprise","Invalid Action", JOptionPane.WARNING_MESSAGE);
             return;
        }
        
        CreateUserAccountJPanel createOrganizationUserAccountJPanel = new CreateUserAccountJPanel(userProcessContainer, system, null, o);
        userProcessContainer.add("CreateOrganizationUserAccountJPanel", createOrganizationUserAccountJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_createUserAccountJButton1ActionPerformed

    private void userAccountJTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userAccountJTable1MouseClicked
        int selectedRow= userAccountJTable1.getSelectedRow();
        if (selectedRow < 0) return;
        UserAccount ua = (UserAccount) userAccountJTable1.getValueAt(selectedRow, 0);
        if(ua!=null) deleteUserAccountJButton2.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_userAccountJTable1MouseClicked

    private void refreshButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButton3ActionPerformed
       Organization o= (Organization) organizationJComboBox1.getSelectedItem();
       if(o!=null) populateUserAccountTable(o);
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshButton3ActionPerformed

    private void deleteUserAccountJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserAccountJButton2ActionPerformed
       
        Organization o= (Organization) organizationJComboBox1.getSelectedItem();
        int selectedRow= userAccountJTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Row","Invalid Action", JOptionPane.WARNING_MESSAGE);
            return;
        }
        EmployeeUserAccount ua= (EmployeeUserAccount) userAccountJTable1.getValueAt(selectedRow, 0);
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int response= JOptionPane.showConfirmDialog(null, "Are you sure to delete "+ ua.getEmployee().getPerson().getFirstName()+" "+ua.getEmployee().getPerson().getLastName()+" ?", 
                    "Delete Confirmation", dialogButton, JOptionPane.WARNING_MESSAGE);
        if(response == JOptionPane.YES_OPTION)
            o.getUserAccountDirectory().getUserAccountList().remove(ua);
            populateUserAccountTable(o);
            deleteUserAccountJButton2.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteUserAccountJButton2ActionPerformed

    private void organizationJComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBox1ActionPerformed
        Organization o= (Organization) organizationJComboBox1.getSelectedItem();
        if(o!=null){populateUserAccountTable(o);
        createUserAccountJButton1.setEnabled(true);}
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationJComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton createUserAccountJButton1;
    private javax.swing.JButton deleteUserAccountJButton2;
    private javax.swing.JLabel imageJLabel2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameJLabel3;
    private javax.swing.JComboBox organizationJComboBox1;
    private javax.swing.JButton refreshButton3;
    private javax.swing.JTable userAccountJTable1;
    // End of variables declaration//GEN-END:variables
}
