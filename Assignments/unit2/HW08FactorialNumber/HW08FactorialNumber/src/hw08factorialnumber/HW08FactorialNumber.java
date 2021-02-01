package hw08factorialnumber;

import java.util.Scanner;

/**
 *
 * @Catherine Luje
 */
public class HW08FactorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int factorial = 1;

        System.out.println("Enter number between 0 and 15 : ");
        number = scanner.nextInt();
        if (number >= 0 && number <= 15) {
            while (number > 0) {
                factorial = factorial * number;
                number--;
            }
            System.out.println("The factorial is: " + factorial);

        } else {
            System.out.println(" The program only calculates factorial between 0 and 15 ");
        }

    }
}
