// Problem: https://codeforces.com/problemset/problem/1417/A

import java.util.Scanner;
public class Magic{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int css = sObj.nextInt();
        for(int zz=0; zz<css; zz++){
            int n = sObj.nextInt();
            int k = sObj.nextInt();
            int[] arr = new int[n];
            int min = Integer.MAX_VALUE;
            for(int i=0; i<n; i++){
                arr[i] = sObj.nextInt();
                if(arr[i] < min) min = arr[i];
            }
            int total = 0;
            for(int ele: arr){
                total += (k-ele)/min;
            }
            System.out.println(total-((k-min)/min));
        }
    }
}