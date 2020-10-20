/*
Problem:    Write a program to reverse an array or string
            https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/

Approach:
>   The simplest approach is to create another array of same size and iterate through the first array,
    filling the second in reverse.
    O(n) time | O(n) auxilary space

>   We can take two pointers at each end of the array, finally close in from both sides towards middle,
    swapping elements at each step. <Implemented below>
    O(n) time | O(1) auxilary space
*/

import java.util.Arrays;
class ReverseArray{

    static int[] getReverse(int[] input){
        int leftPtr = 0;
        int rightPtr = input.length - 1;
        while(leftPtr < rightPtr){
            int temp = input[leftPtr];
            input[leftPtr] = input[rightPtr];
            input[rightPtr] = temp;
            leftPtr++;
            rightPtr--;
        }
        return input;
    }

    public static void main(String[] args){
        int[] input = {3, 14, 47, 58, 61, 64, 75};
        input = getReverse(input);
        System.out.println(Arrays.toString(input));
    }
}