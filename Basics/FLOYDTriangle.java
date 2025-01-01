public class FLOYDTriangle {

    public static void main(String[] args) {

        int n = 4;
        int counter = 1;

        // Loop through rows
        for (int i = 1; i <= n; i++) {

            // Loop through columns
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + counter);
                counter++;
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
