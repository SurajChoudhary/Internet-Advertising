/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;

import System.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
public class UserOrganization extends Organization{
    
    public UserOrganization()
    {
        super(Type.UserOrganization.getValue());
    }
    @Override
    public ArrayList<Role> getOrganizationSupportedRole() {
        return null;
    }    
}
