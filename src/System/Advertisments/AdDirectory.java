/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Advertisments;

import java.util.ArrayList;

/**
 *
 * @author SURAJ
 */
public class AdDirectory {
    
    private ArrayList<Advertisment> adList;
    
    public AdDirectory()
    {
        adList= new ArrayList<>();
    }

    public ArrayList<Advertisment> getAdList() {
        return adList;
    }
    
    public Advertisment createAndAddAdvertisment()
    {
        Advertisment ad= new Advertisment();
        adList.add(ad);
        return ad;
    }
}
