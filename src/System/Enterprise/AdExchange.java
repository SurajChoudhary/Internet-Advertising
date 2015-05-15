/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Enterprise;


import System.Market.MarketDirectory;
import System.Role.AdminRole;
import System.Role.Role;
import System.Advertisments.Advertisment;
import System.Invoice.Invoice;
import System.Market.Market;
import System.Order.Order;
import System.Payment.Payment;
import System.Person.Person;
import System.Person.PersonDirectory;
import System.Person.EndUserPersonProfile;
import System.WorkQueue.AdServingWorkRequest;
import System.WorkQueue.BidRequest;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author SURAJ
 */
public class AdExchange extends Enterprise {
    
    private ArrayList<Publisher> publisherList;
    private MarketDirectory marketDirectory;
    private PersonDirectory userPersonProfiles;
    
    public AdExchange(String name)
    {
        super(name);
        publisherList= new ArrayList<>();
        marketDirectory= new MarketDirectory();
        userPersonProfiles= new PersonDirectory();
    }
      @Override
    public ArrayList<Role> getOrganizationSupportedRole() {
       
        AdminRole role= new AdminRole();
        role.setRoleType(AdminRole.ADEXCHANGEADMIN);
        ArrayList<Role> roles= new ArrayList<>();
        roles.add(role);
        return roles;
    }
      
    public MarketDirectory getMarketDirectory() {
        return marketDirectory;
    }

    public ArrayList<Publisher> getPublisherList() {
        return publisherList;
    }

    public PersonDirectory getUserPersonProfiles() {
        return userPersonProfiles;
    }
    
    public Advertisment getBidsforAdSpaces(AdExchange exchange, AdServingWorkRequest request)
    {
        Advertisment ad=null;
        EndUserPersonProfile userPersonProfile = null;
        ArrayList<BidRequest> bidList= new ArrayList<>();
        for(Person person: userPersonProfiles.getPersonlist())
          if(person.getPersonID()==(request.getUserAccount().getPersonProfile().getPersonID()))
              userPersonProfile = (EndUserPersonProfile) person;
         if(userPersonProfile!=null){
          for(Market market : exchange.getMarketDirectory().getMarketList())
           if(market.getMarketType().equals(userPersonProfile.getMarketType()))
            for(Advertiser advertiser : market.getAdvertiserList())
             {
               BidRequest bidRequest= new BidRequest();
               bidRequest.setExchange(exchange);
               bidRequest.setMessage("Bidding Request for Ad Space");
               bidRequest.setStatus("Bid Request Sent");
               bidRequest.setAdPosition(request.getAdPosition());
               bidRequest.setPageHits(request.getPageRanking());
               bidRequest.setPersonProfile(userPersonProfile);
               exchange.getWorkQueue().getRequestList().add(bidRequest); 
               bidRequest.setSenderEnterprise(advertiser);
               advertiser.getWorkQueue().getRequestList().add(bidRequest);
               bidRequest = advertiser.bidResponseForAdSpace(advertiser, bidRequest);
               bidList.add(bidRequest);
             } 
           ad= filterRequest(bidList, exchange, request);
         }
      
      return ad;
    }
    
    private Advertisment filterRequest(ArrayList<BidRequest> bidList,AdExchange exchange, AdServingWorkRequest request)
    {
        Advertisment ad;
        BidRequest highestBidRequest= getBestBid(bidList, "firstBid");
        if(highestBidRequest!=null)
         {
          if(checkMoneyInAccounts(highestBidRequest, request, exchange))
           {
               ad= getAdvertisment(exchange, request, highestBidRequest);
               bidList.removeAll(bidList);
               return ad;
           }else{highestBidRequest.setStatus("Insufficient Account Balance");
                 highestBidRequest= getBestBid(bidList, "secondBid");
                 if(highestBidRequest!=null)
                   if(checkMoneyInAccounts(highestBidRequest, request, exchange))
                    {
                       ad= getAdvertisment(exchange, request, highestBidRequest);
                       bidList.removeAll(bidList);
                       return ad;
                    }
                 else{ highestBidRequest.setStatus("Insufficient Account Balance");
                       return null;
                   }
           }
         }
        return null;
    }
    
   private BidRequest getBestBid(ArrayList<BidRequest> bidList, String value)
    {
        BidRequest highestBidRequest = null;
        ArrayList<Double> bidRates= new ArrayList<>();
         for(BidRequest request1: bidList) 
           if(request1.getSolution()!=null)
             bidRates.add(request1.getSolution().getBidRate());
         Collections.sort(bidRates, Collections.reverseOrder());
         double rate;
         if(!bidRates.isEmpty()){
            switch (value) {
               case "firstBid":
                            rate =bidRates.get(0);
                            for(BidRequest request: bidList)
                             if(rate==request.getSolution().getBidRate())
                               highestBidRequest= request;
                            break;
               case "secondBid":
                            try{rate= bidRates.get(1);
                            for(BidRequest request: bidList)
                             if(rate==request.getSolution().getBidRate())
                               highestBidRequest= request;}
                            catch(Exception e){};
                            break;
            }
          }
        return highestBidRequest;
    }
    
