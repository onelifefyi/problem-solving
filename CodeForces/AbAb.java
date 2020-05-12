//problem : https://codeforces.com/problemset/problem/1148/A

import java.util.Scanner;
import java.lang.Math;
public class AbAb{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        long a = sObj.nextLong();
        long b = sObj.nextLong();
        long c = sObj.nextLong();

        if(a != b){
            System.out.println(Math.min(a,b)*2 + 1 + c*2);
        }
        else{
            System.out.println(Math.min(a,b)*2 + c*2);
        }
    }
}