/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.satellite.model;

import utils.FileManager;

/**
 *
 * @author Luje Catherine
 */
public class Satellite {
     public Satellite(String name, String creatioDate, float weight,String typeOfStellite, String orbitType) {
        this.name = name;
        this.creationDate = creatioDate;
        this.weight = weight;
        this.typeofStellite = typeOfStellite;
        this.orbitType = orbitType;
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
     * @return the creationDate
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate the creationDate to set
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the typeofStellite
     */
    public String getTypeofStellite() {
        return typeofStellite;
    }

    /**
     * @param typeofStellite the typeofStellite to set
     */
    public void setTypeofStellite(String typeofStellite) {
        this.typeofStellite = typeofStellite;
    }

    /**
     * @return the orbitType
     */
    public String getOrbitType() {
        return orbitType;
    }

    /**
     * @param orbitType the orbitType to set
     */
    public void setOrbitType(String orbitType) {
        this.orbitType = orbitType;
    }

    private String name;
    private String creationDate;
    private float weight;
    private String typeofStellite;
    private String orbitType;
}
            
       
