public class binarySearch {

    public static int binarySearch(int array[], int key) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2; // Calculate the middle index

            // Check if the key is at the middle
            if (array[middle] == key) {
                return middle; // Key found at the middle
            } 
            // If the key is smaller than the middle element, search the left half
            else if (key < array[middle]) {
                end = middle - 1;
            } 
            // If the key is greater than the middle element, search the right half
            else {
                start = middle + 1;
            }
        }

        // If the key is not found
        return -1;
    }

    public static void main(String args[]) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 4;

        int result = binarySearch(array, key);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
