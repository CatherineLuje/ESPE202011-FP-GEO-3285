/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18searchalgorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author luje Catherine
 */
public class HW18SearchAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages;
        int n;
        int searchAge;
        int position;

        System.out.print("Enter the number of people: ");
        n = input.nextInt();
        ages = new int[n];

        printArray(n, ages, input);
        System.out.println("");
        System.out.println("----Linear Search----");
        System.out.print("Enter the age to search: ");
        searchAge = input.nextInt();
        position = LinearSearch.search(ages, searchAge);
        System.out.println("Age is in the position: " + position);

        System.out.println("");
        System.out.println("----Binary Search----");
        Arrays.sort(ages);
        System.out.println("\t" + Arrays.toString(ages));
        System.out.print("Enter the age to search: ");
        searchAge = input.nextInt();
        Arrays.sort(ages);
        position = Arrays.binarySearch(ages, searchAge);
        System.out.println("Age is in the position: " + position);

    }

    public static void printArray(int n, int[] ages, Scanner input) {
        for (int i = 0; i < n; i++) {
            System.out.print("The age of the person  [ " + (i + 1) + " ] is -> ");
            ages[i] = input.nextInt();
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(ages[i] + ", ");

        }
    }

}
