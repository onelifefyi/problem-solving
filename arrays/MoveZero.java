// Move all the zeros in an array to the end

import java.util.Arrays;
public class MoveZero{

    // Idea similar to below but a bit too complicated
    // public static int[] moveZero(int[] arr){
    //     int zerPtr = 0;
    //     while(zerPtr < arr.length){
    //         if(arr[zerPtr] != 0) zerPtr++;
    //         else{
    //             for(int i=zerPtr; i<arr.length; i++){
    //                 if(arr[i] != 0){
    //                     arr[zerPtr] = arr[i];
    //                     arr[i] = 0;
    //                     break;
    //                 }
    //             }
    //         }
    //         zerPtr++;
    //     }
    //     return arr;
    // }

    // Good implementation O(n) time
    public static int[] moveZero(int[] arr){
        int temp = 0;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 0, 7, 14, 0, 61, 0, 87, 43, 44};
        arr = moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
}