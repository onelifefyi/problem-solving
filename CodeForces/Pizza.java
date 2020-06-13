//problem: https://codeforces.com/problemset/problem/979/A

import java.util.Scanner;
public class Pizza{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        long n = sObj.nextLong() + 1;
        if(n == 1){
            System.out.println(0);
            return;
        }
        if(n % 2 == 0){
            System.out.println(n/2);
        }
        else{
            System.out.println(n);
        }
    }
}