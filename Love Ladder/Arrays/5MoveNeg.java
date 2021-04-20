/*
Problem: 
Move all the negative elements to one side of the array.

Approach: 
>   Simply sort the array
    time O(nlogn) | aux space O(1)

>   Have two pointers current and left starting at 0, increment current till end and if a negative number is encountered,
    swap it with left and increment left
    time O(n) | aux space O(1)
*/

import java.util.Arrays;
class MoveNeg{

    public static int[] moveNeg(int[] input){
        int current, left;
        current = left = 0;
        int temp = 0;
        while(current < input.length){
            if(input[current] < 0){
                temp = input[current];
                input[current] = input[left];
                input[left] = temp;
                left++;
            }
            current++;
        }
        return input;
    }

    public static void main(String[] args) {
        int[] input = {12,-1,-4,32,13,-6,-1,213,-213,21,312};
        input = moveNeg(input);
        System.out.println(Arrays.toString(input));
    }
}