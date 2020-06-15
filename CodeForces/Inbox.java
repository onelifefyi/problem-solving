//problem: https://codeforces.com/problemset/problem/465/B

import java.util.Scanner;
public class Inbox{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int cases  = sObj.nextInt();
        int arr[] = new int[cases];
        int prev = 0;
        int first = 0;
        int totali = 0;
        for(int i=0; i<cases; i++){
            arr[i] = sObj.nextInt();
            if(arr[i] == 1){
                if(prev == 0){
                    first++;
                }
                totali++;
            }
            prev = arr[i];
        }
        if(totali == 0){
            System.out.println(0);
            return;
        }
        System.out.println((first-1)*2 + (totali-first+1));
    }
}