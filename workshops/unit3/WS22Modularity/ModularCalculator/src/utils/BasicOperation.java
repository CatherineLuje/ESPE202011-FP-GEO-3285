/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Luje Catherine
 */
public class BasicOperation {

    //addition, subtraction,division, multiplication 
    public static float subtractionTwoNumbers(float addend1, float addend2) {
        float result = 0;
        result = addend1 - addend2;
        return result;

    }

    public static float addTwoNumbers(float minuend, float subtrahend) {
        float result = 0;
        result = minuend + subtrahend;
        return result;

    }

    public static float multiplyTwoNumbers(float multiplying, float multiplier) {
        float result = 0;
        result = multiplying * multiplier;
        return result;

    }
     public static float divideTwoNumbers(float dividend, float divider) {
        float result = 0;
        result = dividend / divider;
        return result;

    }
}
