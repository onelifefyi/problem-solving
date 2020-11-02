/*
Problem:
https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
Print the maximum sum of the contiguous sub-array in a separate line for each test case.

Approach:
>   We'll consider it as a continous stream of data, we will maintain a variable to keep track of max sum,
    now we keep adding the elements of array to sum iff sum + the element is greater than the element itself,
    if the element is greater than the sum then we'll replace sum by that element
    finally we'll return the max sum after traversal
    time O(n) | auxilary space O(1)

*/

class KadanesAlgo{

    public static int getSum(int[] input){
        int max = input[0];
        int sum = max;
        for(int i=1; i<input.length; i++){
            sum += input[i];
            if(input[i] > sum) sum = input[i];
            // note that the equivalent of above two lines is sum = Math.max(input[i], sum + input[i])
            if(sum > max) max = sum;
        }
        return max;
    }

    public static void main(String[] args){
        //int[] input = {1, 2, 3, -2, 5};
        int[] input = {-6, -1, 0, -4, -1};
        System.out.println(getSum(input));
    }
}