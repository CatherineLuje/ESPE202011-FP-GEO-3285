/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11recursion;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class WS11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int fact = 0;

        System.out.println("Enter number : ");
        number = scanner.nextInt();

        System.out.println("Factorial of: " + number + " is equal to-->" + fact);
        fact = showfactorial(number);
    }

    public static int showfactorial(int n) {
        if (n < 0) {
            return -1;
        } else {
            if (n == 0) {
                return 1;
            }
            return (n * showfactorial(n - 1));
        }
    }
}
