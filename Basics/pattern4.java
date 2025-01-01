public class pattern4 {

	public static void main(String args[]){
	
		char letter = 'A'; // this letter defines in the unicode so that it can be incremented
	
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(" " + letter);
				letter++;	
			}
			System.out.println();
		}
	}
}