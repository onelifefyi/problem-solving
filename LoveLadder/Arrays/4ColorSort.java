// NOT SOLVED YET!!!!! DAMN!!!!!
// Solved now, remember to not increment mid while swapping with 2;
/* 
Problem: Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.
         https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0

Approach:
>   The simplest approach is to simply sort the array.
    O(nlogn) time | O(n) space

>   We can traverse through the array and store the no of 0s, 1s and 2s in 3 variables,
    after that on another sweep, fill the array according to count stored in those variables
    O(n) time | O(1) auxilary space

>   If we want to do it in a single pass or the input is considered as continous stream,
    we can have two pointers (in addition to current) on left end and right end of array,
    now everytime a zero is encountered swap it with left and increment both current and left,
    and if 2 is encountered swap it with right keeping current on same position

*/

import java.util.Arrays;
class ColorSort {

    public static int[] sortArray(int[] input){
        int low, mid, high;
        low = mid = 0;
        high = input.length-1;
        while(mid < high){
            if(input[mid] == 0){
                input[mid] = input[low];
                input[low] = 0;
                low++;
                mid++;
            }
            else if(input[mid] == 2){
                input[mid] = input[high];
                input[high] = 2;
                high--;
            }
            else mid++;
        }

        return input;
    }

    public static void main(String[] args) {
        int[] input = {0,0,1,2,1,1,2,2};
        input = sortArray(input);
        System.out.println(Arrays.toString(input));
    }
}
