import java.util.*;

public class iou {

    static Scanner sc = new Scanner(System.in); // Corrected "Static" to "static"

    public static int[] inputArray() {
        int arr[] = new int[10]; // Array of size 10
        System.out.println("You need to input 10 numbers to populate the array:");

        for (int i = 0; i < arr.length; i++) { // Use i < arr.length
            System.out.print("Please type your number to add it to the array: ");
            arr[i] = sc.nextInt(); // Read input
        }

        System.out.println("Your elements have been successfully added.");
        return arr;
    }

    public static void outputArray(int array[]) {
        System.out.print("Your array elements are: "); // Print once outside the loop
        for (int i = 0; i < array.length; i++) { // Use i < array.length
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Add a new line after printing all elements
    }

    public static void main(String args[]) {
        int arr[] = inputArray(); // Input array
        outputArray(arr); // Output array
    }
}
