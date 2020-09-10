// problem #15: https://codeforces.com/problemset/problem/200/B

import java.util.Scanner;
public class Drinks{
    public static void main(String[] args){
        Scanner sObj = new Scanner(System.in);
        int n = sObj.nextInt();
        double sum = 0;
        for(int i=0; i<n; i++) sum += sObj.nextInt();
        System.out.println(sum/n);
        sObj.close();
    }
}