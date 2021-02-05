/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10functions;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class HW10Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dividend = 0;
        int divisor = 0;
        float quotient = 0;
        int variableX;
        int variableY;
        int multiplicand;
        int stop = 12;
        int product = 0;
      
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(" UNIVERSIDAD DE LAS FUERZAS ARMADAS -ESPE\n\n ");
        System.out.print("     Engineering in Geospatial Technologies\n ");
        System.out.print("        Programming Fundamentals \n\n");
        System.out.println("              Luje Catherine ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(" =====================Calculator==================");
        System.out.println(" ---------------------Division--------------------");
        System.out.println("Enter dividend: ");
        dividend = input.nextInt();
        System.out.println("Enter divider: ");
        divisor = input.nextInt();
        quotient = divideTwoNumbers(dividend, divisor);
        System.out.println("Quotient is:  -> " + quotient);
        System.out.println(" ------------------------------------------------");
        System.out.println(" ------------------Function f(x)------------------");
        System.out.println("Enter a value for x :");
        variableX = input.nextInt();
        variableY = computeSquare(variableX);
        System.out.println("The square of -> " + variableX + " <- is equal to -> " + variableY);
        System.out.println("-------------------------------------------------");
        System.out.println(" ------------------Function g(x)------------------");
        System.out.println("Enter a value for x: ");
        variableX = input.nextInt();
        variableY = computeParabola(variableX);
        System.out.println("The square of -> " + variableX + " <- is equal to -> " + variableY);
        System.out.println(" -------------------------------------------------");
        System.out.println(" ----------------Multiplication table-------------");
        System.out.println("Enter the table to study: ");
        multiplicand = input.nextInt();
        for (int multiplier = 1; multiplier <= stop; multiplier++) {
            product = showTheMultiplicationTable(multiplicand, multiplier);
            System.out.println(+multiplicand + "*" + multiplier + "=" + product);

        }
        System.out.println("-------------------------------------------------");
    }

    public static float divideTwoNumbers(int dividend, int divisor) {

        float quotient = 0.0F;
        quotient = (float) dividend / (float) divisor;
        return quotient;
    }

    public static int computeSquare(int x) {
        int y = 0;
        y = x * x;
        return (y);

    }

    public static int computeParabola(int x) {
        int y = 0;
        y = x * x + 2 * x + 1;

        return y;
    }

    public static int showTheMultiplicationTable(int multiplicand, int multiplier) {
        int product;

        product = multiplicand * multiplier;
        return product;
    }
   
}
