/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS15ArraysCorrection;

import java.util.Scanner;

/**
 *
 * @author Luje Catherine
 */
public class WS15ArraysCorrection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Corretion 
        int customer = 0;
        String[] fullname;
        int[]age;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please Enter the number of customers -> ");
        customer=scanner.nextInt();
        
        fullname=new String[customer];
        age= new int[customer];
        for (int i=0; i< customer; i++){
            scanner.nextLine();
            System.out.print("Please Enter the name of customer  " +(i+1)+ "-> " );
            fullname[i]=scanner.nextLine();
           
            System.out.print("Enter the age of the customer  " +fullname[i]+  "-> " );
            age[i] = scanner.nextInt();
            System.out.println("------------------------------------------");
        }
        System.out.println("Customer ->  \t    Age  " );

        for (int i = 0; i < customer; i++) {
            System.out.println(fullname[i] + " ->  \t " + age[i]+ " years old" );
    }
}
}