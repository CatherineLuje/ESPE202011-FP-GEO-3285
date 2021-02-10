/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursion;

import java.util.Scanner;

/**
 *
 * @author Catherine Luje
 */
public class HW11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base;
        int exponent;
        System.out.println("Enter base");
        base = input.nextInt();
        System.out.println("Entex exponent");
        exponent = input.nextInt();
        System.out.println("The result is: " + showPotentiationOfNumber(base, exponent));
    }

    public static int showPotentiationOfNumber(int base, int exponent) {
        int accumulator = 1;
        for (int i = 1; i <= exponent; i++) {
            accumulator = accumulator * base;
        }

        return accumulator;
    }

}
