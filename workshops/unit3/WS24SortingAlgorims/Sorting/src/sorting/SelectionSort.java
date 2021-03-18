/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Luje Catherine
 */
public class SelectionSort {

    public int[] sort(int[] unsortedArray) {
        int size = unsortedArray.length;
        int minumumIndex;
        int position;

        for (int i = 0; i < size - 1; i++) {
            minumumIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (unsortedArray[j] < unsortedArray[minumumIndex]) {
                    minumumIndex = j;
                }

                //swap
            }
            position = unsortedArray[minumumIndex];
            unsortedArray[minumumIndex] = unsortedArray[i];
            unsortedArray[i] = position;

            printMatrix(unsortedArray);
        }

        return unsortedArray;
    }

    public void printMatrix(int[] unsortedArray) {
        for (int element : unsortedArray) {
            System.out.print(element + " \t ");
        }
        System.out.println("");
    }

}
