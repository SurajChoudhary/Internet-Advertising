/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Advertisments;

/**
 *
 * @author SURAJ
 */
public class Advertisment {
    
   private String  adImagePath;
   private int adID;
   private String productType;
   private static int count= 124;

    public Advertisment(){
        adID=count++;
    }

    public String getAdImagePath() {
        return adImagePath;
    }

    public void setAdImagePath(String adImagePath) {
        this.adImagePath = adImagePath;
    }
    
    public int getAdID() {
        return adID;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return String.valueOf(adID);
    }
   
}
