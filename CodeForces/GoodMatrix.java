//problem: https://codeforces.com/problemset/problem/177/A1

import java.util.Scanner;
public class GoodMatrix{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = Integer.parseInt(sObj.nextLine());
        int[][] arr = new int[n][n];
        int sum = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sObj.nextInt();
                if(i == (n-1)/2){
                    sum += arr[i][j];
                    //System.out.println("eleRow: " + arr[i][j]);
                }
                if(j == (n-1)/2){
                    sum += arr[i][j];
                    //System.out.println("eleColl: " + arr[i][j]);
                }
            }
                sum += arr[i][i];
                //System.out.println("eleDiag1: " + arr[i][i]);
                sum += arr[i][n-i-1];
                //System.out.println("eleDiag2: " + arr[i][n-i-1]);
            sObj.nextLine();
        }
        System.out.println(sum - 3*arr[(n-1)/2][(n-1)/2]);
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}