/* A 2d matrix is given, find the maximum sum of elements in pattern (Hourglass):

a b c
  d
e f g

Throught the matrix
*/
public class HourGlass{

    static int getMax(int arr[][]){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int row=0; row<arr.length-2; row++){
            for(int col=0; col<arr[0].length-2; col++){
                sum=0;
                for(int i=0; i<3; i++){
                    sum += arr[row][col+i] + arr[row+2][col+i];
                }
                sum += arr[row+1][col+1];
                if(sum>=max){
                    max = sum;
                }
            }
        }
        return max;
    }

    public static void main(String[] args){
        int arr[][] = {{1,2,3,4},
                       {1,1,1,1},
                       {2,2,2,2},
                       {3,3,3,3},
                       {5,5,5,5}};
        System.out.println(getMax(arr));
    }
}