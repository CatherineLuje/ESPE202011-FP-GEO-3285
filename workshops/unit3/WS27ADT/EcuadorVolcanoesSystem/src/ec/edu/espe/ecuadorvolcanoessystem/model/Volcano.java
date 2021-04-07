/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ecuadorvolcanoessystem.model;

/**
 *
 * @author Luje Catherine
 */
public class Volcano {
    private String name;
    private boolean region;
    private float altitude;
    private boolean isActive;
    private String typeOfVolcano;

    public Volcano(String name,boolean region, float atitude, boolean isActive, String typeOfVolcano) {
        this.name = name;
        this.region = region;
        this.altitude = atitude;
        this.isActive = isActive;
        this.typeOfVolcano = typeOfVolcano;
    
    }
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the region
     */
    public boolean getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(boolean region) {
        this.region = region;
    }

    /**
     * @return the altitude
     */
    public float getAltitude() {
        return altitude;
    }

    /**
     * @param altitude the altitude to set
     */
    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    /**
     * @return the isActive
     */
    public boolean isIsActive() {
        return isActive;
    }

    /**
     * @param isActive the isActive to set
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * @return the typeOfVolcano
     */
    public String getTypeOfVolcano() {
        return typeOfVolcano;
    }

    /**
     * @param typeOfVolcano the typeOfVolcano to set
     */
    public void setTypeOfVolcano(String typeOfVolcano) {
        this.typeOfVolcano = typeOfVolcano;
    }
    
    
            
    
}
