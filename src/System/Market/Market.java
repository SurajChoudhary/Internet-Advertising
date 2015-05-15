/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Market;

import System.Enterprise.Advertiser;
import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
public class Market {
    
    private String marketType;
    private ArrayList<Advertiser> advertiserList;
    
    public static final String ELECTRONICS= "Electronics Market";
    public static final String CLOTHING= "Clothing Market";
    public static final String SPORTS= "Sports Market";
    public static final String HEALTHMARKET= "Health Market";
    
    public Market()
    {
        advertiserList= new ArrayList<>();
    }

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    public String getMarketType() {
        return marketType;
    }

    public ArrayList<Advertiser> getAdvertiserList() {
        return advertiserList;
    }
  
    @Override
    public String toString() {
        return marketType;
    }
}
