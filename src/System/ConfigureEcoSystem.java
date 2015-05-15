/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import System.Employee.Employee;
import System.Person.Person;
import System.Role.AdminRole;
import System.UserAccount.EmployeeUserAccount;

/**
 *
 * @author SURAJ
 */
public class ConfigureEcoSystem {
    
    public static EcoSystem configure()
    {
        EcoSystem system= EcoSystem.getInstance();
        
        Person person = new Person();
        person.setFirstName("System");
        person.setLastName("Administrator");
        person.setPersonID(000000);
        system.getPersonDirectory().getPersonlist().add(person);
        Employee employee= system.getEmployeeDirectory().createAndAddEmployee();
        employee.setEmpID(00);
        employee.setPerson(person);
        EmployeeUserAccount userAccount = new EmployeeUserAccount();
        userAccount.setUsername("admin");
        byte[] salt = system.getUserAccountDirectory().generateSalt();
        userAccount.setSalt(salt);
        String hashedPassword= system.getUserAccountDirectory().generateHashPassword("admin", salt);
        userAccount.setPassword(hashedPassword);
        userAccount.setEmployee(employee);
        AdminRole role= new AdminRole();
        role.setRoleType(AdminRole.SYSTEMADMIN);
        userAccount.setRole(role);
        system.getUserAccountDirectory().getUserAccountList().add(userAccount);
        
        return system;
    }
}
