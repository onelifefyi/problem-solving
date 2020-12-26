// Problem: https://codeforces.com/problemset/problem/1462/A

import java.util.Scanner;
import java.util.Arrays;
public class Sequence{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            //StringBuilder sOut = new StringBuilder();
            int size = sObj.nextInt();
            //sObj.nextLine();
            int[] arr = new int[size];
            int left = 0;
            int right = size-1;
            for(int i=0; i<size; i++) arr[i] = sObj.nextInt();
            for(int y=0; y<size; y++){
                if(y%2==0) System.out.print(arr[left++] + " ");
                else System.out.print(arr[right--] + " ");
            }
            System.out.println();
        }
    }
}