/*
Problem: https://leetcode.com/problems/find-the-duplicate-number/
>   Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
    There is only one duplicate number in nums, return this duplicate number.

Approach:
>   One naive approach is to for each element traverse the rest of the array and check if duplicate exists.
    time O(n^2) | auxilary space O(1)

>   Other way would be to first sort the array and then iterate to check if duplicate is found
    time O(nlogn) | auxilary space O(1) (I gotta search more about java collection, if it uses quick or merge sort)

>   Other approach is to create a hash set and keep inserting the elements and check item already exists in the set
    time O(n) | auxilary space O(n)

>   The best approach that I can think of is to iterate through the array and then go to the respective element-1 index and,
    mark it as negative (multiply by -1), now if we check that the element is already negative then the previous is duplicate.
    time O(n) | auxilary space O(1) <implemented here>

*/
class FindDuplicate {

    public static int getDuplicate(int input[]){
        for(int i=0; i<input.length; i++){
            if(input[Math.abs(input[i])-1] < 0) return Math.abs(input[i]);
            else input[Math.abs(input[i])-1] *= -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        // Test Cases: 

        //int[] input = {3,1,3,4,2};
        //int[] input = {1,1};
        int[] input = {1,3,5,5,2};
        System.out.println(getDuplicate(input));
    }
}
