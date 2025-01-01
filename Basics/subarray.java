public class subarray {

    // Method to print all unique pairs
    public static void subarray(int[] array) {

        // Loop to print the pairs
        for (int i = 0; i < array.length; i++) { // This is for the first element of the pair
            for (int j = i + 1; j < array.length; j++) { // This is for the second element of the pair
                System.out.print("(" + array[i] + "," + array[j] + ") ");
            }
        }
    }

    public static void main(String[] args) {
        // Sample array to test the function
        int[] array = {1, 2, 3, 4};

        // Call the subarray function to print pairs
        subarray(array);
    }
}
