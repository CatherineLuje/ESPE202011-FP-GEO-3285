/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysquizfebruary22;

import java.util.Scanner;

/**
 *
 * @author Luje Catherine
 */
public class ArraysQuizFebruary22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] fullname;
        int[] ageByCustomer;
        int customers=0;
        int age=0;
        

        System.out.println("Enter the number of customers -> ");
        customers = input.nextInt();
        
        fullname = new String[customers];
        ageByCustomer = new int[customers];

        for (int i = 0; i < customers; i++) {
            System.out.println("Enter the name of customer numeber " + (i + 1) + " -> ");
            fullname[i] = input.nextLine();
        }
        for (int i = 0; i < customers; i++) {
            System.out.println("Enter the age of the person " + (i + 1) + " -> ");
            ageByCustomer[i] = input.nextInt();
        }
        for (int i = 0; i < fullname.length; i++) {
            System.out.print("The name of customer " + (i + 1) + " -> "+fullname);
            

        }
        for (int i = 0; i < ageByCustomer.length; i++) {
            System.out.print("Age" + (i + 1) + " -> "+ageByCustomer);
            

        }
    }
}

