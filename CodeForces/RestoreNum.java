//problem: https://codeforces.com/problemset/problem/1154/A

import java.util.Scanner;
public class RestoreNum{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i=0; i<4; i++){
            arr[i] = sObj.nextInt();
        }
        int max = 0;
        for(int ele: arr){
            if(max < ele){
                max = ele;
            }
        }
        for(int i=0; i<4; i++){
            if(max - arr[i] == 0){
                continue;
            }
            System.out.print((max - arr[i]) + " ");
        }
    }
}