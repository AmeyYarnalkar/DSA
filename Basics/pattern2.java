public class pattern2{

	public static void main(String args[]){
	
		//loop to print the pattern
		int n = 4;
		
		//loop to handle the rows
		for(int i = 0; i < n; i++){
		
			//loop to print the star
			for(int j = 1; j < (n + 1) - i; j++){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}