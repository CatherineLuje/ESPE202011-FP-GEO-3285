/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws12libraries;

/**
 *
 * @author Catherine Luje
 */
public class WS12Libraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //if we have the Math Library
        //we import and use it 
        
        float squareRoot=0.0F;
        float number=0.0F;
        float power=0.0F;
        float base=0.0F;
        float exponent=0.0F;
        float absoluteValue;
        
        
        
        number=9;
        squareRoot=(float)Math.sqrt(number);
        System.out.println("Ths square root of--> " +number+ " <--is--> " +squareRoot);
        
        
        number=49;
        squareRoot=(float)Math.sqrt(number);
        System.out.println("Ths square root of--> " +number+ " <--is--> " +squareRoot);

        
        number=5;
        squareRoot=(float)Math.sqrt(number);
        System.out.println("Ths square root of--> " +number+ " <--is--> " +squareRoot);

        base=3;
        exponent =2;
        
       
        //power =9 ?
        
        base=2;
        power=4;
        power =(float) Math.pow(base,exponent);
        System.out.println(base +" ^ " + exponent+ "=" +power);
        
        //power=16?
        
        base=78;
        exponent=5;
        //calculatr 78^5
        //2.887.174.368
        absoluteValue= getAbsoluteValue(number);
        number = -5;
        absoluteValue=getAbsoluteValue(number);
        System.out.println("Absolute Value of--> " +number+ " is " +absoluteValue);
        
        //if we have the Library, what would we do?
        //we should create the feature the library
        //our own algoritm to compute the square root
        
    }
    public float  computePower (float base, float exponent){
        float power;
        power=1.0F;
     
        for(int i= 1; i<=(int)exponent;i++ ){
            power=power*base;
            
        }
        return power;
    }
    private static float getAbsoluteValue (float number){
       if (number <0){
           return -number;
       }else 
           return number;
       }
      //  if (number <0){
            
      //     number=number *-1;
      //     System.out.println("");
      //    return number;
      //}
                //return number; 
           }
      //}
        
        
  
