//problem: https://codeforces.com/problemset/problem/1197/A

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Planks{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nos = sObj.nextInt();
        for(int z=0; z<nos; z++){
            int size = sObj.nextInt();
            int[] arr = new int[size];
            for(int i=0; i<size; i++){
                arr[i] = sObj.nextInt();
            }
            if(size < 3){
                System.out.println(0);
                continue;
            }
            Arrays.sort(arr);
            System.out.println(Math.min(arr[size-2]-1, size-2));
        }
    }
}