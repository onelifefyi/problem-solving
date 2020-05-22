//problem: https://codeforces.com/problemset/problem/34/B

import java.util.Scanner;
import java.util.Arrays;

public class Sale{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = sObj.nextInt();
        int max = sObj.nextInt();
        int[] arr = new int[nos];
        for(int i=0; i<nos; i++){
            arr[i] = sObj.nextInt();
        }
        Arrays.sort(arr);
        int total = 0;
        for(int i=0; i<max; i++){
            //System.out.println("Checking: " + arr[i]);
            if(arr[i] < 0){
                total -= arr[i];
            }
        }
        System.out.println(total);
    }
}