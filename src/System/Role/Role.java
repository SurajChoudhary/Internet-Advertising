/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Role;

import System.Enterprise.Enterprise;
import System.Organization.Organization;
import System.UserAccount.UserAccount;
import javax.swing.JPanel;
import System.EcoSystem;
import System.Network.Network;
/**
 *
 * @author SURAJ
 */
public abstract class Role {

    String roleType;
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
                                         EcoSystem system, Network network, Enterprise enterprise, 
                                         Organization organization,UserAccount userAccount);

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }
    
    @Override
    public String toString() {
        return roleType;
    }
}
