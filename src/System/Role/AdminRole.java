/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import Interface.AdExchangeEnterprise.AdExchangeAdminWorkAreaJPanel;
import Interface.AdvertiserEnterprise.AdvertiserAdminWorkAreaJPanel;
import Interface.PublisherEnterprise.PublisherAdminWorkAreaJPanel;
import Interface.EcoSystemAdmin.EcoSystemAdminWorkAreaJPanel;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import System.Enterprise.Enterprise;
import javax.swing.JPanel;
import System.EcoSystem;
import System.Enterprise.AdExchange;
import System.Enterprise.Publisher;
import System.Network.Network;
import System.UserAccount.EmployeeUserAccount;

/**
 *
 * @author SURAJ
 */
public class AdminRole extends Role{

    public static final String SYSTEMADMIN= "System Admin";
    public static final String ADEXCHANGEADMIN= "AdExchange Admin";
    public static final String PUBLSHERADMIN= "Publisher Admin";
    public static final String ADVERTISERADMIN= "Advertiser Admin";
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,EcoSystem system, Network network, Enterprise enterprise,
                                Organization organization, UserAccount userAccount) {
       
        switch (userAccount.getRole().getRoleType()) {
            case SYSTEMADMIN:
                return new EcoSystemAdminWorkAreaJPanel(userProcessContainer, system, (EmployeeUserAccount) userAccount);
            case PUBLSHERADMIN:
                return new PublisherAdminWorkAreaJPanel(userProcessContainer,system, (Publisher) enterprise, network, (EmployeeUserAccount)userAccount);
            case ADEXCHANGEADMIN:
                return new AdExchangeAdminWorkAreaJPanel(userProcessContainer, system, network, (AdExchange) enterprise, (EmployeeUserAccount)userAccount);
            case ADVERTISERADMIN:
                return new AdvertiserAdminWorkAreaJPanel(userProcessContainer, system, network, enterprise,  (EmployeeUserAccount)userAccount);
        }
      return null;
    }
}
