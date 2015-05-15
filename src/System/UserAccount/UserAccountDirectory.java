/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.UserAccount;

import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
public class UserAccountDirectory {
  
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory()
    {
        userAccountList= new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String un, String pass)
    {
        for(UserAccount ua: userAccountList)
        {  String hashedPassword= generateHashPassword(pass, ua.getSalt());
           if(ua.getUsername().equals(un)&& ua.getPassword().equals(hashedPassword))
               return ua;
        }
      return null;
    }
    
    
    public String generateHashPassword(String password, byte[] salt)
    {
        HashUtil hash = new HashUtil();
        byte[] hashedPasswordBytes = hash.getHashWithSalt(password, HashUtil.HashingTechqniue.SSHA256, salt);
        String hashedPassword = hash.bytetoBase64String(hashedPasswordBytes);
        return hashedPassword;
    }
    
    public byte[] generateSalt()
    {
        HashUtil hash = new HashUtil();
        byte[] salt = hash.generateSalt();
        return salt;
    }
}
