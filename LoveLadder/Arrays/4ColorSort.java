// NOT SOLVED YET!!!!! DAMN!!!!!
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
    now everytime a zero is encountered swap it with left and if 2 is encountered swap it with right

*/

import java.util.Arrays;
class ColorSort {

    public static int[] sortArray(int[] input){
        int zeroPtr = 0;
        int twoPtr = input.length-1;
        int currentPtr = 1;
        while(currentPtr < twoPtr){
            System.out.println("Current Pointer: " + currentPtr);
            if(input[currentPtr] == 0){
                input[currentPtr] = input[zeroPtr];
                input[zeroPtr] = 0;
                zeroPtr++;
                currentPtr--;
            }
            else if(input[currentPtr] == 2){
                input[currentPtr] = input[twoPtr];
                input[twoPtr] = 2;
                twoPtr--;
                currentPtr--;
            }
            else currentPtr++;
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = {0,2,1,2,0};
        input = sortArray(input);
        System.out.println(Arrays.toString(input));
    }
}
