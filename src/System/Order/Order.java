/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Order;

import System.AdSolution.Solution;
import System.UserAccount.EndUserUserAccount;

/**
 *
 * @author SURAJ
 */
public class Order {
  
    private static int count=100;
    private int id;
    private Solution solutionProvided;
    private EndUserUserAccount user;
    private String advertiser;
    private String publisher;
    private String exchange;
    private double amount;
  
    public Order()
    {
        count++;
        id=count;
    }
  
    public int getId() {
        return id;
    }

    public Solution getSolutionProvided() {
        return solutionProvided;
    }

    public void setSolutionProvided(Solution solutionProvided) {
        this.solutionProvided = solutionProvided;
    }

    public String getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(String advertiser) {
        this.advertiser = advertiser;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }
    
     @Override
    public String toString() {
        return String.valueOf(id);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public EndUserUserAccount getUser() {
        return user;
    }

    public void setUser(EndUserUserAccount user) {
        this.user = user;
    }
}
