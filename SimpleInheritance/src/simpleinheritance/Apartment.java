/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleinheritance;

/**
 *
 * @author CCannon
 */
public class Apartment {
    private String aptNum;
    private boolean laundry;

    /**
     * @return the aptNum
     */
    public String getAptNum() {
        return aptNum;
    }

    /**
     * @param aptNum the aptNum to set
     */
    public void setAptNum(String aptNum) {
        this.aptNum = aptNum;
    }

    /**
     * @return the laundry
     */
    public boolean isLaundry() {
        return laundry;
    }

    /**
     * @param laundry the laundry to set
     */
    public void setLaundry(boolean laundry) {
        this.laundry = laundry;
    }
}
