
package areavolumecube.pkgint;

import java.util.Scanner;
public class AreaVolumeCubeInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scanner = new Scanner (System.in);
        
        int arista;
        int facearea; 
        int cubearea;
        int cubevolume;
        
        System.out.println("Enter the length of the cube edge : ");
        
        arista= scanner.nextInt();
        
        facearea=arista*arista;
        cubearea=6*arista*arista;
        cubevolume=arista*arista*arista;
        
        System.out.println("The cube face area is : " +facearea+ "cm^2");
        System.out.println("The total area of the cube is : "+cubearea+ "c^2");
        System.out.println("The volume of the cube is " +cubevolume+ "cm^3");
    }
}
       
      
     
              
        
          
          
      
        
        
        
       
        
        
      
