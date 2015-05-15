/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Market;

import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
public class MarketDirectory {
    
    private ArrayList<Market> marketList;
    
    public MarketDirectory()
    {
        marketList= new ArrayList<>();
    }

    public ArrayList<Market> getMarketList() {
        return marketList;
    }
    
    public Boolean checkMarketbyType(String type)
    {
         for(Market market: marketList)
             if(market.getMarketType().equalsIgnoreCase(type))
                 return true;
         return false;
    }
    
    public Market createAndAddMarket()
    {
        Market market= new Market();
        marketList.add(market);
        return market;
    }
}
