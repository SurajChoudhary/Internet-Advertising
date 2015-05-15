/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Organizations;

import System.Employee.Employee;
import System.Person.Person;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author SURAJ
 */
public class ViewEmployeeJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Employee employee;
    /**
     * Creates new form UpdateEmployeeJPanel
     */
    public ViewEmployeeJPanel(JPanel userProcessContainer, Employee employee) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.employee= employee;
        populateFeilds();
    }
    
    private void populateFeilds()
    {
        empIDJLabel1.setText(String.valueOf(employee.getEmpID()));
        Person person = employee.getPerson();
        firstnameJLabel3.setText(person.getFirstName());
        lastNameLabel4.setText(person.getLastName());
        dobJLabel3.setText(String.valueOf(person.getDay()+" "+ person.getMonth()+" "+String.valueOf(person.getYear())));
        ageLabel4.setText(String.valueOf(person.getAge()));
        genderJLabel3.setText(person.getGender());
        personIDJLabel4.setText(String.valueOf(person.getPersonID()));
        streetAddress1Label3.setText(person.getAddress().getStreetAddress1());
        streetAddress2Label4.setText(person.getAddress().getStreetAddress2());
        cityJLabel7.setText(person.getAddress().getCity());
        stateJLabel8.setText(person.getAddress().getState());
        countryLabel10.setText(person.getAddress().getCountry());
        zipCodeLabel9.setText(String.valueOf(person.getAddress().getZipCode()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        empIDJLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        firstNameJLabel10 = new javax.swing.JLabel();
        firstnameJLabel3 = new javax.swing.JLabel();
        lastNameJLabel9 = new javax.swing.JLabel();
        lastNameLabel4 = new javax.swing.JLabel();
        dobJLabel12 = new javax.swing.JLabel();
        dobJLabel3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ageLabel4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        genderJLabel3 = new javax.swing.JLabel();
        personIDJLabel14 = new javax.swing.JLabel();
        personIDJLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        streetAddress1JLabel1 = new javax.swing.JLabel();
        streetAddress1Label3 = new javax.swing.JLabel();
        streetAddress2JLabel2 = new javax.swing.JLabel();
        streetAddress2Label4 = new javax.swing.JLabel();
        jcityJLabel3 = new javax.swing.JLabel();
        cityJLabel7 = new javax.swing.JLabel();
        stateJLabel4 = new javax.swing.JLabel();
        stateJLabel8 = new javax.swing.JLabel();
        zipCodeJLabel6 = new javax.swing.JLabel();
        countryLabel10 = new javax.swing.JLabel();
        zipCodeJLabel5 = new javax.swing.JLabel();
        zipCodeLabel9 = new javax.swing.JLabel();
        imageJLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/View_icon.png"))); // NOI18N
        jLabel5.setText("View Employee Profile");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 330, 60));

        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbutton.png"))); // NOI18N
        backJButton1.setText("Back");
        backJButton1.setToolTipText("Back");
        backJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 90, 30));
        add(empIDJLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 130, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Employee ID :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 110, 30));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Person Profile", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Apple Braille", 1, 14))); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Page 1 of 2", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Apple Braille", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(6, 2, 0, 4));

        firstNameJLabel10.setText("             First Name");
        jPanel1.add(firstNameJLabel10);
        jPanel1.add(firstnameJLabel3);

        lastNameJLabel9.setText("             Last Name");
        jPanel1.add(lastNameJLabel9);
        jPanel1.add(lastNameLabel4);

        dobJLabel12.setText("             Date of Birth");
        jPanel1.add(dobJLabel12);
        jPanel1.add(dobJLabel3);

        jLabel3.setText("             Age");
        jPanel1.add(jLabel3);
        jPanel1.add(ageLabel4);

        jLabel4.setText("             Gender");
        jPanel1.add(jLabel4);
        jPanel1.add(genderJLabel3);

        personIDJLabel14.setText("             Person ID");
        jPanel1.add(personIDJLabel14);
        jPanel1.add(personIDJLabel4);

        jTabbedPane1.addTab("Personal Information", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Page 2 of 2", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Apple Braille", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(6, 2, 0, 4));

        streetAddress1JLabel1.setText("            Street Address 1");
        jPanel2.add(streetAddress1JLabel1);
        jPanel2.add(streetAddress1Label3);

        streetAddress2JLabel2.setText("            Street Address 2");
        jPanel2.add(streetAddress2JLabel2);
        jPanel2.add(streetAddress2Label4);

        jcityJLabel3.setText("            City");
        jPanel2.add(jcityJLabel3);
        jPanel2.add(cityJLabel7);

        stateJLabel4.setText("            State");
        jPanel2.add(stateJLabel4);
        jPanel2.add(stateJLabel8);

        zipCodeJLabel6.setText("            Country");
        jPanel2.add(zipCodeJLabel6);
        jPanel2.add(countryLabel10);

        zipCodeJLabel5.setText("            ZipCode");
        jPanel2.add(zipCodeJLabel5);
        jPanel2.add(zipCodeLabel9);

        jTabbedPane1.addTab("Address Information", jPanel2);

        jPanel4.add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 750, 320));

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel4;
    private javax.swing.JButton backJButton1;
    private javax.swing.JLabel cityJLabel7;
    private javax.swing.JLabel countryLabel10;
    private javax.swing.JLabel dobJLabel12;
    private javax.swing.JLabel dobJLabel3;
    private javax.swing.JLabel empIDJLabel1;
    private javax.swing.JLabel firstNameJLabel10;
    private javax.swing.JLabel firstnameJLabel3;
    private javax.swing.JLabel genderJLabel3;
    private javax.swing.JLabel imageJLabel2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jcityJLabel3;
    private javax.swing.JLabel lastNameJLabel9;
    private javax.swing.JLabel lastNameLabel4;
    private javax.swing.JLabel personIDJLabel14;
    private javax.swing.JLabel personIDJLabel4;
    private javax.swing.JLabel stateJLabel4;
    private javax.swing.JLabel stateJLabel8;
    private javax.swing.JLabel streetAddress1JLabel1;
    private javax.swing.JLabel streetAddress1Label3;
    private javax.swing.JLabel streetAddress2JLabel2;
    private javax.swing.JLabel streetAddress2Label4;
    private javax.swing.JLabel zipCodeJLabel5;
    private javax.swing.JLabel zipCodeJLabel6;
    private javax.swing.JLabel zipCodeLabel9;
    // End of variables declaration//GEN-END:variables
}
