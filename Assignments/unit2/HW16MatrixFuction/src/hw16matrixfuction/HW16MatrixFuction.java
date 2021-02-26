/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw16matrixfuction;

import java.util.Scanner;

/**
 *
 * @author Luje Catherine
 */
public class HW16MatrixFuction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] a;
        int[][] b;
        int[][] t;
        int[][] c;
        int rows = 0;
        int colums = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the matrix dimesions");
        System.out.print("\n rows->");
        rows = input.nextInt();

        System.out.print("\n colums->");
        colums = input.nextInt();

        a = new int[rows][colums];
        b = new int[rows][colums];
        c = new int[rows][colums];

        System.out.println("------Enter the elements of the matrix-------");

        a = readMatrixElements(rows, colums, "A", input);
        b = readMatrixElements(rows, colums, "B", input);

        for (int tab = 0; tab <= colums / 2; tab++) {

        }
        System.out.println(" A");

        printMatrix(rows, colums, a);
        System.out.println("\t");

        System.out.println(" B ");
        printMatrix(rows, colums, b);

        System.out.println("--The subtraction of matrices is--");
        c = calculateSubtraction(rows, colums, a, b);
        printMatrix(rows, colums, c);
    }

    public static int[][] readMatrixElements(int rows, int columns, String name, Scanner input) {
        int[][] matrix;
        matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {
                System.out.print(name + "[" + (i + 1) + "][" + (j + 1) + "] ->");
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] calculateSubtraction(int rows, int columns, int[][] a, int[][] b) {
        int[][] c;
        c = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        return c;
    }

    public static void printMatrix(int rows, int columns, int[][] matrix) {
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < columns; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.println();
                    } else if (i == rows - 1) {
                        System.out.println();

                    } else {
                        System.out.println();
                    }
                }
                System.out.println(matrix[i][j]);
                if (j > -1 && j < (columns - 1)) {
                    System.out.println();

                }
                if (j == (columns - 1)) {
                    if (i == 0) {
                        System.out.println();
                    } else if (i == rows - 1) {
                        System.out.println();
                    } else {
                        System.out.println();
                    }
                }
            }
        }
        System.out.println("");
    }
}
