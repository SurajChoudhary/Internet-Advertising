/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import Interface.AdExchangeEnterprise.MarketOrganization.MarketPlaceManagerWorkAreaJPanel;
import Interface.Organizations.FInanceOrganization.FinanceEmployeeWorkAreaJPanel;
import Interface.AdvertiserEnterprise.MarketingOrganization.AdvertiserMarketingEmployeeWorkAreaJPanel;
import Interface.AdvertiserEnterprise.SalesOrganization.SalesEmployeeWorkAreaJPanel;
import Interface.AdExchangeEnterprise.AccountOrganization.AccountantWorkAreaJPanel;
import Interface.PublisherEnterprise.MarketingOrganization.PublisherMarketingEmployeeWorkAreaJPanel;
import System.EcoSystem;
import System.Enterprise.Enterprise;
import System.Network.Network;
import System.Organization.Organization;
import System.UserAccount.EmployeeUserAccount;
import System.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author SURAJ
 */
public class EmployeeRole extends Role{

    public static final String ADVERTISERMARKETINGEMPLOYEE= "AdMarketing Employee";
    public static final String PUBLISHERMARKETINGEMPLOYEE= "Marketing Employee";
    public static final String SALESEMPLOYEE= "Sales Employee";
    public static final String FINANCEEMPLOYEE= "Finance Employee";
    public static final String MARKETEMPLOYEE= "Market Manager";
    public static final String ACCOUNTEMPLOYEE= "Accountant";
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,EcoSystem system, Network network, Enterprise enterprise,
                                Organization organization, UserAccount userAccount) {
        
        switch (userAccount.getRole().getRoleType()) {
            case ADVERTISERMARKETINGEMPLOYEE:
                return new AdvertiserMarketingEmployeeWorkAreaJPanel(userProcessContainer, enterprise, organization, (EmployeeUserAccount) userAccount);
            case SALESEMPLOYEE:
                return new SalesEmployeeWorkAreaJPanel(userProcessContainer, enterprise, organization, (EmployeeUserAccount) userAccount);
            case FINANCEEMPLOYEE:
                return new FinanceEmployeeWorkAreaJPanel(userProcessContainer, enterprise, organization, (EmployeeUserAccount) userAccount);
            case MARKETEMPLOYEE:
                return new MarketPlaceManagerWorkAreaJPanel(userProcessContainer, network, enterprise, organization, (EmployeeUserAccount) userAccount);
            case ACCOUNTEMPLOYEE:
                return new AccountantWorkAreaJPanel(userProcessContainer, enterprise, organization, (EmployeeUserAccount) userAccount);
            case PUBLISHERMARKETINGEMPLOYEE:
                return new PublisherMarketingEmployeeWorkAreaJPanel(userProcessContainer, enterprise, organization, (EmployeeUserAccount) userAccount);
        }
      return null;
    }
}
