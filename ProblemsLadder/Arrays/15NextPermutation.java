/*
Problem: 
https://leetcode.com/problems/next-permutation/
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

Approach:
>   Simplest approach is to find all the possible permutations of the given array, sort it and finally return the next element,
    time O(n!) | auxillary space O(n)

>   An efficient way:
    From the end of the array start traversing to find the index of first element less than previous element - index1
    Now again from the end of the array find the index of element greater than the element at index1 - index2
    Now swap both the elements and finally reverse the elements from index1+1 position till the end
    time O(n) + O(n) + O(n) === O(n) | auxillary space O(1) 

*/

import java.util.Arrays;
class NextPermutation{

    public static int[] swap(int[] input, int index1, int index2){
        int temp = input[index1];
        input[index1] = input[index2];
        input[index2] = temp;
        return input;
    }

    public static int[] reverse(int[] input, int start, int end){
        int temp = 0;
        for(int i=start; i<=(start+end)/2; i++){
            temp = input[i];
            input[i] = input[end-(i-start)];
            input[end-(i-start)] = temp;
        }
        return input;
    }

    public static int[] next(int[] input){
        int index1,index2;
        index1 = index2 = input.length-1;
        while(index1 > 0){
            if(input[index1-1] < input[index1]){
                index1--;
                break;
            }
            index1--;
        }
        if(index1 > 0){
            while(index2 > 0){
                if(input[index2] > input[index1]) break;
                index2--;
            }
            input = swap(input, index1, index2);
        }
        else index1--;
        input = reverse(input, index1+1, input.length-1);
        return input;
    }

    public static void main(String[] args){
        //int[] input = {1,2,3};
        //int[] input = {3,2,1};
        int[] input = {1,1,6};
        System.out.println(Arrays.toString(next(input)));
    }

}