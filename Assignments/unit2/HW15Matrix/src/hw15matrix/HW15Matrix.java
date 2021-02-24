/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15matrix;

import java.util.Scanner;

/**
 *
 * @author Luje Catherine
 */
public class HW15Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = 0;
        int columns = 0;
        int matrixA[][] = new int[rows][columns];
        int matrixB[][] = new int[rows][columns];
        int matrixC[][] = new int[rows][columns];

        System.out.println("---Matrix Subtraction--");
        System.out.println("Enter the number of rows in the matrix");
        rows = input.nextInt();
        System.out.println("Enter the number of columns in the matrix");
        columns = input.nextInt();


        
    }    

}
