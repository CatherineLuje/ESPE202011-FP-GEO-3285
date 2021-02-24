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
        int[][] matrixA;
        int[][] matrixB;
        int[][] matrixC;
        int rows = 0;
        int columns = 0;
        matrixA = new int[rows][columns];
        matrixB = new int[rows][columns];
        matrixC = new int[rows][columns];

        System.out.println("---Matrix Subtraction--");
        System.out.println("Enter the number of rows in the matrix");
        rows = input.nextInt();
        System.out.println("Enter the number of columns in the matrix");
        columns = input.nextInt();

        System.out.println("Enter the values for matrix A ");
        for (int i = 0; i < rows; i++) {
            System.out.println("");
            for (int j = 0; j < columns; j++) {
                System.out.println("\t" + matrixA[rows][columns]);
                matrixA[rows][columns] = input.nextInt();
            }
        }
        System.out.println("Enter the values for matrix B ");
        for (int i = 0; i < rows; i++) {
            System.out.println("");
            for (int j = 0; j < columns; j++) {
                matrixB[rows][columns] = input.nextInt();
                System.out.println("\t" + matrixB[rows][columns]);
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixC[rows][columns] = matrixA[rows][columns] - matrixB[rows][columns];
            }
        }
        System.out.println("\nEquals to -> ");
        for (int i = 0; i < rows; i++) {
            System.out.println("");
            for (int j = 0; j < columns; j++) {
                System.out.print("\t " + matrixC[rows][columns]);
            }
        }

    }
}
