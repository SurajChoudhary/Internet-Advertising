/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.EcoSystemAdmin;

import System.EcoSystem;
import System.Enterprise.Enterprise;
import System.Network.Network;
import System.Person.Person;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SURAJ
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

     private EcoSystem system;
     private JPanel userProcessContainer;
    /**
     * Creates new form CreateEnterpriceJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer,EcoSystem system, Person p) {
        initComponents();
        this.system= system;
        this.userProcessContainer= userProcessContainer;
        nameJLabel3.setText(p.getFirstName()+" "+p.getLastName());
        populateComboBox();
    }
    
    private void populateComboBox()
    {
        networkJComboBox1.removeAllItems();
        for(Network n: system.getNetworkList())
          networkJComboBox1.addItem(n);
    }

    private void populateEnterpriseTable(Network n)
    {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable1.getModel();
        model.setRowCount(0);
        
        for(Enterprise enterprise: n.getEnterpriseList()){
            Object[] row = new Object[3];
            row[0]= enterprise;
            String name= enterprise.getClass().getName();
            String[] parts= name.split("\\.");
            row[1]= parts[2];
            row[2]= enterprise.getLocation();
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

        networkJComboBox1 = new javax.swing.JComboBox();
        addEnterpriceJButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameJLabel3 = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        viewEnterpriseJButton1 = new javax.swing.JButton();
        deleteEnterpriseJButton2 = new javax.swing.JButton();
        refreshButton1 = new javax.swing.JButton();
        imageJLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        networkJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBox1ActionPerformed(evt);
            }
        });
        add(networkJComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 210, 30));

        addEnterpriceJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addIcon.gif"))); // NOI18N
        addEnterpriceJButton1.setText("Add Enterprise");
        addEnterpriceJButton1.setToolTipText("Create Enterprise");
        addEnterpriceJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addEnterpriceJButton1.setEnabled(false);
        addEnterpriceJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEnterpriceJButton1ActionPerformed(evt);
            }
        });
        add(addEnterpriceJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 160, 40));

        enterpriseJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Type", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseJTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterpriseJTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 690, 220));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Manage Icon.png"))); // NOI18N
        jLabel1.setText("Manage Enterprise");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 330, 60));

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 16)); // NOI18N
        jLabel2.setText("Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 60, 30));

        nameJLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 16)); // NOI18N
        add(nameJLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 170, 30));

        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbutton.png"))); // NOI18N
        backJButton1.setText("Back");
        backJButton1.setToolTipText("Back");
        backJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 80, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setText("Select a Network :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 140, 30));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setText("Enterprise List :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 140, 30));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setText("Create an Enterprise :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 160, 30));

        viewEnterpriseJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search_icon small.gif"))); // NOI18N
        viewEnterpriseJButton1.setText("View Details");
        viewEnterpriseJButton1.setToolTipText("View Enterprise");
        viewEnterpriseJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewEnterpriseJButton1.setEnabled(false);
        viewEnterpriseJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEnterpriseJButton1ActionPerformed(evt);
            }
        });
        add(viewEnterpriseJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 170, 40));

        deleteEnterpriseJButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_icon.png"))); // NOI18N
        deleteEnterpriseJButton2.setText("Delete Enterprise");
        deleteEnterpriseJButton2.setToolTipText("Delete Enterprise");
        deleteEnterpriseJButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteEnterpriseJButton2.setEnabled(false);
        deleteEnterpriseJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEnterpriseJButton2ActionPerformed(evt);
            }
        });
        add(deleteEnterpriseJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 170, 40));

        refreshButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reset-icon.png"))); // NOI18N
        refreshButton1.setText("Refresh");
        refreshButton1.setToolTipText("Refresh Table");
        refreshButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButton1ActionPerformed(evt);
            }
        });
        add(refreshButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 120, 30));

        imageJLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        imageJLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/110637_SystemManagebackgroundPanel.jpg"))); // NOI18N
        add(imageJLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBox1ActionPerformed

        Network n = (Network) networkJComboBox1.getSelectedItem();
         if(n != null)
         {populateEnterpriseTable(n);
        addEnterpriceJButton1.setEnabled(true);
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_networkJComboBox1ActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed

        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void addEnterpriceJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEnterpriceJButton1ActionPerformed

        Network n = (Network) networkJComboBox1.getSelectedItem();
        if(n == null)
        {
             JOptionPane.showMessageDialog(null, "Please select a Network","Invalid Action", JOptionPane.WARNING_MESSAGE);
             return;
        }
        CreateEnterpriseJPanel createEnterpriseJPanel= new CreateEnterpriseJPanel(userProcessContainer, n);
        userProcessContainer.add("CreateEnterpriseJPanel", createEnterpriseJPanel);
        ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_addEnterpriceJButton1ActionPerformed

    private void enterpriseJTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterpriseJTable1MouseClicked
        int selectedRow= enterpriseJTable1.getSelectedRow();
        if (selectedRow < 0) return;
        Enterprise enterprise =   (Enterprise) enterpriseJTable1.getValueAt(selectedRow, 0);
        if(enterprise!=null)
        {viewEnterpriseJButton1.setEnabled(true);
        deleteEnterpriseJButton2.setEnabled(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseJTable1MouseClicked

    private void refreshButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButton1ActionPerformed
         Network n = (Network) networkJComboBox1.getSelectedItem();
          if(n != null)populateEnterpriseTable(n);
          viewEnterpriseJButton1.setEnabled(false);
          deleteEnterpriseJButton2.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshButton1ActionPerformed

    private void viewEnterpriseJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEnterpriseJButton1ActionPerformed

        Network n = (Network) networkJComboBox1.getSelectedItem();
        int selectedRow= enterpriseJTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row","Invalid Action", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Enterprise e = (Enterprise) enterpriseJTable1.getValueAt(selectedRow, 0);
        ViewUpdateEnterpriseJPanel viewUpdateEnterpriseJPanel= new ViewUpdateEnterpriseJPanel(userProcessContainer, e, n);
        userProcessContainer.add("ViewUpdateEnterpriseJPanel", viewUpdateEnterpriseJPanel);
        ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_viewEnterpriseJButton1ActionPerformed

    private void deleteEnterpriseJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEnterpriseJButton2ActionPerformed
        Network n = (Network) networkJComboBox1.getSelectedItem();
        int selectedRow= enterpriseJTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Row","Invalid Action", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Enterprise e = (Enterprise) enterpriseJTable1.getValueAt(selectedRow, 0);
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int response =JOptionPane.showConfirmDialog(null, "Are you sure to delete "+ e.getName() +" ?", "Delete Confirmation", dialogButton, JOptionPane.WARNING_MESSAGE);
        if(response == JOptionPane.YES_OPTION)
             n.getEnterpriseList().remove(e);
        populateEnterpriseTable(n);
        deleteEnterpriseJButton2.setEnabled(false);
        viewEnterpriseJButton1.setEnabled(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteEnterpriseJButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEnterpriceJButton1;
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton deleteEnterpriseJButton2;
    private javax.swing.JTable enterpriseJTable1;
    private javax.swing.JLabel imageJLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameJLabel3;
    private javax.swing.JComboBox networkJComboBox1;
    private javax.swing.JButton refreshButton1;
    private javax.swing.JButton viewEnterpriseJButton1;
    // End of variables declaration//GEN-END:variables
}
