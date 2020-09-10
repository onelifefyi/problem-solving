// problem #13: https://codeforces.com/problemset/problem/233/A

import java.util.Scanner;
public class PerfectPermutation{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        if(n%2==1) System.out.println("-1");
        else for(int i=n;i>0;i--) System.out.print(i + " ");
        sObj.close();
    }
}