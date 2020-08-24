// problem: https://leetcode.com/problems/find-the-duplicate-number/

/* Approach: 
+ The simplest approach that I can see is to sort the array first O(nlogn) Then iterate through the array O(N) : O(nlogn)
+ Assuming that we can't sort the array, other naive approach is to traverse through all elements once for each element O(n^2)
+ One more thing that we can do is create a frequency array (since it can have numbers in range(1,N)) and whenever count >1 return 
        - This has time O(n) and space O(n)
+ Floyd's method/ Hare & turtle
*/ 


class Duplicate{

    static int getDuplicate(int[] arr){
        int hare=arr[0];
        int turtle=arr[0];
        do{
            hare = arr[arr[hare]];
            turtle = arr[turtle];
        }
        while(hare != turtle);
        hare = arr[0];

        while(hare != turtle){
            hare = arr[hare];
            turtle = arr[turtle];
        }
        return hare;
    }

    public static void main(String[] args){
        int[] input = {4,5,1,2,3,3};
        System.out.println(getDuplicate(input));
    }
}