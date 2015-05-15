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
public class AmazonWebPageJPanel extends javax.swing.JPanel {

    private int pageHits;
    private String pageName= "Amazon.com";
    private int adSpaces=2;
    private static int count=3;
    private JPanel userProcessContainer;
    private EndUserUserAccount userAccount;
    private AdExchange exchange;
    private Publisher publisher;
    private Advertisment bottomAd;
    private Advertisment topAdv;
    /**
     * Creates new form Publisher1Page1JPanel
     */
    public AmazonWebPageJPanel(JPanel userProcessContainer, Network network, Publisher publisher, EndUserUserAccount ua) {
        initComponents();
        this.userProcessContainer= userProcessContainer;
        this.userAccount= ua;
        this.publisher= publisher;
        pageHits= count; 
        getAdExchange(network);
    }
    
    private void getAdExchange(Network network)
    {
        if(network==null)return;
        for(Enterprise e: network.getEnterpriseList())
            if(e instanceof AdExchange)
                exchange = (AdExchange) e;
        if(exchange!= null){
            if(!exchange.getPublisherList().isEmpty())
            {   count++;
                getAdImageforLabel1();
                getAdImageforLabel2();
            }
        }
    }
    private void getAdImageforLabel1()
    {
        AdServingWorkRequest request= generateWorkRequest("Top");
        request.setMessage("User Arrival/Request for AdSpace1");
        topAdv= exchange.getBidsforAdSpaces(exchange, request);
        if(topAdv != null){
         String imagePath= topAdv.getAdImagePath();
         if (imagePath != null)
          {
           ImageIcon icon= new ImageIcon(imagePath);
           Image img = icon.getImage();
           Image newimg = img.getScaledInstance(500, 240,  java.awt.Image.SCALE_SMOOTH);  
           ImageIcon newIcon = new ImageIcon(newimg); 
           adImageJLabel1.setIcon(newIcon);
          }
        }
        else topImageLabel1.setText("No Ads available for the Top space");
    }
    
    private void getAdImageforLabel2()
    {  
        AdServingWorkRequest request= generateWorkRequest("Bottom");
        request.setMessage("User Arrival/Request for AdSpace2");
        bottomAd= exchange.getBidsforAdSpaces(exchange, request);
        if(bottomAd != null){
         String imagePath= bottomAd.getAdImagePath();
         if (imagePath != null)
          {
           ImageIcon icon= new ImageIcon(imagePath);
           Image img = icon.getImage();
           Image newimg = img.getScaledInstance(500, 200,  java.awt.Image.SCALE_SMOOTH);  
           ImageIcon newIcon = new ImageIcon(newimg); 
           adImageLabel2.setIcon(newIcon);
          }
        }
        else bottomImageLabel1.setText("No Ads available for the Bottom space");
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton1 = new javax.swing.JButton();
        adImageJLabel1 = new javax.swing.JLabel();
        adImageLabel2 = new javax.swing.JLabel();
        topImageLabel1 = new javax.swing.JLabel();
        bottomImageLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
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
        add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 90, -1));

        adImageJLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adImageJLabel1.setPreferredSize(new java.awt.Dimension(300, 200));
        adImageJLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adImageJLabel1MouseClicked(evt);
            }
        });
        add(adImageJLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 470, 230));

        adImageLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adImageLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adImageLabel2MouseClicked(evt);
            }
        });
        add(adImageLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 480, 200));
        add(topImageLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 300, 30));
        add(bottomImageLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 290, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Amazon-logo.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 500, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void adImageJLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adImageJLabel1MouseClicked

        if(topAdv==null) return;            
        for(Market market: exchange.getMarketDirectory().getMarketList())
         for(Advertiser advertiser: market.getAdvertiserList())
          for(Advertisment adv: advertiser.getAdDirectory().getAdList())
           if(adv.getAdID()== topAdv.getAdID())
           {
             userAccount.getPersonProfile().setMarketType(market.getMarketType());
             int clicks = userAccount.getPersonProfile().getUserClicks();
             userAccount.getPersonProfile().setUserClicks(clicks+1);
           }
           DisplayAdImageJPanel displayAdJPanel= new DisplayAdImageJPanel(userProcessContainer, topAdv);
           userProcessContainer.add("DisplayAdJPanel", displayAdJPanel);
           ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
           
        // TODO add your handling code here:
    }//GEN-LAST:event_adImageJLabel1MouseClicked

    private void adImageLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adImageLabel2MouseClicked

        if(bottomAd==null) return;            
        for(Market market: exchange.getMarketDirectory().getMarketList())
         for(Advertiser advertiser: market.getAdvertiserList())
          for(Advertisment adv: advertiser.getAdDirectory().getAdList())
           if(adv.getAdID()== bottomAd.getAdID())
           {
             userAccount.getPersonProfile().setMarketType(market.getMarketType());
             int clicks = userAccount.getPersonProfile().getUserClicks();
             userAccount.getPersonProfile().setUserClicks(clicks+1);
           }
           DisplayAdImageJPanel displayAdJPanel= new DisplayAdImageJPanel(userProcessContainer, bottomAd);
           userProcessContainer.add("DisplayAdJPanel", displayAdJPanel);
           ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
           
        // TODO add your handling code here:
    }//GEN-LAST:event_adImageLabel2MouseClicked

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
    private javax.swing.JLabel adImageLabel2;
    private javax.swing.JButton backJButton1;
    private javax.swing.JLabel bottomImageLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel topImageLabel1;
    // End of variables declaration//GEN-END:variables


}
