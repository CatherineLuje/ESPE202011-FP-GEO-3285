/*im
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

import java.util.sccaner;
/**
 *
 * @author User
 */
public class BasicOperations {

    private static int summ;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        int addend1;
        int addend2;
        
        int minuend;
        int subtrahend; 
        int difference;
        
        int multiplication; 
        int multiplying; 
        int multiplier;
        
        int division;
        int dividend;
        int divisor;
        
        int modulus;
       
        dividend = 8;
        divisor =5;  
    
        multiplying = 5;
        multiplier = 8; 
        
        minuend = -23;
        subtrahend = -6;
        
        addend1 = 5;
        addend2 = 18;
        
        sum = addend1+ addend2;
        
     System.out.println("The addition of" + addend1 + " + " +addend2 + " is equal to -->" + sum);
    
     ++sum;
     System.out.println("sum is equal to --> " + sum);
     
     sum++;
     System.out.println("sum is equal to --> " + sum);
     
     System.out.println("adding one to sum " + (sum++));
     
     System.out.println("adding one to sum " + ((++sum)));
     
     System.out.println("the substraction of " + minuend + " - " + subtrahend + " is equal to --> " + (minuend -subtrahend));
     
     System.out.println("the multiplication of  " + multiplying + " * "  + multiplier + " is equal to --> " + (multiplying * multiplier));
     
     System.out.println("the division of " + dividend + " / " + divisor + " is equal to --> " +( dividend / divisor ));
     
     System.out.println("the modulus of " + dividend+ " % " + divisor  + " is equal to --> " +( dividend % divisor ));
       
 
    
    
}
    }
