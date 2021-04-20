/* 
Problem: Given an array arr[] and a number K where K is smaller than size of array, 
         the task is to find the Kth smallest element in the given array. 
         It is given that all array elements are distinct.
         https://practice.geeksforgeeks.org/problems/kth-smallest-element/0

Approach:
>   The simplest approach that I can think of is to first sort the array and return (k-1)th element from beginning
    O(nlogn) time | O(1) auxilary space

*/

import java.util.Arrays;
class KthMin{

    public static int getMinMax(int[] input, int k){
        Arrays.sort(input);
        return input[k-1];
    }

    public static void main(String[] args) {
        int[] input = {3, 14, 47, 58, 61, 64, 75};
        int k = 5;
        System.out.print(getMinMax(input, k));
    }
}