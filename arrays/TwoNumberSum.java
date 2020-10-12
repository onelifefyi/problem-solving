/* Problem:
Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum. If any two numbers in the input array sum up to the
target sum, the function should return them in an array, in sorted order. If no two numbers sum up to the target sum, the function should return an empty array.
Assume that there will be at most one pair of numbers summing up to the target sum.
*/

/* Approach:  
    > The most naive approach is to take each element and compare it's sum with rest of the array,
      time O(n^2), auxilary space O(1)
    
    > Two pointer approach: first we sort the array, then keep one pointer 'left' at start and one pointer 'right' at end,
      now while left is less than right, if sum is smaller than the sum of left and right pointer's value's sum append left pointer by 1
      else decrement right pointer by one time: sorting O(nlog(n)) + O(n) traversal: time O(nlogn), extra space O(1)

    > One other way that I can think of is to create a hash set, and for each element in array check if (sum-element) is already present,
      if present that means two sum possible, else add that element to array, time O(n), space O(n) for hashset (I'll implement this)
*/

import java.util.Arrays;
import java.util.HashSet;

public class TwoNumberSum{

    // public static int[] getTwoSum(int[] arr, int sum){
    //     int[] result = new int[2];
    //     int[] emptyArr = {};
    //     boolean foundSum = false;
    //     HashSet<Integer> hSet = new HashSet<Integer>();
    //     for(int ele: arr){
    //         if(hSet.contains(sum-ele)){
    //             result[0] = Math.min(ele, sum-ele);
    //             result[1] = Math.max(ele, sum-ele);
    //             foundSum = true;
    //             break;
    //         }
    //         else hSet.add(ele);
    //     }
    //     if(foundSum) return result;
    //     else return emptyArr;
    // }

    public static int[] getTwoSum(int[] arr, int sum){
        int[] result = new int[2];
        int[] emptyArr = {};
        boolean foundSum = false;
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            if(arr[left] + arr[right] == sum){
                result[0] = arr[left];
                result[1] = arr[right];
                return result;
            }
            if(arr[left] + arr[right] > sum){
                right--;
            }
            else left++;
        }
        return emptyArr;
    }

    public static void main(String[] args) {
        int arr[] = {3,5,-4,8,11,1,-1,6};
        int sum = 13;
        int[] result = getTwoSum(arr, sum);
        System.out.println(Arrays.toString(result));
    }
}