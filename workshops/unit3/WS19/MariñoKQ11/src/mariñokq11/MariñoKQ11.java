/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariñokq11;

import java.util.Scanner;

/**
 *
 * @author Luje Catherine
 */
public class MariñoKQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        int totalsum = 0;
        int []number = new int [5];
        float numbers[]= new float[3];
        float average;
        float sumNumbers=0;
        
        System.out.println("Sum the array");
       CalculatorTheSumArray(number, scanner, totalsum);
        
        
        
        System.out.println("Average of the numbers");
        //CalculatorAverageTheArray(numbers, scanner, sumNumbers);
        
    }

    public static void CalculatorAverageTheArray(float[] numbers, Scanner scanner, float sumNumbers) {
        float average;
        for (int i = 0; i<3; i++){
            System.out.println("Enter the number ");
            numbers[i] = scanner.nextFloat();                   
        }
        for (int i = 0; i<3; i++){    
            average = sumNumbers/numbers[i];
            System.out.println(" The average the numbers is equal to -->" +average);
            
        }
    }

    public static void CalculatorTheSumArray(int[] number, Scanner scanner, int totalsum) {
        for (int i = 0; i<number.length; i++){
            System.out.println("Enter the number ");
            number[i]=scanner.nextInt();
        }
        for (int i = 0; i<number.length; i++){
            totalsum=totalsum+number[i];
        }
        System.out.println(" The total sum  is equal to -->" +totalsum);
    }
    
}
