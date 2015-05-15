/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.WorkQueue;

import System.Advertisments.Advertisment;
import System.UserAccount.EndUserUserAccount;

/**
 *
 * @author SURAJ
 */
public class AdServingWorkRequest extends WorkRequest{
 
    private String adPosition;
    private int pageRanking;
    private EndUserUserAccount userAccount;
    private Advertisment advertisment;

    public int getPageRanking() {
        return pageRanking;
    }

    public void setPageRanking(int pageRanking) {
        this.pageRanking = pageRanking;
    }
    
    public String getAdPosition() {
        return adPosition;
    }

    public void setAdPosition(String adPosition) {
        this.adPosition = adPosition;
    }

    public EndUserUserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(EndUserUserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public Advertisment getAdvertisment() {
        return advertisment;
    }

    public void setAdvertisment(Advertisment advertisment) {
        this.advertisment = advertisment;
    }
    
}
