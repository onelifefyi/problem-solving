// https://codeforces.com/problemset/problem/1399/A

import java.util.Scanner;
import java.util.Arrays;
public class A{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        for(int i=0; i<n; i++){
            int size = sObj.nextInt();
            int arr[] = new int[size];
            for(int j=0; j<size; j++){
                arr[j] = sObj.nextInt();
            }
            Arrays.sort(arr);
            boolean isPossible = true;
            for(int k=1; k<size; k++){
                if(arr[k]-arr[k-1] > 1){
                    isPossible = false;
                    break;
                }
            }
            if(isPossible) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}