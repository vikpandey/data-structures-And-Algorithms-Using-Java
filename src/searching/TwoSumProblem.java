package searching;

import java.util.Arrays;

public class TwoSumProblem {

	public static void main(String[] args) {
		
		int[] arr = {7, 9, 4, 22, 19, 23, 44, 21};
		int k = 41;
		
		twoSum(arr, k);
	}
	
	public static void twoSum(int[] arr, int k) {
		int  temp;
		Arrays.sort(arr);
		for(int i = 0, j = arr.length -1; i < j; i++) {
			temp = arr[i] + arr[j];
			if(temp == k) {
				System.out.println("item found:- i: " + i + " j:" + j );
				break;
			}
			else if(temp < k) {
				i = i+1;
			}
			else {
				j = j-1;
			}
		}
		
		return;
	}
	
	

}
