package JonathanArray;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		double[] arr = {2, 3, 4, 6, 9, 11, 12, 15};
		//swap(arr, 0, arr.length-1);
		//shuffle(arr);
		//print(arr);
//		if(checkHalfway(arr, 12, 0, arr.length - 1))
//		{System.out.println("The number you are looking for is"
//				+ "less than the value in the middle of the array.");
//		}else{
//			System.out.println("The number you are looking for is "
//					+ "greater than or equal to the value in the middle of "
//					+ "the array.");
//		}
//		countUnderBound(arr, 4);
//		int[] array = {3, 9, 6, 11, 14, 16, 3, 6, 7, 10, 14, 25, 31, 13, 24, 3, 6, 9 ,11, 3, 9, 6 , 11};
//		int[] subArr = getSubArray(array, 19, 22);
//		System.out.println(Arrays.toString(subArr) + "");
//		contains(array, subArr);
		int[] array = new int[50];
		testPrimes(50);
	}

	/**
	 * return an array containing elements from
	 * startIndex to endIndex(inclusive)
	 * @param arr
	 * @param startIndex
	 * @param endIndex
	 * @return
	 */
	public static int[] getSubArray(int[] arr, int startIndex, int endIndex){
		int[] subArray = new int[endIndex - startIndex +1];
		for(int i = 0; i < subArray.length; i++){
			subArray[i] = arr[startIndex + i];
		}
		return subArray;
	}
	
	/**
	 * returns true if arr contains subArray sequence
	 * @param arr
	 * @param subArray
	 * @return
	 */
	public static boolean contains(int[] arr, int[] subArray){
		for(int i = 0 ; i < arr.length; i++){
				//for(int index = 0; index < subArray.length; index++){
				int index = i;
				while(index < subArray.length){
					if(subArray[index] == arr[index + i] && index == subArray.length - 1){
						System.out.println("Found a match at index " + i);
						return true;
					}else if(subArray[index] != arr[i+ index]){
						System.out.println("No match at " + i);
						break;
					}
					index++;
				}
				//}
			}
		return false;
	}
		
	
	private static void testPrimes(int numberToTest){
		int lastToCheck = (int)(Math.sqrt(numberToTest));
		//boolean[] theNumbers = new boolean[numberToTest];
//		for(int i = 0; i < numberToTest; i++){
//			theNumbers[i] = true;
//		}
//		theNumbers[0] = false;
//		theNumbers[1] = false;
//		int increment = 2;
//		boolean first = true;
//		for(int test = 2; test < numberToTest/2; test =test + increment){
//			if(!first){
//				theNumbers[test] = false;
//			}
//			else{
//				first = false;
//			}
//			if(numberToTest % (test + 1) == 0 || numberToTest % (test + 3) == 0 ){
//				theNumbers[test] = false;
//			}
//		}
		String primes = "";
		for(int index = 0; index <= numberToTest; index ++){
			int theNumbers = 0;
			for(int j = index; j >= 1; j--){
				if(index % j == 0){
					theNumbers = theNumbers + 1;
				}
			}
			if(theNumbers == 2){
				primes = primes + index + " ";
			}
		}
		System.out.println(primes + "is prime.");
//		for(int index = 0; index < theNumbers.length; index++){
//			if(theNumbers[index]){
//				System.out.println(index + " is prime.");
//			}
//		}
	}
	
	public static void populateRandomArray(int[] arr){
		int[] randArr = new int[arr.length - 1];
		for(int i = 0; i < arr.length; i ++){
			int toAdd = arr[(int)Math.random() * arr.length];
			while(indexOf(randArr,toAdd) > -1){
				toAdd = arr[(int)Math.random() * arr.length];
			}
			randArr[i] = toAdd;
		}
	}
	
	private static int indexOf(int[] arr, int toFind){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == toFind){
				return i;
			}
			return -1;
		}
		return 0;
	}
	
	//returns number of elements in arr less than d
	public static int countUnderBound(double[] arr, double d){
		int underBound = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < d ){
				underBound++;
			}
		}
		System.out.println(underBound);
		return underBound;
	}
	
	public static void cycleThrough(int[] arr, int n){
		for(int i = 0; i < arr.length; i++){
			cycleOnce(arr);
		}
	}
	
	private static void cycleOnce(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			if(i == 0){
				swap(arr,arr[i], arr[arr.length]);
			}
			swap(arr, arr[i], arr[i + 1]);
		}
	}

	private static void shuffle(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			int random = (int) (Math.random() * arr.length);
			swap(arr,i,random);
		}
		
	}

	public static void selectionSort(int[] array){
		System.out.println("Selection sort with "+Arrays.toString(array));
		for (int i = 0; i < array.length - 1; i++){
		    int tempLowIndex = i;
		    for (int j = i + 1; j < array.length; j++){
		        if (array[j] < array[tempLowIndex]){
		            tempLowIndex = j;
		        }
		    }
		   if(tempLowIndex!=i){
		         swap(array, tempLowIndex, i);
		         System.out.println("becomes "+Arrays.toString(array));
		   } 
		   }//end for
		System.out.println("Ends as "+Arrays.toString(array));
	}
	private static void print(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]+", ");
		}
		System.out.println(arr[arr.length - 1]);
	}
	private static void swap(int[] arr, int i, int j) {
		 int placeholder = arr[j];
		 arr[j] = arr[i];
		 arr[i] = placeholder;
	}

	/**
	 * returns true if searchValue is less than element 
	 * halfway between beginning and end  
	 * @param arr
	 * @param i
	 * @param j
	 * @param length
	 */
	
	private static boolean checkHalfway(int[] arr, int searchValue, int begin, int end) {
		return searchValue < arr[(begin + end + 1)/2];
	}
	
	//(int)((arr.length/2)-1)
	//(int)(arr.length/2)

}
