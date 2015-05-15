/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import System.Organization.Organization;
import System.Role.Role;
import System.UserAccount.UserAccount;
import System.Enterprise.Enterprise;
import System.Network.Network;
import System.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem system;
    private ArrayList<Network> networkList;
    
    public EcoSystem()
    {
        super("System");
        networkList= new ArrayList<>();
    }

   public static EcoSystem getInstance()
    {
       if(system==null)
       system= new EcoSystem();
       return system;
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork()
    {
        Network n= new Network();
        networkList.add(n);
        return n;
    }
    
    public void removeNetwork(Network n)
    {
        networkList.remove(n);
    }
    
    @Override
    public ArrayList<Role> getOrganizationSupportedRole() {
        return null;
    }
    
    public Boolean checkLocation(String location)
    {
        for(Network n: networkList)
          if(n.getLocationName().equalsIgnoreCase(location))
              return true;
        return false;
    }
    
    public Boolean checkPersonID(int personID, EcoSystem system)
    {
        for(Person p: system.getPersonDirectory().getPersonlist()){
           if(p.getPersonID()==(personID))
               return true; 
        }
        for(Network n: networkList){
          for(Enterprise e:n.getEnterpriseList()){
           for(Person p: e.getPersonDirectory().getPersonlist()){
            if(p.getPersonID()==(personID)) return true;
             else{ 
                 for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                  for(Person p1: o.getPersonDirectory().getPersonlist()){
                   if(p1.getPersonID()==(personID))
                 return true;
          }}}}}
        if(n.getUserOrganization()!=null)
        for(Person userPersonProfile: n.getUserOrganization().getPersonDirectory().getPersonlist())
               if(userPersonProfile.getPersonID()==(personID)) return true;
         }
     return false;
    }   
    
    public Boolean checkUsername(String username, EcoSystem system)
    {
        for(UserAccount ua: system.getUserAccountDirectory().getUserAccountList()){
           if(ua.getUsername().equalsIgnoreCase(username))
               return true; 
        }
        for(Network n: networkList){
          for(Enterprise e:n.getEnterpriseList()){
           for(UserAccount ua: e.getUserAccountDirectory().getUserAccountList()){
             if(ua.getUsername().equalsIgnoreCase(username)) return true;
             else{ 
                 for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                 for(UserAccount ua1: o.getUserAccountDirectory().getUserAccountList()){
                 if(ua1.getUsername().equalsIgnoreCase(username))
                 return true;
          }}}}}
          if(n.getUserOrganization()!=null)
          for(UserAccount cutomerUserAccount: n.getUserOrganization().getUserAccountDirectory().getUserAccountList())
               if(cutomerUserAccount.getUsername().equalsIgnoreCase(username)) return true;
           }
     return false;
    }   
}
