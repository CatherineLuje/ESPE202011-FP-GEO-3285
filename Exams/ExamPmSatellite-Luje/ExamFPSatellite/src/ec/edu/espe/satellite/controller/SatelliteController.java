/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.satellite.controller;

import ec.edu.espe.satellite.model.Satellite;
import utils.FileManager;
import javax.swing.JTable;
import javax.swing.JOptionPane;

/**
 *
 * @author Luje Catherine
 */
public class SatelliteController {

public void save(Satellite satellite){
      String data = satellite.getName() + "," + satellite.getCreationDate() + "," + satellite.getWeight() + "," + satellite.getTypeofStellite() + "," + satellite.getOrbitType();
        FileManager.save(data, "Satellites");
      
    }
}
