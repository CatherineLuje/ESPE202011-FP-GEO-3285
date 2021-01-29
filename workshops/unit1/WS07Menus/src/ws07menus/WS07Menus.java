/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws07menus;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class WS07Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        
        do {
           System.out.println(" ========= Calculator  =======");
            System.out.println("1. -> Cube face area  ");
            System.out.println("2. -> Total cube area ");
            System.out.println("3. -> Cube volume  ");
            System.out.println("4. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int arista;
                    int facearea; 
                    System.out.println("Enter the length of the cube edge : ");
                    arista= input.nextInt();
                    facearea=arista*arista;
                    System.out.println("The cube face area is : " +facearea+ "cm^2");
                    break;
                case 2:
                    int cubearea; 
                    System.out.println("Enter the length of the cube edge : ");
                    arista= input.nextInt();
                    cubearea=6*arista*arista;
                    System.out.println("The total area of the cube is : "+cubearea+ "c^2");
                    break;
                    
                case 3: 
                    int cubevolume;
                    System.out.println("Enter the length of the cube edge : ");
                    arista= input.nextInt();
                    cubevolume=arista*arista*arista;
                    System.out.println("The volume of the cube is " +cubevolume+ "cm^3");
                    break;
                case 4:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option \n\n\n");
                    break;
            }

        } while (option != 4);

    }

}