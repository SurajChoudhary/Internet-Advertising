/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Employee;

import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
public class EmployeeDirectory {
   
    private ArrayList<Employee> employeeList;
    
    public EmployeeDirectory()
    {
        employeeList= new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createAndAddEmployee()
    {
        Employee e= new Employee();
        employeeList.add(e);
        return e;
    }
    
    public Boolean checkOrganizationEmployeeIDs(int iD)
    {
        for(Employee e: employeeList)
            if(e.getEmpID()==(iD))
                return true;
        return false;
    }
}
