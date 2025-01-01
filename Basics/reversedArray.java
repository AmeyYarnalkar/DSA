public class reversedArray {

    // Method to reverse the array in place
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move towards the center
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60};

        // Reverse the array in place
        reverseArray(array);

        // Print the reversed array
        System.out.print("Your reversed array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
