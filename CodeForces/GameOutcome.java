//problem: https://codeforces.com/problemset/problem/157/A

import java.util.Scanner;

public class GameOutcome{

    public static int getSum(int[][] arr, int at, char type){
        int sum = 0;
        if(type == 'c'){
            for(int i=0; i<arr.length; i++){
                sum +=  arr[i][at];
            }
        }
        else{
            for(int i=0; i<arr.length; i++){
                sum +=  arr[at][i];
            }
        }
        return sum;
    }
    
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int[][] input = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                input[i][j] = sObj.nextInt();
            }
        }
        int total_win = 0;
        int x_sum = 0;
        for(int x=0; x<n; x++){
            x_sum = getSum(input, x, 'r');
            for(int y=0; y<n; y++){
                if(x_sum<getSum(input, y, 'c')){
                    total_win++;
                }
            }
        }
        System.out.println(total_win);
    }
}