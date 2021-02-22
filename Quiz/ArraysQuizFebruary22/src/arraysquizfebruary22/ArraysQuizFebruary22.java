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
        int[] numberOfClients;
        String[] fullname;
        int[] ageByCustomer;
       
        int customers;
        int age;

        System.out.println("Enter the number of customers -> ");
        customers = input.nextInt();
        numberOfClients = new int [customers];
        
        System.out.println("Enter the name of customer numeber");
        age=input.nextInt();
        

        

        for (int i = 0; i <customers;  i++) {
            System.out.println("Enter the name of customer numeber " + (i + 1) + " -> ");
        }
        for (int i = 0; i < age; i++) {
            System.out.print("Age" + (i + 1) + " -> " );
            age[i] = input.nextInt();
        }
    }
}
