/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws10functions;

/**
 *
 * @Luje Catherine
 */
public class WS10Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int divd = 5;
        int divr = 10;
        float quotient = 0;
        int x = 0;
        int y = 0;
           //call to divideTwoNumbers() function
        quotient = divideTwoNumbers(divd, divr);
        System.out.println("Quotient of 5 -> " + quotient);

        y = f(3);
        System.out.println("3^2 -> " + y);

        y = f(-3);
        System.out.println("-3^2 -> " + y);

        x = -1;
        y = f(x);
        System.out.println("The square of -> " + x + " <- is equal to -> " + y);

    }

    //function definition
    //return data type    name     parameter1   parameter2
    public static float divideTwoNumbers(int dividend, int divisor) {
        //body of the function
        float quotient = 0.0F;

        //             5        10   
        // float     int        int
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int f(int x) {
        int y = 0;
        y = x * x;

        return y;
    }

    public static int g(int x) {
        int y = 0;
        y = x * x + 2 * x + 1;

        return y;
    }

 
}
