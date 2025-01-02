import java.util.Scanner;
import java.math.BigInteger;

public class function1 {

    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static void calculateProduct(int a, int b) {
        System.out.println("The product is: " + (a * b));
    }

    public static void calculateFactorial(int a) {
        if (a < 0) {
            System.out.println("Factorial is undefined for negative numbers.");
            return;
        }
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= a; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("The factorial of " + a + " is: " + factorial);
    }

    public static void isPrime(int a) {
        if (a < 2) {
            System.out.println("The given number is " + (a == 1 ? "neither prime nor composite." : "negative, try once again."));
            return;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                System.out.println("Given number is not prime.");
                return;
            }
        }
        System.out.println("Given number is prime.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Hello World
        printHelloWorld();

        // Product
        System.out.print("Enter two numbers for product: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        calculateProduct(num1, num2);

        // Factorial
        System.out.print("Enter a number to calculate factorial: ");
        int factNum = sc.nextInt();
        calculateFactorial(factNum);

        // Prime Check
        System.out.print("Enter a number to check if it's prime: ");
        int primeNum = sc.nextInt();
        isPrime(primeNum);

        sc.close();
    }
}
