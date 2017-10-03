import java.util.Arrays;//to use Arrays class
public class ArrayClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {1,4,2,7,9,4,57,14,20,21,3};
		System.out.println("The array is: "+ Arrays.toString(arr));
		Arrays.sort(arr);
		//to sort a specified range in an array: 
		// Arrays.sort(arr,0,4);
		System.out.println("\nAfter sorting: "+Arrays.toString(arr));/*to print the elements in a single
		line, the array is converted to a string using toString() */
		//binary search class
		int index = Arrays.binarySearch(arr,7);/*if the number is present, it returns
		the index of the number, else returns a negative value*/
		System.out.println("\nBinary Search");
		if(index>0)
			System.out.println("The number is present in " +(index+1) +" position" );
		else
			System.out.println("The number is not present");
		//copyOf and copyOfRange class
		System.out.println("\nCopy Class: ");
		int[] Array = Arrays.copyOf(arr, arr.length);//to copy the whole string
		System.out.println("The copied array is: "+ Arrays.toString(Array));
		int[] Array1= Arrays.copyOfRange(Array, 2, 7);//to copy a specified range from an array
		System.out.println("\nThe copied subArray is:"+ Arrays.toString(Array1));
	}

}
