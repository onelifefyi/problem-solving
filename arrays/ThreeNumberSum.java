/*
Problem: 
> Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum. The function should nd all triplets in the array that
sum up to the target sum and return a two-dimensional array of all these triplets.

Approach:
> Simplest O(n^3) for iterating for each triplet possible.
> We can have hashset + all pairs possible O(n^2) time + extra space O(n)
> One other approach will be to iterate through the entire array after sorting it, 
  and for each number do a two sum search time O(nlogn + n^2): O(n^2) time and extra space O(n) <implemented below>
*/             

import java.util.Arrays;
import java.util.ArrayList;
public class ThreeNumberSum {

    public static ArrayList<int[]> getThreeSum(int[] input, int sum){
        Arrays.sort(input);
        ArrayList<int[]> result = new ArrayList<int[]>();
        for(int current=0; current<input.length-1; current++){
            int left = current+1;
            int right = input.length - 1;
            boolean tripletFound = false;
            while(left < right){
                int currentSum = input[current] + input[left] + input[right];
                if(currentSum == sum) tripletFound = true;
                else if(currentSum < sum) left++;
                else right--;
                if(tripletFound){
                    tripletFound = false;
                    result.add(new int[]{input[current], input[left], input[right]});
                    left++;
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {12, 3, 1, 2, -6, 5, -8, 6};
        int sum = 0;
        ArrayList<int[]> result = getThreeSum(input, sum);
        for(int[] triplet: result) System.out.println(Arrays.toString(triplet));
    }
}
