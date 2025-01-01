public class arrayCreation {

	public static void main(String args[]){
	
		//array creation type 1
		
		int array1[] = new int[50]; // here datype is mentioned to assign the size to each element, new keyword is used because it helps to find new memory location in the stack memory, right ?
		System.out.println("Array created by using new keyword.");
		
		//array creation type 2
		
		int array2[] = {1,2,3,4,5,6,7,8,9}; // here array is directly created by using the array elements, it automatically assigns the size.
		System.out.println("Array created using array elements");
		
		// my question is if array has size what will happen if append one extra element in array?
		 
	}
}