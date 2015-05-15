/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.WorkQueue;

import System.AdSolution.Solution;
import System.Person.EndUserPersonProfile;

/**
 *
 * @author SURAJ
 */
public class BidRequest extends WorkRequest{
    
    private EndUserPersonProfile personProfile;
    private String adPosition;
    private Solution solution;
    private int pageHits;

    public int getPageHits() {
        return pageHits;
    }

    public void setPageHits(int pageHits) {
        this.pageHits = pageHits;
    }

    public EndUserPersonProfile getPersonProfile() {
        return personProfile;
    }

    public void setPersonProfile(EndUserPersonProfile personProfile) {
        this.personProfile = personProfile;
    }

    public String getAdPosition() {
        return adPosition;
    }

    public void setAdPosition(String adPosition) {
        this.adPosition = adPosition;
    }

    public Solution getSolution() {
        return solution;
    }

    public void setSolution(Solution solution) {
        this.solution = solution;
    }
    
}
