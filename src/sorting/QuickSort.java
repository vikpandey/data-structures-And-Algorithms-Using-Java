package sorting;

import java.util.Arrays;

/**
 * 
 * @author vikas
 * 
 * In quick sort we need to 
 *
 */

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = {8, 20, 31, 16, 9, 5, 49,29};
		int startIndex = 0;
		int endIndex = arr.length - 1;
		
		
		quickSort(arr, startIndex, endIndex);
		
		System.out.println("sorted Array");
		printArray(arr);
}
	
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void quickSort(int[] arr, int startIndex, int endIndex) {
		
		
		
		if(startIndex >= endIndex) {
			return;
		}
		
		
		
		//if(startIndex < endIndex) {
	
		int partitionIndex = partition(arr, startIndex, endIndex);
		quickSort(arr, startIndex, partitionIndex-1);
		quickSort(arr, partitionIndex+1, endIndex);
		
		//}
	}
	
	public static int partition(int[] arr, int startIndex, int endIndex) {
		
		int pivot = (int) findPivot(arr, startIndex, endIndex);
		int pIndex = startIndex;
		
		for(int i = startIndex; i < pivot; i++) {
			if(arr[i] < arr[pivot]) {
				
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
				/*
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				*/
			}
		}
		
		/*
		 * Swap the value of partition index to the value at the 
		 * end of the array. Then return the index of partition array.
		 */
		int temp = arr[pIndex];
		arr[pIndex] = arr[pivot];
		arr[pivot] = temp;
		
		return pIndex;
	}
	
	public static Integer findPivot(int[] arr, int start, int end) {
		if(arr.length < 1) {
			return null;
		}
		
		int max = arr[0];
		
		for(int i = start; i < end; i++) {
			if(arr[i] < arr[i+1]) {
				max = arr[i+1];
			}
		}
		return max/2;
	}
}
