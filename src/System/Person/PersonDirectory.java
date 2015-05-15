/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Person;
import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
public class PersonDirectory {
    
    private ArrayList<Person> personlist;
    
    public PersonDirectory()
    {
        personlist = new ArrayList<>();
    }

    public ArrayList<Person> getPersonlist() {
        return personlist;
    }

    public void deletePersonbyPersonID(int personID)
   {
     Person person1=null; 
     for(Person person: personlist)
     if(person.getPersonID()==(personID)) person1= person;
     if(person1 !=null) personlist.remove(person1);
   }
}