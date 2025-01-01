public class pattern1 {

	public static void main(String args[]){
	
		//loop to print the pattern type 1
		int n = 4;
	
		// loop for each row
		for(int i = 0; i < n; i++){
			
			//loop to print stars
			for(int j = 0; j <= i;j++){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}