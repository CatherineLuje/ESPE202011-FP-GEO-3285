/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21functions;

import java.util.Scanner;

/**
 *
 * @author Luje Catherine
 */
public class WS21Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float batteryPercentage;
        float batteryLifeHpComputer=5.2F;
        float duration;
        float milliliters;
        int pages;
        float millilitersOfHPPrinterInk=3.5F;
        
        System.out.println("AUTHOR: LUJE CATHERINE");
        System.out.println(" ");
        System.out.println("----Calculate Hp Computer Battery Percentage----");
        System.out.print("Enter your computer's battery percentage: ");
        batteryPercentage = input.nextFloat();
        duration=calculateHpComputerBatteryPercentage(batteryPercentage, batteryLifeHpComputer);
        System.out.println("The battery of your computer will last: " +duration + " hours");
        
        
        System.out.println("");
        System.out.println("---Calculate Ink Yield for HP DeskJet Printer----");
        System.out.print("Enter the number of pages: ");
        pages= input.nextInt();
        milliliters=CalculateInkYieldForHpDeskJetPrinter(pages, millilitersOfHPPrinterInk);
        System.out.println("The ink to be consumed is: "+ String.format("%.2f", milliliters)+ " milliliters");

    }

    public static float CalculateInkYieldForHpDeskJetPrinter(int pages, float millilitersOfHPPrinterInk) {
        float milliliters;
        milliliters=((pages*millilitersOfHPPrinterInk)/190);
        return milliliters;
    }

    public static float calculateHpComputerBatteryPercentage(float batteryPercentage, float batteryLifeHpComputer) {
        float duration;
        duration=((batteryPercentage*batteryLifeHpComputer)/100);
        return duration;
    }
}
