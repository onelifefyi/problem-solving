// problem: https://codeforces.com/problemset/problem/581/A

import java.util.Scanner;
import java.lang.Math;

public class Socks{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
            int s1 = sObj.nextInt();
            int s2 = sObj.nextInt();
            System.out.println(Math.min(s1,s2));
            System.out.println((s1 + s2 - 2*Math.min(s1,s2))/2);
    }
}