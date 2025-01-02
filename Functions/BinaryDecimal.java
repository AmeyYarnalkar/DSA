import java.util.Scanner;

public class BinaryDecimal {

    static Scanner sc = new Scanner(System.in);

    // Method to take user input
    public static int userInput(String prompt) {
        System.out.println(prompt);
        return sc.nextInt();
    }

    // Method to convert binary to decimal
    public static void BtoD(int num) {
        int digit;
        int decimal = 0;
        int counter = 0;

        while (num != 0) {
            digit = num % 10; // Extract the last digit
            if (digit != 0 && digit != 1) {
                System.out.println("Invalid binary number. Please enter a valid binary number.");
                return;
            }
            decimal += digit * (int) Math.pow(2, counter); // Calculate the decimal value
            num /= 10; // Remove the last digit
            counter++;
        }

        System.out.println("The decimal equivalent is: " + decimal);
    }

    // Method to convert decimal to binary
    public static void DtoB(int num) {
        if (num < 0) {
            System.out.println("Invalid number. Please enter a non-negative integer.");
            return;
        }

        int binary = 0;
        int factor = 1;

        while (num != 0) {
            int remainder = num % 2; // Get the remainder when dividing by 2
            binary += remainder * factor; // Append the remainder at the correct position
            factor *= 10; // Move to the next position in the binary representation
            num /= 2; // Divide the number by 2
        }

        System.out.println("The binary equivalent is: " + binary);
    }

    public static void main(String[] args) {
        System.out.println("Choose an option:");
        System.out.println("1. Convert Binary to Decimal");
        System.out.println("2. Convert Decimal to Binary");
        int choice = sc.nextInt();

        if (choice == 1) {
            int binaryNumber = userInput("Enter the binary number:");
            BtoD(binaryNumber);
        } else if (choice == 2) {
            int decimalNumber = userInput("Enter the decimal number:");
            DtoB(decimalNumber);
        } else {
            System.out.println("Invalid choice. Please choose either 1 or 2.");
        }
    }
}
