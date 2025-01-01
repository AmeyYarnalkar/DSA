public class pattern3{

	public static void main(String args[]){
	
		//loop to print the pattern
		int n = 4;
		
		//loop to handle the rows
		for(int i = 0; i < n; i++){
		
			//loop to print the star
			for(int j = 1; j <= i; j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
