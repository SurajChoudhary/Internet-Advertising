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
public class AccountingOrganization extends Organization{
    
    public AccountingOrganization()
    {
        super(Type.AccountingOrgainzation.getValue());
        
    }
    @Override
    public ArrayList<Role> getOrganizationSupportedRole() {
    
        EmployeeRole role= new EmployeeRole();
        role.setRoleType(EmployeeRole.ACCOUNTEMPLOYEE);
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(role);
        return roles;   
    }
}
