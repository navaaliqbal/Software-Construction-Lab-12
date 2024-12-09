package lab7;

import java.util.Scanner;

import java.util.Scanner;

public class RecursiveSumOfDigits {

    // Recursive function to calculate the sum of digits
    public static int sumOfDigits(int number) {
        // Handle negative numbers by converting them to positive
        number = Math.abs(number);

        // Base case: if the number is 0, return 0
        if (number == 0) {
            return 0;
        }
        
        // Recursive case: add the last digit and recurse on the rest of the number
        return number % 10 + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        // Scanner for taking user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter an integer:");

        // Read user input
        int number = scanner.nextInt();
        
        // Compute the sum of digits using the recursive function
        int result = sumOfDigits(number);

        // Output the result
        System.out.println("Sum of digits: " + result);

        // Close the scanner
        scanner.close();
    }
}

