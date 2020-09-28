// Problem: Move all the negative elements to one side of the array.
/* 
Approach: 1) keep a pointer to the first element, and swap it whenever a -ve number is encountered and increment the pointer; time O(n), space O(1)
*/
import java.util.Arrays;
public class MoveNeg {
    public static void main(String[] args) {
        int[] arr = {-14,24,214,42,14,-124,124,214,-61};
        int pointer = 0;
        int temp = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i] < 0){
                temp = arr[i];
                arr[i] = arr[pointer];
                arr[pointer] = temp;
                i--;
                pointer++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
