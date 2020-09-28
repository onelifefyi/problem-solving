// problem: Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algorithm.
/*
Approach: 1: Iterate through the array to find # of 0's 1's and 2's, finally iterate again and fill. O(n) time, O(1) space
Approach: 2: 
*/
import java.util.Arrays;
public class ColorSort {
    public static void main(String[] args) {
        int arr[] = {0,1,2,1,1,0,0,2,2};
        int zero = 0;
        int two = arr.length-1;
        for(int i=1; i<arr.length && i<=two; i++){
            if(arr[i] == 0){
                arr[i] = arr[zero];
                arr[zero] = 0;
                zero++;
                i--;
            }
            else if(arr[i] == 2){
                arr[i] = arr[two];
                arr[two] = 2;
                two--;
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
