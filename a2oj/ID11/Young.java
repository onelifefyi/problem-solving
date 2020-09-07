// Problem#1: https://codeforces.com/problemset/problem/69/A

import java.util.Scanner;

public class Young{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int a=0,b=0,c=0;
        for(int i=0; i<n; i++){
            a += sObj.nextInt();
            b += sObj.nextInt();
            c += sObj.nextInt();
        }
        if(a!=0 || b!=0 || c!=0) System.out.println("NO");
        else System.out.println("YES");
    }
}