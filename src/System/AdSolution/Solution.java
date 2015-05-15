/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package System.AdSolution;

import System.Advertisments.Advertisment;

/**
 *
 * @author SURAJ
 */
public class Solution {
  
    private static int count= 1140;
    private int solutionID;
    private Advertisment ad;
    private double bidRate;
    private int maxAge;
    private int minAge;
    private String gender;
    private int minpageHit;
    private int maxPageHit;
    private int minUserClicks;
    private int maxUserClicks;
    private String adPositon;
    
    public Solution(){
        solutionID=count++;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMinpageHit() {
        return minpageHit;
    }

    public void setMinpageHit(int minpageHit) {
        this.minpageHit = minpageHit;
    }

    public int getMaxPageHit() {
        return maxPageHit;
    }

    public void setMaxPageHit(int maxPageHit) {
        this.maxPageHit = maxPageHit;
    }

    public int getMinUserClicks() {
        return minUserClicks;
    }

    public void setMinUserClicks(int minUserClicks) {
        this.minUserClicks = minUserClicks;
    }

    public int getMaxUserClicks() {
        return maxUserClicks;
    }

    public void setMaxUserClicks(int maxUserClicks) {
        this.maxUserClicks = maxUserClicks;
    }
    
    public int getSolutionID() {
        return solutionID;
    }

    public Advertisment getAd() {
        return ad;
    }

    public void setAd(Advertisment ad) {
        this.ad = ad;
    }

    public double getBidRate() {
        return bidRate;
    }

    public void setBidRate(double bidRate) {
        this.bidRate = bidRate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdPositon() {
        return adPositon;
    }

    public void setAdPositon(String adPositon) {
        this.adPositon = adPositon;
    }

    @Override
    public String toString() {
        return String.valueOf(solutionID);
    }
   
}
