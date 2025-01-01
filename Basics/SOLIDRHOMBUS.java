public class SolidRhombus {

    public static void main(String[] args) {

        int n = 4;

        // Upper half of the rhombus
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        // Lower half of the rhombus
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        
        /*
        public class SolidRhombus {

    public static void main(String[] args) {

        int n = 4;

        // Upper half of the rhombus
        for (int i = 1; i <= n; i++) {
            String s = "  ".repeat(n - i) + " *".repeat(n);
            System.out.println(s);
        }

        // Lower half of the rhombus
        for (int i = n - 1; i >= 1; i--) {
            String s = "  ".repeat(n - i) + " *".repeat(n);
            System.out.println(s);
        }
    }
}

        */
    }
}
