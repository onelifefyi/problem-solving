/*
Problem: https://www.geeksforgeeks.org/smallest-difference-pair-values-two-unsorted-arrays/

Approach:
> The most naive approach would be to find the difference for each pair and return elements providing min difference O(nm) time
> The other way that i can think of is to first merge both the array and sort it, after that keep elements of 1 array in hashset,
  now traverse throught the merged array calculating min related to ith and i+1th element, whenever min is found verify that i and i+1th
  are not in the same array using hash set. time(O(nlogn + mLogm + n + m) => O(nlogn + mlogm)) and space(O(min(n,m) + (n + m) => O(n+m)) Not so cool!!
> Now, I saw the solution to get the following approach, first sort both the arrays and then keep two pointers at start of both array, 
  if we find equal element return it and end else keep incrementing either one of those pointers each time trying to decrease the difference.
  Update the result if new minimum difference is found. time(O(nlogn + mlongm + n + m)) = O(nlogn + mlogm) time, extra space O(1)
*/

import java.util.Arrays;

public class SmallestDifference {

    public static int[] getPair(int[] inputA, int[] inputB){
        Arrays.sort(inputA);
        Arrays.sort(inputB);
        int[] result = {inputA[0], inputB[0]};
        int difference = Integer.MAX_VALUE;
        int aPointer = 0;
        int bPointer = 0;
        while(aPointer < inputA.length && bPointer < inputB.length){
            //System.out.printf("Checking %d and %d\n", inputA[aPointer], inputB[bPointer]);
            int currentDifference = Math.abs(inputA[aPointer] - inputB[bPointer]);
            if(currentDifference == 0){
                result[0] = result[1] = inputA[aPointer];
                return result;
            }
            else if(currentDifference < difference){
                //System.out.printf("Updating for %d and %d\n", inputA[aPointer], inputB[bPointer]);
                result[0] = inputA[aPointer]; result[1] = inputB[bPointer];
                difference = currentDifference;
            }
            if(inputA[aPointer] < inputB[bPointer]) aPointer++;
            else bPointer++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] inputA = {-1,5,10,20,28,3};
        int[] inputB = {26,134,135,15,27};
        System.out.println(Arrays.toString(getPair(inputA, inputB)));
    }
}
