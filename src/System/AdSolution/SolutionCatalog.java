/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.AdSolution;

import System.Advertisments.Advertisment;
import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
public class SolutionCatalog {
    
    private ArrayList<Solution> solutionList;
    
    public SolutionCatalog()
    {
        solutionList= new ArrayList<>();
    }
    
    public Solution createAndAddSolution()
    {
        Solution s= new Solution();
        solutionList.add(s);
        return s;
    }

    public ArrayList<Solution> getSolutionList() {
        return solutionList;
    }
    
    public Boolean checkForSolution(Advertisment ad, String position, int maxAge,int minAge, double bidRate,
                        String gender, int maxPageHit, int minPageHit, int maxUserClicks, int minUserClicks)
    {
       for(Solution solution: solutionList)
        if(solution.getAd().getAdID()==ad.getAdID()&& solution.getAdPositon().equals(position)
           &&solution.getMaxAge()==maxAge&&solution.getMinAge()==minAge&&solution.getBidRate()==bidRate
           && solution.getGender().equals(gender)&&solution.getMaxPageHit()==maxPageHit&&solution.getMinpageHit()==minPageHit
           && solution.getMaxUserClicks()==maxUserClicks&&solution.getMinUserClicks()==minUserClicks) 
                return true;
       return false;
    }
    
    
    
}

