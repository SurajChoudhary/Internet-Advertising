
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Person;
/**
 *
 * @author SURAJ
 */
public class Person {
    
     private int personID;
     private String firstName;
     private String lastName;
     private int day;
     private String month;
     private int year;
     private int age;
     private AddressInfo address;
     private String gender;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    } 

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public AddressInfo getAddress() {
        return address;
    }

    public void setAddress(AddressInfo address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return firstName+ " "+lastName;
    }    
}
