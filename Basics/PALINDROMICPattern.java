public class PalindromicPattern {

    public static void main(String args[]) {
    
        int n = 5;
        
        // Loop to iterate over the rows
        for (int i = 1; i <= n; i++) {
            
            // Print leading spaces
            System.out.print("  ".repeat(n - i));
            
            // Print the first half of the pattern (decreasing numbers)
            for (int j = i; j >= 1; j--) {
                System.out.print(" " + j);
            }
            
            // Print the second half of the pattern (increasing numbers)
            for (int j = 2; j <= i; j++) {
                System.out.print(" " + j);
            }
            
            System.out.println();
        }
    }
}
