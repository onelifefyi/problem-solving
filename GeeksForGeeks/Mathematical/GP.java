// Problem: Find the nth term of a GP. Given first term and second term

import java.util.Scanner;
import java.lang.Math;
public class GP{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        int a = sObj.nextInt();
        float m = sObj.nextInt()/a;
        System.out.println(a*Math.pow(m,n-1));
    }
}