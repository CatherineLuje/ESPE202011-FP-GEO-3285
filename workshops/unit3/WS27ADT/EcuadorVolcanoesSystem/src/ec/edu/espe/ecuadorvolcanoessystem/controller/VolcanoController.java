/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ecuadorvolcanoessystem.controller;

import ec.edu.espe.ecuadorvolcanoessystem.model.Volcano;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.FileManager;

/**
 *
 * @author Luje Catherine
 */
public class VolcanoController {

    public void save(Volcano volcano) {
        String data = volcano.getName() + "," + volcano.getRegion() + "," + volcano.getAltitude() + "," + volcano.isIsActive() + "," + volcano.getTypeOfVolcano();
        FileManager.save(data, "Volcanoes");

    }

    public DefaultTableModel readVolcanoes() throws FileNotFoundException {
        Vector volcanoes = new Vector();
        volcanoes.addElement("Name");
        volcanoes.addElement("Regiom");
        volcanoes.addElement("Altitude");
        volcanoes.addElement("Is Active");
        volcanoes.addElement("Type of volcano");

        DefaultTableModel table = new DefaultTableModel(volcanoes, 0);

        try {
            FileReader fr = new FileReader("Volcanoes.csv");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d = br.readLine()) != null) {
                StringTokenizer data = new StringTokenizer(d, ",");
                Vector x = new Vector();
                while (data.hasMoreTokens()) {
                    x.addElement(data.nextToken());
                }
                table.addRow(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return table;

    }
}
