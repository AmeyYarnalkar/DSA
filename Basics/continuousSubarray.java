public class continuousSubarray {

    // Function to print continuous subarrays
    public static void subarray(int[] array) {

        // Loop for the start index of the subarray
        for (int i = 0; i < array.length; i++) {

            // Loop for the end index of the subarray
            for (int j = i; j < array.length; j++) {

                // Print subarray from index i to j
                System.out.print("(");
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k]);
                    if (k < j) System.out.print(", "); // Format for better readability
                }
                System.out.print(") ");
            }
        }
    }

    public static void main(String[] args) {

        // Sample array to test the function
        int[] array = {1, 2, 3};

        // Call the subarray function to print all subarrays
        subarray(array);
    }
}
