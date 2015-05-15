/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Network;

import System.Enterprise.AdExchange;
import System.Enterprise.Enterprise;
import System.Organization.UserOrganization;
import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
public class Network{
    
    private String name;
    private String locationName;
    private ArrayList<Enterprise> enterpriseList;
    private UserOrganization userOrganization;
   
    public Network()
    {
        enterpriseList= new ArrayList<>();
        userOrganization = new UserOrganization();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Boolean checkEnterpriseNameAndLocation(String name, String location)
    {
        for(Enterprise e: enterpriseList)
            if(e.getName().equals(name) && e.getLocation().equals(location))
                return true;
        return false;
    }
    
//    public ArrayList<Publisher> publisherList()
//    {
//        ArrayList<Publisher> local = new ArrayList<>();
//        for(Enterprise enterprise: enterpriseList)
//        if(enterprise instanceof Publisher)
//            local.add((Publisher)enterprise);
//        return local;
//    }
    
    public ArrayList<AdExchange> adExchangeList()
    {
        ArrayList<AdExchange> local = new ArrayList<>();
        for(Enterprise enterprise: enterpriseList)
        if(enterprise instanceof AdExchange)
            local.add((AdExchange)enterprise);
        return local;
    }

    public UserOrganization getUserOrganization() {
        return userOrganization;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
