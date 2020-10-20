/*
Problem: Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Approach:
>   

*/
class SubArraySum {
    public static void main(String[] args) {
        //int input[] = {1, 2, 3, -2, 5};
        int input[] = {-1, 6, -4, 2, -5};
        int maxIndex = 0;
        int sum = input[0];
        for(int i=1; i<input.length; i++){
            if(sum + input[i] > sum) maxIndex = i;
            sum += input[i];
        }
        System.out.println(maxIndex);
    }    
}
