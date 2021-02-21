/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14BooksAndCountriesArrays;

import java.util.Scanner;

/**
 *
 * @author Luje Catherine
 */
public class HW14BooksAndCountriesArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] booksByShelf;
        String[] countries = {"Germany", "Australia", "Ecuador", "China", "Brazil", "Bolivia", "Austria", "Canada", "Japan", "China", "England"};
        float[] costByBook = {12.5F, 13.25F, 21.02F, 10.30F, 24.12F, 23.12F, 9.75F, 11.20F, 6.12F};
        int n;
        System.out.print("Enter the number of shelves: ");
        n = input.nextInt();

        booksByShelf = new int[n];

        //booksByShelf[0] = 5;
        //booksByShelf[1] = 9;
        //booksByShelf[2] = 14;
        //booksByShelf[3] = 8;
        //booksByShelf[4] = 12;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of books on the shelf " + (i + 1) + " -> ");
            booksByShelf[i] = input.nextInt();
        }
        System.out.println("----------------------------------------------------");
        for (int books : booksByShelf) {
            System.out.println("The books on the shelf are " + books);
        }
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.println("The books on the shelf are " + (i + 1) + " -> " + booksByShelf[i]);
        }
        System.out.println("-------------------Cost of books--------------------");

        for (int i = 0; i < costByBook.length; i++) {
            System.out.println("The cost of the book is " + (i + 1) + " -> " + costByBook[i]);
        }
        System.out.println("---------------------Countries----------------------");
        for (String namesCountries : countries) {
            System.out.println("" + namesCountries);
        }

    }
}
