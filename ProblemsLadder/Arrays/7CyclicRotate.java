/*
Problem: https://www.geeksforgeeks.org/c-program-cyclically-rotate-array-one/

Approach: 
>   One naive (actually stupid!!!) way to solve it is by taking another array of same size and copy from first till last -1 to new array
    Now copy the last element to first position of new array
    time O(n) | auxilary space O(n)

>   Another way is to copy the last to a temp array now shift all elements by one, finally copy from temp to first
    time O(n) | auxilary space O(1)

*/

import java.util.Arrays;
class CyclicRotate {

    public static int[] rotateByOne(int[] input){
        int sizeOfArr = input.length;
        int temp = input[sizeOfArr-1];
        for(int i=sizeOfArr-1; i>0; i--) input[i] = input[i-1];
        input[0] = temp;
        return input;
    }

    public static void main(String[] args) {
        int[] input = {1,2,14,75,444};
        input = rotateByOne(input);
        input = rotateByOne(input);
        System.out.println(Arrays.toString(input));
    }
}
