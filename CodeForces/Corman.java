// problem: https://codeforces.com/problemset/problem/732/B

import java.util.Scanner;

public class Corman{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int nDays = sObj.nextInt();
        int min = sObj.nextInt();
        int arr[] = new int[nDays];
        for(int i=0; i<nDays; i++){
            arr[i] = sObj.nextInt();
        }
        if(nDays == 1){
            System.out.println(0 + "\n" + arr[0]);
            return;
        }
        int total = 0;
        for(int j=0; j<nDays-1; j++){
            if((arr[j] + arr[j+1]) < min){
                total += min - (arr[j] + arr[j+1]);;
                arr[j+1] += min - (arr[j] + arr[j+1]);
            }
        }
        if((arr[nDays-1] + arr[nDays-2]) < min){
            total += min - (arr[nDays-1] + arr[nDays-2]);
            arr[nDays-1] += min - (arr[nDays-1] + arr[nDays-2]);
        }
        System.out.println(total);
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
}