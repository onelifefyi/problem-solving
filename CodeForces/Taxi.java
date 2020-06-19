//problem: https://codeforces.com/problemset/problem/158/B

import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class Taxi{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = sObj.nextInt();
        int arr[] = new int[5];
        Arrays.fill(arr, 0);
        for(int i=0; i<nos; i++){
            arr[sObj.nextInt()] += 1;
        }
        
        int total = arr[4];
        total += arr[2]/2;
        if(arr[2] % 2 != 0){
            arr[2] = 1;
            arr[1] -= 2;
            total++;
        }

        total += arr[3];
        arr[1] -= arr[3];
        
        if(arr[1] > 0){
            total += Math.ceil((float) arr[1] /4.0);
        }

        System.out.println(total);
    }
}