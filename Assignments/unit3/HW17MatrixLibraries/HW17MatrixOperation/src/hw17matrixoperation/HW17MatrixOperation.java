/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw17matrixoperation;

import espe.edu.ec.MatrixOperation.MatrixOperation;
import java.util.Scanner;

/**
 *
 * @author Luje Catherine
 */
public class HW17MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float[][] matrixA;
        float[][] matrixB;
        float[][] resultMatrix;
        int m = 0;
        int n = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the matrix dimensions ");
        System.out.print("\n m -> ");
        m = input.nextInt();

        System.out.print("\n n -> ");
        n = input.nextInt();

        matrixA = new float[m][n];
        matrixB = new float[m][n];
        resultMatrix = new float[m][n];

        System.out.println(" ------- Enter the elements of the matrix -------");
        matrixA = MatrixOperation.readMatrixElements(m, n, "A", input);
        matrixB = MatrixOperation.readMatrixElements(m, n, "B", input);

        for (int tab = 0; tab <= m / 2; tab++) {
        }
        System.out.println("");
        System.out.print("\t");
        System.out.println(" MATRIX A");
        MatrixOperation.printMatrix(m, n, matrixA);
        System.out.println("");
        System.out.print("\t");
        System.out.println(" MATRIX B  ");
        MatrixOperation.printMatrix(m, n, matrixB);
   

        for (int tab = 0; tab <= m / 2; tab++) {
        }
      
        System.out.println("");
        System.out.println("-- The sum of matrices is --");
        resultMatrix = MatrixOperation.addTwoMatrices(m, n, matrixA, matrixB);
        MatrixOperation.printMatrix(m, n, resultMatrix);

        System.out.println("");
        System.out.println("-- Matrix subtraction is: --");
        resultMatrix = MatrixOperation.subtractionTwoMatrices(m, n, matrixA, matrixB);
        MatrixOperation.printMatrix(m, n, resultMatrix);

        System.out.println("");
        System.out.println("-- Matrix Multiplication is: --");
        resultMatrix = MatrixOperation.multiplyTwoMatrices(m, n, matrixA, matrixB);
        MatrixOperation.printMatrix(m, n, resultMatrix);
        
    }
}
