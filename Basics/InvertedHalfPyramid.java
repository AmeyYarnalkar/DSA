public class InvertedHalfPyramid {

	public static void printStar() {
		System.out.print(" *");
	}
	
	public static void printSpace() {
		System.out.print("  ");
	}

	public static void main(String args[]){
		
		int square = 4;
		
		//loop to handle row iterations
		for(int i = 1; i <= square; i++){
			
			//loop to print the spaces
			for(int j = 1; j <= square - i; j++){
				printSpace();
			}
			
			//loop to print the stars
			for(int j = 1; j <= i;j++){
				printStar();
			}
			System.out.println();
		}
		
		/*
		public class InvertedHalfPyramid {

    public static void main(String[] args) {
        int square = 4;

        for (int i = 1; i <= square; i++) {
            // Construct spaces and stars in a single step
            String spaces = "  ".repeat(square - i);
            String stars = " *".repeat(i);

            // Print the row
            System.out.println(spaces + stars);
        }
    }
}

		*/
	}
	
}