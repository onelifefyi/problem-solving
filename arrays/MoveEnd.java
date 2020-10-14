/*
Problem: You are given an array of integers and an integer.
         Write a function that moves all instances of that integer in the array to the end of the array.

Approach:
> One simple way is to traverse through the array keeping a pointer at last and whenever the required integer is found
  swap it with the last pointer's position and decrement last by 1
  This'll take O(n) time and O(1) auxilary space but order isn't maintained.

> Another naive approach to maintain order is by bubbling the required element to the end everytime it is encountered
  time O(n^2) aux space O(1)

> We can maintain a pointer pointing to required element and keep traversing, if another number is encountered then swap 
  the values and change the pointer to swapped position
  time O(n) aux space O(1) implemented below

*/
import java.util.Arrays;
public class MoveEnd{

    public static int[] moveToEnd(int[] input, int number){
        int pointer = 0;
        while(input[pointer] != number) pointer++;        
        for(int i=pointer+1; i<input.length; i++){
            if(input[i] != number){
                input[pointer] = input[i];
                input[i] = number;
                pointer++;
            }
        }
        return input;
    }
    
    public static void main(String[] args){
        int[] input = {2,61,2,14,2,2,14,2};
        int number = 14;
        int[] result = moveToEnd(input, number);
        System.out.println(Arrays.toString(result));
    }
}