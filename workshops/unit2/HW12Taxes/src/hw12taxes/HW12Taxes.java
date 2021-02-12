/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12taxes;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author Luje Catherine
 */
public class HW12Taxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        float product = 0.0F;
        float iva = 0;
        float taxbase = 0;
        float value = 0;
        float ISD = 0;

        System.out.println("Enter product value: ");
        product = scanner.nextFloat();
        iva = (float) (product * 0.12);
        System.out.println("The IVA of the product is:  " + iva);

        System.out.println("Enter your annual income: ");
        taxbase = scanner.nextFloat();
        calculateIncomeTax(taxbase);

        System.out.println("Enter the value to be transferred abroad: ");
        value = scanner.nextFloat();
        calculateCurrencyValue(value);
    }

    public static void calculateCurrencyValue(float value) {
        float ISD;
        if (value > 1200) {
            ISD = (float) ((value - 1200) * 0.05);
            System.out.println("The value to be paid for foreign currency outflows is:  " + ISD);

        } else {
            if (value < 1200) {
                ISD = (value * 0);
                System.out.println("The value to be paid for foreign currency outflows is:  " + ISD);
            }
        }
    }
    public static void calculateIncomeTax(float taxbase) {
        if (taxbase > 0 && taxbase <= 11212) {

            System.out.println("The Tax on the basic fraction is " + 0.0F);

        }
        if (taxbase >= 11212 && taxbase <= 14285) {
            System.out.println("The Tax on the basic fraction is " + ((taxbase - 11212) * 0.05F));
        }
        if (taxbase >= 14825 && taxbase <= 17854) {
            System.out.println("The Tax on the basic fraction is " + (154 + (taxbase - 14825) * 0.1));
        }
        if (taxbase >= 17854 && taxbase <= 21442) {
            System.out.println("The Tax on the basic fraction is " + (511 + (taxbase - 17854) * 0.12));
        }
        if (taxbase >= 21442 && taxbase <= 42874) {
            System.out.println("The Tax on the basic fraction is " + (941 + (taxbase - 21442) * 0.15));
        }
        if (taxbase >= 42874 && taxbase <= 64297) {
            System.out.println("The Tax on the basic fraction is " + (4156 + (taxbase - 42874) * 0.2));
        }
        if (taxbase >= 64297 && taxbase <= 85729) {
            System.out.println("The Tax on the basic fraction is " + (8440 + (taxbase - 64297) * 0.25));
        }
        if (taxbase >= 85729 && taxbase <= 114288) {
            System.out.println("The Tax on the basic fraction is " + (8440 + (taxbase - 85729) * 0.3));
        }
        if (taxbase >= 114288) {
            System.out.println("The Tax on the basic fraction is " + (22366 + (taxbase - 114288) * 0.35));

        }
    }
}