    private Boolean checkMoneyInAccounts(BidRequest highestBidRequest,AdServingWorkRequest request,
                              AdExchange exchange)
    {   double moneyInAdvertiserAccount;
        try{ 
             moneyInAdvertiserAccount= ((highestBidRequest.getSenderEnterprise())).getFinancialAccount().getAccountBalance();
             exchange.getFinancialAccount().getAccountBalance();
             (request.getSenderEnterprise()).getFinancialAccount().getAccountBalance();
             if(moneyInAdvertiserAccount<=10)
                    return false;
        }catch(NumberFormatException ex){
               return false;
            }
        return true;
    }
    
    private Advertisment getAdvertisment(AdExchange exchange, AdServingWorkRequest request, BidRequest highestBidRequest)
    {     Advertisment ad;
            Advertiser biddingAdvertiser= (Advertiser) (highestBidRequest.getSenderEnterprise());
            Publisher pagePublisher= (Publisher) request.getSenderEnterprise();
            double finalBidAmount=highestBidRequest.getSolution().getBidRate();
            double moneyInAdvertiserAccount= biddingAdvertiser.getFinancialAccount().getAccountBalance();
            double moneyInExchangeAccount= exchange.getFinancialAccount().getAccountBalance();
            double moneyInPublisherAccount= pagePublisher.getFinancialAccount().getAccountBalance();
           
            request.setAdvertisment(highestBidRequest.getSolution().getAd());
            request.setStatus("Advertisment Sent");
            highestBidRequest.setStatus("Bid Approved");
            
            Order order1= generateOrder(biddingAdvertiser, pagePublisher, exchange, highestBidRequest, request);
            order1.setAmount(finalBidAmount);
            exchange.getMasterOrderCatalog().getOrderList().add(order1);
            biddingAdvertiser.getMasterOrderCatalog().addOrder(order1);
            
            Order order2= generateOrder(biddingAdvertiser, pagePublisher, exchange, highestBidRequest, request);
            order2.setAmount(finalBidAmount*.6);
            exchange.getMasterOrderCatalog().getOrderList().add(order2);
            pagePublisher.getMasterOrderCatalog().addOrder(order2);
            
            Invoice invoice1= new Invoice();
            invoice1.setOrder(order1);
            invoice1.setInvoiceStatus("Paid");
            exchange.getInvoiceHistory().getInvoiceList().add(invoice1);
            biddingAdvertiser.getInvoiceHistory().getInvoiceList().add(invoice1);    
            
            Invoice invoice2= new Invoice();
            invoice2.setOrder(order2);
            invoice2.setInvoiceStatus("Paid");
            exchange.getInvoiceHistory().getInvoiceList().add(invoice2);
            pagePublisher.getInvoiceHistory().getInvoiceList().add(invoice2);
            
            Payment payment1=generatePayment(biddingAdvertiser);
            payment1.setTansactionAmount(finalBidAmount);
            exchange.getPaymentHistory().getPaymentList().add(payment1);
            biddingAdvertiser.getPaymentHistory().getPaymentList().add(payment1);
            biddingAdvertiser.getFinancialAccount().setAccountBalance(moneyInAdvertiserAccount-finalBidAmount);
            exchange.getFinancialAccount().setAccountBalance(moneyInExchangeAccount+finalBidAmount);
            
            Payment payment2 = generatePayment(exchange);
            payment2.setTansactionAmount(finalBidAmount/2);
            exchange.getPaymentHistory().getPaymentList().add(payment2);
            pagePublisher.getPaymentHistory().getPaymentList().add(payment2);
            exchange.getFinancialAccount().setAccountBalance(exchange.getFinancialAccount().getAccountBalance()-(finalBidAmount*.6));
            pagePublisher.getFinancialAccount().setAccountBalance(moneyInPublisherAccount+(finalBidAmount*.6));
            
            invoice1.setPayment(payment1);
            invoice2.setPayment(payment2);
            ad= highestBidRequest.getSolution().getAd();
       return ad;     
     }
    
    private Order generateOrder(Advertiser biddingAdvertiser, Publisher pagePublisher,
                              AdExchange exchange, BidRequest highestBidRequest,AdServingWorkRequest request)
     {
          Order order= new Order();
          order.setAdvertiser(biddingAdvertiser.getName());
          order.setPublisher(pagePublisher.getName());
          order.setExchange(exchange.getName());
          order.setSolutionProvided(highestBidRequest.getSolution());
          order.setUser(request.getUserAccount());
          return order;
      }
    
    private Payment generatePayment(Enterprise enterprise)
    {
          Payment payment = new Payment();
          payment.setAccountNumber(enterprise.getFinancialAccount().getAccountNumber());
          payment.setAccountType(enterprise.getFinancialAccount().getAccountType());
          return payment;
    }
}
