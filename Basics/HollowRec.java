public class HollowRec {

	public static void main(String args[]){
	
		int col = 5;
		int rows = 4;
		
		// loop to iterate over the rows
		for(int i = 1; i <= rows; i++){
			
			//loop to iterate over the columns
			for(int j = 1; j <= col; j++){
				if(i == 1 || i == rows || j == 1 || j == col){
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		/*
		
		Optimised Approach
		
		public class HollowRectangle {

   	 public static void main(String[] args) {

        int columns = 5;
        int rows = 4;

        // Construct the first and last rows
        String fullRow = "* ".repeat(columns);

        // Construct the middle row
        String middleRow = "* " + "  ".repeat(columns - 2) + "*";

        // Print the rows
        for (int i = 1; i <= rows; i++) {
            if (i == 1 || i == rows) {
                System.out.println(fullRow);
            } else {
                System.out.println(middleRow);
            }
        }
    }
}

		*/	
	}
}