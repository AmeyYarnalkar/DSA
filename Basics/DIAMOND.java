public class DIAMOND {

	public static void main(String args[]){
	
		int n = 5;
		
		//first Half
		
		// loop to iterate over rows
		for(int i = 1; i <= n; i++){
		
			// loop to print the spaces
			for(int j = 1; j <= n - i; j++){
				System.out.print("  ");
			}
			
			//loop to print the star
			for(int j = 1; j <= (2*i) - 1; j++){
				System.out.print(" *");
			}
			System.out.println();
		}
		
		//second Half
		
		// loop to iterate over rows
		for(int i = n; i >= 1; i--){
		
			// loop to print the spaces
			for(int j = 1; j <= n - i; j++){
				System.out.print("  ");
			}
			
			//loop to print the star
			for(int j = 1; j <= (2*i) - 1; j++){
				System.out.print(" *");
			}
			System.out.println();
		}

	}
}