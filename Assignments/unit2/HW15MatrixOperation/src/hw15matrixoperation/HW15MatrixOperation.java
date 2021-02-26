/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15matrixoperation;

import java.util.Scanner;

/**
 *
 * @author Luje Catherine
 */
public class HW15MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = 0;
        int columns = 0;
        int matrixA[][]= new int[rows][columns] ;
        int  matrixB [][]= new int[rows][columns] ;
        int matrixC [][] = new int[rows][columns];
      
        
 
        System.out.println("---Matrix Subtraction--");
        System.out.println("Enter the number of rows in the matrix");
        rows = input.nextInt();
        System.out.println("Enter the number of columns in the matrix");
        columns = input.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        System.out.println("Enter the values for matrix A ");
        for (int i = 0; i < rows; i++) {
            System.out.println("");
            for (int j = 0; j < columns; j++) {
                System.out.println("\t" + matrixA[i][j]);
                System.out.println("rows["+(i+1)+"]["+(j+1)+"]->");
                matrixA[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the values for matrix B ");
        for (int i = 0; i < rows; i++) {
            System.out.println("");
            for (int j = 0; j < columns; j++) {
                matrixB[i][j] = input.nextInt();
                System.out.println("\t" + matrixB[i][j]);
            }

        }
        System.out.println("\nEquals to -> ");
        for (int i = 0; i < rows; i++) {
            System.out.println("");
            for (int j = 0; j < columns; j++) {
                System.out.print("\t " + matrixC[i][j]);
            }
        }

    }
}
