// You are given a list of n-1 integers and these integers are in the range of 1 to n.
// There are no duplicates in the list. One of the integers is missing in the list. Write an efficient code to find the missing integer.

// Approach: 1) Sort the array (time: O(nlogn)) then iterate through the array to find missing element; time O(nlogn + n) = O(nlogn); space O(1)

import java.util.Arrays;
public class Duplicate{
    public static void main(String[] args) {
        int[] arr = {6,5,4,7,8,2,1,3};
        Arrays.sort(arr);
        for(int i=1; i<=arr.length; i++){
            if(arr[i-1] != i){
                System.out.println(i);
                return;
            }
        }
        System.out.println(arr.length + 1);
    }
}