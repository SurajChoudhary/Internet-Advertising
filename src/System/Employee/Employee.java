/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Employee;

import System.Person.Person;

/**
 *
 * @author SURAJ
 */
public class Employee {
    
    private int empID;
    private Person person;;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    @Override
    public String toString() {
        return person.getFirstName()+" "+person.getLastName();
    }
    
}
