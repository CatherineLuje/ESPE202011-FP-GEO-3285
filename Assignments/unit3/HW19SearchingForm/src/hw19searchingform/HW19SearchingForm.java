/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw19searchingform;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Luje Catherine
 */
public class HW19SearchingForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] ages = new int[6];
        int searchAge;
        int position;
        for (int i = 0; i < ages.length; i++) {
            ages[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter ages"));
        }
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + ", ");
        }
        Arrays.sort(ages);
        System.out.println("\t" + Arrays.toString(ages));
        System.out.print("Enter the age to search: ");
        searchAge = input.nextInt();
        Arrays.sort(ages);
        position = Arrays.binarySearch(ages, searchAge);
        JOptionPane.showMessageDialog(null, searchAge);

 
        if (position != -1) {
            System.out.println("Age found in position " + position);
        } else {
            System.out.println("Age not found ");
        }
    }

    public int binarySearch(int elements[], int left, int right, int x) {
        if (right >= left) {

            int mid = left + (right - left) / 2;

            if (elements[mid] == x) {
                return mid;
            }
            if (elements[mid] > x) {
                return binarySearch(elements, left, mid - 1, x);
            }
            if (elements[mid] < x) {
                return binarySearch(elements, mid + 1, right, x);
            }
        }
        return -1;
    }
}
