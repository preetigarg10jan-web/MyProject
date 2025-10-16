import java.util.Scanner;

public class FactorialCalculator {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Ask the user for input
                System.out.print("Enter a number (1-10): ");
                int num = scanner.nextInt();

                // Check if input is valid
                if (num < 1 || num > 10) {
                    System.out.println("Invalid input! Please enter a number between 1 and 10.");
                    return;
                }

                // Calculate factorial
                int factorial = 1;
                for (int i = 1; i <= num; i++) {
                    factorial *= i;
                }

                // Output the result
                System.out.println("Factorial of " + num + " is: " + factorial);

                scanner.close();
            }
        }


