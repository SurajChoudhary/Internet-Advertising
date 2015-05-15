/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;

import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory()
    {
        organizationList= new ArrayList<>();
    }
    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization createAndAddOrganization(String orgType)
    {
        Organization organization= null;
        if(orgType.equals(Organization.Type.AdvertiserMarketingOrganization.getValue()))
            organization = new AdvertiserMarketingOrganization();
        else  if(orgType.equals(Organization.Type.SalesOrganization.getValue()))
            organization = new SalesOrganization();
        else  if(orgType.equals(Organization.Type.FinanceOrganization.getValue()))
            organization = new FinanceOrganization();
        else  if(orgType.equals(Organization.Type.MarketOrganization.getValue()))
            organization = new MarketOrganization();
        else  if(orgType.equals(Organization.Type.AccountingOrgainzation.getValue()))
            organization = new AccountingOrganization();
        else  if(orgType.equals(Organization.Type.PublisherMarketingOrganization.getValue()))
            organization = new PublisherMarketingOrganization();
        organizationList.add(organization);
        return organization;
    }
    
//    public Boolean checkOrganizationbyType()
//    {
//       for(Organization organization: organizationList)
//         if(organization instanceof MarketingOrganization || organization instanceof SalesOrganization
//                || organization instanceof AccountingOrganization || organization instanceof FinanceOrganization
//                 || organization instanceof MarketOrganization)
//             return true;
//       return false;
//    }
    
    public OrganizationDirectory(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
}
