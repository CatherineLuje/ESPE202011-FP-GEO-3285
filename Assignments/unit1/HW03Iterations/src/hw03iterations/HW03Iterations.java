/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03iterations;

/**
 *
 * @author User
 */
public class HW03Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 1
        
         int i;
        i = 0;
        System.out.println("This is a whie loop from 1 to 26");
        
        while ( i < 26 ){
            System.out.println(" i-> " + (i +1));
             //i +=1
             i+=1;
        }
         // Exercise 2 
             System.out.println("Multiplation Tables : 26");
             int top =26;
             int product=0;
             int table = 26;
             for(int j = 1; j<= top; j++){
                 product = table * j;
                 System.out.println("26 * " + j + "=" + product );
        // Exercise 3
        }
             System.out.println(" Multiplies of 12  ");
             for(int k = 0; k <= 180 ; k+=12){
                 System.out.println(k);
          } 
             
    }
  }

                    
    