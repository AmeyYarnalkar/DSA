import java.util.*;
public class largest{

	public static int getLargest(int array[]){
		int largest = Integer.MIN_VALUE;
		
		for(int i = 0; i < array.length;i++){
			if (array[i] > largest){
			largest = array[i];
			}
		}
		return largest;
	}
	public static void main(String args[]){
	
	int array[] = {22,33,45,67,1,99,100};
	System.out.print("The largest number in the array is: " + getLargest(array));
	}
}