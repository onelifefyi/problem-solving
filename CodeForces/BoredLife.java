//problem: https://codeforces.com/problemset/problem/822/A

import java.util.Scanner;
public class BoredLife{
    public static void main(String args[]){
        Scanner sObj = new Scanner(System.in);
        int a = sObj.nextInt();
        int b = sObj.nextInt();
        int gcd = 1;
        if(a > b){
            a = b;
        }
        for(int i=a; i>1; i--){
            gcd *= i;
        }
        System.out.println(gcd);
    }
}