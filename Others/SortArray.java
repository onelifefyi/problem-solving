import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {1,24,23,43,24,14,34,2353,61,9};
        int length = arr.length;
        for(int i=0; i<length; i++){
            for(int j=1; j<length; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
