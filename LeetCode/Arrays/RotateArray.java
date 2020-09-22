// problem: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
/* Approach: + The easiest way would be to take additional array and copy on new positions (new positiopn = (index+shift)%size) -> O(N) time, O(N) space
             + If we can only use O(1) extra space then, one way would be to create an algo to rotate once and then do it n times -> O(N^2) time, O(1) space
             + A good approach is implemented below, where we reverse the elements first and then reverse first $toShift elements and then again reverse the remaining elements
                this approach takes O(N) time and O(1) space
*/

import java.util.Arrays;
public class RotateArray {
    static int[] arr = {14,61,124,352,325,34,564};
    static int n = 2;

    public static void reverse(int[] arr, int start, int end){
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

    public static void main(String[] args) {
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, n-1);
        reverse(arr, n, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
