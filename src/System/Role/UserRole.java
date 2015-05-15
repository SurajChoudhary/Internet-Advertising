/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import Interface.User.UserWorkAreaJPanel;
import System.EcoSystem;
import System.Enterprise.Enterprise;
import System.Network.Network;
import System.Organization.Organization;
import System.UserAccount.EndUserUserAccount;
import System.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author SURAJ
 */
public class UserRole extends Role {

    public static final String USER= "User";

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,EcoSystem system, Network network, Enterprise enterprise,
                                Organization organization, UserAccount userAccount) {
        return new UserWorkAreaJPanel(userProcessContainer, network, (EndUserUserAccount) userAccount);
    }
    
}
