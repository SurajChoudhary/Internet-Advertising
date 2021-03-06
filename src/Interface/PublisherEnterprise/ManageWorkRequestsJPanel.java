/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.PublisherEnterprise;

import Interface.AdExchangeEnterprise.ViewAdServingWorkRequestJPanel;
import System.Enterprise.AdExchange;
import System.Enterprise.Publisher;
import System.Network.Network;
import System.WorkQueue.AdServingWorkRequest;
import System.WorkQueue.AddPublisherWorkRequest;
import System.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SURAJ
 */
public class ManageWorkRequestsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Publisher publisher;
    /**
     * Creates new form AddRequestJPanel
     */
    public ManageWorkRequestsJPanel(JPanel userProcessContainer,Publisher publisher,Network network) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.publisher= publisher;
        populateTable();
        populateComboBox(network);    
    }
    private void populateComboBox(Network network)
    {
        adExchangeJComboBox1.removeAllItems();
         for(AdExchange exchange: network.adExchangeList())
             adExchangeJComboBox1.addItem(exchange);
    }
    
    private void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) workQueueJTable1.getModel();
        model.setRowCount(0);
        
        for(WorkRequest request: publisher.getWorkQueue().getRequestList()){
            Object[] row = new Object[5];
            row[0]= request;
            row[1]= request.getMessage();
            row[2]= request.getCreated();
            row[3]= request.getExchange();
            row[4]= request.getStatus();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workQueueJTable1 = new javax.swing.JTable();
        sendJButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        adExchangeJComboBox1 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        viewRequestJButton2 = new javax.swing.JButton();
        imageJLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Manage Icon.png"))); // NOI18N
        jLabel1.setText("Manage Work Requests");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 420, 60));

        workQueueJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Message", "Date/Time", "Receiver (AdExchange)", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workQueueJTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workQueueJTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(workQueueJTable1);
        workQueueJTable1.getColumnModel().getColumn(0).setPreferredWidth(8);
        workQueueJTable1.getColumnModel().getColumn(2).setPreferredWidth(90);
        workQueueJTable1.getColumnModel().getColumn(4).setPreferredWidth(25);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 750, 260));

        sendJButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mail-send-icon.png"))); // NOI18N
        sendJButton2.setText("Send");
        sendJButton2.setToolTipText("Send Add Request to AdExchange");
        sendJButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sendJButton2.setEnabled(false);
        sendJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendJButton2ActionPerformed(evt);
            }
        });
        add(sendJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 490, 120, 30));

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel4.setText("Select an AdExchange :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 180, 30));

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel5.setText("Send Add Request to AdExchange :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 260, 30));

        adExchangeJComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adExchangeJComboBox1MouseClicked(evt);
            }
        });
        add(adExchangeJComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 230, 30));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setText("Work Queue :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 140, 30));

        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbutton.png"))); // NOI18N
        backJButton1.setText("Back");
        backJButton1.setToolTipText("Back");
        backJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 80, -1));

        viewRequestJButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/View_icon.png"))); // NOI18N
        viewRequestJButton2.setText("View Details");
        viewRequestJButton2.setToolTipText("View Request Details");
        viewRequestJButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewRequestJButton2.setEnabled(false);
        viewRequestJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequestJButton2ActionPerformed(evt);
            }
        });
        add(viewRequestJButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 130, 30));

        imageJLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        imageJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Publisher Back Ground.jpeg"))); // NOI18N
        add(imageJLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 690));
    }// </editor-fold>//GEN-END:initComponents

    private void sendJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendJButton2ActionPerformed

        AdExchange exchange = (AdExchange) adExchangeJComboBox1.getSelectedItem();
        if(exchange == null)
        {
            JOptionPane.showMessageDialog(null, "Please select a Network","Invalid Action", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        AddPublisherWorkRequest request= new AddPublisherWorkRequest();
        request.setExchange(exchange);
        request.setMessage("Request for Adding in Exchange");
        request.setSenderEnterprise(publisher);
        request.setStatus("Submitted");
        publisher.getWorkQueue().getRequestList().add(request);
        exchange.getWorkQueue().getRequestList().add(request);
        populateTable();
        JOptionPane.showMessageDialog(null, "Request Send Successfully","", JOptionPane.INFORMATION_MESSAGE);
        sendJButton2.setEnabled(false);
     
        // TODO add your handling code here:
    }//GEN-LAST:event_sendJButton2ActionPerformed

    private void adExchangeJComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adExchangeJComboBox1MouseClicked
        
        sendJButton2.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_adExchangeJComboBox1MouseClicked

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed

        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void viewRequestJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequestJButton2ActionPerformed

        int selectedRow= workQueueJTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Row","Invalid Action", JOptionPane.WARNING_MESSAGE);
            return;
        }
        WorkRequest request = (WorkRequest) workQueueJTable1.getValueAt(selectedRow, 0);
         if(request instanceof AdServingWorkRequest)
         {
           ViewAdServingWorkRequestJPanel viewAdSpaceWorkRequestJPanel= new ViewAdServingWorkRequestJPanel(userProcessContainer, (AdServingWorkRequest) request);;
           userProcessContainer.add("ViewAdSpaceWorkRequestJPanel", viewAdSpaceWorkRequestJPanel);
          ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
         }
         else JOptionPane.showMessageDialog(null, "Please select an Ad Serving \nWork Request to View Details");
            
        // TODO add your handling code here:
    }//GEN-LAST:event_viewRequestJButton2ActionPerformed

    private void workQueueJTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workQueueJTable1MouseClicked
        int selectedRow= workQueueJTable1.getSelectedRow();
        if (selectedRow < 0) return;
        WorkRequest request = (WorkRequest) workQueueJTable1.getValueAt(selectedRow, 0);
        if(request!=null)
        viewRequestJButton2.setEnabled(true);// TODO add your handling code here:
    }//GEN-LAST:event_workQueueJTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox adExchangeJComboBox1;
    private javax.swing.JButton backJButton1;
    private javax.swing.JLabel imageJLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sendJButton2;
    private javax.swing.JButton viewRequestJButton2;
    private javax.swing.JTable workQueueJTable1;
    // End of variables declaration//GEN-END:variables
}
