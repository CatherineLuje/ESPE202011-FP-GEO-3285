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
        double acceleration = 9.81;

        double gravity = 9.81;
        double pressuArea;
        double pressure = 0.0F;

        System.out.println("----------------------------");
        System.out.println("Enter distance in meters");
        distance = scanner.nextDouble();
        System.out.println("Enter time in seconds");
        time = scanner.nextDouble();
        speed = calculateLinearSpeed(distance, time);
        System.out.println("The speed is: " + speed + " m/s");
        System.out.println("----------------------------");

        System.out.println("----------------------------");
        System.out.println("Enter the mass in kilograms  : ");
        mass = scanner.nextDouble();
        force = calculateForce(mass, acceleration);
        System.out.println("The strength is: " + force + " N");
        System.out.println("---------------------------- ");

        System.out.println("-----------------------------");
        System.out.println("Enter the mass for the pressure");
        mass = scanner.nextDouble();
        System.out.println("Enter area for pressure:");
        pressuArea = scanner.nextDouble();
        pressure = calculatePressure(mass, gravity, pressuArea);
        System.out.println("The pressure is: " + pressure + " N/m^2");
        System.out.println("-----------------------------");

        System.out.println("-----------------------------");
        System.out.println("Enter the perimeter: ");
        perimeter = scanner.nextInt();
        System.out.println("Enter the apothem: ");
        apothem = scanner.nextInt();
        pentarea = calculatePentagonArea(perimeter, apothem);
        System.out.println("The area of the pentagon is: " + pentarea);
        System.out.println("--------------------------------------------");

        System.out.println("-----------------------------");
        System.out.println("Enter the arista cube edge : ");
        arista = scanner.nextFloat();
        facearea = calculateCubeArea(arista);
        System.out.println("The cube face area is : " + facearea + " cm^2");
        System.out.println("---------------------------------------------");

        System.out.println("-----------------------------");
        System.out.println("Enter radius of the circle ");
        radius = scanner.nextFloat();
        area = calculateCircleArea(area, radius);
        System.out.println("The area of the circle is: " + area + "cm^2");
        System.out.println("--------------------------------------------");

    }

    public static float calculateCircleArea(float area, float radius) {
        area = area * radius * radius;
        return area;
    }

    public static double calculatePentagonArea(double perimeter, double apothem) {
        double pentarea;
        pentarea = (perimeter * apothem) / 2;
        return pentarea;
    }

    public static double calculateLinearSpeed(double distance, double time) {
        double speed;
        speed = (distance / time);
        return speed;
    }

    public static double calculateForce(double mass, double acceleration) {
        double force;
        force = mass * acceleration;
        return force;
    }

    public static double calculatePressure(double mass, double gravity, double pressuArea) {
        double pressure;
        pressure = (mass * gravity) / pressuArea;
        return pressure;
    }

    public static float calculateCubeArea(float arista) {
        float facearea;
        float cubearea;
        facearea = arista * arista;
        cubearea = 6 * arista * arista;
        return facearea;
    }

}
