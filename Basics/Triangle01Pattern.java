public class Triangle01Pattern {

    public static void main(String[] args) {

        int n = 4;

        // Loop through rows
        for (int i = 1; i <= n; i++) {

            // Start with '1' for odd rows and '0' for even rows
            int digit = (i % 2 == 0) ? 0 : 1;

            // Loop to print the numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + digit);
                // Alternate between 0 and 1
                digit = 1 - digit;
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
