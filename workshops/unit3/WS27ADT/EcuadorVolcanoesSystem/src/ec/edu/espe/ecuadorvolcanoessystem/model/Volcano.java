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
    private String region;
    private float atitude;
    private boolean isActive;
    private String typeOfVolcano;

    public Volcano(String name, String region, float atitude, boolean isActive, String typeOfVolcano) {
        this.name = name;
        this.region = region;
        this.atitude = atitude;
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
    public String getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return the atitude
     */
    public float getAtitude() {
        return atitude;
    }

    /**
     * @param atitude the atitude to set
     */
    public void setAtitude(float atitude) {
        this.atitude = atitude;
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
