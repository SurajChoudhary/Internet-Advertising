/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Organization;

import System.Employee.EmployeeDirectory;
import System.Person.PersonDirectory;
import System.Role.Role;
import System.UserAccount.UserAccountDirectory;
import System.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
public abstract class Organization {

    public String name;
    protected EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    private PersonDirectory personDirectory;
    
    
    public Organization(String name)
    {
        this.name=name;
        personDirectory= new PersonDirectory();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        workQueue = new WorkQueue();
    }

    public enum Type {
        AdvertiserMarketingOrganization("AdMarketing Organization"),
        PublisherMarketingOrganization("Marketing Organization"),
        FinanceOrganization("Finance Organization"),
        SalesOrganization("Sales Organization"),
        UserOrganization("User Organization"),
        MarketOrganization("Market Organization"),
        AccountingOrgainzation("Accounting Organization");
        private String value;
        private Type(String value) {
               this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    public abstract ArrayList<Role> getOrganizationSupportedRole();
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }
    
    @Override
    public String toString() {
        return name;
    }
}