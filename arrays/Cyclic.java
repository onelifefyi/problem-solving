// Problem: Rotate an array one position (cyclic)

import java.util.Arrays;
public class Cyclic{
    static int[] arr = {1,24,214,21,41,2412,4,124};

    public static void rotate(){
        int temp = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--) arr[i] = arr[i-1];
        arr[0] = temp;
    }

    public static void main(String[] args) {
        System.out.println("Given: " + Arrays.toString(arr));
        rotate();
        System.out.println(Arrays.toString(arr));
        rotate();
        System.out.println(Arrays.toString(arr));
    }
}