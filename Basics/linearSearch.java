import java.util.*;

public class linearSearch {

    static Scanner sc = new Scanner(System.in);

    // Method to input an array
    public static int[] inputArray(int size) {
        int arr[] = new int[size];
        System.out.println("Enter " + size + " numbers to populate the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // Optimized linear search method
    public static void linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("Element found at index: " + i + " (value: " + array[i] + ")");
                return; // Exit the method as soon as the key is found
            }
        }
        System.out.println("Element not found in the array.");
    }

    public static void main(String[] args) {
        int[] arr = inputArray(10); // Create an array of size 10
        System.out.print("Enter the number to search for: ");
        int key = sc.nextInt(); // Input the key to search
        linearSearch(arr, key); // Perform linear search
    }
}
