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
		countUnderBound(arr, 4);
		int[] array = {3, 9, 6, 11, 14, 16, 3, 6, 7, 10, 14, 25, 31, 13, 24, 3, 6, 9 ,11, 3, 9, 6 , 11};
		int[] subArr = getSubArray(array, 2, 4);
		System.out.println(Arrays.toString(subArr) + "");
		contains(array, subArr);
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
					if(subArray[index] == arr[index + 1]){
						return true;
					}else if(subArray[index] != arr[i+ index]){
						break;
					}
					index++;
				}
				//}
			}
		return false;
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
