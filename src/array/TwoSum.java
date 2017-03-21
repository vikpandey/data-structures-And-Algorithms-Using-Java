package array;

/**
 * Created by vikas on 11/9/16.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * In this code, I am trying to get the index of the two numbers whose sum is equal to target number.
 */

public class TwoSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the array size");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("enter the values in array");
        for(int i = 0; i < size; i++) {
            try {
                nums[i] = br.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("enter the target number");
        int target = sc.nextInt();
        System.out.println("so the indices are: ");
        int[] f1 = new int[2];
        f1 = twoSumValue(nums, target);
        for(int i = 0; i < f1.length; i++) {
            System.out.println(f1[i] + " ");
        }
        //System.out.println(twoSumValue(nums, target));
    }

    public static int[] twoSumValue(int[] num, int target) {

        int[] nums1 = num.clone();
        Arrays.sort(num);
        int leftMost = 0;
        int rightMost = num.length -1;
        int firstNumber = 0;
        int secondNumber = 0;

        while(leftMost < rightMost) {

            if(num[leftMost] + num[rightMost] == target) {
                firstNumber = num[leftMost];
                secondNumber = num[rightMost];
                break;
            }
            else if(num[leftMost] + num[rightMost] > target) {
                rightMost--;
            }
            else {
                leftMost--;
            }
        }

        int firstValue = 0;
        int secondValue = 0;

        for(int i = 0; i < num.length; i++) {
            if(nums1[i] == firstNumber) {
                firstValue = i;
                break;
            }
        }
        for(int j = num.length-1; j >= 0; j--) {
            if(nums1[j] == secondNumber) {
                secondValue = j;
                break;
            }
        }
        int[] result = new int[2];
        result[0] = firstValue;
        result[1] = secondValue;

        return result;
    }
}
