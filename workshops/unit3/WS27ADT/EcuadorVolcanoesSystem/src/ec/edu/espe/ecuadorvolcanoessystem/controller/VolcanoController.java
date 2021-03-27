/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ecuadorvolcanoessystem.controller;

import ec.edu.espe.ecuadorvolcanoessystem.model.Volcano;
import utils.FileManager;

/**
 *
 * @author Luje Catherine
 */
public class VolcanoController {

    public void save(Volcano volcano){
       String data = volcano.getName() + ", " + volcano.getRegion() + ", " + volcano.getAtitude() + ", " + volcano.isIsActive() + ", " + volcano.getTypeOfVolcano();
       FileManager.save(data, "Volcanoes");
      
    }
}
