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
public class FinanceOrganization extends Organization{
    
     public FinanceOrganization()
    {
        super(Organization.Type.FinanceOrganization.getValue());
        
    }
    @Override
    public ArrayList<Role> getOrganizationSupportedRole() {
    
        EmployeeRole role= new EmployeeRole();
        role.setRoleType(EmployeeRole.FINANCEEMPLOYEE);
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(role);
        return roles;   
    }
    
}
