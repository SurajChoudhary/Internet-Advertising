/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.UserAccount;

import System.Employee.Employee;

/**
 *
 * @author SURAJ
 */
public class EmployeeUserAccount extends UserAccount{
    
    private Employee employee;
       
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    @Override
    public String toString() {
        return employee.getPerson().getFirstName()+" "+employee.getPerson().getLastName();
    }
}
