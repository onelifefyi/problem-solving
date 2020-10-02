// Problem: Find all pairs on integer array whose sum is equal to given number.
/*
    Approach: 
    first sort the array, then use two pointer approach to find sum traversing the array from both ends
    0-1-2-3-4-5-6-7-8-9
    time O(nlogn) to sort & O(n) traverse => time O(nlogn)
    extra space O(1)
*/
import java.util.Arrays;

public class Pair{
    public static void main(String[] args) {
        int[] arr = {6,5,7,4,5,5,9,2,1,0};
        int required = 10;
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        int sum = 0;
        while(start < end){
            sum = arr[start] + arr[end];
            if(sum == required){
                System.out.println("Pair: " + arr[start] + "," + arr[end]);
                start++;
                end--;
            }
            else if(sum > required) end--;
            else start++;
        }
    }
}