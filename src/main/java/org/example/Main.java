package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Factorial");
            System.out.println("2. Power");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Square Root");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to find factorial: ");
                    int num1 = scanner.nextInt();
                    System.out.println("Factorial of " + num1 + " is: " + factorial(num1));
                    break;
                case 2:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exponent));
                    break;
                case 3:
                    System.out.print("Enter a number to find natural logarithm: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Natural logarithm of " + num2 + " is: " + Math.log(num2));
                    break;
                case 4:
                    System.out.print("Enter a number to find square root: ");
                    double num3 = scanner.nextDouble();
                    System.out.println("Square root of " + num3 + " is: " + Math.sqrt(num3));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
