/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdExchangeEnterprise.MarketOrganization;

import System.Enterprise.AdExchange;
import System.Person.Person;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SURAJ
 */
public class ManageEndUserProfilesJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    /**
     * Creates new form ManageUserProfilesJPanel
     */
    public ManageEndUserProfilesJPanel(JPanel userProcessContainer, AdExchange exchange) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        populateTable(exchange);
    }

    private void populateTable(AdExchange exchange)
    {
        DefaultTableModel model = (DefaultTableModel) userJTable1.getModel();
        model.setRowCount(0);
        
       for(Person profile: exchange.getUserPersonProfiles().getPersonlist())
        {
            Object[] object = new Object[5];
            object[0]= profile;
            object[1]= profile.getPersonID();
            object[2]= profile.getAge();
            object[3]= profile.getGender();
            object[4]= profile.getAddress().getCity()+", "+profile.getAddress().getState();
            model.addRow(object);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        userDetailsJButton2 = new javax.swing.JButton();
        backJButton1 = new javax.swing.JButton();
        imageJLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/report-icon-32.png"))); // NOI18N
        jLabel1.setText("View User Profiles");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 420, 60));

        userJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Person ID", "Age", "Gender", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userJTable1.setToolTipText("User List");
        userJTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userJTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userJTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 770, 350));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setText("User List :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 150, 30));

        userDetailsJButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/View_icon.png"))); // NOI18N
        userDetailsJButton2.setText("View Details");
        userDetailsJButton2.setToolTipText("View Customer Profile Details");
        userDetailsJButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userDetailsJButton2.setEnabled(false);
        userDetailsJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDetailsJButton2ActionPerformed(evt);
            }
        });
        add(userDetailsJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 150, 40));

        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbutton.png"))); // NOI18N
        backJButton1.setText("Back");
        backJButton1.setToolTipText("Back");
        backJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 80, -1));

        imageJLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        imageJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdExchange Background.jpg"))); // NOI18N
        add(imageJLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void userDetailsJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDetailsJButton2ActionPerformed

        int selectedRow= userJTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Row","Invalid Action", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Person person= (Person) userJTable1.getValueAt(selectedRow, 0);
        ViewUserProfileDetailsJPanel viewUserProfileJPanel= new ViewUserProfileDetailsJPanel(userProcessContainer, person);
        userProcessContainer.add("ViewUserProfileJPanel", viewUserProfileJPanel);
            ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_userDetailsJButton2ActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed

        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void userJTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userJTable1MouseClicked
        int selectedRow= userJTable1.getSelectedRow();
        if (selectedRow < 0) return;
        Person person =  (Person) userJTable1.getValueAt(selectedRow, 0);
        if(person!=null)
        userDetailsJButton2.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_userJTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JLabel imageJLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton userDetailsJButton2;
    private javax.swing.JTable userJTable1;
    // End of variables declaration//GEN-END:variables
}