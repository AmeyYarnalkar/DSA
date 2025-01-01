public class Butterfly {

    public static void main(String args[]) {

        int n = 4;

        // First half of the butterfly
        for (int i = 1; i <= n; i++) {

            // Loop to print the first stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }

            // Loop to print the spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // Loop to print the last stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        // Second half of the butterfly (reversed)
        for (int i = n ; i >= 1; i--) {

            // Loop to print the first stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }

            // Loop to print the spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // Loop to print the last stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
