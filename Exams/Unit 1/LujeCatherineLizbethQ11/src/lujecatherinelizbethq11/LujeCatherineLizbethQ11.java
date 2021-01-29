/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lujecatherinelizbethq11;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class LujeCatherineLizbethQ11 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        
        do {
           System.out.println(" ========= Calculator =======");
            System.out.println("1. -> multiplication table ");
            System.out.println("0. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {
            case 1: 
            
                System.out.println("Enter a table ");
                    int top = 12; 
                    int product;
                    int table; 
                    table = input.nextInt();
                    System.out.println("Multiplication table" +table);
                    for(int j = 1; j<= top; j++){
                    product = table * j;
                    System.out.println( table + "*" +j +"="+ product);
                    product ++;
                }
                    break;
           case 0:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option \n\n\n");
                    break; 
              }
        } while (option != 0);
 }
}
   



