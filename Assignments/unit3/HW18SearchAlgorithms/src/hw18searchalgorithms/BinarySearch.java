/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18searchalgorithms;

/**
 *
 * @author Luje Catherine
 */
public class BinarySearch {

    public static int binarySearch(int elements[], int left, int right, int x) {
        if (right >= left) {

            int mind = left + (right - left) / 2;

            if (elements[mind] == x) {
                return mind;
            }
            if (elements[mind] > x) {
                return binarySearch(elements, left, mind - 1, x);
            }
            if (elements[mind] < x) {
                return binarySearch(elements, mind + 1, right, x);
            }
        }
        return -1;
    }
}
