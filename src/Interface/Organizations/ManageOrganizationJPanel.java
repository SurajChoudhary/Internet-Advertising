/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Organizations;

import System.Enterprise.AdExchange;
import System.Enterprise.Advertiser;
import System.Enterprise.Enterprise;
import System.Enterprise.Publisher;
import System.Organization.Organization;
import System.Organization.Organization.Type;
import System.Person.Person;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SURAJ
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

     private JPanel userProcessContainer;
     private Enterprise enterprise;
     
    /**
     * Creates new form CreateEnterpriceJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer,Enterprise enterprise, Person p) {
        initComponents();
        this.enterprise= enterprise;
        this.userProcessContainer= userProcessContainer;
        nameJLabel3.setText(p.getFirstName()+" "+p.getLastName());
        populateOrganizationTable();
        populateComboBox();
    }

    private void populateComboBox()
    {
        organizationJComboBox1.removeAllItems();
        if(enterprise instanceof Advertiser)
        {
          organizationJComboBox1.addItem(Type.AdvertiserMarketingOrganization.getValue());
          organizationJComboBox1.addItem(Type.SalesOrganization.getValue());
          organizationJComboBox1.addItem(Type.FinanceOrganization.getValue());
        }else if(enterprise instanceof AdExchange)
        {
          organizationJComboBox1.addItem(Type.MarketOrganization.getValue());
          organizationJComboBox1.addItem(Type.AccountingOrgainzation.getValue());
        }
        else if(enterprise instanceof Publisher)
        {
          organizationJComboBox1.addItem(Type.PublisherMarketingOrganization.getValue());
          organizationJComboBox1.addItem(Type.FinanceOrganization.getValue());
        }
    }
    
    private void populateOrganizationTable()
    {
        DefaultTableModel model = (DefaultTableModel) organizationListJTable1.getModel();
        model.setRowCount(0);
        
        for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
            Object[] row = new Object[1];
            row[0]= organization;
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

        addOrganizationJButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationListJTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameJLabel3 = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        deleteOrganizationJButton2 = new javax.swing.JButton();
        refreshButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        organizationJComboBox1 = new javax.swing.JComboBox();
        imageJLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addOrganizationJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addIcon.gif"))); // NOI18N
        addOrganizationJButton1.setText("Add Organization");
        addOrganizationJButton1.setToolTipText("Create Organization");
        addOrganizationJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addOrganizationJButton1.setEnabled(false);
        addOrganizationJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrganizationJButton1ActionPerformed(evt);
            }
        });
        add(addOrganizationJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 170, 30));

        organizationListJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationListJTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                organizationListJTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(organizationListJTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 650, 190));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Manage Icon.png"))); // NOI18N
        jLabel1.setText("Manage Organizations");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 360, 60));

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 16)); // NOI18N
        jLabel2.setText("Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 60, 30));

        nameJLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 16)); // NOI18N
        add(nameJLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 170, 30));

        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbutton.png"))); // NOI18N
        backJButton1.setText("Back");
        backJButton1.setToolTipText("Back");
        backJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 80, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setText("Organization List :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 140, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setText("Create an Organization  :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 200, 30));

        deleteOrganizationJButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_icon.png"))); // NOI18N
        deleteOrganizationJButton2.setText("Delete Organization");
        deleteOrganizationJButton2.setToolTipText("Delete Organization");
        deleteOrganizationJButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteOrganizationJButton2.setEnabled(false);
        deleteOrganizationJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrganizationJButton2ActionPerformed(evt);
            }
        });
        add(deleteOrganizationJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 170, 30));

        refreshButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reset-icon.png"))); // NOI18N
        refreshButton1.setText("Refresh");
        refreshButton1.setToolTipText("Refresh Table");
        refreshButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButton1ActionPerformed(evt);
            }
        });
        add(refreshButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 120, 30));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel11.setText("Select an Organization Type :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 230, 30));

        organizationJComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                organizationJComboBox1MouseClicked(evt);
            }
        });
        add(organizationJComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 190, -1));

        imageJLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        imageJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Organization Background.jpg"))); // NOI18N
        add(imageJLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 690));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void addOrganizationJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrganizationJButton1ActionPerformed

        String orgType = (String) organizationJComboBox1.getSelectedItem();
        if(orgType == null)
        {
             JOptionPane.showMessageDialog(null, "Please select an Organization Typr","Invalid Action", JOptionPane.WARNING_MESSAGE);
             return;
        }
//        Boolean exists = enterprise.getOrganizationDirectory().checkOrganizationbyType();
//        if(!exists){
        enterprise.getOrganizationDirectory().createAndAddOrganization(orgType);
        JOptionPane.showMessageDialog(null, "Organization Created Successfully","", JOptionPane.INFORMATION_MESSAGE);
        populateOrganizationTable();
        addOrganizationJButton1.setEnabled(false);
//        }else JOptionPane.showMessageDialog(null, "Organizaiton Already Exists in Enterprise","Unable to add Organization", JOptionPane.ERROR_MESSAGE);
        // TODO add your handling code here:
    }//GEN-LAST:event_addOrganizationJButton1ActionPerformed

    private void organizationListJTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizationListJTable1MouseClicked
        int selectedRow= organizationListJTable1.getSelectedRow();
        if (selectedRow < 0) return;
        Organization o = (Organization) organizationListJTable1.getValueAt(selectedRow, 0);
        if(o!=null){
            deleteOrganizationJButton2.setEnabled(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationListJTable1MouseClicked

    private void refreshButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButton1ActionPerformed
         populateOrganizationTable();
    }//GEN-LAST:event_refreshButton1ActionPerformed

    private void deleteOrganizationJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrganizationJButton2ActionPerformed
       
        int selectedRow= organizationListJTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Row","Invalid Action", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Organization o = (Organization) organizationListJTable1.getValueAt(selectedRow, 0);
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int response= JOptionPane.showConfirmDialog(null, "Are you sure to delete "+ o.getName() +" ?", "Delete Confirmation", dialogButton, JOptionPane.WARNING_MESSAGE);
        if(response == JOptionPane.YES_OPTION)
        enterprise.getOrganizationDirectory().getOrganizationList().remove(o);
        populateOrganizationTable();
        deleteOrganizationJButton2.setEnabled(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteOrganizationJButton2ActionPerformed

    private void organizationJComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizationJComboBox1MouseClicked

        addOrganizationJButton1.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationJComboBox1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrganizationJButton1;
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton deleteOrganizationJButton2;
    private javax.swing.JLabel imageJLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameJLabel3;
    private javax.swing.JComboBox organizationJComboBox1;
    private javax.swing.JTable organizationListJTable1;
    private javax.swing.JButton refreshButton1;
    // End of variables declaration//GEN-END:variables
}
