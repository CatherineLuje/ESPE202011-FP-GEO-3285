/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13task;

import java.util.Scanner;

/**
 *
 * @author Luje Catherine
 */
public class WS13Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double perimeter;
        double apothem;
        double pentarea;

        float radius;
        float area = (float) Math.PI;

        float arista;
        float facearea;
        float cubearea;

        double speed;
        double distance;
        double time;

        double force;
        double mass;
        double acceleration;

        double gravity = 9.81;
        double pressuArea;
        double pressure = 0.0F;

        System.out.println("----------------------------");
        printLinearSpeed(scanner);
        System.out.println("----------------------------");

        System.out.println("----------------------------");
        calculateForce(scanner);
        System.out.println("---------------------------- ");

        System.out.println("-----------------------------");
        calculatePressure(scanner, gravity);
        System.out.println("-----------------------------");

        System.out.println("Enter the perimeter: ");
        perimeter = scanner.nextInt();
        System.out.println("Enter the apothem: ");
        apothem = scanner.nextInt();
        calculatePentagonArea(perimeter, apothem);

        System.out.println("Enter the arista cube edge : ");
        arista = scanner.nextFloat();
        calculateCubeArea(arista);

        System.out.println("Enter radius of the circle ");
        radius = scanner.nextFloat();
        calculateCircleArea(area, radius);

    }

    public static void calculatePressure(Scanner scanner, double gravity) {
        double mass;
        double pressuArea;
        double pressure;
        System.out.println("Enter the mass for the pressure");
        mass = scanner.nextDouble();
        System.out.println("Enter area for pressure:");
        pressuArea = scanner.nextDouble();
        pressure = (mass * gravity) / pressuArea;
        System.out.println("The pressure is: " + pressure + " N/m^2");
    }

    public static void calculateForce(Scanner scanner) {
        double mass;
        double acceleration = 9.81;
        double force;
        System.out.println("Enter the mass in kilograms  : ");
        mass = scanner.nextDouble();
        force = mass * acceleration;
        System.out.println("The strength is: " + force + " N");
    }

    public static void printLinearSpeed(Scanner scanner) {
        double distance;
        double time;
        double speed;
        System.out.println("Enter distance in meters");
        distance = scanner.nextDouble();
        System.out.println("Enter time in seconds");
        time = scanner.nextDouble();
        speed = (distance / time);
        System.out.println("The speed is: " + speed + " m/s");
    }

    public static void calculatePentagonArea(double perimeter, double apothem) {
        double pentarea;
        pentarea = (perimeter * apothem) / 2;
        System.out.println("The area of the pentagon is: " + pentarea);
        System.out.println("--------------------------------------------");
    }

    public static void calculateCircleArea(float area, float radius) {
        area = area * radius * radius;
        System.out.println("The area of the circle is: " + area + "cm^2");
        System.out.println("--------------------------------------------");
    }

    public static void calculateCubeArea(float arista) {

        float facearea;
        float cubearea;
        facearea = arista * arista;
        cubearea = 6 * arista * arista;
        System.out.println("The cube face area is : " + facearea + " cm^2");
        System.out.println("---------------------------------------------");
    }

}
