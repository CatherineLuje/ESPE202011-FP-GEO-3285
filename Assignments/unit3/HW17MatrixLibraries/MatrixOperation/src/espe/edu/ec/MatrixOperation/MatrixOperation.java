/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espe.edu.ec.MatrixOperation;

import java.util.Scanner;

/**
 *
 * @author Luje Catherine
 */
public class MatrixOperation {

    public static float[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
        float[][] resultMatrix;
        resultMatrix = new float[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "][" + (j + 1) + "] -> ");
                resultMatrix[i][j] = input.nextFloat();
            }
        }
        return resultMatrix;
    }

    public static float[][] addTwoMatrices(int m, int n, float[][] matrixA, float[][] matrixB) {
        float[][] resultMatrix;
        resultMatrix = new float[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return resultMatrix;
    }

    public static float[][] subtractionTwoMatrices(int m, int n, float[][] matrixA, float[][] matrixB) {
        float[][] resultMatrix;
        resultMatrix = new float[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                resultMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        return resultMatrix;

    }

    public static float[][] multiplyTwoMatrices(int m, int n, float[][] matrixA, float[][] matrixB) {
        float[][] resultMatrix;
        resultMatrix = new float[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                resultMatrix[i][j] = matrixA[i][j] * matrixB[i][j];
            }
        }

        return resultMatrix;
    }

    public static void printMatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("┌ \t");
                    } else if (i == m - 1) {
                        System.out.print("└\t");

                    } else {
                        System.out.print("│\t");
                    }
                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.print("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.print(" \t┐");
                    } else if (i == m - 1) {
                        System.out.print(" \t┘");

                    } else {
                        System.out.print("  \t│");
                    }
                }
            }
        }
        System.out.println("");
    }

}
