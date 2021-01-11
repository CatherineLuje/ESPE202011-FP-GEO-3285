
package areavolumecube.pkgshort;

import java.util.Scanner;
public class AreaVolumeCubeShort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the short arista of the cube : ");
        
       
        short arista ;
        short facearea; 
        short cubearea;
        short cubevolume;
        arista = scanner.nextShort();
        
    
       
        facearea=(short) (arista *arista ); 
        cubearea =(short) (6*arista*arista);
        cubevolume=(short)(arista*arista*arista);
      
        
        System.out.println("The cube face area is : " +facearea+ "cm^2");
        System.out.println("The total area of the cube is : "+cubearea+ "c^2");
        System.out.println("The volume of the cube is " +cubevolume+ "cm^3");
     
    }
    
}

