// Given an array, print each element in reverse order as a single line of space-separated integers.

public class RevArray{

    static int[] reverse(int[] arr){
        int[] result = new int[arr.length];
        int index = 0;
        for(int i=arr.length-1; i>=0; i--){
//            System.out.println(index);
            result[index++] = arr[i];
        }
        return result;
    }

    public static void main(String[] args){
        int arr[] = {3, 14, 17, 61, 64, 75};
        for(int i: reverse(arr)){
            System.out.print(i + " ");
        }
    }
}