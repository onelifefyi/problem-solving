// Problem: Move all negative numbers to one side O(n)
import java.util.Arrays;
public class MoveNegative {
    public static void main(String[] args) {
        int[] arr =  {-1,6,-5745,-765,56,8,61,-457,-856};
        int negCount = 0;
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            temp = arr[i];
            if(arr[i] < 0){
                arr[i] = arr[negCount];
                arr[negCount] = temp;
                negCount++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
