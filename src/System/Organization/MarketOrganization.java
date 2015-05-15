/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;

import System.Role.EmployeeRole;
import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
public class MarketOrganization extends Organization {
    
    public MarketOrganization()
    {
        super(Type.MarketOrganization.getValue());
        
    }
    @Override
    public ArrayList<Role> getOrganizationSupportedRole() {
    
        EmployeeRole role= new EmployeeRole();
        role.setRoleType(EmployeeRole.MARKETEMPLOYEE);
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(role);
        return roles;   
    }
}
