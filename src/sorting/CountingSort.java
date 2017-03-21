package sorting;

public class CountingSort {

	public static void main(String[] args) {
		
		//int[] inputArray = {7,3,1,3,0,7,8,5,8,0,9};
		int[] inputArray = {1,1,2,2,3,4,2,4,2,3,4};
		int[] outputArray = new int[inputArray.length];
		//int k = 10;
		int k = 5;
		int[] result =  countingArray(inputArray, outputArray, k);
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public static int[] countingArray(int[] inputArray, int[] outputArray, int k) {
		
		int[] count = new int[k];
		
		for(int i = 0; i < k; i++) {
			count[i] = 0;
		}
		
		for(int j = 1; j < inputArray.length; j++) {
			count[inputArray[j]] = count[inputArray[j]] + 1;
		}
		
		for(int i = 1; i < k; i++) {
			count[i] = count[i] + count[i-1];
		}
		
	//	for(int j = inputArray.length; j >= 1; j--) {
		for(int j = 1; j < inputArray.length; j++) {
			outputArray[count[inputArray[j]]-1] = inputArray[j];
			//count[inputArray[j]] = count[inputArray[j]] - 1;
			count[inputArray[j]]--;
		}
		return outputArray;
	}
}
