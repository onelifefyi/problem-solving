// Problem: https://codeforces.com/problemset/problem/991/B

import java.util.Scanner;
import java.util.Arrays;
public class GetA{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            arr[i] = sObj.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        double required = n * 4.5;
        int count = 0;
        int ptr=0;
        while(sum < required){
            sum += 5-arr[ptr];
            ptr++;
        }
        System.out.println(ptr);
    }
}