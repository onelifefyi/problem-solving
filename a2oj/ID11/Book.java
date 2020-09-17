// problem #34: http://codeforces.com/problemset/problem/139/A

import java.util.Scanner;

public class Book{
    public static void main(String[] args) {
        Scanner sObj = new Scanner(System.in);
        int total = sObj.nextInt();
        int[] arr = new int[8];
        int maxPerWeek = 0;
        for(int ii=1; ii<=7; ii++){
            arr[ii] = sObj.nextInt();
            maxPerWeek += arr[ii];
        }
        int i;
        total %= maxPerWeek;
        if(total == 0){
            for(i=7; i>0; i--) if(arr[i] != 0) break;
            System.out.println(i);
            return;
        }
        i = 1;
        while(total > 0){
            total -= arr[i++];
        }
        System.out.println(i-1);
        sObj.close();
    }
}