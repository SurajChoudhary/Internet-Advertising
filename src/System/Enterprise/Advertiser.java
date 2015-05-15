/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Enterprise;

import System.AdSolution.Solution;
import System.AdSolution.SolutionCatalog;
import System.Advertisments.AdDirectory;
import System.Person.EndUserPersonProfile;
import System.Role.AdminRole;
import System.Role.Role;
import System.WorkQueue.BidRequest;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author SURAJ
 */
public class Advertiser extends Enterprise {
   
    private AdDirectory adDirectory;
    private SolutionCatalog solutionCatalog;
    
    public Advertiser(String name)
    {
        super(name); 
        adDirectory= new AdDirectory();
        solutionCatalog= new SolutionCatalog();
    }

    @Override
    public ArrayList<Role> getOrganizationSupportedRole() {
        AdminRole role= new AdminRole();
        role.setRoleType(AdminRole.ADVERTISERADMIN);
        ArrayList<Role> roles= new ArrayList<>();
        roles.add(role);
        return roles;
    }   

    public AdDirectory getAdDirectory() {
        return adDirectory;
    }

    public SolutionCatalog getSolutionCatalog() {
        return solutionCatalog;
    }
    
    public BidRequest bidResponseForAdSpace(Advertiser advertiser, BidRequest request)
    {
        Solution finalSolution=null;
        ArrayList<Solution> pageRankingSortedSolutions= new ArrayList<>();
        ArrayList<Solution> adPositionSortedSolutions= new ArrayList<>();
        ArrayList<Solution> userClickSortedSolutions= new ArrayList<>();
        ArrayList<Solution> genderSortedSolutionList= new ArrayList<>();
        ArrayList<Solution> userAgeSortedSolutions= new ArrayList<>();
        ArrayList<Double> bidRateList= new ArrayList<>();
        EndUserPersonProfile profile= request.getPersonProfile();
        
        for(Solution solution: advertiser.getSolutionCatalog().getSolutionList())
          if(request.getPageHits()<=solution.getMaxPageHit() && request.getPageHits()>=solution.getMinpageHit())
              pageRankingSortedSolutions.add(solution);
        
        for(Solution solution: pageRankingSortedSolutions)
         if(request.getAdPosition().equalsIgnoreCase(solution.getAdPositon()))
              adPositionSortedSolutions.add(solution);
       
        for(Solution solution: adPositionSortedSolutions)
         if(profile.getUserClicks()<=solution.getMaxUserClicks() && profile.getUserClicks()>= solution.getMinUserClicks())
              userClickSortedSolutions.add(solution);
        
        for(Solution solution: userClickSortedSolutions)
         if(solution.getGender().equalsIgnoreCase(profile.getGender()))
              genderSortedSolutionList.add(solution);
         else if(solution.getGender().equals("All"))
              genderSortedSolutionList.add(solution);
        
        for(Solution solution: genderSortedSolutionList)
         if(profile.getAge()<=solution.getMaxAge()&& profile.getAge()>= solution.getMinAge())
              userAgeSortedSolutions.add(solution);
                  
        for(Solution solution: userAgeSortedSolutions)
            if(solution!=null)
              bidRateList.add(solution.getBidRate());
        Collections.sort(bidRateList);
        if(!bidRateList.isEmpty()){
          double bidRate= bidRateList.get(0);
          for(Solution solution: userAgeSortedSolutions)
           if(solution.getBidRate()==bidRate)
                 finalSolution= solution;
             
        request.setSolution(finalSolution);
        request.setStatus("Bid Sent");
        }
        return request;
    }
}