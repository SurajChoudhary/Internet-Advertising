/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.UserAccount;

import System.Role.Role;
/**
 *
 * @author SURAJ
 */
public class UserAccount {
    
    private String username;
    private String password;
    private byte[] salt;
    private Role role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public byte[] getSalt() {
        return salt;
    }

    public void setSalt(byte[] salt) {
        this.salt = salt;
    }
}
