package allprogram;

import java.util.Scanner;

public class Calculatarprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input numbers from the user
        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();

        // Taking input for the operation
        System.out.println("Select the operation:");
        System.out.println("1 : + (Addition)");
        System.out.println("2 : - (Subtraction)");
        System.out.println("3 : * (Multiplication)");
        System.out.println("4 : / (Division)");
        System.out.println("5 : % (Modulo or remainder)");
        System.out.print("Enter the operation number: ");
        int operation = scanner.nextInt();

        double result = 0;

        // Performing the selected operation
        switch (operation) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            case 5:
                result = a % b;
                break;
            default:
                System.out.println("Error: Invalid operation!");
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
