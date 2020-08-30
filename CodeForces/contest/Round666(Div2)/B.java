// problem: https://codeforces.com/contest/1397/problem/B

import java.util.Scanner;
import java.util.Arrays;

public class B{

    static long findDiff(int pow, int[] arr){
        long result = 0;
        for(int i=0; i<arr.length; i++){
            result += Math.abs(arr[i] - Math.pow(pow, i));
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int size = sObj.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++) arr[i] = sObj.nextInt();
        Arrays.sort(arr);
        long min = findDiff(2, arr);
        System.out.println("2's" + min);
        long current = findDiff(3, arr);
        System.out.println("3's" + current);
        int pow = 3;
        while(min > current){
            min = current;
            current = findDiff(++pow, arr);
        }
        System.out.println(min);
    }
}