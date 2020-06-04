// problem: https://codeforces.com/problemset/problem/11/A

import java.util.Scanner;

public class IncrSeq{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = sObj.nextInt();
        int[] arr = new int[nos];
        int d = sObj.nextInt();
        for(int i=0; i<nos; i++){
            arr[i] = sObj.nextInt();
        }
        int total = 0;
        for(int z=0; z<nos-1; z++){
            if(arr[z+1] <= arr[z]){
                total += (arr[z] - arr[z+1])/d + 1;
                //System.out.println((((arr[z] - arr[z+1])/d + 1)) + " for " + arr[z] + " and " + arr[z+1]);
                arr[z+1] += ((arr[z] - arr[z+1])/d + 1) * d;
            }
        }
        System.out.println(total);
    }
}