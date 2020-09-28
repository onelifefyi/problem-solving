// Problem: Reverse an array: time O(n), space O(1)
import java.util.Arrays;
class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int temp = 0;
        int len = arr.length-1;
        for(int i=0; i<arr.length/2; i++){
            temp = arr[i];
            arr[i] = arr[len];
            arr[len--] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}