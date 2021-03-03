/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lujecq11;

import java.util.Scanner;

/**
 *
 * @author Luje Catherine
 */
public class LujeCQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int[] numbers = new int[5];
        System.out.println("Enter number: ");
        sum = calculateSum(numbers, input, sum);

        System.out.println("The sum is: " + sum);
        
        //Exercise 2
        int total = 0;
        float elements[] = new float[3];
        float average;
        System.out.println("---Average---");

        average = calculateAverage(elements, input, total);
        System.out.println("The average is:" + average);
    
        //Exercise 3
        System.out.println("");
        int array[]={12,23,34,98,87,65,0};
        System.out.println("Enter the number to search");
        
    }

    public static int calculateSum(int[] numbers, Scanner input, int sum) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("[" + (i + 1) + "]->");
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static float calculateAverage(float[] elements, Scanner input, int total) {
        float average;
        for (int i = 0; i < elements.length; i++) {
            System.out.print(+elements.length + "[" + (i + 1) + "]->");
            elements[i] = input.nextInt();
            average = elements[i];
             }
              for (int i = 0; i < elements.length; i++) {
           total =(int) (total +elements[i]);
            
        }
        average = (total / elements.length);
        return average;
    }

}
