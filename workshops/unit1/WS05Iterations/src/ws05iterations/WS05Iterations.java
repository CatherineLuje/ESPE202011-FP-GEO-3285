
package ws05iterations;

public class WS05Iterations {

    /**
     * @param args Catherine Luje
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i;
        i = 0;
        System.out.println("===This is a whie loop from 1 to 10 ===");
        
        while ( i < 10){
            System.out.println(" i-> " + (i +1));
             //i +=1
             i++;
             //i = i +;
        }
             System.out.println("First 5 Even numbers");
             i = 2;
             while ( i <= 10){
                 System.out.println(i + " - > is even " );
                 i+= 2;
             }
             
             System.out.println("First 5 odd numbers");
             
             int stop;
             stop = 10;
             for(int j= 1; j< 10; j+= 2){
                 System.out.println("Odd number --> " + j);
             }
             
             System.out.println("Multiplation Tables : 9");
             int top =12;
             int product=0;
             int table = 9;
             for(int j = 1; j<= top; j++){
                 product = table * j;
                 System.out.println("9 * " + j + "=" + product );
                
        }
    }
  }
