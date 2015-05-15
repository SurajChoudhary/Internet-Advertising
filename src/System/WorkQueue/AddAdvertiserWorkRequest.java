/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.WorkQueue;

/**
 *
 * @author SURAJ
 */
public class AddAdvertiserWorkRequest extends WorkRequest{
    
    private String marketType;

    public String getMarketType() {
        return marketType;
    }

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }
    
    
}
