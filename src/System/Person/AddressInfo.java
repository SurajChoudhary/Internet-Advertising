/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Person;

/**
 *
 * @author SURAJ
 */
public class AddressInfo {
    
     private String streetAddress1;
     private String streetAddress2;
     private String city;
     private String state;
     private String country;
     private int zipCode;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
      /**
     * @return the streetAddress1
     */
    public String getStreetAddress1() {
        return streetAddress1;
    }

    /**
     * @param streetAddress1 the streetAddress1 to set
     */
    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    /**
     * @return the streetAddress2
     */
    public String getStreetAddress2() {
        return streetAddress2;
    }

    /**
     * @param streetAddress2 the streetAddress2 to set
     */
    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    
}
