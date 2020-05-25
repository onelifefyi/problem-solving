//problem: https://codeforces.com/problemset/problem/1272/A

import java.util.Scanner;
import java.util.Arrays;

public class ThreeFriends{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = sObj.nextInt();
        for(int i=0; i<nos; i++){
            //System.out.println("count: " + (i+1));
            int[] arr = new int[3];
            for(int z=0; z<3; z++){
                arr[z] = sObj.nextInt();
            }
            Arrays.sort(arr);
            if(arr[2] - arr[0] <= 1){
                System.out.println(0);
                continue;
            }
            else {
                arr[0]++;
                arr[2]--;
            }
            System.out.println(arr[2]-arr[1]+arr[2]-arr[0]+arr[1]-arr[0]);
        }
    }
}