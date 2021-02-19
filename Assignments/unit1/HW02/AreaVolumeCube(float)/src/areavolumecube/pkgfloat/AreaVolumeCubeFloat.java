 
package areavolumecube.pkgfloat;

import java.util.Scanner;

public class AreaVolumeCubeFloat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the arista cube edge in decimal : ");
     
        float arista;
        float facearea;
        float cubearea;
        float cubevolume;
        arista = scanner.nextFloat();
  
        facearea=arista*arista;
        cubearea=6*arista*arista;
        cubevolume=arista*arista*arista;
        
        System.out.println("The cube face area is : " +facearea+ "cm^2");
        System.out.println("The volume of the cube is " +cubevolume+ "cm^3");
     
    }
    
}
