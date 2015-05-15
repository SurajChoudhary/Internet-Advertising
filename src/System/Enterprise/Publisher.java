/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Enterprise;

import System.Role.AdminRole;
import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
public class Publisher extends Enterprise {
    
    public Publisher(String name)
    {
        super(name);
    }

    @Override
    public ArrayList<Role> getOrganizationSupportedRole() {
        AdminRole role= new AdminRole();
        role.setRoleType(AdminRole.PUBLSHERADMIN);  
        ArrayList<Role> roles= new ArrayList<>();
        roles.add(role);
        return roles;
    }
    
}