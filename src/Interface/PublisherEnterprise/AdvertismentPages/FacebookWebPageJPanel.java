/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.PublisherEnterprise.AdvertismentPages;

import System.Advertisments.Advertisment;
import System.Enterprise.AdExchange;
import System.Enterprise.Advertiser;
import System.Enterprise.Enterprise;
import System.Enterprise.Publisher;
import System.Market.Market;
import System.Network.Network;
import System.UserAccount.EndUserUserAccount;
import System.WorkQueue.AdServingWorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author SURAJ
 */
public class FacebookWebPageJPanel extends javax.swing.JPanel {

    private int pageHits;
    private String pageName= "Facebook.com";
    private int adSpaces=1;
    private static int count=9;
    private JPanel userProcessContainer;
    private EndUserUserAccount userAccount;
    private AdExchange exchange;
    private Publisher publisher;
    private Advertisment advertisment;
    /**
     * Creates new form Publisher2Page1
     */
    public FacebookWebPageJPanel(JPanel userProcessContainer, Network network, Publisher publisher, EndUserUserAccount ua) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.userAccount= ua;
        this.publisher= publisher;
        pageHits= count;
        getAdExchange(network);
    }

    private void getAdExchange(Network network)
    {
        if(network==null) return;
        for(Enterprise e: network.getEnterpriseList())
            if(e instanceof AdExchange)
                exchange = (AdExchange) e;
        if(exchange!= null){
            if(!exchange.getPublisherList().isEmpty())
                count++;
                getAdImageforLabel1();
        }
    }
    
    private void getAdImageforLabel1()
    {
        AdServingWorkRequest request= generateWorkRequest("Top");
        request.setMessage("User Arrival/Request for Ad");
        advertisment= exchange.getBidsforAdSpaces(exchange, request);
        if(advertisment != null){
          String imagePath= advertisment.getAdImagePath();
         if (imagePath != null)
          {
           ImageIcon icon= new ImageIcon(imagePath);
           Image img = icon.getImage();
           Image newimg = img.getScaledInstance(500, 200,  java.awt.Image.SCALE_SMOOTH);  
           ImageIcon newIcon = new ImageIcon(newimg); 
           adImageJLabel1.setIcon(newIcon);
          }
        }
        else topImageLabel1.setText("No Ads available");
    }
     private AdServingWorkRequest generateWorkRequest(String position)
    {
        AdServingWorkRequest request = new AdServingWorkRequest();
        request.setSenderEnterprise(publisher);
        request.setExchange(exchange);
        request.setStatus("Submitted");
        request.setAdPosition(position);
        request.setUserAccount(userAccount);
        request.setPageRanking(pageHits);
        publisher.getWorkQueue().getRequestList().add(request);
        exchange.getWorkQueue().getRequestList().add(request);
        return request;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton1 = new javax.swing.JButton();
        adImageJLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        topImageLabel1 = new javax.swing.JLabel();
        imageJLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backbutton.png"))); // NOI18N
        backJButton1.setText("Back");
        backJButton1.setToolTipText("Back");
        backJButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 90, -1));

        adImageJLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adImageJLabel1.setPreferredSize(new java.awt.Dimension(300, 200));
        adImageJLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adImageJLabel1MouseClicked(evt);
            }
        });
        add(adImageJLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 480, 270));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Facebook.com");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 420, 60));
        add(topImageLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 300, 30));

        imageJLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        imageJLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Facebook image.jpg"))); // NOI18N
        add(imageJLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 690));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void adImageJLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adImageJLabel1MouseClicked

        if(advertisment==null) return;
        for(Market market: exchange.getMarketDirectory().getMarketList())
        for(Advertiser advertiser: market.getAdvertiserList())
        for(Advertisment adv: advertiser.getAdDirectory().getAdList())
        if(adv.getAdID()== advertisment.getAdID())
        {
         userAccount.getPersonProfile().setMarketType(market.getMarketType());
         int clicks = userAccount.getPersonProfile().getUserClicks();
         userAccount.getPersonProfile().setUserClicks(clicks+1);
        }
        DisplayAdImageJPanel displayAdJPanel= new DisplayAdImageJPanel(userProcessContainer, advertisment);
        userProcessContainer.add("DisplayAdJPanel", displayAdJPanel);
        ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_adImageJLabel1MouseClicked
    
    public int getPageHits() {
        return pageHits;
    }

    public int getAdSpaces() {
        return adSpaces;
    }

    public String getPageName() {
        return pageName;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adImageJLabel1;
    private javax.swing.JButton backJButton1;
    private javax.swing.JLabel imageJLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel topImageLabel1;
    // End of variables declaration//GEN-END:variables
}
