/* 
Problem: Maximum and minimum of an array using minimum number of comparisons
         https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/

Approach:
>   We can sort the array and return the first and last element for smallest and largest element;
    O(nlogn) time | O(n) auxilary space | both for sorting 

>   In this method we traverse through the array maintaining the currentMax and currentMin variables.
    O(n) time | O(1) auxilary space

*/

class MaxMinArray {

    public static int[] getMaxMin(int[] input){
        int[] result = new int[2];
        int max = input[0];
        int min = input[0];
        for(int ele: input){
            if(ele > max) max = ele;
            if(ele < min) min = ele;
        }
        result[0] = min;
        result[1] = max;
        return result;
    }

    public static void main(String[] args) {
        int[] input = {12,3,123,21,3,12,312,3,1,5,235,34,643,6,547,547,54,745};
        int[] result = getMaxMin(input);
        System.out.printf("Min: %d; Min: %d",result[0], result[1]);
    }
}
