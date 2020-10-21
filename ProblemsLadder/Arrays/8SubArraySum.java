/*
Problem: Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Approach:
>   The simplest approach is to find the sum of all the possible sub arrays and returning max of them.
    time O(n^3) | extra space O(1)

>   One optimization to above approach is to find the max sub array sum originating from each element linearly,
    by keeping track of last sum.
    time O(n^2) | auxilary space O(1)

>   The optimal approach is Kadane's Algorithm for this problem.
    keep track of max subarray sum for current element, and compare it with current element maitaining maxSubArray sum,
    maintain a globalMax variable keeping track of maximum subArray throughout the array
    time O(n) | auxilary space O(1)

*/
class SubArraySum {

    public static int getMaxSubArraySum(int[] input){
        int currentSum, globalSum;
        currentSum = globalSum = input[0];
        for(int i=1; i<input.length; i++){
            currentSum = Math.max(currentSum + input[i], input[i]);
            if(currentSum > globalSum) globalSum = currentSum;
        }
        return globalSum;
    }

    public static void main(String[] args) {
        //int input[] = {1, 2, 3, -2, 5};
        int input[] = {-1, 6, -4, 5, -5};
        System.out.println(getMaxSubArraySum(input));
    }    
}
