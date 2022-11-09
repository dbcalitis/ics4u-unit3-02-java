/*
 * This program gives the factorial of the given input
 *
 * @author  Daria Bernice Calitis
 * @version 11.0.16
 * @since   2022-11-09
 */

import java.util.Scanner;

/**
 * Main class.
 */
final class Main {
    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The reverseString function.
     *
     * @param num number input.
     * @return factorial value of num.
     */
    public static int factorial(int num) {
        final int returnValue;

        if (num < 0) {
            returnValue = -1;
        } else if (num == 0) {
            returnValue = 1;
        } else {
            returnValue = factorial(num - 1) * num;
        }

        return returnValue;
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        // Create Scanner Object.
        final Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        final int numInput = scan.nextInt();

        System.out.printf("%s! = %s", String.valueOf(numInput),
            String.valueOf(factorial(numInput)));
        System.out.println();

        System.out.println("\nDone.");
    }
}
