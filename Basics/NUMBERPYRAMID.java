public class NumberPyramid {

    public static void main(String args[]) {
    
        int n = 5;
        for (int i = 1; i <= n; i++) {
            
            // spaces loop
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Number printing
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(" " + i);
            }
            System.out.println();            
        }
    }
}
