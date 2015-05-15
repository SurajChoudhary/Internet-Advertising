/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Person;

/**
 *
 * @author SURAJ
 */
public class EndUserPersonProfile extends Person{
    
    private int userClicks= 100;
    private String marketType;

    public String getMarketType() {
        return marketType;
    }

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    public int getUserClicks() {
        return userClicks;
    }

    public void setUserClicks(int userClicks) {
        this.userClicks = userClicks;
    }
    
}
