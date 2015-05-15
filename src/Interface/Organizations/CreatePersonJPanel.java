/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Organizations;

import System.EcoSystem;
import System.Enterprise.Enterprise;
import System.Organization.Organization;
import System.Person.AddressInfo;
import System.Person.Person;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author SURAJ
 */
public class CreatePersonJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer; 
    private Enterprise enterprise;
    private EcoSystem system;
    private Organization organization;
    /**
     * Creates new form CreatePersonJPanel
     */
    public CreatePersonJPanel(JPanel userProcessContainer, EcoSystem system, Enterprise enterprise, Organization organization) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.organization= organization;
        this.system= system;
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
        createPersonJButton1 = new javax.swing.JButton();
        backJButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        firstNameJLabel10 = new javax.swing.JLabel();
        firstNameJTextField9 = new javax.swing.JTextField();
        lastNameJLabel9 = new javax.swing.JLabel();
        lastNameJTextField10 = new javax.swing.JTextField();
        dobJLabel12 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        dayJComboBox1 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        monthJComboBox2 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        yearsJTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        genderJComboBox1 = new javax.swing.JComboBox();
        ssnJLabel14 = new javax.swing.JLabel();
        personIDJTextField14 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        streetAddress1JLabel1 = new javax.swing.JLabel();
        streetAddress1JTextField1 = new javax.swing.JTextField();
        streetAddress2JLabel2 = new javax.swing.JLabel();
        streetAddress2JTextField2 = new javax.swing.JTextField();
        jcityJLabel3 = new javax.swing.JLabel();
        cityJTextField3 = new javax.swing.JTextField();
        stateJLabel4 = new javax.swing.JLabel();
        stateJTextField4 = new javax.swing.JTextField();
        zipCodeJLabel6 = new javax.swing.JLabel();
        countryJTextField1 = new javax.swing.JTextField();
        zipCodeJLabel5 = new javax.swing.JLabel();
        zipCodeJTextField5 = new javax.swing.JTextField();
        imageJLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/create icon.png"))); // NOI18N
        jLabel5.setText("Create Person Profile");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 330, 60));

        createPersonJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save_icon.gif"))); // NOI18N
        createPersonJButton1.setText("Create Profile");
        createPersonJButton1.setToolTipText("Create Person Profile");
        createPersonJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createPersonJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPersonJButton1ActionPerformed(evt);
            }
        });
        add(createPersonJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, 150, 30));

        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbutton.png"))); // NOI18N
        backJButton1.setText("Back");
        backJButton1.setToolTipText("Back");
        backJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 100, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Profile Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Apple Braille", 1, 14))); // NOI18N
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Step 1 of 2", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Apple Braille", 1, 14), new java.awt.Color(255, 0, 51))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(5, 2, 0, 4));

        firstNameJLabel10.setText("                  First Name");
        jPanel1.add(firstNameJLabel10);

        firstNameJTextField9.setPreferredSize(new java.awt.Dimension(7, 14));
        firstNameJTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstNameJTextField9FocusLost(evt);
            }
        });
        jPanel1.add(firstNameJTextField9);

        lastNameJLabel9.setText("                  Last Name");
        jPanel1.add(lastNameJLabel9);

        lastNameJTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastNameJTextField10FocusLost(evt);
            }
        });
        jPanel1.add(lastNameJTextField10);

        dobJLabel12.setText("                  Date of Birth");
        jPanel1.add(dobJLabel12);

        jPanel11.setOpaque(false);

        jLabel10.setText("Day :");
        jPanel11.add(jLabel10);

        dayJComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dayJComboBox1.setPreferredSize(new java.awt.Dimension(60, 27));
        jPanel11.add(dayJComboBox1);

        jLabel9.setText("Month :");
        jPanel11.add(jLabel9);

        monthJComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        monthJComboBox2.setPreferredSize(new java.awt.Dimension(105, 27));
        jPanel11.add(monthJComboBox2);

        jLabel2.setText("Year :");
        jPanel11.add(jLabel2);

        yearsJTextField2.setPreferredSize(new java.awt.Dimension(50, 28));
        yearsJTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                yearsJTextField2FocusLost(evt);
            }
        });
        jPanel11.add(yearsJTextField2);

        jPanel1.add(jPanel11);

        jLabel1.setText("                  Gender");
        jPanel1.add(jLabel1);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        genderJComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jPanel3.add(genderJComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jPanel1.add(jPanel3);

        ssnJLabel14.setText("                  Person ID");
        jPanel1.add(ssnJLabel14);

        personIDJTextField14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                personIDJTextField14FocusLost(evt);
            }
        });
        jPanel1.add(personIDJTextField14);

        jTabbedPane1.addTab("Personal Information", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Step 2 of 2", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Apple Braille", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(6, 2, 0, 1));

        streetAddress1JLabel1.setText("                 Street Address 1");
        jPanel2.add(streetAddress1JLabel1);
        jPanel2.add(streetAddress1JTextField1);

        streetAddress2JLabel2.setText("                 Street Address 2");
        jPanel2.add(streetAddress2JLabel2);
        jPanel2.add(streetAddress2JTextField2);

        jcityJLabel3.setText("                 City");
        jPanel2.add(jcityJLabel3);

        cityJTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cityJTextField3FocusLost(evt);
            }
        });
        jPanel2.add(cityJTextField3);

        stateJLabel4.setText("                 State");
        jPanel2.add(stateJLabel4);

        stateJTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                stateJTextField4FocusLost(evt);
            }
        });
        jPanel2.add(stateJTextField4);

        zipCodeJLabel6.setText("                 Country");
        jPanel2.add(zipCodeJLabel6);

        countryJTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                countryJTextField1FocusLost(evt);
            }
        });
        jPanel2.add(countryJTextField1);

        zipCodeJLabel5.setText("                 ZipCode");
        jPanel2.add(zipCodeJLabel5);

        zipCodeJTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                zipCodeJTextField5FocusLost(evt);
            }
        });
        jPanel2.add(zipCodeJTextField5);

        jTabbedPane1.addTab("Address Information", jPanel2);

        jPanel4.add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 810, 310));

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

    private void createPersonJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPersonJButton1ActionPerformed

        if(firstNameJTextField9.getText().isEmpty()||lastNameJTextField10.getText().isEmpty()||yearsJTextField2.getText().isEmpty()||
              personIDJTextField14.getText().isEmpty()||streetAddress1JTextField1.getText().isEmpty()||cityJTextField3.getText().isEmpty()
                ||stateJTextField4.getText().isEmpty()|| countryJTextField1.getText().isEmpty()||zipCodeJTextField5.getText().isEmpty())
        {
         JOptionPane.showMessageDialog(null, "One or more fields are Empty","", JOptionPane.INFORMATION_MESSAGE);
         return;
        }
        if(yearsJTextField2.getText().length()!=4||zipCodeJTextField5.getText().length()!=5
                ||personIDJTextField14.getText().length()!=6) return;
        if(yearsJTextField2.getText().contains("-")||zipCodeJTextField5.getText().contains("-")
                ||personIDJTextField14.getText().contains("-")||yearsJTextField2.getText().contains("+")
                ||zipCodeJTextField5.getText().contains("+")||personIDJTextField14.getText().contains("+")) return;
        int year,zipCode,personID;
        try{
            year = Integer.parseInt(yearsJTextField2.getText());
            zipCode= Integer.parseInt(zipCodeJTextField5.getText());
            personID= Integer.parseInt(personIDJTextField14.getText());
         } catch (Exception e) {return;
         }
        Boolean exists= system.checkPersonID(personID,system);
        if(!exists)
        {
            String day=  (String) dayJComboBox1.getSelectedItem();
            String month= (String) monthJComboBox2.getSelectedItem();
           
            Calendar now = Calendar.getInstance();
            int currentYear= now.get(Calendar.YEAR); ; 
            int age = currentYear-year;
            
            AddressInfo address = new AddressInfo();
            address.setStreetAddress1(streetAddress1JTextField1.getText());
            address.setStreetAddress2(streetAddress2JTextField2.getText());
            address.setCity(cityJTextField3.getText());
            address.setState(stateJTextField4.getText());
            address.setCountry(countryJTextField1.getText());
            address.setZipCode(zipCode);
            Person person= new Person();
            person.setFirstName(firstNameJTextField9.getText());
            person.setLastName(lastNameJTextField10.getText());
            person.setPersonID(personID);
            person.setDay(Integer.parseInt(day));
            person.setMonth(month);
            person.setYear(year);
            person.setAge(age);
            person.setGender((String) genderJComboBox1.getSelectedItem());
            person.setAddress(address);
            if(enterprise != null)
                enterprise.getPersonDirectory().getPersonlist().add(person);
            else if(organization != null)
                organization.getPersonDirectory().getPersonlist().add(person);
            
            JOptionPane.showMessageDialog(null, "Person Created Successfully","", JOptionPane.INFORMATION_MESSAGE);
            userProcessContainer.remove(this);
            ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter different PersonID","PersonID already exists", JOptionPane.ERROR_MESSAGE);
            personIDJTextField14.setBackground(Color.yellow);
            personIDJTextField14.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_createPersonJButton1ActionPerformed

    private void firstNameJTextField9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstNameJTextField9FocusLost
       String value = firstNameJTextField9.getText();
        if (value.equals("")) {
        } else {
        Pattern pt6 = Pattern.compile("^[a-zA-Z]*$");
        Matcher mh6 = pt6.matcher(value);
        boolean matchFound6 = mh6.matches();
        if (!(matchFound6)) {
            JOptionPane.showMessageDialog(null, "Enter the Characters only");
            firstNameJTextField9.setText("");
            firstNameJTextField9.requestFocus();
        }
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameJTextField9FocusLost

    private void lastNameJTextField10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastNameJTextField10FocusLost
      String value = lastNameJTextField10.getText();
        if (value.equals("")) {
        } else {
        Pattern pt6 = Pattern.compile("^[a-zA-Z]*$");
        Matcher mh6 = pt6.matcher(value);
        boolean matchFound6 = mh6.matches();
        if (!(matchFound6)) {
            JOptionPane.showMessageDialog(null, "Enter the Characters only");
            lastNameJTextField10.setText("");
            lastNameJTextField10.requestFocus();
        }
    }   // TODO add your handling code here:
    }//GEN-LAST:event_lastNameJTextField10FocusLost

    private void yearsJTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yearsJTextField2FocusLost
       String value = yearsJTextField2.getText();
        if (value.equals("")) {
        } else {
        Pattern pt6 = Pattern.compile("^[0-9]*$");
        Matcher mh6 = pt6.matcher(value);
        boolean matchFound6 = mh6.matches();
        if (!(matchFound6)) {
            JOptionPane.showMessageDialog(null, "Enter the Numbers only");
            yearsJTextField2.setText("");
            yearsJTextField2.requestFocus();
        }else{
            if(value.length()!=4)
            { JOptionPane.showMessageDialog(null, "Enter a valid Year value", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
                yearsJTextField2.setText("");
                yearsJTextField2.requestFocus();
            }
        }
    } // TODO add your handling code here:
    }//GEN-LAST:event_yearsJTextField2FocusLost

    private void personIDJTextField14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_personIDJTextField14FocusLost
      String value = personIDJTextField14.getText();
        if (value.equals("")) {
        } else {
        Pattern pt6 = Pattern.compile("^[0-9]*$");
        Matcher mh6 = pt6.matcher(value);
        boolean matchFound6 = mh6.matches();
        if (!(matchFound6)) {
            JOptionPane.showMessageDialog(null, "Enter the Numbers only");
            personIDJTextField14.setText("");
            personIDJTextField14.requestFocus();
        }else{
            if(value.length()!=6)
            { JOptionPane.showMessageDialog(null, "PersonID should be of 6 Digits");
                personIDJTextField14.setText("");
                personIDJTextField14.requestFocus();
            }
        }
    }     // TODO add your handling code here:
    }//GEN-LAST:event_personIDJTextField14FocusLost

    private void cityJTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cityJTextField3FocusLost
       String value = cityJTextField3.getText();
        if (value.equals("")) {
        } else {
        Pattern pt6 = Pattern.compile("^[a-zA-Z]*$");
        Matcher mh6 = pt6.matcher(value);
        boolean matchFound6 = mh6.matches();
        if (!(matchFound6)) {
            JOptionPane.showMessageDialog(null, "Enter the Characters only");
            cityJTextField3.setText("");
            cityJTextField3.requestFocus();
        }
    } // TODO add your handling code here:
    }//GEN-LAST:event_cityJTextField3FocusLost

    private void stateJTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stateJTextField4FocusLost
     String value = stateJTextField4.getText();
        if (value.equals("")) {
        } else {
        Pattern pt6 = Pattern.compile("^[a-zA-Z]*$");
        Matcher mh6 = pt6.matcher(value);
        boolean matchFound6 = mh6.matches();
        if (!(matchFound6)) {
            JOptionPane.showMessageDialog(null, "Enter the Characters only");
            stateJTextField4.setText("");
            stateJTextField4.requestFocus();
        }
    }   // TODO add your handling code here:
    }//GEN-LAST:event_stateJTextField4FocusLost

    private void zipCodeJTextField5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zipCodeJTextField5FocusLost
       String value = zipCodeJTextField5.getText();
        if (value.equals("")) {
        } else {
        Pattern pt6 = Pattern.compile("^[0-9]*$");
        Matcher mh6 = pt6.matcher(value);
        boolean matchFound6 = mh6.matches();
        if (!(matchFound6)) {
            JOptionPane.showMessageDialog(null, "Enter the Numbers only");
            zipCodeJTextField5.setText("");
            zipCodeJTextField5.requestFocus();
        }else{
            if(value.length()!=5)
            { JOptionPane.showMessageDialog(null, "Enter 5 digit Zipcode", "Invalid Entry", JOptionPane.ERROR_MESSAGE);
                zipCodeJTextField5.setText("");
                zipCodeJTextField5.requestFocus();
            }
        }
    } // TODO add your handling code here:
    }//GEN-LAST:event_zipCodeJTextField5FocusLost

    private void countryJTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_countryJTextField1FocusLost
        String value = countryJTextField1.getText();
        if (value.equals("")) {
        } else {
            Pattern pt6 = Pattern.compile("^[a-zA-Z]*$");
            Matcher mh6 = pt6.matcher(value);
            boolean matchFound6 = mh6.matches();
            if (!(matchFound6)) {
                JOptionPane.showMessageDialog(null, "Enter the Characters only");
                countryJTextField1.setText("");
                countryJTextField1.requestFocus();
            }
        } // TODO add your handling code here:
    }//GEN-LAST:event_countryJTextField1FocusLost
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JTextField cityJTextField3;
    private javax.swing.JTextField countryJTextField1;
    private javax.swing.JButton createPersonJButton1;
    private javax.swing.JComboBox dayJComboBox1;
    private javax.swing.JLabel dobJLabel12;
    private javax.swing.JLabel firstNameJLabel10;
    private javax.swing.JTextField firstNameJTextField9;
    private javax.swing.JComboBox genderJComboBox1;
    private javax.swing.JLabel imageJLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jcityJLabel3;
    private javax.swing.JLabel lastNameJLabel9;
    private javax.swing.JTextField lastNameJTextField10;
    private javax.swing.JComboBox monthJComboBox2;
    private javax.swing.JTextField personIDJTextField14;
    private javax.swing.JLabel ssnJLabel14;
    private javax.swing.JLabel stateJLabel4;
    private javax.swing.JTextField stateJTextField4;
    private javax.swing.JLabel streetAddress1JLabel1;
    private javax.swing.JTextField streetAddress1JTextField1;
    private javax.swing.JLabel streetAddress2JLabel2;
    private javax.swing.JTextField streetAddress2JTextField2;
    private javax.swing.JTextField yearsJTextField2;
    private javax.swing.JLabel zipCodeJLabel5;
    private javax.swing.JLabel zipCodeJLabel6;
    private javax.swing.JTextField zipCodeJTextField5;
    // End of variables declaration//GEN-END:variables
}
