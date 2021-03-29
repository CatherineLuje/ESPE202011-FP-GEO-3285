/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luje Catherine
 */
public class FileManager {

    public static boolean createFile(String fileName) {
        boolean created = false;
        try {
            File file = new File(fileName + ".txt");
            if (file.createNewFile()) {
                System.out.println("file was created");
                created = true;
            } else {
                System.out.println("file already exists");
                created = false;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            created = false;
        }
        return created;
    }

    public static boolean save(String data, String fileName) {
        boolean saved = false;
        createFile(fileName);
        try {
            FileWriter myWrite = new FileWriter(fileName + ".csv", true);
            myWrite.write( data+ System.getProperty("line.separator")) ;
            myWrite.close();
            System.out.println("a new record of " + fileName + " was saved");
            saved = true;
        } catch (IOException ex) {
            ex.printStackTrace();
            saved = false;
        }
        return saved;

    }

    public DefaultTableModel readList() throws FileNotFoundException {
        Vector volcanoes = new Vector();
        volcanoes.addElement("Name");
        volcanoes.addElement("Region");
        volcanoes.addElement("Altitude");
        volcanoes.addElement("Is Active");
        volcanoes.addElement("Type of Volcano");
        DefaultTableModel table = new DefaultTableModel(volcanoes, 0);

        try {
            FileReader fr = new FileReader("Volcanoes.csv");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d = br.readLine()) != null) {
                StringTokenizer data = new StringTokenizer(d, ",");
                Vector x = new Vector();
                while (data.hasMoreTokens()){
                x.addElement(data.nextToken());
            }table.addRow(x);
        }
    }
    catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
    }
return table;
}
}
