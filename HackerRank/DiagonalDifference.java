//Given a square matrix, calculate the absolute difference between the sums of its diagonals.
import java.lang.Math;

class DiagonalDifference{

    static int findDiff(int arr[][]){
        int result = 0; 
        int ctr = 0;
        for(int i=0; i<arr.length; i++){
            result+=arr[i][i];
        }
        for(int i=arr.length - 1; i>=0; i--){
            result -= arr[i][ctr++];
        }
        return Math.abs(result);
    }

    public static void main(String[] args){
        int arr[][] = {{1, 2, 3},
                       {4, 5, 6},
                       {10, 8, 9}};
        System.out.print(findDiff(arr));
    }
}