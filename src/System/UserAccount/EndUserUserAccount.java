/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.UserAccount;

import System.Person.EndUserPersonProfile;

/**
 *
 * @author SURAJ
 */
public class EndUserUserAccount extends UserAccount{
   
    private EndUserPersonProfile personProfile;

    public EndUserPersonProfile getPersonProfile() {
        return personProfile;
    }

    public void setPersonProfile(EndUserPersonProfile personProfile) {
        this.personProfile = personProfile;
    }

    @Override
    public String toString() {
        return personProfile.getFirstName()+" "+personProfile.getLastName();
    }
}
